package com.server.graph_db.alghorithms;

import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.GlobalVertexService;

import java.util.List;

public class Kruskal {
    GlobalVertexService vertexService;
    List<Edge> minimumSpanningTree;

    public Kruskal(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    public void compute(String costProperty) throws Exception {
        minimumSpanningTree = vertexService.getGraph().kruskalMinimumSpanningTree(costProperty);
    }

    public List<Edge> getMinimumSpanningTree() {
        return minimumSpanningTree;
    }
}
