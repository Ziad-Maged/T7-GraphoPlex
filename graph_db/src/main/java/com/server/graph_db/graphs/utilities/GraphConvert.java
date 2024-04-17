package com.server.graph_db.graphs.utilities;
import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.alghorithms.strategies.sharding.HashBasedShardingStrategy;
import com.server.graph_db.alghorithms.strategies.testing.*;
import com.server.graph_db.graphs.*;

public class GraphConvert {

    public static HamiltonianGraph toHamiltonianGraph(Graph graph) {
        TestingStrategy strategy = graph.getTestingStrategy();
        graph.setTestingStrategy(new HamiltonianGraphTestingStrategy());
        if(!graph.validate()){
            graph.setTestingStrategy(strategy);
            return null;
        }
        HamiltonianGraph hamiltonianGraph = new HamiltonianGraph();
        hamiltonianGraph.setShardingStrategy(new HashBasedShardingStrategy());
        hamiltonianGraph.setNodes(graph.getNodes());
        hamiltonianGraph.setVertices(graph.getVertices());
        hamiltonianGraph.setEdges(graph.getEdges());
        hamiltonianGraph.setVertexMap(graph.getVertexMap());
        hamiltonianGraph.setEdgeMap(graph.getEdgeMap());
        hamiltonianGraph.setProperties(graph.getProperties());
        hamiltonianGraph.setTestingStrategy(new HamiltonianGraphTestingStrategy());
        return hamiltonianGraph;
    }

}
