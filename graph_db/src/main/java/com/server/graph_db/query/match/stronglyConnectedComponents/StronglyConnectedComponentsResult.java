package com.server.graph_db.query.match.stronglyConnectedComponents;

import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.query.Result;

import java.util.List;

public class StronglyConnectedComponentsResult extends Result {
    List<List<Vertex>> stronglyConnectedComponents;

    public StronglyConnectedComponentsResult(List<List<Vertex>> stronglyConnectedComponents) {
        this.stronglyConnectedComponents = stronglyConnectedComponents;
        setMessage("Strongly Connected Components Found: " + stronglyConnectedComponents.size());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (List<Vertex> stronglyConnectedComponent : stronglyConnectedComponents) {
            sb.append("Strongly Connected Component " + i++ + ": ");
            for (Vertex vertex : stronglyConnectedComponent) {
                sb.append(vertex.getId()).append(" ");
            }
            sb.append("\n");
        }
        return sb + "\n\n" + super.toString();
    }
}
