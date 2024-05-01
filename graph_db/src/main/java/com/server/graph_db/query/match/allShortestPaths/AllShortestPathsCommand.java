package com.server.graph_db.query.match.allShortestPaths;

import com.server.graph_db.alghorithms.FloydWarshall;
import com.server.graph_db.core.traversers.GlobalTraverserManager;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.query.match.MatchCommand;

import java.util.Map;

public class AllShortestPathsCommand extends MatchCommand {
    String costProperty;
    GlobalVertexService globalVertexService;
    GlobalTraverserManager globalTraverserManager;
    FloydWarshall floydWarshallAlgorithm;

    public AllShortestPathsCommand(String costProperty) {
        this.costProperty = costProperty;
    }

    @Override
    public void setGlobalVertexService(GlobalVertexService globalVertexService) {
        this.globalVertexService = globalVertexService;
        floydWarshallAlgorithm = new FloydWarshall(globalVertexService);
    }

    @Override
    public void setGlobalTraverserManager(GlobalTraverserManager globalTraverserManager) {
        this.globalTraverserManager = globalTraverserManager;
    }

    @Override
    public void execute() throws Exception {
        floydWarshallAlgorithm.compute(costProperty);
        Map<Vertex, Map<Vertex, Integer>> allShortestPaths = floydWarshallAlgorithm.getShortestPaths();
        AllShortestPathsResult result = new AllShortestPathsResult(allShortestPaths);
        setResult(result);
    }
}
