package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.RegularGraphTestingStrategy;

@SuppressWarnings("ALL")
public class RegularGraph extends Graph{

    public RegularGraph(){
        super();
        this.setProperty("type", "RegularGraph");
    }

    public RegularGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new RegularGraphTestingStrategy());
        this.setProperty("type", "RegularGraph");
    }
}
