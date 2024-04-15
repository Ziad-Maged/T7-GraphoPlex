package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;

public class LineGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        // if the degree of the graph is less than 2, then it is not a line graph
        if(g.getType() == GraphType.UNDIRECTED){
            for(Vertex v : g.getEdgeMap().keySet()){
                if(g.getDegreeOfVertex(v.getId()) < 2)
                    return false;
            }
        }else {
            for(Vertex v : g.getEdgeMap().keySet()){
                int inDegree = g.getInDegreeOfVertex(v.getId());
                int outDegree = g.getOutDegreeOfVertex(v.getId());
                if(inDegree < 2 || outDegree < 2)
                    return false;
            }
        }
        for(Vertex v : g.getEdgeMap().keySet()){
            if(!v.isPropertyExist("label") || !v.isPropertyExist("destinationID") || !v.isPropertyExist("sourceID"))
                return false;
            for(Edge e : g.getEdgeMap().get(v)){
                Vertex v2 = g.getVertexMap().get(e.getDestinationVertexId());
                if(!v2.isPropertyExist("label") || !v2.isPropertyExist("destinationID") || !v2.isPropertyExist("sourceID"))
                    return false;
                if(!v.getProperty("sourceID").equals(v2.getProperty("sourceID")) && !v.getProperty("destinationID").equals(v2.getProperty("destinationID")) && !v.getProperty("sourceID").equals(v2.getProperty("destinationID")) && !v.getProperty("destinationID").equals(v2.getProperty("sourceID")))
                    return false;
            }
        }
        return true;
    }
}
