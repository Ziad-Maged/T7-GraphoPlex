package com.server.graph_db.core.vertex.computational.operations;

import com.server.graph_db.core.vertex.computational.ComputationalVertex;

public class SigmoidVertex extends ComputationalVertex {

    public SigmoidVertex(ComputationalVertex a) {
        super();
        this.inputs.add(a);
    }

    @Override
    public double compute() {
        return 1.0 / (1.0 + Math.exp(-inputs.get(0).compute()));
    }

    @Override
    public void computeGradient(double gradient) {
        double sigmoid = compute();
        inputs.get(0).computeGradient(gradient * sigmoid * (1 - sigmoid));
    }
}
