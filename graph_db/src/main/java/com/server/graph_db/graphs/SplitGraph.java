package com.server.graph_db.graphs;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class SplitGraph extends Graph{

    public SplitGraph(){
        super();
    }

    public SplitGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        List<String> independentSet = new ArrayList<>();
        List<String> cliqueSet = new ArrayList<>();
        if(this.getType() == GraphType.UNDIRECTED){
            for(String vertexId : this.getVertexMap().keySet()){
                if(this.getDegreeOfVertex(vertexId) == 0)
                    independentSet.add(vertexId);
                else
                    cliqueSet.add(vertexId);
            }
            if(independentSet.isEmpty() || cliqueSet.isEmpty())
                return false;
            int expectedDegreeOfCliqueVertices = cliqueSet.size() - 1; // since every vertex has to be connected to the other vertices, excluding loops.
            for(String vertexID : cliqueSet){
                if(this.getDegreeOfVertex(vertexID) != expectedDegreeOfCliqueVertices)
                    return false;
            }
        }else {
            for(String vertexId : this.getVertexMap().keySet()){
                if(this.getOutDegreeOfVertex(vertexId) == 0 && this.getInDegreeOfVertex(vertexId) == 0)
                    independentSet.add(vertexId);
                else
                    cliqueSet.add(vertexId);
            }
            if(independentSet.isEmpty() || cliqueSet.isEmpty())
                return false;
            int expectedDegreeOfCliqueVertices = cliqueSet.size() - 1; // since every vertex has to be connected to the other vertices, excluding loops.
            for(String vertexID : cliqueSet){
                if(this.getOutDegreeOfVertex(vertexID) != expectedDegreeOfCliqueVertices || this.getInDegreeOfVertex(vertexID) != expectedDegreeOfCliqueVertices)
                    return false;
            }
        }
        return true;
    }
}
