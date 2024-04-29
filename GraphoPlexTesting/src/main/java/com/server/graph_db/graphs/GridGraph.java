package com.server.graph_db.graphs;

import com.server.graph_db.alghorithms.strategies.testing.GridGraphTestingStrategy;

@SuppressWarnings("ALL")
public class GridGraph extends Graph{

    private int rows, columns;

    public GridGraph(){
        super();
        this.setProperty("type", "GridGraph");
    }

    public GridGraph(int nodes, int vertices, int edges, GraphType type, int rows, int columns){
        super(nodes, vertices, edges, type);
        this.rows = rows;
        this.columns = columns;
        this.setTestingStrategy(new GridGraphTestingStrategy());
        this.setProperty("type", "GridGraph");
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
}
