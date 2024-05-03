package com.server.graph_db.connection;

import com.server.graph_db.alghorithms.strategies.sharding.EqualPartitionShardingStrategy;
import com.server.graph_db.alghorithms.strategies.sharding.RandomPartitionShardingStrategy;
import com.server.graph_db.alghorithms.strategies.sharding.RoundRobinShardingStrategy;
import com.server.graph_db.alghorithms.strategies.sharding.TarjanAlgorithmShardingStrategy;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class GraphoPlexConnection {
    private String host = "127.0.0.1";
    private int port = 8080;
    URL url;
    HttpURLConnection conn;

    public GraphoPlexConnection(){
    }

    public GraphoPlexConnection(String host, int port){
        this.host = host;
        this.port = port;
    }

    public GraphoPlexConnection host(String host){
        this.host = host;
        return this;
    }

    public GraphoPlexConnection port(int port){
        this.port = port;
        return this;
    }

    public GraphoPlexConnection connect() throws IOException {
        url = new URL("http://" + host + ":" + port + "/query");
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        return this;
    }

    public GraphoPlexConnection shutdown() {
        conn.disconnect();
        return this;
    }

    public GraphoPlexConnection createDatabase(String databaseName) throws IOException {
        String jsonInputString = "{\"query\": \"CREATE DATABASE " + databaseName + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection switchDatabase(String databaseName) throws IOException {
        String jsonInputString = "{\"query\": \"SWITCH DATABASE " + databaseName + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection dropDatabase(String databaseName) throws IOException {
        String jsonInputString = "{\"query\": \"DROP DATABASE " + databaseName + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection deleteDatabase(String databaseName) throws IOException {
        String jsonInputString = "{\"query\": \"DELETE DATABASE " + databaseName + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection createVertex(Vertex vertex) throws IOException {
        String jsonInputString = "{\"query\": \"CREATE VERTEX (" + vertex.getId() + ":" + vertex.getLabel() + " " + flattenProperties(vertex.getProperties()) + ")" + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection createEdge(Edge edge) throws IOException {
        String jsonInputString = "{\"query\": \"CREATE EDGE " + edge.getLabel() + " FROM " + edge.getSourceVertexId() + " TO " + edge.getDestinationVertexId() + " WITH " + flattenProperties(edge.getProperties()) + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection match(String parameters) throws IOException{
        String jsonInputString = "{\"query\": \"MATCH " + parameters + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection topologicalSort() throws IOException{
        String jsonInputString = "{\"query\": \"MATCH TOPOLOGICAL SORT" + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection bridgeEdges() throws IOException{
        String jsonInputString = "{\"query\": \"MATCH BRIDGE EDGES" + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection allShortestPaths(String cost) throws IOException{
        String jsonInputString = "{\"query\": \"MATCH ALL SHORTEST PATHS WITH COST = " + cost + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection minimumSpanningTree(String cost) throws IOException{
        String jsonInputString = "{\"query\": \"MATCH MINIMUM SPANNING TREE WITH COST = " + cost + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection maximumFlow(String source, String sink, String capacity) throws IOException{
        String jsonInputString = "{\"query\": \"MATCH MAXIMUM FLOW FROM " + source + " TO " + sink + " WITH CAPACITY = " + capacity + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection shortestPath(String source, String destination, String cost) throws IOException{
        return shortestPath(source, destination, cost, false);
    }

    public GraphoPlexConnection shortestPath(String source, String destination, String cost, boolean hasNegative) throws IOException {
        String negative = (hasNegative) ? " HAS NEGATIVE" : "";
        String jsonInputString = "{\"query\": \"MATCH SHORTEST PATH FROM " + source + " TO " + destination + " WITH COST = " + cost + negative + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection createGraph(Graph g) throws IOException {
        Vertex properties = new Vertex("Properties");
        properties.setProperties(g.getProperties());
        createVertex(properties);
        for(Vertex vertex : g.getVertexMap().values()){
            createVertex(vertex);
        }
        for(Edge edge : g.getEdgeMap().values().stream().flatMap(List::stream).collect(Collectors.toList())){
            createEdge(edge);
        }
        conn.disconnect();
        connect();
        if(g.getShardingStrategy() instanceof TarjanAlgorithmShardingStrategy)
            reshardDatabase("TARJAN");
        else if (g.getShardingStrategy() instanceof RandomPartitionShardingStrategy)
            reshardDatabase("RANDOM");
        else if (g.getShardingStrategy() instanceof RoundRobinShardingStrategy)
            reshardDatabase("ROUND_ROBIN");
        else if (g.getShardingStrategy() instanceof EqualPartitionShardingStrategy)
            reshardDatabase("EQUAL");
        else
            reshardDatabase("HASH");
        return this;
    }

    public GraphoPlexConnection reshardDatabase(String shardingStrategy) throws IOException {
        if(!shardingStrategy.equalsIgnoreCase("HASH") && !shardingStrategy.equalsIgnoreCase("EQUAL") && !shardingStrategy.equalsIgnoreCase("RANDOM") && !shardingStrategy.equalsIgnoreCase("ROUND_ROBIN") && !shardingStrategy.equalsIgnoreCase("TARJAN"))
            throw new IllegalArgumentException("Sharding strategy must be either HASH, EQUAL, RANDOM, ROUND_ROBIN or TARJAN");
        String jsonInputString = "{\"query\": \"RESHARD DATABASE USING " + shardingStrategy.toUpperCase() + "\"}";
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim() + "\n");
            }
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        conn.disconnect();
        connect();
        return this;
    }

    private String flattenProperties(Map<String, String> properties){
        if(properties == null)
            return "{}";
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(String key : properties.keySet()){
            sb.append(key + ": " + properties.get(key) + ", ");
        }
        if(sb.length() == 1)
            return "";
        sb.delete(sb.length() - 2, sb.length());
        sb.append("}");
        return sb.toString();
    }
}
