package com.server.graph_db.alghorithms.strategies.rules;

import com.server.graph_db.graphs.Graph;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "Vertex And Edge Rule", description = "Rule for vertices and edges")
public class VertexAndEdgeRule {
    Graph g;
    public VertexAndEdgeRule(Graph g) {
        this.g = g;
    }
}
