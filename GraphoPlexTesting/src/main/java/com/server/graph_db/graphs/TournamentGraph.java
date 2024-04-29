package com.server.graph_db.graphs;
import com.server.graph_db.alghorithms.strategies.testing.TournamentGraphTestingStrategy;

@SuppressWarnings("ALL")
public class TournamentGraph extends Graph{

    public TournamentGraph(){
        super();
        this.setProperty("type", "TournamentGraph");
    }

    public TournamentGraph(int nodes, int vertices, int edges){
        super(nodes, vertices, edges, GraphType.DIRECTED);
        this.setTestingStrategy(new TournamentGraphTestingStrategy());
        this.setProperty("type", "TournamentGraph");
    }

    @Override
    public void setType(GraphType type){
        super.setType(GraphType.DIRECTED);
    }
}
