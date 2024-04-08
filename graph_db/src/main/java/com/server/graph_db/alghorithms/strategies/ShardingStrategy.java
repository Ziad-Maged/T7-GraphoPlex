package com.server.graph_db.alghorithms.strategies;

import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.util.HashMap;
import java.util.List;

public interface ShardingStrategy {
    Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(Graph g);
}
