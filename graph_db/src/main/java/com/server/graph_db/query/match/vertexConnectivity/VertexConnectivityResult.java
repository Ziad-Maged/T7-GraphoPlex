package com.server.graph_db.query.match.vertexConnectivity;

import com.server.graph_db.query.Result;

public class VertexConnectivityResult extends Result {
    int vertexConnectivity;

    public VertexConnectivityResult(int vertexConnectivity) {
        this.vertexConnectivity = vertexConnectivity;
        setMessage("Vertex connectivity: " + vertexConnectivity);
    }

    public int getVertexConnectivity() {
        return vertexConnectivity;
    }

    public void setVertexConnectivity(int vertexConnectivity) {
        this.vertexConnectivity = vertexConnectivity;
    }
}
