package com.server.graph_db.alghorithms.strategies.sharding;

import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.util.*;

public class EqualPartitionShardingStrategy implements ShardingStrategy {
    @Override
    public Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(Graph g) {
        int nodes = g.getNodes();
        int vpn = g.getVertices() / nodes;
        int remainingVertices = g.getVertices() % nodes;
        int epn = g.getEdges() / nodes;
        int remainingEdges = g.getEdges() % nodes;

        HashMap<Integer, List<Vertex>> vertexShards = new HashMap<>();
        HashMap<Integer, List<Edge>> edgeShards = new HashMap<>();

        List<Vertex> vertices = new ArrayList<>(g.getVertexMap().values());
        List<Edge> edges = new ArrayList<>();
        for (List<Edge> edgeList : g.getEdgeMap().values()) {
            edges.addAll(edgeList);
        }
        Iterator<Vertex> vertexIterator = vertices.iterator();
        Iterator<Edge> edgeIterator = edges.iterator();

        //We partition the vertices and edges into equal parts
        for (int i = 0; i < nodes; i++) {
            vertexShards.put(i, new ArrayList<>());
            edgeShards.put(i, new ArrayList<>());
            int verticesToTake = vpn;
            if (remainingVertices > 0) {
                verticesToTake++;
                remainingVertices--;
            }
            int edgesToTake = epn;
            if (remainingEdges > 0) {
                edgesToTake++;
                remainingEdges--;
            }
            for (int j = 0; j < verticesToTake; j++) {
                vertexShards.get(i).add(vertexIterator.next());
            }
            for (int j = 0; j < edgesToTake; j++) {
                edgeShards.get(i).add(edgeIterator.next());
            }
        }
        return new Tuple<>(vertexShards, edgeShards);
    }
}
