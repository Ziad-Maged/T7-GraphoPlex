package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;

public class WheelGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        // For a Wheel Graph the center (hub) vertex has degree equal to the number of vertices minus 1 (n-1) and all other vertices have degree equal to 3.
        int numberOfVertices = g.getVertexMap().size();
        Vertex center = null;
        if(g.getType() == GraphType.UNDIRECTED){
            for(String id : g.getVertexMap().keySet()){
                if(g.getDegreeOfVertex(id) == numberOfVertices - 1){
                    center = g.getVertexMap().get(id);
                    break;
                }
            }
            if(center == null)
                return false;
            for(String id : g.getVertexMap().keySet()){
                if(!id.equals(center.getId()) && g.getDegreeOfVertex(id) != 3)
                    return false;
            }
        }else {
            for(String id : g.getVertexMap().keySet()){
                int inDegree = g.getInDegreeOfVertex(id);
                int outDegree = g.getOutDegreeOfVertex(id);
                if(inDegree == numberOfVertices - 1 && outDegree == numberOfVertices - 1){
                    center = g.getVertexMap().get(id);
                    break;
                }
            }
            if(center == null)
                return false;
            for(String id : g.getVertexMap().keySet()){
                int inDegree = g.getInDegreeOfVertex(id);
                int outDegree = g.getOutDegreeOfVertex(id);
                if(!id.equals(center.getId()) && inDegree != 3 && outDegree != 3)
                    return false;
            }
        }
        return true;
    }
}
