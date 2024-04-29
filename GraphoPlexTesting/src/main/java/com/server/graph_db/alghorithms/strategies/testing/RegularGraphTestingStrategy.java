package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;

public class RegularGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        if(g.getType() == GraphType.UNDIRECTED){
            int degree = g.getDegreeOfVertex(g.getVertexMap().keySet().toArray()[0].toString());
            for(String vertexID : g.getVertexMap().keySet()){
                if(g.getDegreeOfVertex(vertexID) != degree)
                    return false;
            }
        }else {
            int inDegree = g.getInDegreeOfVertex(g.getVertexMap().keySet().toArray()[0].toString());
            int outDegree = g.getOutDegreeOfVertex(g.getVertexMap().keySet().toArray()[0].toString());
            for(String vertexID : g.getVertexMap().keySet()){
                if(g.getInDegreeOfVertex(vertexID) != inDegree || g.getOutDegreeOfVertex(vertexID) != outDegree)
                    return false;
            }
        }
        return true;
    }
}
