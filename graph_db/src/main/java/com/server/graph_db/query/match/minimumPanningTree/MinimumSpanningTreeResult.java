package com.server.graph_db.query.match.minimumPanningTree;

import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.query.Result;

public class MinimumSpanningTreeResult extends Result {
    Iterable<Edge> edges;

    public MinimumSpanningTreeResult(Iterable<Edge> edges) {
        this.edges = edges;
        setMessage("Minimum Spanning Tree");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMessage());
        sb.append("\n");
        for (Edge edge : edges) {
            sb.append(edge.toString());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString()+"\n\n" +super.toString();
    }

    public Iterable<Edge> getEdges() {
        return edges;
    }

    public void setEdges(Iterable<Edge> edges) {
        this.edges = edges;
    }
}
