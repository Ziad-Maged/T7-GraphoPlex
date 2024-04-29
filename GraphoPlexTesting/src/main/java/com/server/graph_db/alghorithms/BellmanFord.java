package com.server.graph_db.alghorithms;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.GlobalVertexService;
import com.server.graph_db.graphs.Graph;
import java.util.List;

public class BellmanFord implements ShortestPathAlghorithm{
    GlobalVertexService vertexService;
    List<Edge> shortestPathEdges;
    long shortestPath = 0;

    public BellmanFord(GlobalVertexService vertexService) {
        this.vertexService = vertexService;
    }

    @Override
    public void compute(String sourceVertexId, String destinationVertexId, String costField) throws Exception {
        shortestPathEdges = vertexService.getGraph().shortestPath(sourceVertexId, destinationVertexId, costField);
        for(Edge edge : shortestPathEdges){
            shortestPath += Long.parseLong(edge.getProperty(costField));
        }
    }

    @Override
    public long getShortestPath() {
        return shortestPath;
    }

    @Override
    public Iterable<Edge> getPath() throws Exception {
        return shortestPathEdges;
    }
}
