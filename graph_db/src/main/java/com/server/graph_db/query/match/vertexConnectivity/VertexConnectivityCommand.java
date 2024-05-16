package com.server.graph_db.query.match.vertexConnectivity;

import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.query.match.MatchCommand;

public class VertexConnectivityCommand extends MatchCommand {
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    String costProperty;

    public VertexConnectivityCommand(String costProperty) {
        this.costProperty = costProperty;
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
        int vertexConnectivity = globalVertexService.getGraph().getVertexConnectivity(costProperty);
        VertexConnectivityResult result = new VertexConnectivityResult(vertexConnectivity);
        setResult(result);
    }
}
