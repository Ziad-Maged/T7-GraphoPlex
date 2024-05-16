package com.server.graph_db.query.match.edgeConnectivity;

import com.server.graph_db.query.Result;

public class EdgeConnectivityResult extends Result {
    int edgeConnectivity;

    public EdgeConnectivityResult(int edgeConnectivity) {
        this.edgeConnectivity = edgeConnectivity;
        setMessage("Edge Connectivity: " + edgeConnectivity);
    }

    public int getEdgeConnectivity() {
        return edgeConnectivity;
    }

    public void setEdgeConnectivity(int edgeConnectivity) {
        this.edgeConnectivity = edgeConnectivity;
    }
}
