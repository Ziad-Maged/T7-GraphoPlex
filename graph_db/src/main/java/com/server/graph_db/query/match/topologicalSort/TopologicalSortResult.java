package com.server.graph_db.query.match.topologicalSort;

import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.query.Result;

public class TopologicalSortResult extends Result {
    Iterable<Vertex> vertices;
    public TopologicalSortResult(Iterable<Vertex> vertices) {
        this.vertices = vertices;
        setMessage("Topological Sort Result");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sorted Vertices: ");
        for (Vertex vertex : vertices) {
            sb.append(vertex.getId());
            sb.append(",");
        }

        sb.deleteCharAt(sb.length()-1);

        return sb.toString()+"\n\n" +super.toString();
    }

    public Iterable<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(Iterable<Vertex> vertices) {
        this.vertices = vertices;
    }
}
