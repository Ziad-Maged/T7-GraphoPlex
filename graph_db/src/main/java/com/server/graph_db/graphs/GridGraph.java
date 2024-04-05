package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.Vertex;

@SuppressWarnings("ALL")
public class GridGraph extends Graph{

    private int rows, columns;

    public GridGraph(){
        super();
    }

    public GridGraph(int nodes, int vertices, int edges, GraphType type, int rows, int columns){
        super(nodes, vertices, edges, type);
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    public void setRows(int rows){
        this.rows = rows;
    }

    public void setColumns(int columns){
        this.columns = columns;
    }

    @Override
    public boolean validate() {
        if(this.getVertexMap().values().size() != rows * columns)
            return false;
        int expectedNumberOfSideVertices = 2 * rows + 2 * columns - 8;
        int expectedNumberOfNormalVertices = rows * columns - 2 * rows - 2 * columns + 4;
        int numberOfCornerVertices = 0;
        int numberOfSideVertices = 0;
        int numberOfInternalVertices = 0;
        if(this.getType() == GraphType.UNDIRECTED){
            for(Vertex vertex : this.getVertexMap().values()){
                if(this.getDegreeOfVertex(vertex.getId()) == 2)
                    numberOfCornerVertices++;
                else if(this.getDegreeOfVertex(vertex.getId()) == 3)
                    numberOfSideVertices++;
                else if(this.getDegreeOfVertex(vertex.getId()) == 4)
                    numberOfInternalVertices++;
            }
            return numberOfCornerVertices == 4 && numberOfSideVertices == expectedNumberOfSideVertices && numberOfInternalVertices == expectedNumberOfNormalVertices;
        }
        //For Directed Graphs In and Out Degrees would have to be calculated.
        for (Vertex v : this.getVertexMap().values()){
            int inDegree = this.getInDegreeOfVertex(v.getId());
            int outDegree = this.getOutDegreeOfVertex(v.getId());
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
