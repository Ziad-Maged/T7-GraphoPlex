package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;

public class TournamentGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        if(g.getType() == GraphType.UNDIRECTED)
            return false;
        for(Vertex source : g.getEdgeMap().keySet()){
            for(Edge edge : g.getEdgeMap().get(source)){
                if(g.hasEdge(edge.getDestinationVertexId(), source.getId()))
                    return false;
            }
        }
        return true;
    }
}
