package com.server.graph_db.core.vertex.computational;

import java.util.ArrayList;
import java.util.List;

abstract public class ComputationalVertex {
    protected List<ComputationalVertex> inputs = new ArrayList<>();
    protected double value;
    protected double gradient;
    protected int layer;

    public ComputationalVertex() {
        this.value = 0;
        this.gradient = 0.0;
        this.layer = 0;
    }

    public void addInput(ComputationalVertex input) {
        inputs.add(input);
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    abstract public double compute();
    abstract public void computeGradient(double gradient);
}
