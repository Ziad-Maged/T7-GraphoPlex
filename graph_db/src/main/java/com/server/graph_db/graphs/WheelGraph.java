package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.WheelGraphTestingStrategy;

@SuppressWarnings("ALL")
public class WheelGraph extends Graph{

    public WheelGraph(){
        super();
        this.setProperty("type", "WheelGraph");
    }

    public WheelGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new WheelGraphTestingStrategy());
        this.setProperty("type", "WheelGraph");
    }
}
