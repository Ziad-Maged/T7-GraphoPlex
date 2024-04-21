package com.server.graph_db.alghorithms;

import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.core.vertex.Vertex;

import java.util.List;

public class TopologicalSort {
    GlobalVertexService vertexService;
    List<Vertex> sortedVertices;

    public TopologicalSort(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    public void compute() throws Exception {
        sortedVertices = vertexService.getGraph().topologicalSort();
    }

    public List<Vertex> getSortedVertices() {
        return sortedVertices;
    }
}
