package com.server.graph_db.query.match.edgeConnectivity;

import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.query.match.MatchCommand;

public class EdgeConnectivityCommand extends MatchCommand {
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    String costProperty;

    public EdgeConnectivityCommand(String costProperty) {
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
        int edgeConnectivity = globalVertexService.getGraph().getEdgeConnectivity(costProperty);
        EdgeConnectivityResult result = new EdgeConnectivityResult(edgeConnectivity);
        setResult(result);
    }
}
