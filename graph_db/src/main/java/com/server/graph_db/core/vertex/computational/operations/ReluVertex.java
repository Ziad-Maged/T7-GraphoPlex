package com.server.graph_db.core.vertex.computational.operations;

import com.server.graph_db.core.vertex.computational.ComputationalVertex;

public class ReluVertex extends ComputationalVertex {

    public ReluVertex(ComputationalVertex a) {
        super();
        this.inputs.add(a);
    }

    @Override
    public double compute() {
        return Math.max(0, inputs.get(0).compute());
    }

    @Override
    public void computeGradient(double gradient) {
        inputs.get(0).computeGradient(gradient * (compute() > 0 ? 1 : 0));
    }
}
