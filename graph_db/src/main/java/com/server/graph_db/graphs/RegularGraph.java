package com.server.graph_db.graphs;

@SuppressWarnings("ALL")
public class RegularGraph extends Graph{

    public RegularGraph(){
        super();
    }

    public RegularGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        if(this.getType() == GraphType.UNDIRECTED){
            int degree = this.getDegreeOfVertex(this.getVertexMap().keySet().toArray()[0].toString());
            for(String vertexID : this.getVertexMap().keySet()){
                if(this.getDegreeOfVertex(vertexID) != degree)
                    return false;
            }
        }else {
            int inDegree = this.getInDegreeOfVertex(this.getVertexMap().keySet().toArray()[0].toString());
            int outDegree = this.getOutDegreeOfVertex(this.getVertexMap().keySet().toArray()[0].toString());
            for(String vertexID : this.getVertexMap().keySet()){
                if(this.getInDegreeOfVertex(vertexID) != inDegree || this.getOutDegreeOfVertex(vertexID) != outDegree)
                    return false;
            }
        }
        return true;
    }
}
