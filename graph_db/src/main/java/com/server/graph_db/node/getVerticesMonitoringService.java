package com.server.graph_db.node;

import com.server.graph_db.grpc.vertex.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class getVerticesMonitoringService {

    private final Map<String, ManagedChannel> channels = new HashMap<>();
    private final Map<String, VertexServiceGrpc.VertexServiceStub> stubs = new HashMap<>();

    public void addServer(String serverName, String host, int port) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext() // For testing purposes only; use SSL/TLS in production
                .build();
        VertexServiceGrpc.VertexServiceStub stub = VertexServiceGrpc.newStub(channel);
        channels.put(serverName, channel);
        stubs.put(serverName, stub);
    }

    public void removeServer(String serverName) {
        ManagedChannel channel = channels.get(serverName);
        if (channel != null) {
            channel.shutdown();
        }
        channels.remove(serverName);
        stubs.remove(serverName);
    }

    @Scheduled(fixedRate = 5000) // Execute every 5 seconds
    public void monitorMetrics() {
        for (Map.Entry<String, VertexServiceGrpc.VertexServiceStub> entry : stubs.entrySet()) {
            String serverName = entry.getKey();
            VertexServiceGrpc.VertexServiceStub stub = entry.getValue();
            getVerticesRequest request = getVerticesRequest.newBuilder().build();
            stub.getVertices(request, new StreamObserver<getVerticesResponse>() {
                @Override
                public void onNext(getVerticesResponse response) {
                    // Process the metrics received from the gRPC server
                    // the response.getCpuUsage(), response.getMemoryUsage(), and response.getDiskIO() methods are not defined in the response class.
//                    System.out.println("Received metrics from " + serverName + ":");
//                    System.out.println("CPU Usage: " + response.getCpuUsage());
//                    System.out.println("Memory Usage: " + response.getMemoryUsage());
//                    System.out.println("Disk I/O: " + response.getDiskIO());
                }

                @Override
                public void onError(Throwable t) {
                    System.err.println("Error retrieving metrics from " + serverName + ": " + t.getMessage());
                }

                @Override
                public void onCompleted() {
                    System.out.println("Finished receiving metrics from " + serverName);
                }
            });
        }
    }

    public void shutdown() throws InterruptedException {
        for (ManagedChannel channel : channels.values()) {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
