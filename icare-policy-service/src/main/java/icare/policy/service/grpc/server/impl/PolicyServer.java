package icare.policy.service.grpc.server.impl;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class PolicyServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("iCare Policy Server booting up");

        Server server = ServerBuilder.forPort(50051)
                .addService(new PolicyServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Policy Server Shutting down");
            server.shutdown();
            System.out.println("Policy Server terminated");
        }));

        server.awaitTermination();
	}

}
