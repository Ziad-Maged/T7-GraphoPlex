package com.server.graph_db.graphs;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;

import java.util.*;

@SuppressWarnings("ALL")
abstract public class Graph {
    private int nodes; // number of Shards or Servers
    private int vertices; // number of Vertices
    private int edges; // number of Edges
    private GraphType type;
    private HashMap<String, Vertex> vertexMap;
    private HashMap<Vertex, List<Edge>> edgeMap;
    private HashMap<Vertex, Integer> colorMap;

    public Graph(){
        nodes = edges = vertices = 0;
        vertexMap = new HashMap<>();
        edgeMap = new HashMap<>();
        type = GraphType.DIRECTED;
    }
    public  Graph(int nodes, int vertices, int edges, GraphType type){
        this.nodes = nodes;
        this.vertices = vertices;
        this.edges = edges;
        this.type = type;
        vertexMap = new HashMap<>(vertices);
        edgeMap = new HashMap<>(edges);
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
    HashMap<Vertex, Integer> getColorMap(){
        return colorMap;
    }

    public void addVertex(String id){
        if(vertexMap.containsKey(id) || vertexMap.size() == vertices)
            return;
        vertexMap.put(id, new Vertex(id));
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
    void setColorMap(HashMap<Vertex, Integer> colorMap){
        this.colorMap = colorMap;
    }

    abstract public boolean validate();
}
