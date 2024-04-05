package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.Vertex;

@SuppressWarnings("ALL")
public class WheelGraph extends Graph{

    public WheelGraph(){
        super();
    }

    public WheelGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        // For a Wheel Graph the center (hub) vertex has degree equal to the number of vertices minus 1 (n-1) and all other vertices have degree equal to 3.
        int numberOfVertices = this.getVertexMap().size();
        Vertex center = null;
        if(this.getType() == GraphType.UNDIRECTED){
            for(String id : this.getVertexMap().keySet()){
                if(this.getDegreeOfVertex(id) == numberOfVertices - 1){
                    center = this.getVertexMap().get(id);
                    break;
                }
            }
            if(center == null)
                return false;
            for(String id : this.getVertexMap().keySet()){
                if(!id.equals(center.getId()) && this.getDegreeOfVertex(id) != 3)
                    return false;
            }
        }else {
            for(String id : this.getVertexMap().keySet()){
                int inDegree = this.getInDegreeOfVertex(id);
                int outDegree = this.getOutDegreeOfVertex(id);
                if(inDegree == numberOfVertices - 1 && outDegree == numberOfVertices - 1){
                    center = this.getVertexMap().get(id);
                    break;
                }
            }
            if(center == null)
                return false;
            for(String id : this.getVertexMap().keySet()){
                int inDegree = this.getInDegreeOfVertex(id);
                int outDegree = this.getOutDegreeOfVertex(id);
                if(!id.equals(center.getId()) && inDegree != 3 && outDegree != 3)
                    return false;
            }
        }
        return true;
    }
}
