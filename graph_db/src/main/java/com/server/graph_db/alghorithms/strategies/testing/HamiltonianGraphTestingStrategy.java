package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.util.Collections;
import java.util.HashMap;

public class HamiltonianGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        if(g.getVertexMap().size() < 3 || g.getVertexMap().isEmpty())
            return false;
        for(String id : g.getVertexMap().keySet()){
            HashMap<String, Boolean> visited = new HashMap<>();
            visited.put(id, true);
            if(dfs(g, id, visited, 1))
                return true;
        }
        return false;
    }

    private boolean dfs(Graph g, String id, HashMap<String, Boolean> visited, int count){
        if(count == g.getVertexMap().size())
            return true;
        for(Edge e : g.getEdgeMap().getOrDefault(g.getVertexMap().get(id), Collections.emptyList())){
            Vertex nextVertex = g.getVertexMap().get(e.getDestinationVertexId());
            if(!visited.getOrDefault(nextVertex.getId(), false)){
                visited.put(nextVertex.getId(), true);
                if(dfs(g, nextVertex.getId(), visited, count + 1))
                    return true;
                visited.put(nextVertex.getId(), false);
            }
        }
        return false;
    }
}
