package icare.policy.service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
/*
 * @javax.annotation.Generated( value =
 * "by gRPC proto compiler (version 1.45.1)", comments =
 * "Source: icare-policy-service.proto")
 * 
 * @io.grpc.stub.annotations.GrpcGenerated
 */
public final class PolicyServiceGrpc {

  private PolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "icare.policy.service.grpc.PolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<icare.policy.service.grpc.Policy,
      icare.policy.service.grpc.Policy> getApplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "apply",
      requestType = icare.policy.service.grpc.Policy.class,
      responseType = icare.policy.service.grpc.Policy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<icare.policy.service.grpc.Policy,
      icare.policy.service.grpc.Policy> getApplyMethod() {
    io.grpc.MethodDescriptor<icare.policy.service.grpc.Policy, icare.policy.service.grpc.Policy> getApplyMethod;
    if ((getApplyMethod = PolicyServiceGrpc.getApplyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getApplyMethod = PolicyServiceGrpc.getApplyMethod) == null) {
          PolicyServiceGrpc.getApplyMethod = getApplyMethod =
              io.grpc.MethodDescriptor.<icare.policy.service.grpc.Policy, icare.policy.service.grpc.Policy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "apply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  icare.policy.service.grpc.Policy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  icare.policy.service.grpc.Policy.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("apply"))
              .build();
        }
      }
    }
    return getApplyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PolicyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceStub>() {
        public PolicyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceStub(channel, callOptions);
        }
      };
    return PolicyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceBlockingStub>() {
        public PolicyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceBlockingStub(channel, callOptions);
        }
      };
    return PolicyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PolicyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PolicyServiceFutureStub>() {
        public PolicyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PolicyServiceFutureStub(channel, callOptions);
        }
      };
    return PolicyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PolicyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void apply(icare.policy.service.grpc.Policy request,
        io.grpc.stub.StreamObserver<icare.policy.service.grpc.Policy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplyMethod(), responseObserver);
    }

    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getApplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                icare.policy.service.grpc.Policy,
                icare.policy.service.grpc.Policy>(
                  this, METHODID_APPLY)))
          .build();
    }
  }

  /**
   */
  public static final class PolicyServiceStub extends io.grpc.stub.AbstractAsyncStub<PolicyServiceStub> {
    private PolicyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceStub(channel, callOptions);
    }

    /**
     */
    public void apply(icare.policy.service.grpc.Policy request,
        io.grpc.stub.StreamObserver<icare.policy.service.grpc.Policy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PolicyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PolicyServiceBlockingStub> {
    private PolicyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public icare.policy.service.grpc.Policy apply(icare.policy.service.grpc.Policy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PolicyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PolicyServiceFutureStub> {
    private PolicyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PolicyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<icare.policy.service.grpc.Policy> apply(
        icare.policy.service.grpc.Policy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPLY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPLY:
          serviceImpl.apply((icare.policy.service.grpc.Policy) request,
              (io.grpc.stub.StreamObserver<icare.policy.service.grpc.Policy>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PolicyServiceBaseDescriptorSupplier() {}

    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return icare.policy.service.grpc.IcarePolicyService.getDescriptor();
    }

    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PolicyService");
    }
  }

  private static final class PolicyServiceFileDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier {
    PolicyServiceFileDescriptorSupplier() {}
  }

  private static final class PolicyServiceMethodDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PolicyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PolicyServiceFileDescriptorSupplier())
              .addMethod(getApplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
