package com.server.graph_db.query.match.articulationPoints;

import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.query.Result;

import java.util.List;

public class ArticulationPointsResult extends Result {
    List<Vertex> articulationPoints;

    public ArticulationPointsResult(List<Vertex> articulationPoints) {
        this.articulationPoints = articulationPoints;
        setMessage("Articulation points found: " + articulationPoints.size());
    }

    @Override
    public String toString() {
        return "Articulation Points: " + articulationPoints + "\n\n" + super.toString();
    }

    public List<Vertex> getArticulationPoints() {
        return articulationPoints;
    }

    public void setArticulationPoints(List<Vertex> articulationPoints) {
        this.articulationPoints = articulationPoints;
    }
}
