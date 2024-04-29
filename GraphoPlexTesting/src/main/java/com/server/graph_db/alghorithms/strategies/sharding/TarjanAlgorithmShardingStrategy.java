package com.server.graph_db.alghorithms.strategies.sharding;

import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TarjanAlgorithmShardingStrategy implements ShardingStrategy {
    @Override
    public Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(Graph g) {
        int nodes = g.getNodes();
        int currentNode = 0;
        HashMap<Integer, List<Vertex>> vertexShards = new HashMap<>();
        HashMap<Integer, List<Edge>> edgeShards = new HashMap<>();

        for (int i = 0; i < nodes; i++) {
            vertexShards.put(i, new ArrayList<>());
            edgeShards.put(i, new ArrayList<>());
        }

        List<List<Vertex>> tarjanVertices = g.tarjanStronglyConnectedComponents();

        for(List<Vertex> vertices : tarjanVertices) {
            vertexShards.get(currentNode).addAll(vertices);
            for(Vertex v : vertices) {
                edgeShards.get(currentNode).addAll(g.getEdgeMap().get(v));
            }
            currentNode = (currentNode + 1) % nodes;
        }

        return new Tuple<>(vertexShards, edgeShards);
    }
}
