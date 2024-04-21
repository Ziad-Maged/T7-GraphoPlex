package com.server.graph_db.alghorithms;

import com.server.graph_db.core.vertex.GlobalVertexService;

public class FordFulkerson {
    GlobalVertexService vertexService;
    int maxFlow = 0;

    public FordFulkerson(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    public void compute(String source, String sink, String capacityField) throws Exception {
        maxFlow = vertexService.getGraph().fordFulkersonMaxFlow(source, sink, capacityField);
    }

    public int getMaxFlow() {
        return maxFlow;
    }
}
