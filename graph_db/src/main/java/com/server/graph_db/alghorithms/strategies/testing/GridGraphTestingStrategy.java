package com.server.graph_db.alghorithms.strategies.testing;

import com.server.graph_db.alghorithms.strategies.TestingStrategy;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import com.server.graph_db.graphs.GraphType;
import com.server.graph_db.graphs.GridGraph;

public class GridGraphTestingStrategy implements TestingStrategy {
    @Override
    public boolean validate(Graph g) {
        GridGraph gridGraph = (GridGraph) g;
        int rows = gridGraph.getRows();
        int columns = gridGraph.getColumns();
        if(g.getVertexMap().values().size() != rows * columns)
            return false;
        int expectedNumberOfSideVertices = 2 * rows + 2 * columns - 8;
        int expectedNumberOfNormalVertices = rows * columns - 2 * rows - 2 * columns + 4;
        int numberOfCornerVertices = 0;
        int numberOfSideVertices = 0;
        int numberOfInternalVertices = 0;
        if(g.getType() == GraphType.UNDIRECTED){
            for(Vertex vertex : g.getVertexMap().values()){
                if(g.getDegreeOfVertex(vertex.getId()) == 2)
                    numberOfCornerVertices++;
                else if(g.getDegreeOfVertex(vertex.getId()) == 3)
                    numberOfSideVertices++;
                else if(g.getDegreeOfVertex(vertex.getId()) == 4)
                    numberOfInternalVertices++;
            }
            return numberOfCornerVertices == 4 && numberOfSideVertices == expectedNumberOfSideVertices && numberOfInternalVertices == expectedNumberOfNormalVertices;
        }
        //For Directed Graphs In and Out Degrees would have to be calculated.
        for (Vertex v : g.getVertexMap().values()){
            int inDegree = g.getInDegreeOfVertex(v.getId());
            int outDegree = g.getOutDegreeOfVertex(v.getId());
            if(inDegree == 2 && outDegree == 2)
                numberOfCornerVertices++;
            else if(inDegree == 3 && outDegree == 3)
                numberOfSideVertices++;
            else if(inDegree == 4 && outDegree == 4)
                numberOfInternalVertices++;
        }
        return numberOfCornerVertices == 4 && numberOfSideVertices == expectedNumberOfSideVertices && numberOfInternalVertices == expectedNumberOfNormalVertices;
    }
}
