package com.server.graph_db.alghorithms.strategies.sharding;

import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.util.*;

public class RandomPartitionShardingStrategy implements ShardingStrategy {
    @Override
    public Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(Graph g) {
        int nodes = g.getNodes();
        HashMap<String, Vertex> vertexMap = g.getVertexMap();
        HashMap<Vertex, List<Edge>> edgeMap = g.getEdgeMap();
        HashMap<Integer, List<Vertex>> vertexShards = new HashMap<>();
        HashMap<Integer, List<Edge>> edgeShards = new HashMap<>();

        for (int i = 0; i < nodes; i++) {
            vertexShards.put(i, new ArrayList<>());
            edgeShards.put(i, new ArrayList<>());
        }

        //Randomly assign vertices to shards
        //Edges are assigned to the same shard as the source vertex they are connected to.
        for(Vertex v : vertexMap.values()){
            int shard = new Random().nextInt(nodes);
            vertexShards.get(shard).add(v);
            edgeShards.get(shard).addAll(edgeMap.get(v));
        }
        return new Tuple<>(vertexShards, edgeShards);
    }
}
