package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.CompleteBipartiteGraphTestingStrategy;

public class NormalGraph extends Graph {
    public NormalGraph() {
        super();
    }

    public NormalGraph(int nodes, int vertices, int edges, GraphType type) {
        super(nodes, vertices, edges, type);
        this.setProperty("type", "NormalGraph");
    }

    @Override
    public boolean validate() {
        if(this.getTestingStrategy() == null)
            return true;
        else return super.validate();
    }
}
