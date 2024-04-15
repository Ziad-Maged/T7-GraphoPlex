package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;

public class CubicGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        if(g.getType() == GraphType.UNDIRECTED){
            for(Vertex e : g.getVertexMap().values()){
                if(g.getDegreeOfVertex(e.getId()) != 3)
                    return false;
            }
            return true;
        }
        //For directed graphs we might have to calculate both in and out degrees
        for(Vertex v : g.getVertexMap().values()){
            if(g.getInDegreeOfVertex(v.getId()) != 3 || g.getOutDegreeOfVertex(v.getId()) != 3)
                return false;
        }
        return true;
    }
}
