package icare.policy.service.grpc.server.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import icare.policy.service.grpc.Policy;
import icare.policy.service.grpc.PolicyServiceGrpc;
import io.grpc.stub.StreamObserver;

public class PolicyServiceImpl extends PolicyServiceGrpc.PolicyServiceImplBase {
	
	private Map<Integer, Policy> policies = null;
	
	private int defaultMaturityAmt = 100000;
	private static int ID =  1;
	
	public PolicyServiceImpl() {
		policies  = new HashMap<Integer, Policy>();
		policies.put(ID, createPolicyObject("Cancer", "Peter Parker"));
		policies.put(ID, createPolicyObject("Accident", "Sarah Jones"));
		policies.put(ID, createPolicyObject("Critical Illness", "Ashton Martin"));
	}
	
	private Policy createPolicyObject(String lob, String policyHolder
			) {
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1); 
		Date maturityDate = cal.getTime();
		
		Policy policy = Policy.newBuilder()
				.setLob(lob)
				.setPolicyHolder(policyHolder)
				.setMaturityDate(maturityDate.toString())
				.setMaturityAmt(String.valueOf(defaultMaturityAmt*Math.random()))
				.setId(ID)
				.build();
		ID++;
		
		System.out.println("-------- Policy Details ---------" );
		System.out.println("Policy ID : " +policy.getId());
		System.out.println("Policy LOB : " +policy.getLob());
		System.out.println("Policy PolicyHoder : " +policy.getPolicyHolder());
		System.out.println("Policy Maturity Amount : " +policy.getMaturityAmt());
		System.out.println("Policy Maturity Date : " +policy.getMaturityDate());
		return policy;
	}
	
	@Override
	public void apply(Policy request, StreamObserver<Policy> responseObserver) {
		Policy issuedPolicy = createPolicyObject(request.getLob(), request.getPolicyHolder());
		policies.put(issuedPolicy.getId(), issuedPolicy);
		
		responseObserver.onNext(issuedPolicy);
		responseObserver.onCompleted();
	}
}
