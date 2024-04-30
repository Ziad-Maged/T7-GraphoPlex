package com.server.graph_db.query.match.maximumFlow;

import com.server.graph_db.alghorithms.FordFulkerson;
import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.query.match.MatchCommand;

public class MaximumFlowCommand extends MatchCommand {
    String source;
    String sink;
    String costField;
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    FordFulkerson fordFulkersonAlgorithm;

    public MaximumFlowCommand(String source, String sink, String costField) {
        this.source = source;
        this.sink = sink;
        this.costField = costField;
    }
    @Override
    public void setGlobalVertexService(GlobalVertexService globalVertexService) {
        this.globalVertexService = globalVertexService;
        fordFulkersonAlgorithm = new FordFulkerson(globalVertexService);
    }

    @Override
    public void setGlobalTraverserManager(GlobalTraverserManager globalTraverserManager) {
        this.globalTraverserManager = globalTraverserManager;
    }

    @Override
    public void execute() throws Exception {
        fordFulkersonAlgorithm.compute(source, sink, costField);
        int maxFlow = fordFulkersonAlgorithm.getMaxFlow();
        MaximumFlowResult result = new MaximumFlowResult(maxFlow);
        setResult(result);
    }
}
