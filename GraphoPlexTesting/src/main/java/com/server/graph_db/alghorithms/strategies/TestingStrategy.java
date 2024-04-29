package com.server.graph_db.alghorithms.strategies;

import com.server.graph_db.graphs.Graph;

public interface TestingStrategy {
    boolean validate(Graph g);
}
