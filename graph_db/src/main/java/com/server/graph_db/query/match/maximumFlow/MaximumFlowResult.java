package com.server.graph_db.query.match.maximumFlow;

import com.server.graph_db.query.Result;

public class MaximumFlowResult extends Result {
    int maxFlow;
    public MaximumFlowResult(int maxFlow) {
        this.maxFlow = maxFlow;
        setMessage("");
    }

    @Override
    public String toString() {
        return "Maximum flow: " + maxFlow+"\n\n" +super.toString();
    }

    public int getMaxFlow() {
        return maxFlow;
    }

    public void setMaxFlow(int maxFlow) {
        this.maxFlow = maxFlow;
    }
}
