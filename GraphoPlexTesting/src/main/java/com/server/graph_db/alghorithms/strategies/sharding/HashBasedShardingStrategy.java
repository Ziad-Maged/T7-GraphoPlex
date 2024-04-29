package com.server.graph_db.alghorithms.strategies.sharding;

import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashBasedShardingStrategy implements ShardingStrategy {
    @Override
    public Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(Graph g) {
        int nodes = g.getNodes();
        HashMap<String, Vertex> vertexMap = g.getVertexMap();
        HashMap<Vertex, List<Edge>> edgeMap = g.getEdgeMap();
        HashMap<Integer, List<Vertex>> vertexShards = new HashMap<>();
        HashMap<Integer, List<Edge>> edgeShards = new HashMap<>();

        //We group the vertices in a shard that is the hashCode of the vertex id % the number of shards there are.
        for (Vertex vertex : vertexMap.values()) {
            int partitionId = Math.abs(vertex.getId().hashCode() % nodes);
            if (!vertexShards.containsKey(partitionId)) {
                vertexShards.put(partitionId, new ArrayList<>());
            }
            vertexShards.get(partitionId).add(vertex);
        }

        //We group the edges in the shard source vertex
        for (Vertex vertex : edgeMap.keySet()) {
            int partitionId = Math.abs(vertex.getId().hashCode() % nodes);
            if (!edgeShards.containsKey(partitionId)) {
                edgeShards.put(partitionId, new ArrayList<>());
            }
            edgeShards.get(partitionId).addAll(edgeMap.get(vertex));
        }

        return new Tuple<>(vertexShards, edgeShards);
    }
}
