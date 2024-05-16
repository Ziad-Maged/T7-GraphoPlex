package com.server.graph_db.query.match.bridgeEdges;

import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.query.Result;

import java.util.List;

public class BridgeEdgesResult extends Result {
    List<Edge> edges;

    public BridgeEdgesResult(List<Edge> edges) {
        this.edges = edges;
        setMessage("Bridge edges found: " + edges.size());
    }

    @Override
    public String toString() {
        return "Bridge Edges: " + edges+"\n\n" +super.toString();
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }
}
