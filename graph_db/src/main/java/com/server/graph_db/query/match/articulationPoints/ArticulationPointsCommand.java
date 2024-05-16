package com.server.graph_db.query.match.articulationPoints;

import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.query.match.MatchCommand;

import java.util.List;

public class ArticulationPointsCommand extends MatchCommand {
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    @Override
    public void setGlobalVertexService(GlobalVertexService globalVertexService) {
        this.globalVertexService = globalVertexService;
    }

    @Override
    public void setGlobalTraverserManager(GlobalTraverserManager globalTraverserManager) {
        this.globalTraverserManager = globalTraverserManager;
    }

    @Override
    public void execute() throws Exception {
        ArticulationPointsResult result = new ArticulationPointsResult(globalVertexService.getGraph().getArticulationPoints());
        setResult(result);
    }
}
