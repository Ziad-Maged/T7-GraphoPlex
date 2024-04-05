package com.server.graph_db.graphs;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.core.vertex.Edge;

public class TournamentGraph extends Graph{

    public TournamentGraph(){
        super();
    }

    public TournamentGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        if(this.getType() == GraphType.UNDIRECTED)
            return false;
        for(Vertex source : this.getEdgeMap().keySet()){
            for(Edge edge : this.getEdgeMap().get(source)){
                if(this.hasEdge(edge.getDestinationVertexId(), source.getId()))
                    return false;
            }
        }
        return true;
    }
}
