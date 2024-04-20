package com.server.graph_db.node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.MetricsEndpoint;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MonitoringService {

    @Autowired
    private MetricsEndpoint metricsEndpoint;

    @Scheduled(fixedRate = 5000)
    public void monitorMetrics() {
        // Retrieve CPU usage
        Double cpuUsage = metricsEndpoint.metric("system.cpu.usage", null)
                .getMeasurements().get(0).getValue();

        // Retrieve memory usage
        Double memoryUsage = metricsEndpoint.metric("jvm.memory.used", null)
                .getMeasurements().get(0).getValue();

        // Retrieve disk I/O
        Double diskIO = metricsEndpoint.metric("system.disk.write.bytes", null)
                .getMeasurements().get(0).getValue();

        // Log or process the metrics as needed
        System.out.println("CPU Usage: " + cpuUsage);
        System.out.println("Memory Usage: " + memoryUsage);
        System.out.println("Disk I/O: " + diskIO);
    }

}
