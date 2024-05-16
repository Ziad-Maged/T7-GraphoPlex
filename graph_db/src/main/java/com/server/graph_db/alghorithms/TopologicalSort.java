package com.server.graph_db.alghorithms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.core.vertex.Vertex;

import java.util.List;

public class TopologicalSort {
    GlobalVertexService vertexService;
    List<Vertex> sortedVertices;

    public TopologicalSort(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    public void compute() throws Exception {
        sortedVertices = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Deque<String> stack = new ArrayDeque<>();

        for (String vertexId : vertexService.getAllVerticesIds()) {
            if(vertexId.equals("Properties"))
                continue;
            if (!visited.contains(vertexId)) {
                topologicalSortUtil(vertexId, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            sortedVertices.add(vertexService.getVertex(stack.pop()));
        }
//        sortedVertices = vertexService.getGraph().topologicalSort();
    }

    private void topologicalSortUtil(String vertexId, Set<String> visited, Deque<String> stack) throws Exception {
        visited.add(vertexId);

        for (Edge edge : vertexService.getOutgoingEdges(vertexId)) {
            if (!visited.contains(edge.getDestinationVertexId())) {
                topologicalSortUtil(edge.getDestinationVertexId(), visited, stack);
            }
        }

        stack.push(vertexId);
    }

    public List<Vertex> getSortedVertices() {
        return sortedVertices;
    }
}
