package com.server.graph_db.connection;

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
//        conn.setRequestMethod("POST");
//        conn.setRequestProperty("Content-Type", "application/json");
//        conn.setDoOutput(true);
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
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection switchDatabase(String databaseName) throws IOException {
//        conn.setRequestMethod("POST");
//        conn.setRequestProperty("Content-Type", "application/json");
//        conn.setDoOutput(true);
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
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection dropDatabase(String databaseName) throws IOException {
//        conn.setRequestMethod("POST");
//        conn.setRequestProperty("Content-Type", "application/json");
//        conn.setDoOutput(true);
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
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection deleteDatabase(String databaseName) throws IOException {
//        conn.setRequestMethod("POST");
//        conn.setRequestProperty("Content-Type", "application/json");
//        conn.setDoOutput(true);
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
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }
        conn.disconnect();
        connect();
        return this;
    }

    public GraphoPlexConnection createVertex(Vertex vertex) throws IOException {
//        conn.setRequestMethod("POST");
//        conn.setRequestProperty("Content-Type", "application/json");
//        conn.setDoOutput(true);
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
                response.append(responseLine.trim());
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
//        conn.setRequestMethod("POST");
//        conn.setRequestProperty("Content-Type", "application/json");
//        conn.setDoOutput(true);
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
                response.append(responseLine.trim());
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
        for(Vertex vertex : g.getVertexMap().values()){
            createVertex(vertex);
        }
        for(Edge edge : g.getEdgeMap().values().stream().flatMap(List::stream).collect(Collectors.toList())){
            createEdge(edge);
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