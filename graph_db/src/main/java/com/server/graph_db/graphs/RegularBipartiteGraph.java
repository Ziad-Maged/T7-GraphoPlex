package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
public class RegularBipartiteGraph extends Graph{

    public RegularBipartiteGraph(){
        super();
    }

    public RegularBipartiteGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        if(!this.isBipartite())
            return false;

        List<Vertex> partition1 = new ArrayList<>();
        List<Vertex> partition2 = new ArrayList<>();

        for(Map.Entry<Vertex, Integer> e : this.getColorMap().entrySet()){
            if(e.getValue() == 0)
                partition1.add(e.getKey());
            else
                partition2.add(e.getKey());
        }
        if(this.getType() == GraphType.UNDIRECTED){
            int degreeOfPartition1 = this.getDegreeOfVertex(partition1.get(0).getId());
            int degreeOfPartition2 = this.getDegreeOfVertex(partition2.get(0).getId());

            for(Vertex v : partition1){
                if(this.getDegreeOfVertex(v.getId()) != degreeOfPartition1)
                    return false;
            }

            for(Vertex v : partition2){
                if(this.getDegreeOfVertex(v.getId()) != degreeOfPartition2)
                    return false;
            }
        }else {
            int inDegreeOfPartition1 = this.getInDegreeOfVertex(partition1.get(0).getId());
            int outDegreeOfPartition1 = this.getOutDegreeOfVertex(partition1.get(0).getId());
            int inDegreeOfPartition2 = this.getInDegreeOfVertex(partition2.get(0).getId());
            int outDegreeOfPartition2 = this.getOutDegreeOfVertex(partition2.get(0).getId());

            for(Vertex v : partition1){
                if(this.getInDegreeOfVertex(v.getId()) != inDegreeOfPartition1 || this.getOutDegreeOfVertex(v.getId()) != outDegreeOfPartition1)
                    return false;
            }

            for(Vertex v : partition2){
                if(this.getInDegreeOfVertex(v.getId()) != inDegreeOfPartition2 || this.getOutDegreeOfVertex(v.getId()) != outDegreeOfPartition2)
                    return false;
            }
        }
        this.setColorMap(null);
        return true;
    }
}
