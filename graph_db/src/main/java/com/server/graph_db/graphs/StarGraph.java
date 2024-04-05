package com.server.graph_db.graphs;
import com.server.graph_db.core.vertex.Vertex;

@SuppressWarnings("ALL")
public class StarGraph extends Graph{

    public StarGraph(){
        super();
    }

    public StarGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
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
                if(!id.equals(center.getId()) && this.getDegreeOfVertex(id) != 1)
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
                if(!id.equals(center.getId()) && inDegree != 1 && outDegree != 1)
                    return false;
            }
        }
        return true;
    }
}
