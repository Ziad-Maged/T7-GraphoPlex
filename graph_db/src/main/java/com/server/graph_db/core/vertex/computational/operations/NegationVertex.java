package com.server.graph_db.core.vertex.computational.operations;

import com.server.graph_db.core.vertex.computational.ComputationalVertex;

public class NegationVertex extends ComputationalVertex {
    public NegationVertex(ComputationalVertex a) {
        super();
        this.inputs.add(a);
    }

    @Override
    public double compute() {
        return -this.inputs.get(0).compute();
    }

    @Override
    public void computeGradient(double gradient) {
        this.inputs.get(0).computeGradient(-gradient);
    }
}
