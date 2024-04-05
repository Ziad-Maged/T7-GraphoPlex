package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.core.vertex.Edge;

/**
 * Each vertex has to have a sourceID, and destinationID attributes to be able to compare them together to validate the Line graph.
 * */
public class LineGraph extends Graph{

    public LineGraph(){
        super();
    }

    public LineGraph(int nodes, int vertices, int edges, GraphType type){
        super(nodes, vertices, edges, type);
    }

    @Override
    public boolean validate() {
        // if the degree of the graph is less than 2, then it is not a line graph
        if(this.getType() == GraphType.UNDIRECTED){
            for(Vertex v : this.getEdgeMap().keySet()){
                if(this.getDegreeOfVertex(v.getId()) < 2)
                    return false;
            }
        }else {
            for(Vertex v : this.getEdgeMap().keySet()){
                int inDegree = this.getInDegreeOfVertex(v.getId());
                int outDegree = this.getOutDegreeOfVertex(v.getId());
                if(inDegree < 2 || outDegree < 2)
                    return false;
            }
        }
        for(Vertex v : this.getEdgeMap().keySet()){
            if(!v.isPropertyExist("label") || !v.isPropertyExist("destinationID") || !v.isPropertyExist("sourceID"))
                return false;
            for(Edge e : this.getEdgeMap().get(v)){
                Vertex v2 = this.getVertexMap().get(e.getDestinationVertexId());
                if(!v2.isPropertyExist("label") || !v2.isPropertyExist("destinationID") || !v2.isPropertyExist("sourceID"))
                    return false;
                if(!v.getProperty("sourceID").equals(v2.getProperty("sourceID")) && !v.getProperty("destinationID").equals(v2.getProperty("destinationID")) && !v.getProperty("sourceID").equals(v2.getProperty("destinationID")) && !v.getProperty("destinationID").equals(v2.getProperty("sourceID")))
                    return false;
            }
        }
        return true;
    }
}
