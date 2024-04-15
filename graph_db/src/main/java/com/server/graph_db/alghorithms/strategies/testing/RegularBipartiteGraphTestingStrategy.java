package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RegularBipartiteGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        if(!g.isBipartite())
            return false;

        List<Vertex> partition1 = new ArrayList<>();
        List<Vertex> partition2 = new ArrayList<>();

        for(Map.Entry<Vertex, Integer> e : g.getColorMap().entrySet()){
            if(e.getValue() == 0)
                partition1.add(e.getKey());
            else
                partition2.add(e.getKey());
        }
        if(g.getType() == GraphType.UNDIRECTED){
            int degreeOfPartition1 = g.getDegreeOfVertex(partition1.get(0).getId());
            int degreeOfPartition2 = g.getDegreeOfVertex(partition2.get(0).getId());

            for(Vertex v : partition1){
                if(g.getDegreeOfVertex(v.getId()) != degreeOfPartition1)
                    return false;
            }

            for(Vertex v : partition2){
                if(g.getDegreeOfVertex(v.getId()) != degreeOfPartition2)
                    return false;
            }
        }else {
            int inDegreeOfPartition1 = g.getInDegreeOfVertex(partition1.get(0).getId());
            int outDegreeOfPartition1 = g.getOutDegreeOfVertex(partition1.get(0).getId());
            int inDegreeOfPartition2 = g.getInDegreeOfVertex(partition2.get(0).getId());
            int outDegreeOfPartition2 = g.getOutDegreeOfVertex(partition2.get(0).getId());

            for(Vertex v : partition1){
                if(g.getInDegreeOfVertex(v.getId()) != inDegreeOfPartition1 || g.getOutDegreeOfVertex(v.getId()) != outDegreeOfPartition1)
                    return false;
            }

            for(Vertex v : partition2){
                if(g.getInDegreeOfVertex(v.getId()) != inDegreeOfPartition2 || g.getOutDegreeOfVertex(v.getId()) != outDegreeOfPartition2)
                    return false;
            }
        }
        g.setColorMap(null);
        return true;
    }
}
