package com.server.graph_db.query.match.girth;

import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.query.match.MatchCommand;

public class GirthCommand extends MatchCommand {
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
        int girth = globalVertexService.getGraph().getGirth();
        GirthResult result = new GirthResult(girth);
        setResult(result);
    }
}
