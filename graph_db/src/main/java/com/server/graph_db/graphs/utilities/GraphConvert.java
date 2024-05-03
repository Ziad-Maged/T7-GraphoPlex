package com.server.graph_db.graphs.utilities;
import com.server.graph_db.alghorithms.strategies.sharding.HashBasedShardingStrategy;
import com.server.graph_db.alghorithms.strategies.testing.*;
import com.server.graph_db.graphs.*;

@SuppressWarnings("ALL")
public class GraphConvert {

    public static HamiltonianGraph toHamiltonianGraph(Graph graph) {
        HamiltonianGraph hamiltonianGraph = new HamiltonianGraph();
        hamiltonianGraph.setShardingStrategy(new HashBasedShardingStrategy());
        hamiltonianGraph.setNodes(graph.getNodes());
        hamiltonianGraph.setVertices(graph.getVertices());
        hamiltonianGraph.setEdges(graph.getEdges());
        hamiltonianGraph.setVertexMap(graph.getVertexMap());
        hamiltonianGraph.setEdgeMap(graph.getEdgeMap());
        hamiltonianGraph.setProperties(graph.getProperties());
        hamiltonianGraph.setTestingStrategy(new HamiltonianGraphTestingStrategy());
        return hamiltonianGraph;
    }

    public static EulerianGraph toEulerianGraph(Graph graph) {
        EulerianGraph eulerianGraph = new EulerianGraph();
        eulerianGraph.setShardingStrategy(new HashBasedShardingStrategy());
        eulerianGraph.setNodes(graph.getNodes());
        eulerianGraph.setVertices(graph.getVertices());
        eulerianGraph.setEdges(graph.getEdges());
        eulerianGraph.setVertexMap(graph.getVertexMap());
        eulerianGraph.setEdgeMap(graph.getEdgeMap());
        eulerianGraph.setProperties(graph.getProperties());
        eulerianGraph.setTestingStrategy(new EulerianGraphTestingStrategy());
        return eulerianGraph;
    }

    public static CubicGraph toCubicGraph(Graph graph) {
        CubicGraph cubicGraph = new CubicGraph();
        cubicGraph.setShardingStrategy(new HashBasedShardingStrategy());
        cubicGraph.setNodes(graph.getNodes());
        cubicGraph.setVertices(graph.getVertices());
        cubicGraph.setEdges(graph.getEdges());
        cubicGraph.setVertexMap(graph.getVertexMap());
        cubicGraph.setEdgeMap(graph.getEdgeMap());
        cubicGraph.setProperties(graph.getProperties());
        cubicGraph.setTestingStrategy(new CubicGraphTestingStrategy());
        return cubicGraph;
    }

    public static StarGraph toStarGraph(Graph graph) {
        StarGraph starGraph = new StarGraph();
        starGraph.setShardingStrategy(new HashBasedShardingStrategy());
        starGraph.setNodes(graph.getNodes());
        starGraph.setVertices(graph.getVertices());
        starGraph.setEdges(graph.getEdges());
        starGraph.setVertexMap(graph.getVertexMap());
        starGraph.setEdgeMap(graph.getEdgeMap());
        starGraph.setProperties(graph.getProperties());
        starGraph.setTestingStrategy(new StarGraphTestingStrategy());
        return starGraph;
    }

    public static SplitGraph toSplitGraph(Graph graph) {
        SplitGraph splitGraph = new SplitGraph();
        splitGraph.setShardingStrategy(new HashBasedShardingStrategy());
        splitGraph.setNodes(graph.getNodes());
        splitGraph.setVertices(graph.getVertices());
        splitGraph.setEdges(graph.getEdges());
        splitGraph.setVertexMap(graph.getVertexMap());
        splitGraph.setEdgeMap(graph.getEdgeMap());
        splitGraph.setProperties(graph.getProperties());
        splitGraph.setTestingStrategy(new SplitGraphTestingStrategy());
        return splitGraph;
    }

    public static TournamentGraph toTournamentGraph(Graph graph) {
        TournamentGraph tournamentGraph = new TournamentGraph();
        tournamentGraph.setShardingStrategy(new HashBasedShardingStrategy());
        tournamentGraph.setNodes(graph.getNodes());
        tournamentGraph.setVertices(graph.getVertices());
        tournamentGraph.setEdges(graph.getEdges());
        tournamentGraph.setVertexMap(graph.getVertexMap());
        tournamentGraph.setEdgeMap(graph.getEdgeMap());
        tournamentGraph.setProperties(graph.getProperties());
        tournamentGraph.setTestingStrategy(new TournamentGraphTestingStrategy());
        return tournamentGraph;
    }

    public static WheelGraph toWheelGraph(Graph graph) {
        WheelGraph wheelGraph = new WheelGraph();
        wheelGraph.setShardingStrategy(new HashBasedShardingStrategy());
        wheelGraph.setNodes(graph.getNodes());
        wheelGraph.setVertices(graph.getVertices());
        wheelGraph.setEdges(graph.getEdges());
        wheelGraph.setVertexMap(graph.getVertexMap());
        wheelGraph.setEdgeMap(graph.getEdgeMap());
        wheelGraph.setProperties(graph.getProperties());
        wheelGraph.setTestingStrategy(new WheelGraphTestingStrategy());
        return wheelGraph;
    }

    public static RegularBipartiteGraph toRegularBipartiteGraph(Graph graph) {
        RegularBipartiteGraph regularBipartiteGraph = new RegularBipartiteGraph();
        regularBipartiteGraph.setShardingStrategy(new HashBasedShardingStrategy());
        regularBipartiteGraph.setNodes(graph.getNodes());
        regularBipartiteGraph.setVertices(graph.getVertices());
        regularBipartiteGraph.setEdges(graph.getEdges());
        regularBipartiteGraph.setVertexMap(graph.getVertexMap());
        regularBipartiteGraph.setEdgeMap(graph.getEdgeMap());
        regularBipartiteGraph.setProperties(graph.getProperties());
        regularBipartiteGraph.setTestingStrategy(new RegularBipartiteGraphTestingStrategy());
        return regularBipartiteGraph;
    }

    public static CompleteBipartiteGraph toCompleteBipartiteGraph(Graph graph) {
        CompleteBipartiteGraph completeBipartiteGraph = new CompleteBipartiteGraph();
        completeBipartiteGraph.setShardingStrategy(new HashBasedShardingStrategy());
        completeBipartiteGraph.setNodes(graph.getNodes());
        completeBipartiteGraph.setVertices(graph.getVertices());
        completeBipartiteGraph.setEdges(graph.getEdges());
        completeBipartiteGraph.setVertexMap(graph.getVertexMap());
        completeBipartiteGraph.setEdgeMap(graph.getEdgeMap());
        completeBipartiteGraph.setProperties(graph.getProperties());
        completeBipartiteGraph.setTestingStrategy(new CompleteBipartiteGraphTestingStrategy());
        return completeBipartiteGraph;
    }

    public static RegularGraph toRegularGraph(Graph graph) {
        RegularGraph regularGraph = new RegularGraph();
        regularGraph.setShardingStrategy(new HashBasedShardingStrategy());
        regularGraph.setNodes(graph.getNodes());
        regularGraph.setVertices(graph.getVertices());
        regularGraph.setEdges(graph.getEdges());
        regularGraph.setVertexMap(graph.getVertexMap());
        regularGraph.setEdgeMap(graph.getEdgeMap());
        regularGraph.setProperties(graph.getProperties());
        regularGraph.setTestingStrategy(new RegularGraphTestingStrategy());
        return regularGraph;
    }

    public static LineGraph toLineGraph(Graph graph) {
        LineGraph lineGraph = new LineGraph();
        lineGraph.setShardingStrategy(new HashBasedShardingStrategy());
        lineGraph.setNodes(graph.getNodes());
        lineGraph.setVertices(graph.getVertices());
        lineGraph.setEdges(graph.getEdges());
        lineGraph.setVertexMap(graph.getVertexMap());
        lineGraph.setEdgeMap(graph.getEdgeMap());
        lineGraph.setProperties(graph.getProperties());
        lineGraph.setTestingStrategy(new LineGraphTestingStrategy());
        return lineGraph;
    }

    public static IntervalGraph toIntervalGraph(Graph graph) {
        IntervalGraph intervalGraph = new IntervalGraph();
        intervalGraph.setShardingStrategy(new HashBasedShardingStrategy());
        intervalGraph.setNodes(graph.getNodes());
        intervalGraph.setVertices(graph.getVertices());
        intervalGraph.setEdges(graph.getEdges());
        intervalGraph.setVertexMap(graph.getVertexMap());
        intervalGraph.setEdgeMap(graph.getEdgeMap());
        intervalGraph.setProperties(graph.getProperties());
        intervalGraph.setTestingStrategy(new IntervalGraphTestingStrategy());
        return intervalGraph;
    }

    public static GridGraph toGridGraph(Graph graph, int rows, int columns) {
        GridGraph gridGraph = new GridGraph();
        gridGraph.setShardingStrategy(new HashBasedShardingStrategy());
        gridGraph.setNodes(graph.getNodes());
        gridGraph.setVertices(graph.getVertices());
        gridGraph.setEdges(graph.getEdges());
        gridGraph.setRows(rows);
        gridGraph.setColumns(columns);
        gridGraph.setVertexMap(graph.getVertexMap());
        gridGraph.setEdgeMap(graph.getEdgeMap());
        gridGraph.setProperties(graph.getProperties());
        gridGraph.setTestingStrategy(new GridGraphTestingStrategy());
        return gridGraph;
    }

}
