package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.LineGraphTestingStrategy;

/**
 * Each vertex has to have a sourceID, and destinationID attributes to be able to compare them together to validate the Line graph.
 * */
@SuppressWarnings("ALL")
public class LineGraph extends Graph{

    public LineGraph(){
        super();
    }

    public LineGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
        this.setTestingStrategy(new LineGraphTestingStrategy());
    }
}
