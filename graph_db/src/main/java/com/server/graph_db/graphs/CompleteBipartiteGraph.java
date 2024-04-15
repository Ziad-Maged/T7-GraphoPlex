package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.CompleteBipartiteTestingStrategy;

@SuppressWarnings("ALL")
public class CompleteBipartiteGraph extends Graph{

    public CompleteBipartiteGraph() {
        super();
    }

    public CompleteBipartiteGraph(int nodes, int vertices, int edges, GraphType type) {
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new CompleteBipartiteTestingStrategy());
    }
}
