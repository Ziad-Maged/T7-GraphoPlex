package com.server.graph_db.core.vertex;

import java.util.*;

import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.alghorithms.strategies.sharding.HashBasedShardingStrategy;
import com.server.graph_db.alghorithms.strategies.testing.*;
import com.server.graph_db.graphs.*;
import com.server.graph_db.graphs.Graph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.server.graph_db.core.exceptions.vertex.VertexAlreadyExistsException;
import com.server.graph_db.core.exceptions.vertex.VertexNotFoundException;
import com.server.graph_db.core.partition.PartitionManager;
import com.server.graph_db.core.vertex.runnables.getEdgesByIdsAsync;
import com.server.graph_db.core.vertex.runnables.getIncomingEdgesAsync;
import com.server.graph_db.core.vertex.runnables.getOutgoingEdgesAsync;
import com.server.graph_db.core.vertex.runnables.getVerticesByIdsAsync;
import com.server.graph_db.grpc.clients.VertexClient;

@Component
public class GlobalVertexService implements VertexService {

    @Autowired
    private LocalVertexService vertexService;

    @Autowired
    private PartitionManager partitionManager;


    @Autowired
    private VertexClient vertexClient;

    @Value("${server.numOfServers}")
    private int numOfServers;


    @Value("${myserver.serverId}")
    private String serverId;

   

    public Vertex getVertex(String vertexId) throws VertexNotFoundException {
        int partitionId = partitionManager.getPartitionId(vertexId);
        if (partitionId == Integer.parseInt(serverId)) {

            return vertexService.getVertex(vertexId);
        } else {

            return vertexClient.getVertex(vertexId, String.valueOf(partitionId));

        }
    }

    public Iterable<String> getAllVerticesIds() {
        // get vertices Ids from my server and other servers and append them
        List<String> verticesIds = new ArrayList<String>();
        Iterable<String> verticesIdsFromMyserver = vertexService.getAllVerticesIds();

        for (String vertexId : verticesIdsFromMyserver) {
            verticesIds.add(vertexId);
        }

        // loop on all servers and get vertices ids from them
        for (int i = 0; i < numOfServers; i++) {
            if (i != Integer.parseInt(serverId)) {
                // send to the right partition
                Iterable<String> verticesIdsFromOtherServer = vertexClient.getAllVerticesIds(String.valueOf(i));

                // append to verticesIds
                for (String vertexId : verticesIdsFromOtherServer) {
                    verticesIds.add(vertexId);
                }
            }

        }
        ;

        return verticesIds;
    }

    public Graph getGraph() throws Exception {
        // get vertices from my server and other servers and append them
        List<Vertex> vertices = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();
        Iterable<String> verticesIDs = vertexService.getAllVerticesIds();
        Iterable<Vertex> verticesFromMyserver = vertexService.getAllVertices();
        Iterable<Edge> edgesFromMyServer = vertexService.getOutgoingEdges(verticesIDs);
        Graph g;
        Vertex propertiesVertex = null;

        for (Vertex vertex : verticesFromMyserver) {
            vertices.add(vertex);
        }

        for (Edge edge : edgesFromMyServer) {
            edges.add(edge);
        }

        // loop on all servers and get vertices from them
        for (int i = 0; i < numOfServers; i++) {
            if (i != Integer.parseInt(serverId)) {
                // send to the right partition
                Iterable<String> verticesIdsFromOtherServer = vertexClient.getAllVerticesIds(String.valueOf(i));
                Iterable<Vertex> verticesFromOtherServer = vertexClient.getVertices(verticesIdsFromOtherServer, String.valueOf(i));
                Iterable<Edge> edgesFromOtherServer = vertexClient.getOutgoingEdges(verticesIdsFromOtherServer, String.valueOf(i));

                // append to vertices
                for (Vertex vertex : verticesFromOtherServer) {
                    vertices.add(vertex);
                }

                for (Edge edge : edgesFromOtherServer) {
                    edges.add(edge);
                }
            }

        }

        for(Vertex v : vertices){
            if(v.getId().equals("Properties")){
                propertiesVertex = v;
                vertices.remove(v);
                break;
            }
        }

        switch(Objects.requireNonNull(propertiesVertex).getProperty("type")){
            case "CompleteBipartiteGraph":
                g = new CompleteBipartiteGraph();
                g.setTestingStrategy(new CompleteBipartiteGraphTestingStrategy());
                break;
            case "CubicGraph":
                g = new CubicGraph();
                g.setTestingStrategy(new CubicGraphTestingStrategy());
                break;
            case "EulerianGraph":
                g = new EulerianGraph();
                g.setTestingStrategy(new EulerianGraphTestingStrategy());
                break;
            case "GridGraph":
                g = new GridGraph();
                g.setTestingStrategy(new GridGraphTestingStrategy());
                break;
            case "HamiltonianGraph":
                g = new HamiltonianGraph();
                g.setTestingStrategy(new HamiltonianGraphTestingStrategy());
                break;
            case "IntervalGraph":
                g = new IntervalGraph();
                g.setTestingStrategy(new IntervalGraphTestingStrategy());
                break;
            case "LineGraph":
                g = new LineGraph();
                g.setTestingStrategy(new LineGraphTestingStrategy());
                break;
            case "RegularBipartiteGraph":
                g = new RegularBipartiteGraph();
                g.setTestingStrategy(new RegularBipartiteGraphTestingStrategy());
                break;
            case "RegularGraph":
                g = new RegularGraph();
                g.setTestingStrategy(new RegularGraphTestingStrategy());
                break;
            case "SplitGraph":
                g = new SplitGraph();
                g.setTestingStrategy(new SplitGraphTestingStrategy());
                break;
            case "StarGraph":
                g = new StarGraph();
                g.setTestingStrategy(new StarGraphTestingStrategy());
                break;
            case "TournamentGraph":
                g = new TournamentGraph();
                g.setTestingStrategy(new TournamentGraphTestingStrategy());
                break;
            default:
                g = new WheelGraph();
                g.setTestingStrategy(new WheelGraphTestingStrategy());
        }

        g.setProperties((HashMap<String, String>) propertiesVertex.getProperties());
        g.setNodes(numOfServers);
        g.setVertices(vertices.size());
        g.setEdges(edges.size());
        g.setType(GraphType.valueOf(propertiesVertex.getProperty("graphType")));
        g.setShardingStrategy(new HashBasedShardingStrategy());

        for(Vertex v : vertices){
            g.addVertex(v);
        }

        for(Edge e : edges){
            g.addEdge(e);
        }

        return g;
    }

    public Iterable<Vertex> getVerticesByIds(Iterable<String> verticesIds) {
        List<Vertex> vertices = new ArrayList<Vertex>();
        List<List<Vertex>> verticesByPartitionId = new ArrayList<List<Vertex>>();
        // initialize
        for (int i = 0; i < numOfServers; i++) {
            verticesByPartitionId.add(new ArrayList<Vertex>());
        }
        Thread[] activeThreads = new Thread[numOfServers];
        // group vertices ids by partition id
        List<List<String>> verticesIdsByPartitionId = partitionManager.groupVerticesIdsByPartitionId(verticesIds);
        // loop on all partitions and get vertices from them
        for (int i = 0; i < numOfServers; i++) {
            // execute in parallel
            if (verticesIdsByPartitionId.get(i).size() > 0) {
                activeThreads[i] = new Thread(new getVerticesByIdsAsync(vertexService, verticesIdsByPartitionId.get(i),
                        serverId, vertexClient, verticesByPartitionId.get(i), i));
                activeThreads[i].start();
            }

        }

        // wait till only the threads created in this method are finished

        for (int i = 0; i < numOfServers; i++) {
            try {
                if (activeThreads[i] != null)
                    activeThreads[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // append to vertices
        for (int i = 0; i < numOfServers; i++) {
            for (Vertex vertex : verticesByPartitionId.get(i)) {
                vertices.add(vertex);
            }
        }

        return vertices;
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public long getVertexCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVertexCount'");
    }

    @Override
    public Iterable<Edge> getEdgesById(Iterable<EdgeId> edgeIds) throws Exception {
        List<List<EdgeId>> edgeIdsByPartitionId = partitionManager.groupEdgeIdsByPartitionId(edgeIds);
        List<List<Edge>> edgesByPartitionId = new ArrayList<List<Edge>>();
        // initialize
        for (int i = 0; i < numOfServers; i++) {
            edgesByPartitionId.add(new ArrayList<Edge>());
        }

        Thread[] activeThreads = new Thread[numOfServers];
        // loop on all partitions and get edges from them
        for (int i = 0; i < numOfServers; i++) {
            // execute in parallel
            if (edgeIdsByPartitionId.get(i).size() > 0) {
                activeThreads[i] = new Thread(new getEdgesByIdsAsync(vertexService, edgeIdsByPartitionId.get(i),
                        serverId, vertexClient, edgesByPartitionId.get(i), i));
                activeThreads[i].start();
            }

        }

        // wait till only the threads created in this method are finished
        for (int i = 0; i < numOfServers; i++) {
            try {
                if (activeThreads[i] != null)
                    activeThreads[i].join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        List<Edge> edges = new ArrayList<Edge>();
        // append to edges
        for (int i = 0; i < numOfServers; i++) {
            for (Edge edge : edgesByPartitionId.get(i)) {
                edges.add(edge);
            }
        }

        return edges;
    }

    @Override
    public void deleteVertex(String id) {
        if (partitionManager.getPartitionId(id) == Integer.parseInt(serverId)) {
            vertexService.deleteVertex(id);
        } else {
            vertexClient.deleteVertex(id, String.valueOf(partitionManager.getPartitionId(id)));
        }
    }

    @Override
    public void updateVertex(String id, String label, Map<String, String> properties) {
        if (partitionManager.getPartitionId(id) == Integer.parseInt(serverId)) {
            vertexService.updateVertex(id, label, properties);
        } else {
            vertexClient.updateVertex(id, label, properties, String.valueOf(partitionManager.getPartitionId(id)));
        }
    }

    @Override
    public void updateVertex(String id, Map<String, String> properties) {
        if (partitionManager.getPartitionId(id) == Integer.parseInt(serverId)) {
            vertexService.updateVertex(id, properties);
        } else {
            vertexClient.updateVertex(id, properties, String.valueOf(partitionManager.getPartitionId(id)));
        }
    }

    public void createVertex(Vertex vertex) throws VertexAlreadyExistsException {
        if (partitionManager.getPartitionId(vertex.getId()) == Integer.parseInt(serverId)) {
            vertexService.createVertex(vertex);
        } else {
            vertexClient.createVertex(vertex, String.valueOf(partitionManager.getPartitionId(vertex.getId())));
        }
    }

    public void addEdge(String sourceId, Edge edge) throws Exception {
        System.out.println(edge);
        // save outgoing edge with the source vertex
        if (partitionManager.getPartitionId(sourceId) == Integer.parseInt(serverId)) {
            vertexService.addEdge(sourceId, edge, true);
        } else {
            vertexClient.createEdge(sourceId, edge, true, String.valueOf(partitionManager.getPartitionId(sourceId)));
        }

        // save incoming edge with the destination vertex
        if (partitionManager.getPartitionId(edge.getDestinationVertexId()) == Integer.parseInt(serverId)) {
            vertexService.addEdge(sourceId, edge, false);
        } else {
            vertexClient.createEdge(sourceId, edge, false,
                    String.valueOf(partitionManager.getPartitionId(edge.getDestinationVertexId())));
        }
    }

    public void addGraph(Graph g) throws Exception{
        Vertex propertiesVertex = new Vertex("Properties");
        propertiesVertex.setProperties(g.getProperties());
        Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard = g.shard();
        HashMap<Integer, List<Vertex>> vertices = shard.getFirst();
        HashMap<Integer, List<Edge>> edges = shard.getSecond();
        vertices.get(0).add(propertiesVertex);
        for(int serverId : vertices.keySet()){
            if(serverId == Integer.parseInt(this.serverId)) {
                for (Vertex v : vertices.get(serverId)) {
                    vertexService.createVertex(v);
                }
            }else {
                for(Vertex v : vertices.get(serverId)) {
                    vertexClient.createVertex(v, String.valueOf(serverId));
                }
            }
        }

        for(int serverId : edges.keySet()){
            if(serverId == Integer.parseInt(this.serverId)) {
                for (Edge e : edges.get(serverId)) {
                    vertexService.addEdge(e.getSourceVertexId(), e, true);
                    int destinationVertexServerId = getServerIdOfVertex(g.getVertexMap().get(e.getDestinationVertexId()), vertices);
                    if(destinationVertexServerId == Integer.parseInt(this.serverId)) {
                        vertexService.addEdge(e.getSourceVertexId(), e, false);
                    }else {
                        vertexClient.createEdge(e.getSourceVertexId(), e, false, String.valueOf(destinationVertexServerId));
                    }
                }
            }else {
                for (Edge e : edges.get(serverId)) {
                    vertexClient.createEdge(e.getSourceVertexId(), e, true, String.valueOf(serverId));
                    int destinationVertexServerId = getServerIdOfVertex(g.getVertexMap().get(e.getDestinationVertexId()), vertices);
                    if(destinationVertexServerId == Integer.parseInt(this.serverId)) {
                        vertexService.addEdge(e.getSourceVertexId(), e, false);
                    }else {
                        vertexClient.createEdge(e.getSourceVertexId(), e, false, String.valueOf(destinationVertexServerId));
                    }
                }
            }
        }
    }

    private int getServerIdOfVertex(Vertex vertex, HashMap<Integer, List<Vertex>> shard){
        for(int serverId : shard.keySet()){
            if(shard.get(serverId).contains(vertex)){
                return serverId;
            }
        }
        return -1;
    }

    public void reshard(ShardingStrategy shardingStrategy) throws Exception {
        Graph g = getGraph();
        g.setShardingStrategy(shardingStrategy);

        List<Vertex> vertices = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();
        Iterable<String> verticesIDs = vertexService.getAllVerticesIds();
        Iterable<Vertex> verticesFromMyserver = vertexService.getAllVertices();
        Iterable<Edge> edgesFromMyServer = vertexService.getOutgoingEdges(verticesIDs);

        for (Vertex vertex : verticesFromMyserver) {
            vertexService.deleteVertex(vertex.getId());
        }

        for (Edge edge : edgesFromMyServer) {
            vertexService.deleteEdge(edge.getSourceVertexId(), edge.getDestinationVertexId(), edge.getLabel(), true);
        }

        // loop on all servers and get vertices from them
        for (int i = 0; i < numOfServers; i++) {
            if (i != Integer.parseInt(serverId)) {
                Iterable<String> verticesIdsFromOtherServer = vertexClient.getAllVerticesIds(String.valueOf(i));
                Iterable<Edge> edgesFromOtherServer = vertexClient.getOutgoingEdges(verticesIdsFromOtherServer, String.valueOf(i));
                for (String vertex : verticesIdsFromOtherServer) {
                    vertexClient.deleteVertex(vertex, String.valueOf(i));
                }
                for (Edge edge : edgesFromOtherServer) {
                    vertexClient.deleteEdge(edge.getSourceVertexId(), edge.getDestinationVertexId(), edge.getLabel(), true,
                            String.valueOf(i));
                }
            }
        }

        addGraph(g);
    }

    public void deleteEdge(String sourceId, String destinationVertexId, String label) throws Exception {
        if (partitionManager.getPartitionId(sourceId) == Integer.parseInt(serverId)) {
            vertexService.deleteEdge(sourceId, destinationVertexId, label, true);
        } else {
            vertexClient.deleteEdge(sourceId, destinationVertexId, label, true,
                    String.valueOf(partitionManager.getPartitionId(sourceId)));
        }

        if (partitionManager.getPartitionId(destinationVertexId) == Integer.parseInt(serverId)) {
            vertexService.deleteEdge(sourceId, destinationVertexId, label, false);
        } else {
            vertexClient.deleteEdge(sourceId, destinationVertexId, label, false,
                    String.valueOf(partitionManager.getPartitionId(destinationVertexId)));
        }
    }

    public void updateEdge(String sourceId, String destinationVertexId, String label, Map<String, String> properties)
            throws Exception {
        if (partitionManager.getPartitionId(sourceId) == Integer.parseInt(serverId)) {
            vertexService.updateEdge(sourceId, destinationVertexId, label, properties, true);
        } else {
            vertexClient.updateEdge(sourceId, destinationVertexId, label, properties, true,
                    String.valueOf(partitionManager.getPartitionId(sourceId)));
        }

        if (partitionManager.getPartitionId(destinationVertexId) == Integer.parseInt(serverId)) {
            vertexService.updateEdge(sourceId, destinationVertexId, label, properties, false);
        } else {
            vertexClient.updateEdge(sourceId, destinationVertexId, label, properties, false,
                    String.valueOf(partitionManager.getPartitionId(destinationVertexId)));
        }
    }

    @Override
    public Iterable<Edge> getOutgoingEdges(String vertexId) throws Exception {
        if (partitionManager.getPartitionId(vertexId) == Integer.parseInt(serverId)) {
            return vertexService.getOutgoingEdges(vertexId);
        } else {
            return vertexClient.getOutgoingEdges(vertexId, String.valueOf(partitionManager.getPartitionId(vertexId)));
        }
    }

    @Override
    public Iterable<Edge> getIncomingEdges(String vertexId) throws Exception {
        if (partitionManager.getPartitionId(vertexId) == Integer.parseInt(serverId)) {
            return vertexService.getIncomingEdges(vertexId);
        } else {
            return vertexClient.getIncomingEdges(vertexId, String.valueOf(partitionManager.getPartitionId(vertexId)));
        }

    }

    @Override
    public Iterable<Edge> getOutgoingEdges(Iterable<String> verticesIds) throws Exception {
        List<List<String>> verticesIdsByPartitionId = partitionManager.groupVerticesIdsByPartitionId(verticesIds);
        List<List<Edge>> edgesByPartitionId = new ArrayList<List<Edge>>();
        for (int i = 0; i < numOfServers; i++) {
            edgesByPartitionId.add(new ArrayList<Edge>());
        }
        Thread[] activeThreads = new Thread[numOfServers];
        for (int i = 0; i < numOfServers; i++) {
            activeThreads[i] = new Thread(new getOutgoingEdgesAsync(vertexService, verticesIdsByPartitionId.get(i), serverId, vertexClient,
                    edgesByPartitionId.get(i), i));
            activeThreads[i].start();
        }

        for (int i = 0; i < numOfServers; i++) {
            try {
                activeThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        List<Edge> edges = new ArrayList<Edge>();
        for (int i = 0; i < numOfServers; i++) {
            for (Edge edge : edgesByPartitionId.get(i)) {
                edges.add(edge);
            }
        }

        return edges;

    }

    @Override
    public Iterable<Edge> getIncomingEdges(Iterable<String> verticesIds) throws Exception {
        List<List<String>> verticesIdsByPartitionId = partitionManager.groupVerticesIdsByPartitionId(verticesIds);
        List<List<Edge>> edgesByPartitionId = new ArrayList<List<Edge>>();
        for (int i = 0; i < numOfServers; i++) {
            edgesByPartitionId.add(new ArrayList<Edge>());
        }
        Thread[] activeThreads = new Thread[numOfServers];
        for (int i = 0; i < numOfServers; i++) {
            activeThreads[i] = new Thread(new getIncomingEdgesAsync(vertexService, verticesIdsByPartitionId.get(i), serverId, vertexClient,
                    edgesByPartitionId.get(i), i));
            activeThreads[i].start();
        }

        for (int i = 0; i < numOfServers; i++) {
            try {
                activeThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        List<Edge> edges = new ArrayList<Edge>();
        for (int i = 0; i < numOfServers; i++) {
            for (Edge edge : edgesByPartitionId.get(i)) {
                edges.add(edge);
            }
        }

        return edges;
    }

}
