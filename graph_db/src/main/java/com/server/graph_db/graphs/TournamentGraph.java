package com.server.graph_db.graphs;
import com.server.graph_db.alghorithms.strategies.testing.TournamentGraphTestingStrategy;

@SuppressWarnings("ALL")
public class TournamentGraph extends Graph{

    public TournamentGraph(){
        super();
    }

    public TournamentGraph(int nodes, int vertices, int edges){
        super(nodes, vertices, edges, GraphType.DIRECTED);
        this.setTestingStrategy(new TournamentGraphTestingStrategy());
    }

    @Override
    public void setType(GraphType type){
        super.setType(GraphType.DIRECTED);
    }
}
