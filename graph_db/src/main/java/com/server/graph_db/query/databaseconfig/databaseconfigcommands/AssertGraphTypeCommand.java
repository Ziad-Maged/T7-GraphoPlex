package com.server.graph_db.query.databaseconfig.databaseconfigcommands;

import com.server.graph_db.core.database.GlobalDatabaseService;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.utilities.GraphConvert;
import com.server.graph_db.query.databaseconfig.DatabaseResult;

public class AssertGraphTypeCommand extends DatabaseConfigCommand{
    GlobalDatabaseService databaseConfigService;
    GlobalVertexService globalVertexService;
    String graphType;
    int rows, columns;

    public AssertGraphTypeCommand(GlobalVertexService globalVertexService, String graphType) {
        this.globalVertexService = globalVertexService;
        this.graphType = graphType;
        this.rows = this.columns = -1;
    }

    public AssertGraphTypeCommand(GlobalVertexService globalVertexService, int rows, int columns) {
        this.globalVertexService = globalVertexService;
        graphType = "GRID";
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void setGlobalDatabaseService(GlobalDatabaseService databaseConfigService) {
        this.databaseConfigService = databaseConfigService;
    }

    @Override
    public void execute() throws Exception {
        Graph g = globalVertexService.getGraph();
        boolean checkForBipartite = false;
        switch (graphType){
            case "GRID" -> g = GraphConvert.toGridGraph(g, rows, columns);
            case "STAR" -> g = GraphConvert.toStarGraph(g);
            case "SPLIT" -> g = GraphConvert.toSplitGraph(g);
            case "WHEEL" -> g = GraphConvert.toWheelGraph(g);
            case "CUBIC" -> g = GraphConvert.toCubicGraph(g);
            case "HAMILTONIAN" -> g = GraphConvert.toHamiltonianGraph(g);
            case "EULERIAN" -> g = GraphConvert.toEulerianGraph(g);
            case "TOURNAMENT" -> g = GraphConvert.toTournamentGraph(g);
            case "REGULAR" -> g = GraphConvert.toRegularGraph(g);
            case "LINE" -> g = GraphConvert.toLineGraph(g);
            case "INTERVAL" -> g = GraphConvert.toIntervalGraph(g);
            case "REGULAR_BIPARTITE" -> g = GraphConvert.toRegularBipartiteGraph(g);
            case "COMPLETE_BIPARTITE" -> g = GraphConvert.toCompleteBipartiteGraph(g);
            case "BIPARTITE" -> checkForBipartite = true;
            default -> throw new Exception("Invalid graph type: " + graphType);
        }
        boolean assertion = (checkForBipartite) ? g.isBipartite() : g.validate();
        String message = "Validation Result: " + assertion;
        DatabaseResult result = new DatabaseResult();
        result.setMessage(message);
        setResult(result);
    }
}
