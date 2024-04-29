package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.utilities.Interval;

public class IntervalGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        for(Vertex v : g.getEdgeMap().keySet()){
            if(!v.isPropertyExist("interval"))
                return false;
            Interval i = new Interval(v.getProperty("interval"));
            for(Edge e : g.getEdgeMap().get(v)){
                Interval j = new Interval(g.getVertexMap().get(e.getDestinationVertexId()).getProperty("interval"));
                if(!i.overlaps(j))
                    return false;
            }
        }
        return true;
    }
}
