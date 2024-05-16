package com.server.graph_db.grpc.database;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * createDatabase return emoty response
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: database.proto")
public final class databaseConfigServiceGrpc {

  private databaseConfigServiceGrpc() {}

  public static final String SERVICE_NAME = "databaseConfigService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<DatabaseName,
      reply> getCreateDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createDatabase",
      requestType = DatabaseName.class,
      responseType = reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DatabaseName,
      reply> getCreateDatabaseMethod() {
    io.grpc.MethodDescriptor<DatabaseName, reply> getCreateDatabaseMethod;
    if ((getCreateDatabaseMethod = databaseConfigServiceGrpc.getCreateDatabaseMethod) == null) {
      synchronized (databaseConfigServiceGrpc.class) {
        if ((getCreateDatabaseMethod = databaseConfigServiceGrpc.getCreateDatabaseMethod) == null) {
          databaseConfigServiceGrpc.getCreateDatabaseMethod = getCreateDatabaseMethod =
              io.grpc.MethodDescriptor.<DatabaseName, reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DatabaseName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  reply.getDefaultInstance()))
              .setSchemaDescriptor(new databaseConfigServiceMethodDescriptorSupplier("createDatabase"))
              .build();
        }
      }
    }
    return getCreateDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<emptyResponse,
      DatabaseName> getGetCurrentDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrentDatabase",
      requestType = emptyResponse.class,
      responseType = DatabaseName.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<emptyResponse,
      DatabaseName> getGetCurrentDatabaseMethod() {
    io.grpc.MethodDescriptor<emptyResponse, DatabaseName> getGetCurrentDatabaseMethod;
    if ((getGetCurrentDatabaseMethod = databaseConfigServiceGrpc.getGetCurrentDatabaseMethod) == null) {
      synchronized (databaseConfigServiceGrpc.class) {
        if ((getGetCurrentDatabaseMethod = databaseConfigServiceGrpc.getGetCurrentDatabaseMethod) == null) {
          databaseConfigServiceGrpc.getGetCurrentDatabaseMethod = getGetCurrentDatabaseMethod =
              io.grpc.MethodDescriptor.<emptyResponse, DatabaseName>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCurrentDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emptyResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DatabaseName.getDefaultInstance()))
              .setSchemaDescriptor(new databaseConfigServiceMethodDescriptorSupplier("getCurrentDatabase"))
              .build();
        }
      }
    }
    return getGetCurrentDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DatabaseName,
      reply> getDeleteDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteDatabase",
      requestType = DatabaseName.class,
      responseType = reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DatabaseName,
      reply> getDeleteDatabaseMethod() {
    io.grpc.MethodDescriptor<DatabaseName, reply> getDeleteDatabaseMethod;
    if ((getDeleteDatabaseMethod = databaseConfigServiceGrpc.getDeleteDatabaseMethod) == null) {
      synchronized (databaseConfigServiceGrpc.class) {
        if ((getDeleteDatabaseMethod = databaseConfigServiceGrpc.getDeleteDatabaseMethod) == null) {
          databaseConfigServiceGrpc.getDeleteDatabaseMethod = getDeleteDatabaseMethod =
              io.grpc.MethodDescriptor.<DatabaseName, reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DatabaseName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  reply.getDefaultInstance()))
              .setSchemaDescriptor(new databaseConfigServiceMethodDescriptorSupplier("deleteDatabase"))
              .build();
        }
      }
    }
    return getDeleteDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DatabaseName,
      reply> getDropDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dropDatabase",
      requestType = DatabaseName.class,
      responseType = reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DatabaseName,
      reply> getDropDatabaseMethod() {
    io.grpc.MethodDescriptor<DatabaseName, reply> getDropDatabaseMethod;
    if ((getDropDatabaseMethod = databaseConfigServiceGrpc.getDropDatabaseMethod) == null) {
      synchronized (databaseConfigServiceGrpc.class) {
        if ((getDropDatabaseMethod = databaseConfigServiceGrpc.getDropDatabaseMethod) == null) {
          databaseConfigServiceGrpc.getDropDatabaseMethod = getDropDatabaseMethod =
              io.grpc.MethodDescriptor.<DatabaseName, reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "dropDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DatabaseName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  reply.getDefaultInstance()))
              .setSchemaDescriptor(new databaseConfigServiceMethodDescriptorSupplier("dropDatabase"))
              .build();
        }
      }
    }
    return getDropDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DatabaseName,
      reply> getSwitchDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchDatabase",
      requestType = DatabaseName.class,
      responseType = reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<DatabaseName,
      reply> getSwitchDatabaseMethod() {
    io.grpc.MethodDescriptor<DatabaseName, reply> getSwitchDatabaseMethod;
    if ((getSwitchDatabaseMethod = databaseConfigServiceGrpc.getSwitchDatabaseMethod) == null) {
      synchronized (databaseConfigServiceGrpc.class) {
        if ((getSwitchDatabaseMethod = databaseConfigServiceGrpc.getSwitchDatabaseMethod) == null) {
          databaseConfigServiceGrpc.getSwitchDatabaseMethod = getSwitchDatabaseMethod =
              io.grpc.MethodDescriptor.<DatabaseName, reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "switchDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DatabaseName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  reply.getDefaultInstance()))
              .setSchemaDescriptor(new databaseConfigServiceMethodDescriptorSupplier("switchDatabase"))
              .build();
        }
      }
    }
    return getSwitchDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<emptyResponse,
      reply> getSwitchToDefaultDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "switchToDefaultDatabase",
      requestType = emptyResponse.class,
      responseType = reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<emptyResponse,
      reply> getSwitchToDefaultDatabaseMethod() {
    io.grpc.MethodDescriptor<emptyResponse, reply> getSwitchToDefaultDatabaseMethod;
    if ((getSwitchToDefaultDatabaseMethod = databaseConfigServiceGrpc.getSwitchToDefaultDatabaseMethod) == null) {
      synchronized (databaseConfigServiceGrpc.class) {
        if ((getSwitchToDefaultDatabaseMethod = databaseConfigServiceGrpc.getSwitchToDefaultDatabaseMethod) == null) {
          databaseConfigServiceGrpc.getSwitchToDefaultDatabaseMethod = getSwitchToDefaultDatabaseMethod =
              io.grpc.MethodDescriptor.<emptyResponse, reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "switchToDefaultDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emptyResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  reply.getDefaultInstance()))
              .setSchemaDescriptor(new databaseConfigServiceMethodDescriptorSupplier("switchToDefaultDatabase"))
              .build();
        }
      }
    }
    return getSwitchToDefaultDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<emptyResponse,
      reply> getDropDefaultDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dropDefaultDatabase",
      requestType = emptyResponse.class,
      responseType = reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<emptyResponse,
      reply> getDropDefaultDatabaseMethod() {
    io.grpc.MethodDescriptor<emptyResponse, reply> getDropDefaultDatabaseMethod;
    if ((getDropDefaultDatabaseMethod = databaseConfigServiceGrpc.getDropDefaultDatabaseMethod) == null) {
      synchronized (databaseConfigServiceGrpc.class) {
        if ((getDropDefaultDatabaseMethod = databaseConfigServiceGrpc.getDropDefaultDatabaseMethod) == null) {
          databaseConfigServiceGrpc.getDropDefaultDatabaseMethod = getDropDefaultDatabaseMethod =
              io.grpc.MethodDescriptor.<emptyResponse, reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "dropDefaultDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  emptyResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  reply.getDefaultInstance()))
              .setSchemaDescriptor(new databaseConfigServiceMethodDescriptorSupplier("dropDefaultDatabase"))
              .build();
        }
      }
    }
    return getDropDefaultDatabaseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static databaseConfigServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<databaseConfigServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<databaseConfigServiceStub>() {
        @Override
        public databaseConfigServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new databaseConfigServiceStub(channel, callOptions);
        }
      };
    return databaseConfigServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static databaseConfigServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<databaseConfigServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<databaseConfigServiceBlockingStub>() {
        @Override
        public databaseConfigServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new databaseConfigServiceBlockingStub(channel, callOptions);
        }
      };
    return databaseConfigServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static databaseConfigServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<databaseConfigServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<databaseConfigServiceFutureStub>() {
        @Override
        public databaseConfigServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new databaseConfigServiceFutureStub(channel, callOptions);
        }
      };
    return databaseConfigServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * createDatabase return emoty response
   * </pre>
   */
  public static abstract class databaseConfigServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createDatabase(DatabaseName request,
                               io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDatabaseMethod(), responseObserver);
    }

    /**
     */
    public void getCurrentDatabase(emptyResponse request,
                                   io.grpc.stub.StreamObserver<DatabaseName> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCurrentDatabaseMethod(), responseObserver);
    }

    /**
     */
    public void deleteDatabase(DatabaseName request,
                               io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDatabaseMethod(), responseObserver);
    }

    /**
     */
    public void dropDatabase(DatabaseName request,
                             io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropDatabaseMethod(), responseObserver);
    }

    /**
     */
    public void switchDatabase(DatabaseName request,
                               io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwitchDatabaseMethod(), responseObserver);
    }

    /**
     */
    public void switchToDefaultDatabase(emptyResponse request,
                                        io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwitchToDefaultDatabaseMethod(), responseObserver);
    }

    /**
     */
    public void dropDefaultDatabase(emptyResponse request,
                                    io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropDefaultDatabaseMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDatabaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                DatabaseName,
                reply>(
                  this, METHODID_CREATE_DATABASE)))
          .addMethod(
            getGetCurrentDatabaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                emptyResponse,
                DatabaseName>(
                  this, METHODID_GET_CURRENT_DATABASE)))
          .addMethod(
            getDeleteDatabaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                DatabaseName,
                reply>(
                  this, METHODID_DELETE_DATABASE)))
          .addMethod(
            getDropDatabaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                DatabaseName,
                reply>(
                  this, METHODID_DROP_DATABASE)))
          .addMethod(
            getSwitchDatabaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                DatabaseName,
                reply>(
                  this, METHODID_SWITCH_DATABASE)))
          .addMethod(
            getSwitchToDefaultDatabaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                emptyResponse,
                reply>(
                  this, METHODID_SWITCH_TO_DEFAULT_DATABASE)))
          .addMethod(
            getDropDefaultDatabaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                emptyResponse,
                reply>(
                  this, METHODID_DROP_DEFAULT_DATABASE)))
          .build();
    }
  }

  /**
   * <pre>
   * createDatabase return emoty response
   * </pre>
   */
  public static final class databaseConfigServiceStub extends io.grpc.stub.AbstractAsyncStub<databaseConfigServiceStub> {
    private databaseConfigServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected databaseConfigServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new databaseConfigServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDatabase(DatabaseName request,
                               io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCurrentDatabase(emptyResponse request,
                                   io.grpc.stub.StreamObserver<DatabaseName> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCurrentDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDatabase(DatabaseName request,
                               io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dropDatabase(DatabaseName request,
                             io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDropDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchDatabase(DatabaseName request,
                               io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwitchDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchToDefaultDatabase(emptyResponse request,
                                        io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwitchToDefaultDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dropDefaultDatabase(emptyResponse request,
                                    io.grpc.stub.StreamObserver<reply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDropDefaultDatabaseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * createDatabase return emoty response
   * </pre>
   */
  public static final class databaseConfigServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<databaseConfigServiceBlockingStub> {
    private databaseConfigServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected databaseConfigServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new databaseConfigServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public reply createDatabase(DatabaseName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDatabaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public DatabaseName getCurrentDatabase(emptyResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCurrentDatabaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public reply deleteDatabase(DatabaseName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDatabaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public reply dropDatabase(DatabaseName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDropDatabaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public reply switchDatabase(DatabaseName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwitchDatabaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public reply switchToDefaultDatabase(emptyResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwitchToDefaultDatabaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public reply dropDefaultDatabase(emptyResponse request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDropDefaultDatabaseMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * createDatabase return emoty response
   * </pre>
   */
  public static final class databaseConfigServiceFutureStub extends io.grpc.stub.AbstractFutureStub<databaseConfigServiceFutureStub> {
    private databaseConfigServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected databaseConfigServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new databaseConfigServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reply> createDatabase(
        DatabaseName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDatabaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DatabaseName> getCurrentDatabase(
        emptyResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCurrentDatabaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reply> deleteDatabase(
        DatabaseName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDatabaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reply> dropDatabase(
        DatabaseName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDropDatabaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reply> switchDatabase(
        DatabaseName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwitchDatabaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reply> switchToDefaultDatabase(
        emptyResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwitchToDefaultDatabaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<reply> dropDefaultDatabase(
        emptyResponse request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDropDefaultDatabaseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATABASE = 0;
  private static final int METHODID_GET_CURRENT_DATABASE = 1;
  private static final int METHODID_DELETE_DATABASE = 2;
  private static final int METHODID_DROP_DATABASE = 3;
  private static final int METHODID_SWITCH_DATABASE = 4;
  private static final int METHODID_SWITCH_TO_DEFAULT_DATABASE = 5;
  private static final int METHODID_DROP_DEFAULT_DATABASE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final databaseConfigServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(databaseConfigServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DATABASE:
          serviceImpl.createDatabase((DatabaseName) request,
              (io.grpc.stub.StreamObserver<reply>) responseObserver);
          break;
        case METHODID_GET_CURRENT_DATABASE:
          serviceImpl.getCurrentDatabase((emptyResponse) request,
              (io.grpc.stub.StreamObserver<DatabaseName>) responseObserver);
          break;
        case METHODID_DELETE_DATABASE:
          serviceImpl.deleteDatabase((DatabaseName) request,
              (io.grpc.stub.StreamObserver<reply>) responseObserver);
          break;
        case METHODID_DROP_DATABASE:
          serviceImpl.dropDatabase((DatabaseName) request,
              (io.grpc.stub.StreamObserver<reply>) responseObserver);
          break;
        case METHODID_SWITCH_DATABASE:
          serviceImpl.switchDatabase((DatabaseName) request,
              (io.grpc.stub.StreamObserver<reply>) responseObserver);
          break;
        case METHODID_SWITCH_TO_DEFAULT_DATABASE:
          serviceImpl.switchToDefaultDatabase((emptyResponse) request,
              (io.grpc.stub.StreamObserver<reply>) responseObserver);
          break;
        case METHODID_DROP_DEFAULT_DATABASE:
          serviceImpl.dropDefaultDatabase((emptyResponse) request,
              (io.grpc.stub.StreamObserver<reply>) responseObserver);
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

  private static abstract class databaseConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    databaseConfigServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Database.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("databaseConfigService");
    }
  }

  private static final class databaseConfigServiceFileDescriptorSupplier
      extends databaseConfigServiceBaseDescriptorSupplier {
    databaseConfigServiceFileDescriptorSupplier() {}
  }

  private static final class databaseConfigServiceMethodDescriptorSupplier
      extends databaseConfigServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    databaseConfigServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (databaseConfigServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new databaseConfigServiceFileDescriptorSupplier())
              .addMethod(getCreateDatabaseMethod())
              .addMethod(getGetCurrentDatabaseMethod())
              .addMethod(getDeleteDatabaseMethod())
              .addMethod(getDropDatabaseMethod())
              .addMethod(getSwitchDatabaseMethod())
              .addMethod(getSwitchToDefaultDatabaseMethod())
              .addMethod(getDropDefaultDatabaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
