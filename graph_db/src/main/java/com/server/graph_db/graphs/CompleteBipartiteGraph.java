package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ALL")
public class CompleteBipartiteGraph extends Graph{

    public CompleteBipartiteGraph() {
        super();
    }

    public CompleteBipartiteGraph(int nodes, int vertices, int edges, GraphType type) {
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

        this.setColorMap(null);

        for (Vertex vertex1 : partition1) {
            for (Vertex vertex2 : partition2) {
                if (!hasEdge(vertex1.getId(), vertex2.getId())) {
                    return false;
                }
            }
        }
        return true;
    }
}
