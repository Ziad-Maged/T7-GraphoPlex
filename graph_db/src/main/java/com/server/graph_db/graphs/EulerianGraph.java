package com.server.graph_db.graphs;

@SuppressWarnings("ALL")
public class EulerianGraph extends Graph{

    public EulerianGraph(){
        super();
    }

    public EulerianGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        // One way to check if a graph is Eulerian is to check if the degree of each vertex is even
        if(this.getType() == GraphType.UNDIRECTED){
            for(String id : this.getVertexMap().keySet()){
                if(this.getDegreeOfVertex(id) % 2 != 0)
                    return false;
            }
        }else {
            for(String id : this.getVertexMap().keySet()){
                if(this.getOutDegreeOfVertex(id) % 2 != 0 && this.getInDegreeOfVertex(id) % 2 != 0)
                    return false;
            }
        }
        return true;
    }
}
