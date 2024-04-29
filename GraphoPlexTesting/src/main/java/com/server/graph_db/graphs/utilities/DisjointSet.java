package com.server.graph_db.graphs.utilities;

import java.util.*;

public class DisjointSet {
    private Map<String, String> parent;

    public DisjointSet() {
        parent = new HashMap<>();
    }

    public void makeSet(String vertexId) {
        parent.put(vertexId, vertexId);
    }

    public String find(String vertexId) {
        if (!parent.get(vertexId).equals(vertexId)) {
            parent.put(vertexId, find(parent.get(vertexId)));
        }
        return parent.get(vertexId);
    }

    public void union(String vertexId1, String vertexId2) {
        String root1 = find(vertexId1);
        String root2 = find(vertexId2);
        parent.put(root1, root2);
    }
}
