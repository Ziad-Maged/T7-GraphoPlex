package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.EulerianGraphTestingStrategy;

@SuppressWarnings("ALL")
public class EulerianGraph extends Graph{

    public EulerianGraph(){
        super();
    }

    public EulerianGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new EulerianGraphTestingStrategy());
    }
}
