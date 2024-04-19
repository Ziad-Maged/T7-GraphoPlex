package com.server.graph_db.alghorithms.strategies.rules;

import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Rule(name = "VertexRule", description = "Rule for vertices")
public class VertexRule {
    Graph g;
    String propertyToCheck;
    String[] valuesToCheck;
    public VertexRule(Graph g, String propertyToCheck, String[] valuesToCheck) {
        this.g = g;
        this.propertyToCheck = propertyToCheck;
        this.valuesToCheck = valuesToCheck;
    }

    @Condition
    public boolean when() {
        if(valuesToCheck.length == 0|| propertyToCheck == null || propertyToCheck.isEmpty() || valuesToCheck.length > g.getNodes())
            return false;
        for(Vertex v : g.getVertexMap().values())
            if(!v.isPropertyExist(propertyToCheck))
                return false;
        return true;
    }

    @Action
    public void then() {
        int nodes = g.getNodes();
        boolean flag = false;
        HashMap<Integer, List<Vertex>> vertexShards = new HashMap<>();
        HashMap<Integer, List<Edge>> edgeShards = new HashMap<>();

        for(int i = 0; i < nodes; i++){
            vertexShards.put(i, new ArrayList<>());
            edgeShards.put(i, new ArrayList<>());
        }

        for(Vertex v : g.getEdgeMap().keySet()){
            flag = false;
            for(int i = 0; i < valuesToCheck.length; i++){
                if(v.getProperty(propertyToCheck).equals(valuesToCheck[i])){
                    flag = true;
                    vertexShards.get(i).add(v);
                    edgeShards.get(i).addAll(g.getEdgeMap().get(v));
                    break;
                }
            }
            if(!flag){
                int partition = Math.abs(v.getId().hashCode() % nodes);
                vertexShards.get(partition).add(v);
                edgeShards.get(partition).addAll(g.getEdgeMap().get(v));
            }
        }
        RuleEngineResponse.setResponse(new Tuple<>(vertexShards, edgeShards));
    }
}
