package com.server.graph_db.graphs;
import com.server.graph_db.alghorithms.strategies.testing.StarGraphTestingStrategy;

@SuppressWarnings("ALL")
public class StarGraph extends Graph{

    public StarGraph(){
        super();
        this.setProperty("type", "StarGraph");
    }

    public StarGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new StarGraphTestingStrategy());
        this.setProperty("type", "StarGraph");
    }
}
