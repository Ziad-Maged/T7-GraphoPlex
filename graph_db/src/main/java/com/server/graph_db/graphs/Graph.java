package com.server.graph_db.graphs;

abstract public class Graph {
    private int nodes; // number of Shards or Servers
    private int vertices; // number of Vertices
    private int edges; // number of Edges

    public Graph(){
        nodes = edges = vertices = 0;
    }
    public  Graph(int nodes, int vertices, int edges){
        this.nodes = nodes;
        this.vertices = vertices;
        this.edges = edges;
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

    public void setNodes(int nodes){
        this.nodes = nodes;
    }
    public void setVertices(int vertices){
        this.vertices = vertices;
    }
    public void setEdges(int edges){
        this.edges = edges;
    }

    abstract public boolean validate();
}
