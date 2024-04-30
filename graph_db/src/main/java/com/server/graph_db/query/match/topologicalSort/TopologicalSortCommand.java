package com.server.graph_db.query.match.topologicalSort;

import com.server.graph_db.alghorithms.TopologicalSort;
import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.query.match.MatchCommand;

public class TopologicalSortCommand extends MatchCommand {
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    TopologicalSort topologicalSortAlgorithm;

    public TopologicalSortCommand() {
    }
    @Override
    public void setGlobalVertexService(GlobalVertexService globalVertexService) {
        this.globalVertexService = globalVertexService;
        initializeTopologicalSortAlgorithm();
    }

    @Override
    public void setGlobalTraverserManager(GlobalTraverserManager globalTraverserManager) {
        this.globalTraverserManager = globalTraverserManager;
    }

    public void initializeTopologicalSortAlgorithm() {
        this.topologicalSortAlgorithm = new TopologicalSort(globalVertexService);
    }

    @Override
    public void execute() throws Exception {
        topologicalSortAlgorithm.compute();
        Iterable<Vertex> vertices = topologicalSortAlgorithm.getSortedVertices();
        TopologicalSortResult topologicalSortResult = new TopologicalSortResult(vertices);
        setResult(topologicalSortResult);
    }
}
