package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;

public class EulerianGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        // One way to check if a graph is Eulerian is to check if the degree of each vertex is even
        if(g.getType() == GraphType.UNDIRECTED){
            for(String id : g.getVertexMap().keySet()){
                if(g.getDegreeOfVertex(id) % 2 != 0)
                    return false;
            }
        }else {
            for(String id : g.getVertexMap().keySet()){
                if(g.getOutDegreeOfVertex(id) % 2 != 0 || g.getInDegreeOfVertex(id) % 2 != 0)
                    return false;
            }
        }
        return true;
    }
}
