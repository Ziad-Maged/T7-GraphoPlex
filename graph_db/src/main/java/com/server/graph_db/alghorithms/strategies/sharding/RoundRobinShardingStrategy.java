package com.server.graph_db.alghorithms.strategies.sharding;

import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.util.*;

public class RoundRobinShardingStrategy implements ShardingStrategy {
    @Override
    public Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(Graph g) {
        int nodes = g.getNodes();
        int currentShard = 0;
        HashMap<String, Vertex> vertexMap = g.getVertexMap();
        HashMap<Vertex, List<Edge>> edgeMap = g.getEdgeMap();
        HashMap<Integer, List<Vertex>> vertexShards = new HashMap<>();
        HashMap<Integer, List<Edge>> edgeShards = new HashMap<>();

        for(int i = 0; i < nodes; i++){
            vertexShards.put(i, new ArrayList<>());
            edgeShards.put(i, new ArrayList<>());
        }

        //We shard the vertices and edges in a round-robin fashion.
        //All edges are sharded to the same shard as their source vertex.
        for(Vertex v : vertexMap.values()){
            vertexShards.get(currentShard).add(v);
            edgeShards.get(currentShard).addAll(edgeMap.get(v));
            currentShard = (currentShard + 1) % nodes;
        }

        return new Tuple<>(vertexShards, edgeShards);
    }
}
