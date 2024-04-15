package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.IntervalGraphTestingStrategy;

@SuppressWarnings("ALL")
public class IntervalGraph extends Graph{

    public IntervalGraph(){
        super();
    }

    public IntervalGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new IntervalGraphTestingStrategy());
    }
}
