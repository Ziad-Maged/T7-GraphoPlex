package com.server.graph_db.graphs;
import com.server.graph_db.alghorithms.strategies.testing.CubicGraphTestingStrategy;

@SuppressWarnings("ALL")
public class CubicGraph extends Graph{

    public CubicGraph(){
        super();
    }

    public CubicGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new CubicGraphTestingStrategy());
    }
}
