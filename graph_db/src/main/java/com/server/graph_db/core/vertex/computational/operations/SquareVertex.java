package com.server.graph_db.core.vertex.computational.operations;

import com.server.graph_db.core.vertex.computational.ComputationalVertex;

public class SquareVertex extends ComputationalVertex {

    public SquareVertex(ComputationalVertex a) {
        super();
        this.inputs.add(a);
    }

    @Override
    public double compute() {
        return Math.pow(this.inputs.get(0).compute(), 2);
    }

    @Override
    public void computeGradient(double gradient) {
        double a = this.inputs.get(0).compute();
        this.inputs.get(0).computeGradient(gradient * 2 * a);
    }
}
