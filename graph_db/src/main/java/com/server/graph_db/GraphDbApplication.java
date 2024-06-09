package com.server.graph_db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


@SpringBootApplication
public class GraphDbApplication implements CommandLineRunner {

	    static Thread t = new Thread(() -> {
            try (ZContext context = new ZContext()) {
				Properties properties = new Properties();
				properties.load(new FileInputStream("src/main/resources/application.properties"));
				String serverId = properties.getProperty("myserver.serverId");
				String serverHost = properties.getProperty("grpc.servers.hosts").split(",")[Integer.parseInt(serverId)];
				serverHost = (serverHost.equals("localhost")) ? "*" : serverHost;
				String serverAddress = "tcp://" + serverHost + ":5555";
                //  Socket to talk to clients
                ZMQ.Socket socket = context.createSocket(SocketType.REP);
                socket.bind(serverAddress);

                while (!Thread.currentThread().isInterrupted()) {
                    byte[] reply = socket.recv(0);
                    String rep = new String(reply, ZMQ.CHARSET);
					if (rep.contains("Save")) {
						String[] split = rep.split(",");
						saveVertex(split[1], split[2]);
					}
                    System.out.println(
                            "Received " + ": [" + new String(reply, ZMQ.CHARSET) + "]"
                    );
                    String response = "world";
                    socket.send(response.getBytes(ZMQ.CHARSET), 0);
                    Thread.sleep(1000); //  Do some 'work'
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

	private static void saveVertex(String vertexId, String serverId) {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("src/main/resources/partition.properties"));
			properties.setProperty(vertexId, serverId);
			properties.store(new FileOutputStream("src/main/resources/partition.properties"), null);
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}


	public static void main(String[] args) {
		SpringApplication.run(GraphDbApplication.class, args);
		t.start();
	}

	@Override
	public void run(String... args) throws Exception {

	}

}