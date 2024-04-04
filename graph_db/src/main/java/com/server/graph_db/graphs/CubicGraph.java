package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;

import java.util.List;

public class CubicGraph extends Graph{

    public CubicGraph(){
        super();
    }

    public CubicGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        if(this.getType() == GraphType.UNDIRECTED){
            for(Vertex e : this.getVertexMap().values()){
                if(this.getDegreeOfVertex(e.getId()) != 3)
                    return false;
            }
            return true;
        }
        //For directed graphs we might have to calculate both in and out degrees
        for(Vertex v : this.getVertexMap().values()){
            if(this.getInDegreeOfVertex(v.getId()) != 3 || this.getOutDegreeOfVertex(v.getId()) != 3)
                return false;
        }
        return true;
    }
}
