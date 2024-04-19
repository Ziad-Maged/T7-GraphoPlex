package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.RegularBipartiteGraphTestingStrategy;

@SuppressWarnings("ALL")
public class RegularBipartiteGraph extends Graph{

    public RegularBipartiteGraph(){
        super();
        this.setProperty("type", "RegularBipartiteGraph");
    }

    public RegularBipartiteGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new RegularBipartiteGraphTestingStrategy());
        this.setProperty("type", "RegularBipartiteGraph");
    }
}
