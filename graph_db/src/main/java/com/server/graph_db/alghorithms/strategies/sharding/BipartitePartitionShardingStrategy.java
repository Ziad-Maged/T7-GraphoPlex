package com.server.graph_db.alghorithms.strategies.sharding;
import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import java.util.*;

public class BipartitePartitionShardingStrategy implements ShardingStrategy {
    @Override
    public Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(Graph g) {
        //If the graph is not bipartite, return null. We do not partition in this case, since this is a sharding strategy exclusively for bipartite graphs.
        if(!g.isBipartite()){
            g.setColorMap(null);
            return null;
        }
        //If the graph is Bipartite, then we partition the graph.
        int nodes = g.getNodes();
        int nodesPerSet = nodes / 2;
        int currentNode = 0;
        HashMap<String, Vertex> vertexMap = g.getVertexMap();
        HashMap<Vertex, List<Edge>> edgeMap = g.getEdgeMap();
        HashMap<Vertex, Integer> colorMap = g.getColorMap();
        HashMap<Integer, List<Vertex>> vertexShards = new HashMap<>();
        HashMap<Integer, List<Edge>> edgeShards = new HashMap<>();

        for(int i = 0; i < nodesPerSet; i++) {
            vertexShards.put(i, new ArrayList<>());
            edgeShards.put(i, new ArrayList<>());
        }

        for(Vertex vertex : vertexMap.values()){
            int color = colorMap.get(vertex);
            int shard = vertex.hashCode() % nodesPerSet;
            vertexShards.get(shard).add(vertex);
            List<Edge> edges = edgeMap.get(vertex);
            for(Edge edge : edges){
                Vertex otherVertex = vertexMap.get(edge.getDestinationVertexId());
                if(colorMap.get(otherVertex) == color)
                    edgeShards.get(color).add(edge);
            }
        }

        g.setColorMap(null);

        return new Tuple<>(vertexShards, edgeShards);
    }
}