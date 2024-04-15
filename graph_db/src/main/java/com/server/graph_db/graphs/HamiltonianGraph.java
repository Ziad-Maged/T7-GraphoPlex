package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.HamiltonianGraphTestingStrategy;

@SuppressWarnings("ALL")
public class HamiltonianGraph extends Graph{

    public HamiltonianGraph(){
        super();
    }

    public HamiltonianGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new HamiltonianGraphTestingStrategy());
    }
}
