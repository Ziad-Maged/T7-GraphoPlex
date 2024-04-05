package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.graphs.utilities.Interval;

@SuppressWarnings("ALL")
public class IntervalGraph extends Graph{

    public IntervalGraph(){
        super();
    }

    public IntervalGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        for(Vertex v : this.getEdgeMap().keySet()){
            if(!v.isPropertyExist("interval"))
                return false;
            Interval i = new Interval(v.getProperty("interval"));
            for(Edge e : this.getEdgeMap().get(v)){
                Interval j = new Interval(this.getVertexMap().get(e.getDestinationVertexId()).getProperty("interval"));
                if(!i.overlaps(j))
                    return false;
            }
        }
        return true;
    }
}
