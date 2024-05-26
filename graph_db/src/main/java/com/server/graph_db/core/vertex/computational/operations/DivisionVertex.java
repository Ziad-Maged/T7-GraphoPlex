package com.server.graph_db.core.vertex.computational.operations;

import com.server.graph_db.core.vertex.computational.ComputationalVertex;

public class DivisionVertex extends ComputationalVertex {

    public DivisionVertex(ComputationalVertex a, ComputationalVertex b) {
        super();
        this.inputs.add(a);
        this.inputs.add(b);
    }

    @Override
    public double compute() {
        return inputs.get(0).compute() / inputs.get(1).compute();
    }

    @Override
    public void computeGradient(double gradient) {
        inputs.get(0).computeGradient(gradient / inputs.get(1).compute());
        inputs.get(1).computeGradient(-gradient * inputs.get(0).compute() / Math.pow(inputs.get(1).compute(), 2));
    }
}
