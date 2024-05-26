package com.server.graph_db.core.vertex.computational;

public class VariableVertex extends ComputationalVertex{

    public VariableVertex(double value) {
        super();
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double compute() {
        return value;
    }

    @Override
    public void computeGradient(double gradient) {
        this.gradient += gradient;
    }

    public double getGradient() {
        return gradient;
    }

    public void resetGradient() {
        gradient = 0.0;
    }
}
