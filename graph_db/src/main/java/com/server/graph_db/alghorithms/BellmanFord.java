package com.server.graph_db.alghorithms;

import com.server.graph_db.alghorithms.traversables.BellmanFordTraversable;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.GlobalVertexService;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class BellmanFord implements ShortestPathAlghorithm{
    GlobalVertexService vertexService;



    String sourceVertexId;
    String destinationVertexId;



    LinkedList<Edge> pathReturned;
    HashMap<String, BellmanFordTraversable> visited;


    PriorityQueue<BellmanFordTraversable> queue;
    long shortestPath = 0;

    public BellmanFord(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    @Override
    public void compute(String sourceVertexId, String destinationVertexId, String costField) throws Exception {
        //TODO
    }

    @Override
    public long getShortestPath() {
        return shortestPath;
    }

    @Override
    public Iterable<Edge> getPath() throws Exception {
        return null;
    }
}
