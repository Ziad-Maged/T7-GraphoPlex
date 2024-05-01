package com.server.graph_db.query.match.minimumPanningTree;

import com.server.graph_db.alghorithms.Kruskal;
import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.query.match.MatchCommand;

public class MinimumSpanningTreeCommand extends MatchCommand {
    String costProperty;
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    Kruskal kruskalAlgorithm;

    public MinimumSpanningTreeCommand(String costProperty) {
        this.costProperty = costProperty;
    }
    @Override
    public void setGlobalVertexService(GlobalVertexService globalVertexService) {
        this.globalVertexService = globalVertexService;
        kruskalAlgorithm = new Kruskal(globalVertexService);
    }

    @Override
    public void setGlobalTraverserManager(GlobalTraverserManager globalTraverserManager) {
        this.globalTraverserManager = globalTraverserManager;
    }

    @Override
    public void execute() throws Exception {
        kruskalAlgorithm.compute(costProperty);
        Iterable<Edge> edges = kruskalAlgorithm.getMinimumSpanningTree();
        MinimumSpanningTreeResult result = new MinimumSpanningTreeResult(edges);
        setResult(result);
    }
}
