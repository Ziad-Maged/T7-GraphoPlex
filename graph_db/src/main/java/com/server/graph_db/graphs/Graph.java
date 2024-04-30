package com.server.graph_db.graphs;
import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.alghorithms.strategies.sharding.HashBasedShardingStrategy;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.utilities.DisjointSet;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
abstract public class Graph {
    private int nodes; // number of Shards or Servers
    private int vertices; // number of Vertices
    private int edges; // number of Edges
    private int currentNumberOfEdges;
    private GraphType type;
    private HashMap<String, Vertex> vertexMap;
    private HashMap<Vertex, List<Edge>> edgeMap;
    private HashMap<Vertex, Integer> colorMap;
    private HashMap<String, String> properties;
    private ShardingStrategy shardingStrategy;
    private TestingStrategy testingStrategy;

    public Graph(){
        nodes = edges = vertices = currentNumberOfEdges = 0;
        vertexMap = new HashMap<>();
        edgeMap = new HashMap<>();
        properties = new HashMap<>();
        type = GraphType.DIRECTED;
        properties.put("graphType", type.toString());
    }
    public  Graph(int nodes, int vertices, int edges, GraphType type){
        this.nodes = nodes;
        this.vertices = vertices;
        this.edges = edges;
        this.type = type;
        this.currentNumberOfEdges = 0;
        vertexMap = new HashMap<>(vertices);
        edgeMap = new HashMap<>(edges);
        properties = new HashMap<>();
        shardingStrategy = new HashBasedShardingStrategy();
        properties.put("graphType", type.toString());
    }

    public int getNodes(){
        return nodes;
    }
    public int getVertices(){
        return vertices;
    }
    public int getEdges(){
        return edges;
    }
    public int getCurrentNumberOfEdges(){
        return currentNumberOfEdges;
    }
    public GraphType getType(){
        return type;
    }
    public HashMap<String, Vertex> getVertexMap(){
        return vertexMap;
    }
    public HashMap<Vertex, List<Edge>> getEdgeMap(){
        return edgeMap;
    }
    public HashMap<Vertex, Integer> getColorMap(){
        return colorMap;
    }
    public HashMap<String, String> getProperties(){
        return properties;
    }
    public ShardingStrategy getShardingStrategy(){
        return shardingStrategy;
    }
    public TestingStrategy getTestingStrategy(){
        return testingStrategy;
    }

    public String getProperty(String key){
        return properties.get(key);
    }

    public void setProperty(String key, String value){
        properties.put(key, value);
    }

    public void addVertex(String id){
        if(vertexMap.containsKey(id) || vertexMap.size() == vertices)
            return;
        vertexMap.put(id, new Vertex(id));
        edgeMap.put(vertexMap.get(id), new ArrayList<>());
    }

    public void addVertex(String id, List<Edge> edges){
        if(vertexMap.containsKey(id) || vertexMap.size() == vertices || currentNumberOfEdges + edges.size() > this.edges)
            return;
        Vertex vertex = new Vertex(id);
        vertexMap.put(id, vertex);
        edgeMap.put(vertex, edges);
        currentNumberOfEdges += edges.size();
    }

    public void addVertex(Vertex vertex){
        if(vertexMap.containsKey(vertex.getId()) || vertexMap.size() == vertices)
            return;
        vertexMap.put(vertex.getId(), vertex);
        edgeMap.put(vertex, new ArrayList<>());
    }

    public Vertex getVertexByID(String id){
        return vertexMap.getOrDefault(id, null);
    }

    public List<Edge> getVertexEdgesByID(String id){
        return edgeMap.getOrDefault(vertexMap.get(id), null);
    }

    public void addEdge(String source, String destination){
        if(!vertexMap.containsKey(source) || !vertexMap.containsKey(destination) || currentNumberOfEdges == edges)
            return;
        if(type == GraphType.UNDIRECTED){
            edgeMap.get(vertexMap.get(source)).add(new Edge(source, destination));
            edgeMap.get(vertexMap.get(destination)).add(new Edge(destination, source));
        }else{
            edgeMap.get(vertexMap.get(source)).add(new Edge(source, destination));
        }
        currentNumberOfEdges++;
    }

    public void addEdge(String source, String destination, String label){
        if(!vertexMap.containsKey(source) || !vertexMap.containsKey(destination) || currentNumberOfEdges == edges)
            return;
        if(type == GraphType.UNDIRECTED){
            Edge outgoing = new Edge(source, destination);
            outgoing.setLabel(label);
            Edge incoming = new Edge(destination, source);
            incoming.setLabel(label);
            edgeMap.get(vertexMap.get(source)).add(outgoing);
            edgeMap.get(vertexMap.get(destination)).add(incoming);
        }else{
            Edge outgoing = new Edge(source, destination);
            outgoing.setLabel(label);
            edgeMap.get(vertexMap.get(source)).add(outgoing);
        }
        currentNumberOfEdges++;
    }

    public void addEdge(Edge edge){
        if(!vertexMap.containsKey(edge.getSourceVertexId()) || !vertexMap.containsKey(edge.getDestinationVertexId()) || currentNumberOfEdges == edges)
            return;
        if(type == GraphType.UNDIRECTED){
            edgeMap.get(vertexMap.get(edge.getSourceVertexId())).add(edge);
            Edge incoming = new Edge(edge.getDestinationVertexId(), edge.getSourceVertexId());
            incoming.setLabel(edge.getLabel());
            edgeMap.get(vertexMap.get(edge.getDestinationVertexId())).add(incoming);
        }else{
            edgeMap.get(vertexMap.get(edge.getSourceVertexId())).add(edge);
        }
        currentNumberOfEdges++;
    }

    /**
     * Returns the degree of a vertex if the graph is undirected*/
    public int getDegreeOfVertex(String id){
        if(!vertexMap.containsKey(id) || type == GraphType.DIRECTED)
            return -1;
        return edgeMap.get(vertexMap.get(id)).size();
    }

    public int getOutDegreeOfVertex(String id){
        if(!vertexMap.containsKey(id) || type == GraphType.UNDIRECTED)
            return -1;
        return edgeMap.get(vertexMap.get(id)).size();
    }

    public int getInDegreeOfVertex(String id){
        if(!vertexMap.containsKey(id) || type == GraphType.UNDIRECTED)
            return -1;
        int inDegree = 0;
        for(List<Edge> edges : edgeMap.values()){
            for(Edge edge : edges){
                if(edge.getDestinationVertexId().equals(id))
                    inDegree++;
            }
        }
        return inDegree;
    }

    public boolean hasEdge(String source, String destination){
        if(!vertexMap.containsKey(source) || !vertexMap.containsKey(destination))
            return false;
        return edgeMap.get(vertexMap.get(source)).contains(new Edge(source, destination));
    }

    public boolean isBipartite(){
        if(vertexMap.size() < 2 || vertexMap.isEmpty())
        return false;

        colorMap = new HashMap<>();
        Queue<Vertex> queue = new LinkedList<>();

        for(Vertex v : vertexMap.values()){
            colorMap.put(v, -1);
        }

        Vertex start = vertexMap.values().iterator().next();
        colorMap.put(start, 0);
        queue.offer(start);

        while (!queue.isEmpty()){
            Vertex current = queue.poll();
            for(Edge edge : edgeMap.get(current)){
                Vertex neighbour = vertexMap.get(edge.getDestinationVertexId());
                if(colorMap.get(neighbour) == -1){
                    colorMap.put(neighbour, 1 - colorMap.get(current));
                    queue.offer(neighbour);
                }else if(colorMap.get(neighbour) == colorMap.get(current)){
                    return false;
                }
            }
        }
        return true;
    }

    public List<Edge> getBridgeEdges(){
        List<Edge> bridges = new ArrayList<>();
        int time = 0;

        HashMap<String, Integer> discoveryTime = new HashMap<>();
        HashMap<String, Integer> lowTime = new HashMap<>();

        for(String id : vertexMap.keySet()){
            discoveryTime.put(id, -1);
            lowTime.put(id, -1);
        }

        for(Vertex vertex : vertexMap.values()){
            if(discoveryTime.get(vertex.getId()) == -1){
                dfsForBridges(vertex, null, discoveryTime, lowTime, bridges, time);
            }
        }

        return bridges;
    }

    private void dfsForBridges(Vertex vertex, Vertex parent, HashMap<String, Integer> discoveryTime, HashMap<String, Integer> lowTime, List<Edge> bridges, int time){
        time++;
        discoveryTime.put(vertex.getId(), time);
        lowTime.put(vertex.getId(), time);

        for(Edge edge : edgeMap.get(vertex)){
            Vertex neighbour = vertexMap.get(edge.getDestinationVertexId());
            if(neighbour.equals(parent))
                continue;
            if(discoveryTime.get(neighbour.getId()) == -1){
                dfsForBridges(neighbour, vertex, discoveryTime, lowTime, bridges, time);
                lowTime.put(vertex.getId(), Math.min(lowTime.get(vertex.getId()), lowTime.get(neighbour.getId())));
                if(lowTime.get(neighbour.getId()) > discoveryTime.get(vertex.getId())){
                    bridges.add(edge);
                }
            }else{
                lowTime.put(vertex.getId(), Math.min(lowTime.get(vertex.getId()), discoveryTime.get(neighbour.getId())));
            }
        }
    }

    public int getEccentricity(String id){
        if(!vertexMap.containsKey(id))
            return -1;
        int eccentricity = 0;
        Queue<Vertex> queue = new LinkedList<>();
        HashMap<Vertex, Integer> distanceMap = new HashMap<>();
        for(Vertex vertex : vertexMap.values()){
            distanceMap.put(vertex, Integer.MAX_VALUE);
        }
        distanceMap.put(vertexMap.get(id), 0);
        queue.offer(vertexMap.get(id));
        while (!queue.isEmpty()){
            Vertex current = queue.poll();
            for(Edge edge : edgeMap.getOrDefault(current, Collections.emptyList())){
                Vertex neighbour = vertexMap.get(edge.getDestinationVertexId());
                if(distanceMap.get(neighbour) == Integer.MAX_VALUE){
                    distanceMap.put(neighbour, distanceMap.get(current) + 1);
                    eccentricity = Math.max(eccentricity, distanceMap.get(neighbour));
                    queue.offer(neighbour);
                }
            }
        }
        return eccentricity;
    }

    public int getRadius(){
        int radius = Integer.MAX_VALUE;
        for(Vertex vertex : vertexMap.values()){
            radius = Math.min(radius, this.getEccentricity(vertex.getId()));
        }
        return radius;
    }

    public List<Vertex> getArticulationPoints(){
        List<Vertex> articulationPoints = new ArrayList<>();
        int time = 0;
        HashMap<String, Integer> discoveryTime = new HashMap<>();
        HashMap<String, Integer> lowTime = new HashMap<>();
        HashMap<String, Vertex> parentMap = new HashMap<>();
        HashSet<String> visited = new HashSet<>();

        for(String id : vertexMap.keySet()){
            discoveryTime.put(id, -1);
            lowTime.put(id, -1);
        }

        for(Vertex vertex : vertexMap.values()){
            if(!visited.contains(vertex.getId())){
                dfsForArticulationPoints(vertex, null,time, discoveryTime, lowTime, visited, parentMap, articulationPoints);
            }
        }
        return articulationPoints;
    }

    private void dfsForArticulationPoints(Vertex currentVertex, String parentVertex, int time, HashMap<String, Integer> disc, HashMap<String, Integer> low, HashSet<String> visited, HashMap<String, Vertex> parent, List<Vertex> articulationPoints){
        int children = 0;
        visited.add(currentVertex.getId());
        disc.put(currentVertex.getId(), time);
        low.put(currentVertex.getId(), time + 1); // Initialize low value

        for (Edge edge : edgeMap.getOrDefault(currentVertex, Collections.emptyList())) {
            Vertex neighbor = vertexMap.get(edge.getDestinationVertexId());

            if (!visited.contains(neighbor.getId())) {
                children++;
                parent.put(neighbor.getId(), currentVertex);
                dfsForArticulationPoints(neighbor, currentVertex.getId(), time + 1, disc, low, visited, parent, articulationPoints);

                low.put(currentVertex.getId(), Math.min(low.get(currentVertex.getId()), low.get(neighbor.getId())));

                // Check if the current vertex is an articulation point
                if (parentVertex == null && children > 1) {
                    articulationPoints.add(currentVertex);
                }
                if (parentVertex != null && low.get(neighbor.getId()) >= disc.get(currentVertex.getId())) {
                    articulationPoints.add(currentVertex);
                }
            } else if (!neighbor.getId().equals(parentVertex)) {
                low.put(currentVertex.getId(), Math.min(low.get(currentVertex.getId()), disc.get(neighbor.getId())));
            }
        }
    }

    public int getGirth() {
        int minCycleLength = Integer.MAX_VALUE;
        // Perform BFS from each vertex to find the shortest cycle
        for (Vertex vertex : vertexMap.values()) {
            int cycleLength = bfsForShortestCycle(vertex);
            if (cycleLength > 0) {
                minCycleLength = Math.min(minCycleLength, cycleLength);
            }
        }
        // If no cycle is found, return -1 (indicating the graph is acyclic)
        if (minCycleLength == Integer.MAX_VALUE) {
            return -1;
        }
        return minCycleLength;
    }

    private int bfsForShortestCycle(Vertex startVertex) {
        Queue<Vertex> queue = new LinkedList<>();
        HashMap<Vertex, Integer> distanceMap = new HashMap<>();
        HashMap<Vertex, Vertex> parentMap = new HashMap<>();
        HashSet<Vertex> visited = new HashSet<>();

        queue.offer(startVertex);
        distanceMap.put(startVertex, 0);
        parentMap.put(startVertex, null);
        visited.add(startVertex);

        int minCycleLength = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            int currentDistance = distanceMap.get(currentVertex);
            // Check if there is a cycle back to the start vertex
            for (Edge edge : edgeMap.getOrDefault(currentVertex, Collections.emptyList())) {
                Vertex neighbor = vertexMap.get(edge.getDestinationVertexId());
                if (neighbor.equals(startVertex)) {
                    minCycleLength = Math.min(minCycleLength, currentDistance + 1);
                }
            }

            for (Edge edge : edgeMap.getOrDefault(currentVertex, Collections.emptyList())) {
                Vertex neighbor = vertexMap.get(edge.getDestinationVertexId());
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    distanceMap.put(neighbor, currentDistance + 1);
                    parentMap.put(neighbor, currentVertex);
                    queue.offer(neighbor);
                } else if (!neighbor.equals(parentMap.get(currentVertex))) {
                    // Check for a back edge (a shorter cycle)
                    int backEdgeDistance = distanceMap.get(neighbor) + currentDistance + 1;
                    minCycleLength = Math.min(minCycleLength, backEdgeDistance);
                }
            }
        }
        return minCycleLength == Integer.MAX_VALUE ? -1 : minCycleLength;
    }

    /**
     * This method gets the shortest path between two vertices in a graph with non-negative or negative edge weights using the Bellman-Ford algorithm.
     * */
    public List<Edge> shortestPath(String sourceId, String destinationId, String weightProperty) {
        // Initialize distances from source vertex to all other vertices
        HashMap<Vertex, Integer> distances = new HashMap<>();
        HashMap<Vertex, Vertex> parents = new HashMap<>();
        for (Vertex vertex : vertexMap.values()) {
            distances.put(vertex, Integer.MAX_VALUE);
            parents.put(vertex, null);
        }
        distances.put(vertexMap.get(sourceId), 0);

        // Relax edges repeatedly to find shortest paths
        for (int i = 0; i < vertices - 1; i++) {
            for (Edge edge : edgeMap.values().stream().flatMap(List::stream).collect(Collectors.toList())) {
                Vertex sourceVertex = vertexMap.get(edge.getSourceVertexId());
                Vertex destinationVertex = vertexMap.get(edge.getDestinationVertexId());
                int weight = Integer.parseInt(edge.getProperty(weightProperty)); // Assume weight is stored in the Edge class
                if (distances.get(sourceVertex) != Integer.MAX_VALUE && distances.get(sourceVertex) + weight < distances.get(destinationVertex)) {
                    distances.put(destinationVertex, distances.get(sourceVertex) + weight);
                    parents.put(destinationVertex, sourceVertex);
                }
            }
        }

        // Check for negative weight cycles
        for (Edge edge : edgeMap.values().stream().flatMap(List::stream).collect(Collectors.toList())) {
            Vertex sourceVertex = vertexMap.get(edge.getSourceVertexId());
            Vertex destinationVertex = vertexMap.get(edge.getDestinationVertexId());
            int weight = Integer.parseInt(edge.getProperty(weightProperty)); // Assume weight is stored in the Edge class
            if (distances.get(sourceVertex) != Integer.MAX_VALUE && distances.get(sourceVertex) + weight < distances.get(destinationVertex)) {
                // Negative weight cycle detected
                throw new RuntimeException("Graph contains a negative weight cycle");
            }
        }

        // Reconstruct the shortest path from source to destination
        List<Edge> shortestPath = new ArrayList<>();
        Vertex currentVertex = vertexMap.get(destinationId);
        while (parents.get(currentVertex) != null) {
            Vertex parent = parents.get(currentVertex);
            Edge edge = findEdge(parent, currentVertex);
            shortestPath.add(edge); // Add the edge to the shortest path
            currentVertex = parent;
        }
        Collections.reverse(shortestPath); // Reverse the path to get it from source to destination
        return shortestPath;
    }

    private Edge findEdge(Vertex source, Vertex destination) {
        for (Edge edge : edgeMap.get(source)) {
            if (edge.getDestinationVertexId().equals(destination.getId())) {
                return edge;
            }
        }
        return null; // Edge not found
    }

    public List<Vertex> topologicalSort() {
        List<Vertex> sortedVertices = new ArrayList<>();
        Stack<Vertex> stack = new Stack<>();
        HashSet<Vertex> visited = new HashSet<>();
        // Perform DFS on each vertex
        for (Vertex vertex : vertexMap.values()) {
            if (!visited.contains(vertex)) {
                dfsForTopologicalSort(vertex, visited, stack);
            }
        }
        // Pop vertices from stack to get topological ordering
        while (!stack.isEmpty()) {
            sortedVertices.add(stack.pop());
        }
        return sortedVertices;
    }

    private void dfsForTopologicalSort(Vertex vertex, HashSet<Vertex> visited, Stack<Vertex> stack) {
        visited.add(vertex);
        // Explore all neighbors
        for (Edge edge : edgeMap.getOrDefault(vertex, Collections.emptyList())) {
            Vertex neighbor = vertexMap.get(edge.getDestinationVertexId());
            if (!visited.contains(neighbor)) {
                dfsForTopologicalSort(neighbor, visited, stack);
            }
        }
        // Push vertex to stack after exploring all neighbors
        stack.push(vertex);
    }

    public int fordFulkersonMaxFlow(String sourceId, String sinkId) {
        return fordFulkersonMaxFlow(vertexMap.get(sourceId), vertexMap.get(sinkId), "capacity");
    }

    public int fordFulkersonMaxFlow(String sourceId, String sinkId, String capacityProperty) {
        return fordFulkersonMaxFlow(vertexMap.get(sourceId), vertexMap.get(sinkId), capacityProperty);
    }

    public int getEdgeConnectivity() {
        return getEdgeConnectivity("capacity");
    }

    public int getEdgeConnectivity(String CapacityProperty) {
        int edgeConnectivity = Integer.MAX_VALUE;
        // Iterate through all pairs of vertices
        for (Vertex sourceVertex : vertexMap.values()) {
            for (Edge edge : edgeMap.getOrDefault(sourceVertex, Collections.emptyList())) {
                Vertex destinationVertex = vertexMap.get(edge.getDestinationVertexId());
                // Calculate maximum flow using Ford-Fulkerson algorithm
                int maxFlow = fordFulkersonMaxFlow(sourceVertex, destinationVertex, CapacityProperty);
                // Update edge connectivity as the minimum of all maximum flows
                edgeConnectivity = Math.min(edgeConnectivity, maxFlow);
            }
        }
        return edgeConnectivity;
    }

    private int fordFulkersonMaxFlow(Vertex source, Vertex sink, String capacityProperty) {
        int maxFlow = 0;
        // Initialize residual graph with original capacities
        HashMap<Vertex, List<Edge>> residualGraph = new HashMap<>(edgeMap);
        while (true) {
            // Find augmenting path using Breadth-First Search
            List<Vertex> path = bfsForAugmentingPath(source, sink, residualGraph, capacityProperty);
            if (path.isEmpty()) {
                break; // No augmenting path found, stop the loop
            }
            // Find minimum capacity along the augmenting path
            int minCapacity = Integer.MAX_VALUE;
            for (int i = 0; i < path.size() - 1; i++) {
                Vertex u = path.get(i);
                Vertex v = path.get(i + 1);
                for (Edge edge : residualGraph.getOrDefault(u, Collections.emptyList())) {
                    if (edge.getDestinationVertexId().equals(v.getId())) {
                        minCapacity = Math.min(minCapacity, Integer.parseInt(edge.getProperty(capacityProperty))); // Assume capacity is stored in the Edge class
                        break;
                    }
                }
            }
            // Update residual capacities and reverse edges
            for (int i = 0; i < path.size() - 1; i++) {
                Vertex u = path.get(i);
                Vertex v = path.get(i + 1);
                for (Edge edge : residualGraph.getOrDefault(u, Collections.emptyList())) {
                    if (edge.getDestinationVertexId().equals(v.getId())) {
                        edge.addProperty(capacityProperty, String.valueOf(Integer.parseInt(edge.getProperty(capacityProperty)) - minCapacity));
                        for (Edge reverseEdge : residualGraph.getOrDefault(v, Collections.emptyList())) {
                            if (reverseEdge.getDestinationVertexId().equals(u.getId())) {
                                reverseEdge.addProperty(capacityProperty, String.valueOf(Integer.parseInt(reverseEdge.getProperty(capacityProperty)) + minCapacity));
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            // Increment maximum flow by the minimum capacity of the augmenting path
            maxFlow += minCapacity;
        }
        return maxFlow;
    }

    private List<Vertex> bfsForAugmentingPath(Vertex source, Vertex sink, HashMap<Vertex, List<Edge>> residualGraph, String capacityProperty) {
        Queue<Vertex> queue = new LinkedList<>();
        queue.offer(source);
        HashMap<Vertex, Vertex> parentMap = new HashMap<>();
        parentMap.put(source, null);
        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.poll();
            if (currentVertex.equals(sink)) {
                // Reconstruct augmenting path from sink to source
                List<Vertex> path = new ArrayList<>();
                Vertex vertex = sink;
                while (vertex != null) {
                    path.add(vertex);
                    vertex = parentMap.get(vertex);
                }
                Collections.reverse(path);
                return path;
            }
            for (Edge edge : residualGraph.getOrDefault(currentVertex, Collections.emptyList())) {
                Vertex neighbor = vertexMap.get(edge.getDestinationVertexId());
                if (!parentMap.containsKey(neighbor) && Integer.parseInt(edge.getProperty(capacityProperty)) > 0) {
                    queue.offer(neighbor);
                    parentMap.put(neighbor, currentVertex);
                }
            }
        }
        return Collections.emptyList(); // No augmenting path found
    }

    public List<Edge> kruskalMinimumSpanningTree() {
        return kruskalMinimumSpanningTree("cost");
    }

    public List<Edge> kruskalMinimumSpanningTree(String costProperty) {
        // Sort all edges in non-decreasing order of their weights
        List<Edge> sortedEdges = new ArrayList<>();
        for (List<Edge> edges : edgeMap.values()) {
            sortedEdges.addAll(edges);
        }
        Collections.sort(sortedEdges, Comparator.comparingInt(edge -> Integer.parseInt(edge.getProperty(costProperty))));
        // Create a new disjoint set to track the connected components
        DisjointSet disjointSet = new DisjointSet();
        for (String vertexId : vertexMap.keySet()) {
            disjointSet.makeSet(vertexId);
        }
        List<Edge> minimumSpanningTree = new ArrayList<>();
        int edgeCount = 0;
        // Iterate through sorted edges
        for (Edge edge : sortedEdges) {
            String sourceId = edge.getSourceVertexId();
            String destinationId = edge.getDestinationVertexId();
            // Check if the edge forms a cycle
            if (!disjointSet.find(sourceId).equals(disjointSet.find(destinationId))) {
                // If not, include the edge in the minimum spanning tree
                minimumSpanningTree.add(edge);
                disjointSet.union(sourceId, destinationId);
                edgeCount++;
                // If we have included enough edges to form a spanning tree, break the loop
                if (edgeCount == vertices - 1) {
                    break;
                }
            }
        }
        return minimumSpanningTree;
    }

    public List<List<Vertex>> tarjanStronglyConnectedComponents() {
        List<List<Vertex>> stronglyConnectedComponents = new ArrayList<>();
        // Create maps to store the index and low-link values of each vertex
        Map<Vertex, Integer> indexMap = new HashMap<>();
        Map<Vertex, Integer> lowLinkMap = new HashMap<>();
        // Perform Tarjan's algorithm for each vertex
        for (Vertex vertex : vertexMap.values()) {
            if (!indexMap.containsKey(vertex)) {
                tarjanDFS(vertex, indexMap, lowLinkMap, new Stack<>(), new HashSet<>(), stronglyConnectedComponents);
            }
        }
        return stronglyConnectedComponents;
    }

    private void tarjanDFS(Vertex vertex, Map<Vertex, Integer> indexMap, Map<Vertex, Integer> lowLinkMap, Stack<Vertex> stack, Set<Vertex> onStack, List<List<Vertex>> stronglyConnectedComponents) {
        indexMap.put(vertex, indexMap.size());
        lowLinkMap.put(vertex, indexMap.get(vertex));
        stack.push(vertex);
        onStack.add(vertex);
        // Explore neighbors of the current vertex
        for (Edge edge : edgeMap.getOrDefault(vertex, Collections.emptyList())) {
            Vertex neighbor = vertexMap.get(edge.getDestinationVertexId());
            if (!indexMap.containsKey(neighbor)) {
                tarjanDFS(neighbor, indexMap, lowLinkMap, stack, onStack, stronglyConnectedComponents);
                lowLinkMap.put(vertex, Math.min(lowLinkMap.get(vertex), lowLinkMap.get(neighbor)));
            } else if (onStack.contains(neighbor)) {
                lowLinkMap.put(vertex, Math.min(lowLinkMap.get(vertex), indexMap.get(neighbor)));
            }
        }
        // Check if the current vertex is the root of a strongly connected component
        if (lowLinkMap.get(vertex).equals(indexMap.get(vertex))) {
            List<Vertex> component = new ArrayList<>();
            Vertex v;
            do {
                v = stack.pop();
                onStack.remove(v);
                component.add(v);
            } while (!v.equals(vertex));
            stronglyConnectedComponents.add(component);
        }
    }

    public Map<Vertex, Map<Vertex, Integer>> floydWarshall() {
        return floydWarshall("cost");
    }

    public Map<Vertex, Map<Vertex, Integer>> floydWarshall(String costProperty) {
        final int INF = Integer.MAX_VALUE / 2;
        Map<Vertex, Map<Vertex, Integer>> distanceMap = new HashMap<>();
        // Initialize distance map with direct edge weights
        for (Vertex vertex : vertexMap.values()) {
            Map<Vertex, Integer> vertexDistance = new HashMap<>();
            for (Edge edge : edgeMap.getOrDefault(vertex, Collections.emptyList())) {
                vertexDistance.put(vertexMap.get(edge.getDestinationVertexId()), Integer.parseInt(edge.getProperty(costProperty)));
            }
            distanceMap.put(vertex, vertexDistance);
        }
        // Update distance map using Floyd-Warshall algorithm
        for (Vertex k : vertexMap.values()) {
            for (Vertex i : vertexMap.values()) {
                for (Vertex j : vertexMap.values()) {
                    if (distanceMap.get(i).containsKey(k) && distanceMap.get(k).containsKey(j)) {
                        int throughK = distanceMap.get(i).get(k) + distanceMap.get(k).get(j);
                        int direct = distanceMap.get(i).getOrDefault(j, INF);
                        distanceMap.get(i).put(j, Math.min(direct, throughK));
                    }
                }
            }
        }
        return distanceMap;
    }

    public void setNodes(int nodes){
        this.nodes = nodes;
    }
    public void setVertices(int vertices){
        this.vertices = vertices;
    }
    public void setEdges(int edges){
        this.edges = edges;
    }
    public void setCurrentNumberOfEdges(int currentNumberOfEdges){
        this.currentNumberOfEdges = currentNumberOfEdges;
    }
    public void setType(GraphType type){
        this.type = type;
    }
    public void setVertexMap(HashMap<String, Vertex> vertexMap){
        this.vertexMap = vertexMap;
    }
    public void setEdgeMap(HashMap<Vertex, List<Edge>> edgeMap){
        this.edgeMap = edgeMap;
    }
    public void setColorMap(HashMap<Vertex, Integer> colorMap){
        this.colorMap = colorMap;
    }
    public void setProperties(HashMap<String, String> properties){
        this.properties = properties;
    }
    public void setShardingStrategy(ShardingStrategy shardingStrategy){
        this.shardingStrategy = shardingStrategy;
    }
    public void setTestingStrategy(TestingStrategy testingStrategy){
        this.testingStrategy = testingStrategy;
    }

    public boolean validate(){
        return testingStrategy.validate(this);
    }
    public Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(){
        return shardingStrategy.shard(this);
    }
}