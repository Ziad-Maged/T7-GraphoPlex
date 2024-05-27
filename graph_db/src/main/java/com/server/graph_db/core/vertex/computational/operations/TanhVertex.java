package com.server.graph_db.core.vertex.computational.operations;

import com.server.graph_db.core.vertex.computational.ComputationalVertex;

public class TanhVertex extends ComputationalVertex {
    public TanhVertex(ComputationalVertex a) {
        super();
        this.inputs.add(a);
    }
    @Override
    public double compute() {
        return Math.tanh(this.inputs.get(0).compute());
    }

    @Override
    public void computeGradient(double gradient) {
        double a = this.inputs.get(0).compute();
        this.inputs.get(0).computeGradient(gradient * (1 - Math.pow(Math.tanh(a), 2)));
    }
}
