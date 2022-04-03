package icare.policy.service.grpc.client.impl;

import javax.net.ssl.SSLException;

import icare.policy.service.grpc.Policy;
import icare.policy.service.grpc.PolicyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PolicyClient {

	public static void main(String[] args) throws SSLException {
		PolicyClient client = new PolicyClient();
		client.run();
	}
	
	private void run() throws SSLException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        applyPolicy(channel);

        System.out.println("Client is shutting down");
        channel.shutdown();

    }
	
	private void applyPolicy(ManagedChannel channel) {
        PolicyServiceGrpc.PolicyServiceBlockingStub policyClient = PolicyServiceGrpc.newBlockingStub(channel);

        Policy request = Policy.newBuilder()
                .setLob("Cancer")
                .setPolicyHolder("Harry Potter")
                .build();

        // call the RPC and get back a ClaimResponse (protocol buffers)
        Policy response = policyClient.apply(request);

        System.out.println("Policy Received : " + response);
    }

}
