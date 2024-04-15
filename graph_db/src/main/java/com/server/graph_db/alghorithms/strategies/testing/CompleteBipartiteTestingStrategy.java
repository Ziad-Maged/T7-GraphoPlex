package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CompleteBipartiteTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        if(!g.isBipartite())
            return false;

        List<Vertex> partition1 = new ArrayList<>();
        List<Vertex> partition2 = new ArrayList<>();

        for(Map.Entry<Vertex, Integer> e : g.getColorMap().entrySet()){
            if(e.getValue() == 0)
                partition1.add(e.getKey());
            else
                partition2.add(e.getKey());
        }

        g.setColorMap(null);

        for (Vertex vertex1 : partition1) {
            for (Vertex vertex2 : partition2) {
                if (!g.hasEdge(vertex1.getId(), vertex2.getId())) {
                    return false;
                }
            }
        }
        return true;
    }
}
