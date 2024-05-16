package com.server.graph_db.query.match.allShortestPaths;

import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.query.Result;

import java.util.Map;

public class AllShortestPathsResult extends Result {
    Map<Vertex, Map<Vertex, Integer>> allShortestPaths;

    public AllShortestPathsResult(Map<Vertex, Map<Vertex, Integer>> allShortestPaths) {
        this.allShortestPaths = allShortestPaths;
        setMessage("All shortest paths computed successfully");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Vertex vertex : allShortestPaths.keySet()) {
            sb.append("From vertex: ").append(vertex.getId()).append("\n");
            for (Vertex vertex1 : allShortestPaths.get(vertex).keySet()) {
                sb.append("To vertex: ").append(vertex1.getId()).append(" cost: ").append(allShortestPaths.get(vertex).get(vertex1)).append("\n");
            }
        }
        return sb.toString()+"\n\n" +super.toString();
    }

    public Map<Vertex, Map<Vertex, Integer>> getAllShortestPaths() {
        return allShortestPaths;
    }

    public void setAllShortestPaths(Map<Vertex, Map<Vertex, Integer>> allShortestPaths) {
        this.allShortestPaths = allShortestPaths;
    }
}
