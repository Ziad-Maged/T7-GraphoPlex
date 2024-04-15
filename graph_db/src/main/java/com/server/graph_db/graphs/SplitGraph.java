package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.SplitGraphTestingStrategy;

@SuppressWarnings("ALL")
public class SplitGraph extends Graph{

    public SplitGraph(){
        super();
    }

    public SplitGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new SplitGraphTestingStrategy());
    }
}
