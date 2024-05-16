package com.server.graph_db.query.match.eccentricity;

import com.server.graph_db.query.Result;

public class EccentricityResult extends Result {
    int eccentricity;

    public EccentricityResult(int eccentricity) {
        this.eccentricity = eccentricity;
        setMessage("Eccentricity: " + eccentricity);
    }

    public int getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(int eccentricity) {
        this.eccentricity = eccentricity;
    }
}
