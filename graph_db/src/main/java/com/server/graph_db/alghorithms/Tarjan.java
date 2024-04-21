package com.server.graph_db.alghorithms;

import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.core.vertex.Vertex;

import java.util.List;

public class Tarjan {
    GlobalVertexService vertexService;
    List<List<Vertex>> stronglyConnectedComponents;

    public Tarjan(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    public void compute() throws Exception {
        stronglyConnectedComponents = vertexService.getGraph().tarjanStronglyConnectedComponents();
    }

    public List<List<Vertex>> getStronglyConnectedComponents() {
        return stronglyConnectedComponents;
    }
}
