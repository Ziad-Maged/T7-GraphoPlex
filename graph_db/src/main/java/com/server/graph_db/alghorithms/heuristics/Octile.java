package com.server.graph_db.alghorithms.heuristics;

import com.server.graph_db.core.vertex.Vertex;

public class Octile implements Hueristic{
    String x;
    String y;

    public Octile(String x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public long getHeuristic(Vertex source, Vertex destination) {
        String sourceX = source.getProperty(this.x);
        String sourceY = source.getProperty(this.y);
        String destinationX = destination.getProperty(this.x);
        String destinationY = destination.getProperty(this.y);

        long xDistance = Math.abs(Long.parseLong(sourceX) - Long.parseLong(destinationX));
        long yDistance = Math.abs(Long.parseLong(sourceY) - Long.parseLong(destinationY));

        return (long) ((xDistance + yDistance) + (Math.sqrt(2) - 2) * Math.min(xDistance, yDistance));
    }
}
