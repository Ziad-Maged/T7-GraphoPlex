package com.server.graph_db.query.match.diameter;

import com.server.graph_db.query.Result;

public class DiameterResult extends Result {
    int diameter;

    public DiameterResult(int diameter) {
        this.diameter = diameter;
        setMessage("Diameter: " + diameter);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
