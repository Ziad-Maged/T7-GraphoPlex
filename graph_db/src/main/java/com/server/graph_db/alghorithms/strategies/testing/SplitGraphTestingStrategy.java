package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;

import java.util.ArrayList;
import java.util.List;

public class SplitGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        List<String> independentSet = new ArrayList<>();
        List<String> cliqueSet = new ArrayList<>();
        if(g.getType() == GraphType.UNDIRECTED){
            for(String vertexId : g.getVertexMap().keySet()){
                if(g.getDegreeOfVertex(vertexId) == 0)
                    independentSet.add(vertexId);
                else
                    cliqueSet.add(vertexId);
            }
            if(independentSet.isEmpty() || cliqueSet.isEmpty())
                return false;
            int expectedDegreeOfCliqueVertices = cliqueSet.size() - 1; // since every vertex has to be connected to the other vertices, excluding loops.
            for(String vertexID : cliqueSet){
                if(g.getDegreeOfVertex(vertexID) != expectedDegreeOfCliqueVertices)
                    return false;
            }
        }else {
            for(String vertexId : g.getVertexMap().keySet()){
                if(g.getOutDegreeOfVertex(vertexId) == 0 && g.getInDegreeOfVertex(vertexId) == 0)
                    independentSet.add(vertexId);
                else
                    cliqueSet.add(vertexId);
            }
            if(independentSet.isEmpty() || cliqueSet.isEmpty())
                return false;
            int expectedDegreeOfCliqueVertices = cliqueSet.size() - 1; // since every vertex has to be connected to the other vertices, excluding loops.
            for(String vertexID : cliqueSet){
                if(g.getOutDegreeOfVertex(vertexID) != expectedDegreeOfCliqueVertices || g.getInDegreeOfVertex(vertexID) != expectedDegreeOfCliqueVertices)
                    return false;
            }
        }
        return true;
    }
}
