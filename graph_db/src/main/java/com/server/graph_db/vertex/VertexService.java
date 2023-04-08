package com.server.graph_db.vertex;

import java.util.LinkedList;

public interface VertexService {
    
    public Vertex getVertex(String id);
    public void addVertex(Vertex vertex);
    public void addEdge(String id, Edge edge);
    public void deleteAll();
    public LinkedList<Edge> getEdges(String vertexId);
    public long getVertexCount();
    public Iterable<String> getAllVerticesIds();
    public Iterable<Vertex> getVerticesByIds(Iterable<String> ids);
    public void deleteVertex(String id);


}
