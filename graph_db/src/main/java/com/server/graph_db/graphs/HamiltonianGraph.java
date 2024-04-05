package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;

import java.util.Collections;
import java.util.HashMap;

@SuppressWarnings("ALL")
public class HamiltonianGraph extends Graph{

    public HamiltonianGraph(){
        super();
    }

    public HamiltonianGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        if(this.getVertexMap().size() < 3 || this.getVertexMap().isEmpty())
            return false;
        for(String id : this.getVertexMap().keySet()){
            HashMap<String, Boolean> visited = new HashMap<>();
            visited.put(id, true);
            if(dfs(id, visited, 1))
                return true;
        }
        return false;
    }

    private boolean dfs(String id, HashMap<String, Boolean> visited, int count){
        if(count == this.getVertexMap().size())
            return true;
        for(Edge e : this.getEdgeMap().getOrDefault(this.getVertexMap().get(id), Collections.emptyList())){
            Vertex nextVertex = this.getVertexMap().get(e.getDestinationVertexId());
            if(!visited.getOrDefault(nextVertex.getId(), false)){
                visited.put(nextVertex.getId(), true);
                if(dfs(nextVertex.getId(), visited, count + 1))
                    return true;
                visited.put(nextVertex.getId(), false);
            }
        }
        return false;
    }
}
