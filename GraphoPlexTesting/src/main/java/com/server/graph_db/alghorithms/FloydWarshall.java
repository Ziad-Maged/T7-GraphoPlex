package com.server.graph_db.alghorithms;

import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.core.vertex.Vertex;

import java.util.Map;

public class FloydWarshall {
    GlobalVertexService vertexService;
    Map<Vertex, Map<Vertex, Integer>> shortestPaths;

    public FloydWarshall(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    public void compute() throws Exception {
        shortestPaths = vertexService.getGraph().floydWarshall();
    }

    public Map<Vertex, Map<Vertex, Integer>> getShortestPaths() {
        return shortestPaths;
    }
}
