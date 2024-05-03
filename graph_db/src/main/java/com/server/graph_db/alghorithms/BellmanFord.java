package com.server.graph_db.alghorithms;

import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.GlobalVertexService;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BellmanFord implements ShortestPathAlghorithm {

    private GlobalVertexService vertexService;
    private String sourceVertexId;
    private String destinationVertexId;
    private String costField;
    private List<Edge> shortestPath;
    private Map<String, Long> distances;

    public BellmanFord(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    public void compute(String source, String destination, String costField) throws Exception {
        sourceVertexId = source;
        destinationVertexId = destination;
        this.costField = costField;
        shortestPath = new LinkedList<>();
        distances = new HashMap<>();
        List<String> vertices = (List<String>) vertexService.getAllVerticesIds();
        List<Edge> edges = (List<Edge>) vertexService.getOutgoingEdges(vertices);

        // Initialize distances with infinity, except for the source vertex
        for (String vertexId : vertices) {
            distances.put(vertexId, Long.MAX_VALUE);
        }
        distances.put(sourceVertexId, 0L);

        // Relax edges repeatedly
        for (int i = 0; i < vertices.size() - 1; i++) {
            for (Edge edge : edges) {
                if (distances.get(edge.getSourceVertexId()) != Long.MAX_VALUE &&
                        distances.get(edge.getSourceVertexId()) + Long.parseLong(edge.getProperties().get(costField)) < distances.get(edge.getDestinationVertexId())) {
                    distances.put(edge.getDestinationVertexId(), distances.get(edge.getSourceVertexId()) + Long.parseLong(edge.getProperties().get(costField)));
                }
            }
        }

        // Check for negative cycles
        for (Edge edge : edges) {
            if (distances.get(edge.getSourceVertexId()) != Long.MAX_VALUE &&
                    distances.get(edge.getSourceVertexId()) + Long.parseLong(edge.getProperties().get(costField)) < distances.get(edge.getDestinationVertexId())) {
                throw new Exception("Graph contains negative cycle");
            }
        }
    }

    public long getShortestPath() {
        return distances.get(destinationVertexId);
    }

    public Iterable<Edge> getPath() throws Exception {
        if (distances.get(destinationVertexId) == Long.MAX_VALUE) {
            throw new Exception("Vertex with id " + destinationVertexId + " is not reachable from vertex with id " + sourceVertexId);
        }

        // Reconstruct path
        String currentVertexId = destinationVertexId;
        while (!currentVertexId.equals(sourceVertexId)) {
            for (Edge edge : vertexService.getIncomingEdges(currentVertexId)) {
                if (distances.get(edge.getSourceVertexId()) + Long.parseLong(edge.getProperty(costField)) == distances.get(currentVertexId)) {
                    shortestPath.add(0, edge);
                    currentVertexId = edge.getSourceVertexId();
                    break;
                }
            }
        }
        return shortestPath;
    }
}
