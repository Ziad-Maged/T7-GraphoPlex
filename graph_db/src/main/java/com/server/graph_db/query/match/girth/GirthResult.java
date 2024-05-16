package com.server.graph_db.query.match.girth;

import com.server.graph_db.query.Result;

public class GirthResult extends Result {
    int girth;

    public GirthResult(int girth) {
        this.girth = girth;
        setMessage("Girth: " + girth);
    }

    public int getGirth() {
        return girth;
    }

    public void setGirth(int girth) {
        this.girth = girth;
    }
}
