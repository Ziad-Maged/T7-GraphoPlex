package com.server.graph_db.grpc.index;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: index.proto")
public final class indexServiceGrpc {

  private indexServiceGrpc() {}

  public static final String SERVICE_NAME = "indexService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<createIndexRequest,
      createIndexResponse> getCreateIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createIndex",
      requestType = createIndexRequest.class,
      responseType = createIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<createIndexRequest,
      createIndexResponse> getCreateIndexMethod() {
    io.grpc.MethodDescriptor<createIndexRequest, createIndexResponse> getCreateIndexMethod;
    if ((getCreateIndexMethod = indexServiceGrpc.getCreateIndexMethod) == null) {
      synchronized (indexServiceGrpc.class) {
        if ((getCreateIndexMethod = indexServiceGrpc.getCreateIndexMethod) == null) {
          indexServiceGrpc.getCreateIndexMethod = getCreateIndexMethod =
              io.grpc.MethodDescriptor.<createIndexRequest, createIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  createIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  createIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new indexServiceMethodDescriptorSupplier("createIndex"))
              .build();
        }
      }
    }
    return getCreateIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<deleteIndexRequest,
      deleteIndexResponse> getDeleteIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteIndex",
      requestType = deleteIndexRequest.class,
      responseType = deleteIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<deleteIndexRequest,
      deleteIndexResponse> getDeleteIndexMethod() {
    io.grpc.MethodDescriptor<deleteIndexRequest, deleteIndexResponse> getDeleteIndexMethod;
    if ((getDeleteIndexMethod = indexServiceGrpc.getDeleteIndexMethod) == null) {
      synchronized (indexServiceGrpc.class) {
        if ((getDeleteIndexMethod = indexServiceGrpc.getDeleteIndexMethod) == null) {
          indexServiceGrpc.getDeleteIndexMethod = getDeleteIndexMethod =
              io.grpc.MethodDescriptor.<deleteIndexRequest, deleteIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deleteIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deleteIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new indexServiceMethodDescriptorSupplier("deleteIndex"))
              .build();
        }
      }
    }
    return getDeleteIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<createIndicesRequest,
      createIndicesResponse> getCreateIndicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createIndices",
      requestType = createIndicesRequest.class,
      responseType = createIndicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<createIndicesRequest,
      createIndicesResponse> getCreateIndicesMethod() {
    io.grpc.MethodDescriptor<createIndicesRequest, createIndicesResponse> getCreateIndicesMethod;
    if ((getCreateIndicesMethod = indexServiceGrpc.getCreateIndicesMethod) == null) {
      synchronized (indexServiceGrpc.class) {
        if ((getCreateIndicesMethod = indexServiceGrpc.getCreateIndicesMethod) == null) {
          indexServiceGrpc.getCreateIndicesMethod = getCreateIndicesMethod =
              io.grpc.MethodDescriptor.<createIndicesRequest, createIndicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createIndices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  createIndicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  createIndicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new indexServiceMethodDescriptorSupplier("createIndices"))
              .build();
        }
      }
    }
    return getCreateIndicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<deleteIndicesRequest,
      deleteIndicesResponse> getDeleteIndicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteIndices",
      requestType = deleteIndicesRequest.class,
      responseType = deleteIndicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<deleteIndicesRequest,
      deleteIndicesResponse> getDeleteIndicesMethod() {
    io.grpc.MethodDescriptor<deleteIndicesRequest, deleteIndicesResponse> getDeleteIndicesMethod;
    if ((getDeleteIndicesMethod = indexServiceGrpc.getDeleteIndicesMethod) == null) {
      synchronized (indexServiceGrpc.class) {
        if ((getDeleteIndicesMethod = indexServiceGrpc.getDeleteIndicesMethod) == null) {
          indexServiceGrpc.getDeleteIndicesMethod = getDeleteIndicesMethod =
              io.grpc.MethodDescriptor.<deleteIndicesRequest, deleteIndicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteIndices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deleteIndicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deleteIndicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new indexServiceMethodDescriptorSupplier("deleteIndices"))
              .build();
        }
      }
    }
    return getDeleteIndicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static indexServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<indexServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<indexServiceStub>() {
        @Override
        public indexServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new indexServiceStub(channel, callOptions);
        }
      };
    return indexServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static indexServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<indexServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<indexServiceBlockingStub>() {
        @Override
        public indexServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new indexServiceBlockingStub(channel, callOptions);
        }
      };
    return indexServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static indexServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<indexServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<indexServiceFutureStub>() {
        @Override
        public indexServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new indexServiceFutureStub(channel, callOptions);
        }
      };
    return indexServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class indexServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createIndex(createIndexRequest request,
                            io.grpc.stub.StreamObserver<createIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIndexMethod(), responseObserver);
    }

    /**
     */
    public void deleteIndex(deleteIndexRequest request,
                            io.grpc.stub.StreamObserver<deleteIndexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIndexMethod(), responseObserver);
    }

    /**
     */
    public void createIndices(createIndicesRequest request,
                              io.grpc.stub.StreamObserver<createIndicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIndicesMethod(), responseObserver);
    }

    /**
     */
    public void deleteIndices(deleteIndicesRequest request,
                              io.grpc.stub.StreamObserver<deleteIndicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIndicesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                createIndexRequest,
                createIndexResponse>(
                  this, METHODID_CREATE_INDEX)))
          .addMethod(
            getDeleteIndexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                deleteIndexRequest,
                deleteIndexResponse>(
                  this, METHODID_DELETE_INDEX)))
          .addMethod(
            getCreateIndicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                createIndicesRequest,
                createIndicesResponse>(
                  this, METHODID_CREATE_INDICES)))
          .addMethod(
            getDeleteIndicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                deleteIndicesRequest,
                deleteIndicesResponse>(
                  this, METHODID_DELETE_INDICES)))
          .build();
    }
  }

  /**
   */
  public static final class indexServiceStub extends io.grpc.stub.AbstractAsyncStub<indexServiceStub> {
    private indexServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected indexServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new indexServiceStub(channel, callOptions);
    }

    /**
     */
    public void createIndex(createIndexRequest request,
                            io.grpc.stub.StreamObserver<createIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteIndex(deleteIndexRequest request,
                            io.grpc.stub.StreamObserver<deleteIndexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createIndices(createIndicesRequest request,
                              io.grpc.stub.StreamObserver<createIndicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIndicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteIndices(deleteIndicesRequest request,
                              io.grpc.stub.StreamObserver<deleteIndicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIndicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class indexServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<indexServiceBlockingStub> {
    private indexServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected indexServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new indexServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public createIndexResponse createIndex(createIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public deleteIndexResponse deleteIndex(deleteIndexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public createIndicesResponse createIndices(createIndicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIndicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public deleteIndicesResponse deleteIndices(deleteIndicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIndicesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class indexServiceFutureStub extends io.grpc.stub.AbstractFutureStub<indexServiceFutureStub> {
    private indexServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected indexServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new indexServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<createIndexResponse> createIndex(
        createIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<deleteIndexResponse> deleteIndex(
        deleteIndexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<createIndicesResponse> createIndices(
        createIndicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIndicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<deleteIndicesResponse> deleteIndices(
        deleteIndicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIndicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INDEX = 0;
  private static final int METHODID_DELETE_INDEX = 1;
  private static final int METHODID_CREATE_INDICES = 2;
  private static final int METHODID_DELETE_INDICES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final indexServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(indexServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_INDEX:
          serviceImpl.createIndex((createIndexRequest) request,
              (io.grpc.stub.StreamObserver<createIndexResponse>) responseObserver);
          break;
        case METHODID_DELETE_INDEX:
          serviceImpl.deleteIndex((deleteIndexRequest) request,
              (io.grpc.stub.StreamObserver<deleteIndexResponse>) responseObserver);
          break;
        case METHODID_CREATE_INDICES:
          serviceImpl.createIndices((createIndicesRequest) request,
              (io.grpc.stub.StreamObserver<createIndicesResponse>) responseObserver);
          break;
        case METHODID_DELETE_INDICES:
          serviceImpl.deleteIndices((deleteIndicesRequest) request,
              (io.grpc.stub.StreamObserver<deleteIndicesResponse>) responseObserver);
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

  private static abstract class indexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    indexServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Index.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("indexService");
    }
  }

  private static final class indexServiceFileDescriptorSupplier
      extends indexServiceBaseDescriptorSupplier {
    indexServiceFileDescriptorSupplier() {}
  }

  private static final class indexServiceMethodDescriptorSupplier
      extends indexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    indexServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (indexServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new indexServiceFileDescriptorSupplier())
              .addMethod(getCreateIndexMethod())
              .addMethod(getDeleteIndexMethod())
              .addMethod(getCreateIndicesMethod())
              .addMethod(getDeleteIndicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
