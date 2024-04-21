package com.server.graph_db.graphs;
import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.alghorithms.strategies.sharding.HashBasedShardingStrategy;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
abstract public class Graph {
    private int nodes; // number of Shards or Servers
    private int vertices; // number of Vertices
    private int edges; // number of Edges
    private GraphType type;
    private HashMap<String, Vertex> vertexMap;
    private HashMap<Vertex, List<Edge>> edgeMap;
    private HashMap<Vertex, Integer> colorMap;
    private HashMap<String, String> properties;
    private ShardingStrategy shardingStrategy;
    private TestingStrategy testingStrategy;

    public Graph(){
        nodes = edges = vertices = 0;
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
        if(vertexMap.containsKey(id) || vertexMap.size() == vertices)
            return;
        Vertex vertex = new Vertex(id);
        vertexMap.put(id, vertex);
        edgeMap.put(vertex, edges);
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
        if(!vertexMap.containsKey(source) || !vertexMap.containsKey(destination))
            return;
        if(type == GraphType.UNDIRECTED){
            edgeMap.get(vertexMap.get(source)).add(new Edge(source, destination));
            edgeMap.get(vertexMap.get(destination)).add(new Edge(destination, source));
        }else{
            edgeMap.get(vertexMap.get(source)).add(new Edge(source, destination));
        }
    }

    public void addEdge(String source, String destination, String label){
        if(!vertexMap.containsKey(source) || !vertexMap.containsKey(destination))
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
    }

    public void addEdge(Edge edge){
        if(!vertexMap.containsKey(edge.getSourceVertexId()) || !vertexMap.containsKey(edge.getDestinationVertexId()))
            return;
        if(type == GraphType.UNDIRECTED){
            edgeMap.get(vertexMap.get(edge.getSourceVertexId())).add(edge);
            Edge incoming = new Edge(edge.getDestinationVertexId(), edge.getSourceVertexId());
            incoming.setLabel(edge.getLabel());
            edgeMap.get(vertexMap.get(edge.getDestinationVertexId())).add(incoming);
        }else{
            edgeMap.get(vertexMap.get(edge.getSourceVertexId())).add(edge);
        }
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
            shortestPath.add(new Edge(parent.getId(), currentVertex.getId())); // Create an edge from parent to current vertex
            currentVertex = parent;
        }
        Collections.reverse(shortestPath); // Reverse the path to get it from source to destination
        return shortestPath;
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