package com.server.graph_db.query.match.eccentricity;

import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.query.match.MatchCommand;

public class EccentricityCommand extends MatchCommand {
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    String vertexId;

    public EccentricityCommand(String vertexId) {
        this.vertexId = vertexId;
    }

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
        int eccentricity = globalVertexService.getGraph().getEccentricity(vertexId);
        EccentricityResult result = new EccentricityResult(eccentricity);
        setResult(result);
    }
}
