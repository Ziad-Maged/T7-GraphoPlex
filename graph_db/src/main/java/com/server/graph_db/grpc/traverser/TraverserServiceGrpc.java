package com.server.graph_db.grpc.traverser;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: traverser.proto")
public final class TraverserServiceGrpc {

  private TraverserServiceGrpc() {}

  public static final String SERVICE_NAME = "TraverserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<vertexBinding,
      verticesIds> getGetVerticesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVertices",
      requestType = vertexBinding.class,
      responseType = verticesIds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<vertexBinding,
      verticesIds> getGetVerticesMethod() {
    io.grpc.MethodDescriptor<vertexBinding, verticesIds> getGetVerticesMethod;
    if ((getGetVerticesMethod = TraverserServiceGrpc.getGetVerticesMethod) == null) {
      synchronized (TraverserServiceGrpc.class) {
        if ((getGetVerticesMethod = TraverserServiceGrpc.getGetVerticesMethod) == null) {
          TraverserServiceGrpc.getGetVerticesMethod = getGetVerticesMethod =
              io.grpc.MethodDescriptor.<vertexBinding, verticesIds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getVertices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  vertexBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verticesIds.getDefaultInstance()))
              .setSchemaDescriptor(new TraverserServiceMethodDescriptorSupplier("getVertices"))
              .build();
        }
      }
    }
    return getGetVerticesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<filterVerticesRequest,
      verticesIds> getFilterVerticesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "filterVertices",
      requestType = filterVerticesRequest.class,
      responseType = verticesIds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<filterVerticesRequest,
      verticesIds> getFilterVerticesMethod() {
    io.grpc.MethodDescriptor<filterVerticesRequest, verticesIds> getFilterVerticesMethod;
    if ((getFilterVerticesMethod = TraverserServiceGrpc.getFilterVerticesMethod) == null) {
      synchronized (TraverserServiceGrpc.class) {
        if ((getFilterVerticesMethod = TraverserServiceGrpc.getFilterVerticesMethod) == null) {
          TraverserServiceGrpc.getFilterVerticesMethod = getFilterVerticesMethod =
              io.grpc.MethodDescriptor.<filterVerticesRequest, verticesIds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "filterVertices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  filterVerticesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  verticesIds.getDefaultInstance()))
              .setSchemaDescriptor(new TraverserServiceMethodDescriptorSupplier("filterVertices"))
              .build();
        }
      }
    }
    return getFilterVerticesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<filterEdgesRequest,
      edgeIds> getFilterOutGoingEdgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "filterOutGoingEdges",
      requestType = filterEdgesRequest.class,
      responseType = edgeIds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<filterEdgesRequest,
      edgeIds> getFilterOutGoingEdgesMethod() {
    io.grpc.MethodDescriptor<filterEdgesRequest, edgeIds> getFilterOutGoingEdgesMethod;
    if ((getFilterOutGoingEdgesMethod = TraverserServiceGrpc.getFilterOutGoingEdgesMethod) == null) {
      synchronized (TraverserServiceGrpc.class) {
        if ((getFilterOutGoingEdgesMethod = TraverserServiceGrpc.getFilterOutGoingEdgesMethod) == null) {
          TraverserServiceGrpc.getFilterOutGoingEdgesMethod = getFilterOutGoingEdgesMethod =
              io.grpc.MethodDescriptor.<filterEdgesRequest, edgeIds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "filterOutGoingEdges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  filterEdgesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgeIds.getDefaultInstance()))
              .setSchemaDescriptor(new TraverserServiceMethodDescriptorSupplier("filterOutGoingEdges"))
              .build();
        }
      }
    }
    return getFilterOutGoingEdgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<filterEdgesRequest,
      edgeIds> getFilterInGoingEdgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "filterInGoingEdges",
      requestType = filterEdgesRequest.class,
      responseType = edgeIds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<filterEdgesRequest,
      edgeIds> getFilterInGoingEdgesMethod() {
    io.grpc.MethodDescriptor<filterEdgesRequest, edgeIds> getFilterInGoingEdgesMethod;
    if ((getFilterInGoingEdgesMethod = TraverserServiceGrpc.getFilterInGoingEdgesMethod) == null) {
      synchronized (TraverserServiceGrpc.class) {
        if ((getFilterInGoingEdgesMethod = TraverserServiceGrpc.getFilterInGoingEdgesMethod) == null) {
          TraverserServiceGrpc.getFilterInGoingEdgesMethod = getFilterInGoingEdgesMethod =
              io.grpc.MethodDescriptor.<filterEdgesRequest, edgeIds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "filterInGoingEdges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  filterEdgesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edgeIds.getDefaultInstance()))
              .setSchemaDescriptor(new TraverserServiceMethodDescriptorSupplier("filterInGoingEdges"))
              .build();
        }
      }
    }
    return getFilterInGoingEdgesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TraverserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraverserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraverserServiceStub>() {
        @Override
        public TraverserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraverserServiceStub(channel, callOptions);
        }
      };
    return TraverserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TraverserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraverserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraverserServiceBlockingStub>() {
        @Override
        public TraverserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraverserServiceBlockingStub(channel, callOptions);
        }
      };
    return TraverserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TraverserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TraverserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TraverserServiceFutureStub>() {
        @Override
        public TraverserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TraverserServiceFutureStub(channel, callOptions);
        }
      };
    return TraverserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TraverserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVertices(vertexBinding request,
                            io.grpc.stub.StreamObserver<verticesIds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVerticesMethod(), responseObserver);
    }

    /**
     */
    public void filterVertices(filterVerticesRequest request,
                               io.grpc.stub.StreamObserver<verticesIds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterVerticesMethod(), responseObserver);
    }

    /**
     */
    public void filterOutGoingEdges(filterEdgesRequest request,
                                    io.grpc.stub.StreamObserver<edgeIds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterOutGoingEdgesMethod(), responseObserver);
    }

    /**
     */
    public void filterInGoingEdges(filterEdgesRequest request,
                                   io.grpc.stub.StreamObserver<edgeIds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterInGoingEdgesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVerticesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                vertexBinding,
                verticesIds>(
                  this, METHODID_GET_VERTICES)))
          .addMethod(
            getFilterVerticesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                filterVerticesRequest,
                verticesIds>(
                  this, METHODID_FILTER_VERTICES)))
          .addMethod(
            getFilterOutGoingEdgesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                filterEdgesRequest,
                edgeIds>(
                  this, METHODID_FILTER_OUT_GOING_EDGES)))
          .addMethod(
            getFilterInGoingEdgesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                filterEdgesRequest,
                edgeIds>(
                  this, METHODID_FILTER_IN_GOING_EDGES)))
          .build();
    }
  }

  /**
   */
  public static final class TraverserServiceStub extends io.grpc.stub.AbstractAsyncStub<TraverserServiceStub> {
    private TraverserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TraverserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraverserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVertices(vertexBinding request,
                            io.grpc.stub.StreamObserver<verticesIds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVerticesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void filterVertices(filterVerticesRequest request,
                               io.grpc.stub.StreamObserver<verticesIds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterVerticesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void filterOutGoingEdges(filterEdgesRequest request,
                                    io.grpc.stub.StreamObserver<edgeIds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterOutGoingEdgesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void filterInGoingEdges(filterEdgesRequest request,
                                   io.grpc.stub.StreamObserver<edgeIds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterInGoingEdgesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TraverserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TraverserServiceBlockingStub> {
    private TraverserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TraverserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraverserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public verticesIds getVertices(vertexBinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVerticesMethod(), getCallOptions(), request);
    }

    /**
     */
    public verticesIds filterVertices(filterVerticesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterVerticesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgeIds filterOutGoingEdges(filterEdgesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterOutGoingEdgesMethod(), getCallOptions(), request);
    }

    /**
     */
    public edgeIds filterInGoingEdges(filterEdgesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterInGoingEdgesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TraverserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TraverserServiceFutureStub> {
    private TraverserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TraverserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TraverserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verticesIds> getVertices(
        vertexBinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVerticesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<verticesIds> filterVertices(
        filterVerticesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterVerticesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgeIds> filterOutGoingEdges(
        filterEdgesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterOutGoingEdgesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edgeIds> filterInGoingEdges(
        filterEdgesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterInGoingEdgesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VERTICES = 0;
  private static final int METHODID_FILTER_VERTICES = 1;
  private static final int METHODID_FILTER_OUT_GOING_EDGES = 2;
  private static final int METHODID_FILTER_IN_GOING_EDGES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TraverserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TraverserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VERTICES:
          serviceImpl.getVertices((vertexBinding) request,
              (io.grpc.stub.StreamObserver<verticesIds>) responseObserver);
          break;
        case METHODID_FILTER_VERTICES:
          serviceImpl.filterVertices((filterVerticesRequest) request,
              (io.grpc.stub.StreamObserver<verticesIds>) responseObserver);
          break;
        case METHODID_FILTER_OUT_GOING_EDGES:
          serviceImpl.filterOutGoingEdges((filterEdgesRequest) request,
              (io.grpc.stub.StreamObserver<edgeIds>) responseObserver);
          break;
        case METHODID_FILTER_IN_GOING_EDGES:
          serviceImpl.filterInGoingEdges((filterEdgesRequest) request,
              (io.grpc.stub.StreamObserver<edgeIds>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TraverserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TraverserServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Traverser.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TraverserService");
    }
  }

  private static final class TraverserServiceFileDescriptorSupplier
      extends TraverserServiceBaseDescriptorSupplier {
    TraverserServiceFileDescriptorSupplier() {}
  }

  private static final class TraverserServiceMethodDescriptorSupplier
      extends TraverserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TraverserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TraverserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TraverserServiceFileDescriptorSupplier())
              .addMethod(getGetVerticesMethod())
              .addMethod(getFilterVerticesMethod())
              .addMethod(getFilterOutGoingEdgesMethod())
              .addMethod(getFilterInGoingEdgesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
