package com.server.graph_db.query.match.radius;

import com.server.graph_db.query.Result;

public class RadiusResult extends Result {
    int radius;

    public RadiusResult(int radius) {
        this.radius = radius;
        setMessage("Radius: " + radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
