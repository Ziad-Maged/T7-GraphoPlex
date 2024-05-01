package com.server.graph_db.query.databaseconfig.databaseconfigcommands;

import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.core.database.GlobalDatabaseService;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.query.databaseconfig.DatabaseResult;

public class ReshardDatabaseCommand extends DatabaseConfigCommand{
    ShardingStrategy shardingStrategy;
    GlobalDatabaseService databaseConfigService;
    GlobalVertexService vertexService;

    public ReshardDatabaseCommand(ShardingStrategy shardingStrategy) {
        this.shardingStrategy = shardingStrategy;
    }

    @Override
    public void setGlobalDatabaseService(GlobalDatabaseService databaseConfigService) {
        this.databaseConfigService = databaseConfigService;
    }

    public void setVertexService(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    @Override
    public void execute() throws Exception {
        Graph g = vertexService.getGraph();
        g.setShardingStrategy(shardingStrategy);
        String databaseName = databaseConfigService.getCurrentDatabase();
        databaseConfigService.dropDatabase(databaseName);
        vertexService.addGraph(g);
        String message = "Database " + databaseName + " resharded successfully";
        DatabaseResult databaseResult = new DatabaseResult();
        databaseResult.setMessage(message);
        setResult(databaseResult);
    }
}
