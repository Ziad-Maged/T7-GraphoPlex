package com.server.graph_db.query.match.stronglyConnectedComponents;

import com.server.graph_db.alghorithms.Tarjan;
import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.query.match.MatchCommand;

import java.util.List;

public class StronglyConnectedComponentsCommand extends MatchCommand {
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    Tarjan tarjanAlgorithm;
    @Override
    public void setGlobalVertexService(GlobalVertexService globalVertexService) {
        this.globalVertexService = globalVertexService;
        tarjanAlgorithm = new Tarjan(globalVertexService);
    }

    @Override
    public void setGlobalTraverserManager(GlobalTraverserManager globalTraverserManager) {
        this.globalTraverserManager = globalTraverserManager;
    }

    @Override
    public void execute() throws Exception {
        tarjanAlgorithm.compute();
        List<List<Vertex>> scc = tarjanAlgorithm.getStronglyConnectedComponents();
        StronglyConnectedComponentsResult result = new StronglyConnectedComponentsResult(scc);
        setResult(result);
    }
}
