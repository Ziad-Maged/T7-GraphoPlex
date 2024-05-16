package com.server.graph_db.grpc.vertex;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: vertex.proto")
public final class VertexServiceGrpc {

  private VertexServiceGrpc() {}

  public static final String SERVICE_NAME = "VertexService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<getVertexRequest,
      getVertexResponse> getGetVertexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVertex",
      requestType = getVertexRequest.class,
      responseType = getVertexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<getVertexRequest,
      getVertexResponse> getGetVertexMethod() {
    io.grpc.MethodDescriptor<getVertexRequest, getVertexResponse> getGetVertexMethod;
    if ((getGetVertexMethod = VertexServiceGrpc.getGetVertexMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getGetVertexMethod = VertexServiceGrpc.getGetVertexMethod) == null) {
          VertexServiceGrpc.getGetVertexMethod = getGetVertexMethod =
              io.grpc.MethodDescriptor.<getVertexRequest, getVertexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getVertex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getVertexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getVertexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("getVertex"))
              .build();
        }
      }
    }
    return getGetVertexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<getVerticesRequest,
      getVerticesResponse> getGetVerticesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVertices",
      requestType = getVerticesRequest.class,
      responseType = getVerticesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<getVerticesRequest,
      getVerticesResponse> getGetVerticesMethod() {
    io.grpc.MethodDescriptor<getVerticesRequest, getVerticesResponse> getGetVerticesMethod;
    if ((getGetVerticesMethod = VertexServiceGrpc.getGetVerticesMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getGetVerticesMethod = VertexServiceGrpc.getGetVerticesMethod) == null) {
          VertexServiceGrpc.getGetVerticesMethod = getGetVerticesMethod =
              io.grpc.MethodDescriptor.<getVerticesRequest, getVerticesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getVertices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getVerticesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getVerticesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("getVertices"))
              .build();
        }
      }
    }
    return getGetVerticesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<createVertexRequest,
      createVertexResponse> getCreateVertexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createVertex",
      requestType = createVertexRequest.class,
      responseType = createVertexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<createVertexRequest,
      createVertexResponse> getCreateVertexMethod() {
    io.grpc.MethodDescriptor<createVertexRequest, createVertexResponse> getCreateVertexMethod;
    if ((getCreateVertexMethod = VertexServiceGrpc.getCreateVertexMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getCreateVertexMethod = VertexServiceGrpc.getCreateVertexMethod) == null) {
          VertexServiceGrpc.getCreateVertexMethod = getCreateVertexMethod =
              io.grpc.MethodDescriptor.<createVertexRequest, createVertexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createVertex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  createVertexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  createVertexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("createVertex"))
              .build();
        }
      }
    }
    return getCreateVertexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<deleteVertexRequest,
      deleteVertexResponse> getDeleteVertexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteVertex",
      requestType = deleteVertexRequest.class,
      responseType = deleteVertexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<deleteVertexRequest,
      deleteVertexResponse> getDeleteVertexMethod() {
    io.grpc.MethodDescriptor<deleteVertexRequest, deleteVertexResponse> getDeleteVertexMethod;
    if ((getDeleteVertexMethod = VertexServiceGrpc.getDeleteVertexMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getDeleteVertexMethod = VertexServiceGrpc.getDeleteVertexMethod) == null) {
          VertexServiceGrpc.getDeleteVertexMethod = getDeleteVertexMethod =
              io.grpc.MethodDescriptor.<deleteVertexRequest, deleteVertexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteVertex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deleteVertexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deleteVertexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("deleteVertex"))
              .build();
        }
      }
    }
    return getDeleteVertexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<updateVertexRequest,
      updateVertexResponse> getUpdateVertexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateVertex",
      requestType = updateVertexRequest.class,
      responseType = updateVertexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<updateVertexRequest,
      updateVertexResponse> getUpdateVertexMethod() {
    io.grpc.MethodDescriptor<updateVertexRequest, updateVertexResponse> getUpdateVertexMethod;
    if ((getUpdateVertexMethod = VertexServiceGrpc.getUpdateVertexMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getUpdateVertexMethod = VertexServiceGrpc.getUpdateVertexMethod) == null) {
          VertexServiceGrpc.getUpdateVertexMethod = getUpdateVertexMethod =
              io.grpc.MethodDescriptor.<updateVertexRequest, updateVertexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateVertex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  updateVertexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  updateVertexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("updateVertex"))
              .build();
        }
      }
    }
    return getUpdateVertexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<createEdgeRequest,
      createEdgeResponse> getCreateEdgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createEdge",
      requestType = createEdgeRequest.class,
      responseType = createEdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<createEdgeRequest,
      createEdgeResponse> getCreateEdgeMethod() {
    io.grpc.MethodDescriptor<createEdgeRequest, createEdgeResponse> getCreateEdgeMethod;
    if ((getCreateEdgeMethod = VertexServiceGrpc.getCreateEdgeMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getCreateEdgeMethod = VertexServiceGrpc.getCreateEdgeMethod) == null) {
          VertexServiceGrpc.getCreateEdgeMethod = getCreateEdgeMethod =
              io.grpc.MethodDescriptor.<createEdgeRequest, createEdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createEdge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  createEdgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  createEdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("createEdge"))
              .build();
        }
      }
    }
    return getCreateEdgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<deleteEdgeRequest,
      deleteEdgeResponse> getDeleteEdgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEdge",
      requestType = deleteEdgeRequest.class,
      responseType = deleteEdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<deleteEdgeRequest,
      deleteEdgeResponse> getDeleteEdgeMethod() {
    io.grpc.MethodDescriptor<deleteEdgeRequest, deleteEdgeResponse> getDeleteEdgeMethod;
    if ((getDeleteEdgeMethod = VertexServiceGrpc.getDeleteEdgeMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getDeleteEdgeMethod = VertexServiceGrpc.getDeleteEdgeMethod) == null) {
          VertexServiceGrpc.getDeleteEdgeMethod = getDeleteEdgeMethod =
              io.grpc.MethodDescriptor.<deleteEdgeRequest, deleteEdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEdge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deleteEdgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deleteEdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("deleteEdge"))
              .build();
        }
      }
    }
    return getDeleteEdgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<updateEdgeRequest,
      updateEdgeResponse> getUpdateEdgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEdge",
      requestType = updateEdgeRequest.class,
      responseType = updateEdgeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<updateEdgeRequest,
      updateEdgeResponse> getUpdateEdgeMethod() {
    io.grpc.MethodDescriptor<updateEdgeRequest, updateEdgeResponse> getUpdateEdgeMethod;
    if ((getUpdateEdgeMethod = VertexServiceGrpc.getUpdateEdgeMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getUpdateEdgeMethod = VertexServiceGrpc.getUpdateEdgeMethod) == null) {
          VertexServiceGrpc.getUpdateEdgeMethod = getUpdateEdgeMethod =
              io.grpc.MethodDescriptor.<updateEdgeRequest, updateEdgeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateEdge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  updateEdgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  updateEdgeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("updateEdge"))
              .build();
        }
      }
    }
    return getUpdateEdgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<getOutgoingEdgesRequest,
      getOutgoingEdgesResponse> getGetOutgoingEdgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOutgoingEdges",
      requestType = getOutgoingEdgesRequest.class,
      responseType = getOutgoingEdgesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<getOutgoingEdgesRequest,
      getOutgoingEdgesResponse> getGetOutgoingEdgesMethod() {
    io.grpc.MethodDescriptor<getOutgoingEdgesRequest, getOutgoingEdgesResponse> getGetOutgoingEdgesMethod;
    if ((getGetOutgoingEdgesMethod = VertexServiceGrpc.getGetOutgoingEdgesMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getGetOutgoingEdgesMethod = VertexServiceGrpc.getGetOutgoingEdgesMethod) == null) {
          VertexServiceGrpc.getGetOutgoingEdgesMethod = getGetOutgoingEdgesMethod =
              io.grpc.MethodDescriptor.<getOutgoingEdgesRequest, getOutgoingEdgesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOutgoingEdges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getOutgoingEdgesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getOutgoingEdgesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("getOutgoingEdges"))
              .build();
        }
      }
    }
    return getGetOutgoingEdgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<getIncomingEdgesRequest,
      getIncomingEdgesResponse> getGetIncomingEdgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getIncomingEdges",
      requestType = getIncomingEdgesRequest.class,
      responseType = getIncomingEdgesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<getIncomingEdgesRequest,
      getIncomingEdgesResponse> getGetIncomingEdgesMethod() {
    io.grpc.MethodDescriptor<getIncomingEdgesRequest, getIncomingEdgesResponse> getGetIncomingEdgesMethod;
    if ((getGetIncomingEdgesMethod = VertexServiceGrpc.getGetIncomingEdgesMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getGetIncomingEdgesMethod = VertexServiceGrpc.getGetIncomingEdgesMethod) == null) {
          VertexServiceGrpc.getGetIncomingEdgesMethod = getGetIncomingEdgesMethod =
              io.grpc.MethodDescriptor.<getIncomingEdgesRequest, getIncomingEdgesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getIncomingEdges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getIncomingEdgesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getIncomingEdgesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("getIncomingEdges"))
              .build();
        }
      }
    }
    return getGetIncomingEdgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<getEdgesRequest,
      getEdgesResponse> getGetEdgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEdges",
      requestType = getEdgesRequest.class,
      responseType = getEdgesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<getEdgesRequest,
      getEdgesResponse> getGetEdgesMethod() {
    io.grpc.MethodDescriptor<getEdgesRequest, getEdgesResponse> getGetEdgesMethod;
    if ((getGetEdgesMethod = VertexServiceGrpc.getGetEdgesMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getGetEdgesMethod = VertexServiceGrpc.getGetEdgesMethod) == null) {
          VertexServiceGrpc.getGetEdgesMethod = getGetEdgesMethod =
              io.grpc.MethodDescriptor.<getEdgesRequest, getEdgesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEdges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getEdgesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getEdgesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("getEdges"))
              .build();
        }
      }
    }
    return getGetEdgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<getOutGoingEdgesForVerticesRequest,
      getEdgesResponse> getGetOutgoingEdgesForVerticesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOutgoingEdgesForVertices",
      requestType = getOutGoingEdgesForVerticesRequest.class,
      responseType = getEdgesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<getOutGoingEdgesForVerticesRequest,
      getEdgesResponse> getGetOutgoingEdgesForVerticesMethod() {
    io.grpc.MethodDescriptor<getOutGoingEdgesForVerticesRequest, getEdgesResponse> getGetOutgoingEdgesForVerticesMethod;
    if ((getGetOutgoingEdgesForVerticesMethod = VertexServiceGrpc.getGetOutgoingEdgesForVerticesMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getGetOutgoingEdgesForVerticesMethod = VertexServiceGrpc.getGetOutgoingEdgesForVerticesMethod) == null) {
          VertexServiceGrpc.getGetOutgoingEdgesForVerticesMethod = getGetOutgoingEdgesForVerticesMethod =
              io.grpc.MethodDescriptor.<getOutGoingEdgesForVerticesRequest, getEdgesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOutgoingEdgesForVertices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getOutGoingEdgesForVerticesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getEdgesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("getOutgoingEdgesForVertices"))
              .build();
        }
      }
    }
    return getGetOutgoingEdgesForVerticesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<getIncomingEdgesForVerticesRequest,
      getEdgesResponse> getGetIncomingEdgesForVerticesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getIncomingEdgesForVertices",
      requestType = getIncomingEdgesForVerticesRequest.class,
      responseType = getEdgesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<getIncomingEdgesForVerticesRequest,
      getEdgesResponse> getGetIncomingEdgesForVerticesMethod() {
    io.grpc.MethodDescriptor<getIncomingEdgesForVerticesRequest, getEdgesResponse> getGetIncomingEdgesForVerticesMethod;
    if ((getGetIncomingEdgesForVerticesMethod = VertexServiceGrpc.getGetIncomingEdgesForVerticesMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getGetIncomingEdgesForVerticesMethod = VertexServiceGrpc.getGetIncomingEdgesForVerticesMethod) == null) {
          VertexServiceGrpc.getGetIncomingEdgesForVerticesMethod = getGetIncomingEdgesForVerticesMethod =
              io.grpc.MethodDescriptor.<getIncomingEdgesForVerticesRequest, getEdgesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getIncomingEdgesForVertices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getIncomingEdgesForVerticesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getEdgesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("getIncomingEdgesForVertices"))
              .build();
        }
      }
    }
    return getGetIncomingEdgesForVerticesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<getAllVerticesIdsRequest,
      getAllVerticesIdsResponse> getGetAllVerticesIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllVerticesIds",
      requestType = getAllVerticesIdsRequest.class,
      responseType = getAllVerticesIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<getAllVerticesIdsRequest,
      getAllVerticesIdsResponse> getGetAllVerticesIdsMethod() {
    io.grpc.MethodDescriptor<getAllVerticesIdsRequest, getAllVerticesIdsResponse> getGetAllVerticesIdsMethod;
    if ((getGetAllVerticesIdsMethod = VertexServiceGrpc.getGetAllVerticesIdsMethod) == null) {
      synchronized (VertexServiceGrpc.class) {
        if ((getGetAllVerticesIdsMethod = VertexServiceGrpc.getGetAllVerticesIdsMethod) == null) {
          VertexServiceGrpc.getGetAllVerticesIdsMethod = getGetAllVerticesIdsMethod =
              io.grpc.MethodDescriptor.<getAllVerticesIdsRequest, getAllVerticesIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllVerticesIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getAllVerticesIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  getAllVerticesIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VertexServiceMethodDescriptorSupplier("getAllVerticesIds"))
              .build();
        }
      }
    }
    return getGetAllVerticesIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VertexServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VertexServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VertexServiceStub>() {
        @Override
        public VertexServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VertexServiceStub(channel, callOptions);
        }
      };
    return VertexServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VertexServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VertexServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VertexServiceBlockingStub>() {
        @Override
        public VertexServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VertexServiceBlockingStub(channel, callOptions);
        }
      };
    return VertexServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VertexServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VertexServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VertexServiceFutureStub>() {
        @Override
        public VertexServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VertexServiceFutureStub(channel, callOptions);
        }
      };
    return VertexServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class VertexServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVertex(getVertexRequest request,
                          io.grpc.stub.StreamObserver<getVertexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVertexMethod(), responseObserver);
    }

    /**
     */
    public void getVertices(getVerticesRequest request,
                            io.grpc.stub.StreamObserver<getVerticesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVerticesMethod(), responseObserver);
    }

    /**
     */
    public void createVertex(createVertexRequest request,
                             io.grpc.stub.StreamObserver<createVertexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVertexMethod(), responseObserver);
    }

    /**
     */
    public void deleteVertex(deleteVertexRequest request,
                             io.grpc.stub.StreamObserver<deleteVertexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVertexMethod(), responseObserver);
    }

    /**
     */
    public void updateVertex(updateVertexRequest request,
                             io.grpc.stub.StreamObserver<updateVertexResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVertexMethod(), responseObserver);
    }

    /**
     */
    public void createEdge(createEdgeRequest request,
                           io.grpc.stub.StreamObserver<createEdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEdgeMethod(), responseObserver);
    }

    /**
     */
    public void deleteEdge(deleteEdgeRequest request,
                           io.grpc.stub.StreamObserver<deleteEdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEdgeMethod(), responseObserver);
    }

    /**
     */
    public void updateEdge(updateEdgeRequest request,
                           io.grpc.stub.StreamObserver<updateEdgeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEdgeMethod(), responseObserver);
    }

    /**
     */
    public void getOutgoingEdges(getOutgoingEdgesRequest request,
                                 io.grpc.stub.StreamObserver<getOutgoingEdgesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOutgoingEdgesMethod(), responseObserver);
    }

    /**
     */
    public void getIncomingEdges(getIncomingEdgesRequest request,
                                 io.grpc.stub.StreamObserver<getIncomingEdgesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIncomingEdgesMethod(), responseObserver);
    }

    /**
     */
    public void getEdges(getEdgesRequest request,
                         io.grpc.stub.StreamObserver<getEdgesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEdgesMethod(), responseObserver);
    }

    /**
     */
    public void getOutgoingEdgesForVertices(getOutGoingEdgesForVerticesRequest request,
                                            io.grpc.stub.StreamObserver<getEdgesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOutgoingEdgesForVerticesMethod(), responseObserver);
    }

    /**
     */
    public void getIncomingEdgesForVertices(getIncomingEdgesForVerticesRequest request,
                                            io.grpc.stub.StreamObserver<getEdgesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIncomingEdgesForVerticesMethod(), responseObserver);
    }

    /**
     */
    public void getAllVerticesIds(getAllVerticesIdsRequest request,
                                  io.grpc.stub.StreamObserver<getAllVerticesIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllVerticesIdsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVertexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                getVertexRequest,
                getVertexResponse>(
                  this, METHODID_GET_VERTEX)))
          .addMethod(
            getGetVerticesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                getVerticesRequest,
                getVerticesResponse>(
                  this, METHODID_GET_VERTICES)))
          .addMethod(
            getCreateVertexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                createVertexRequest,
                createVertexResponse>(
                  this, METHODID_CREATE_VERTEX)))
          .addMethod(
            getDeleteVertexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                deleteVertexRequest,
                deleteVertexResponse>(
                  this, METHODID_DELETE_VERTEX)))
          .addMethod(
            getUpdateVertexMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                updateVertexRequest,
                updateVertexResponse>(
                  this, METHODID_UPDATE_VERTEX)))
          .addMethod(
            getCreateEdgeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                createEdgeRequest,
                createEdgeResponse>(
                  this, METHODID_CREATE_EDGE)))
          .addMethod(
            getDeleteEdgeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                deleteEdgeRequest,
                deleteEdgeResponse>(
                  this, METHODID_DELETE_EDGE)))
          .addMethod(
            getUpdateEdgeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                updateEdgeRequest,
                updateEdgeResponse>(
                  this, METHODID_UPDATE_EDGE)))
          .addMethod(
            getGetOutgoingEdgesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                getOutgoingEdgesRequest,
                getOutgoingEdgesResponse>(
                  this, METHODID_GET_OUTGOING_EDGES)))
          .addMethod(
            getGetIncomingEdgesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                getIncomingEdgesRequest,
                getIncomingEdgesResponse>(
                  this, METHODID_GET_INCOMING_EDGES)))
          .addMethod(
            getGetEdgesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                getEdgesRequest,
                getEdgesResponse>(
                  this, METHODID_GET_EDGES)))
          .addMethod(
            getGetOutgoingEdgesForVerticesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                getOutGoingEdgesForVerticesRequest,
                getEdgesResponse>(
                  this, METHODID_GET_OUTGOING_EDGES_FOR_VERTICES)))
          .addMethod(
            getGetIncomingEdgesForVerticesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                getIncomingEdgesForVerticesRequest,
                getEdgesResponse>(
                  this, METHODID_GET_INCOMING_EDGES_FOR_VERTICES)))
          .addMethod(
            getGetAllVerticesIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                getAllVerticesIdsRequest,
                getAllVerticesIdsResponse>(
                  this, METHODID_GET_ALL_VERTICES_IDS)))
          .build();
    }
  }

  /**
   */
  public static final class VertexServiceStub extends io.grpc.stub.AbstractAsyncStub<VertexServiceStub> {
    private VertexServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VertexServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VertexServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVertex(getVertexRequest request,
                          io.grpc.stub.StreamObserver<getVertexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVertexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVertices(getVerticesRequest request,
                            io.grpc.stub.StreamObserver<getVerticesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVerticesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVertex(createVertexRequest request,
                             io.grpc.stub.StreamObserver<createVertexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVertexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVertex(deleteVertexRequest request,
                             io.grpc.stub.StreamObserver<deleteVertexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVertexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVertex(updateVertexRequest request,
                             io.grpc.stub.StreamObserver<updateVertexResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVertexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEdge(createEdgeRequest request,
                           io.grpc.stub.StreamObserver<createEdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEdgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEdge(deleteEdgeRequest request,
                           io.grpc.stub.StreamObserver<deleteEdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEdgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEdge(updateEdgeRequest request,
                           io.grpc.stub.StreamObserver<updateEdgeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEdgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOutgoingEdges(getOutgoingEdgesRequest request,
                                 io.grpc.stub.StreamObserver<getOutgoingEdgesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOutgoingEdgesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncomingEdges(getIncomingEdgesRequest request,
                                 io.grpc.stub.StreamObserver<getIncomingEdgesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIncomingEdgesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEdges(getEdgesRequest request,
                         io.grpc.stub.StreamObserver<getEdgesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEdgesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOutgoingEdgesForVertices(getOutGoingEdgesForVerticesRequest request,
                                            io.grpc.stub.StreamObserver<getEdgesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOutgoingEdgesForVerticesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncomingEdgesForVertices(getIncomingEdgesForVerticesRequest request,
                                            io.grpc.stub.StreamObserver<getEdgesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIncomingEdgesForVerticesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllVerticesIds(getAllVerticesIdsRequest request,
                                  io.grpc.stub.StreamObserver<getAllVerticesIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllVerticesIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VertexServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<VertexServiceBlockingStub> {
    private VertexServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VertexServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VertexServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public getVertexResponse getVertex(getVertexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVertexMethod(), getCallOptions(), request);
    }

    /**
     */
    public getVerticesResponse getVertices(getVerticesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVerticesMethod(), getCallOptions(), request);
    }

    /**
     */
    public createVertexResponse createVertex(createVertexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVertexMethod(), getCallOptions(), request);
    }

    /**
     */
    public deleteVertexResponse deleteVertex(deleteVertexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVertexMethod(), getCallOptions(), request);
    }

    /**
     */
    public updateVertexResponse updateVertex(updateVertexRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVertexMethod(), getCallOptions(), request);
    }

    /**
     */
    public createEdgeResponse createEdge(createEdgeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEdgeMethod(), getCallOptions(), request);
    }

    /**
     */
    public deleteEdgeResponse deleteEdge(deleteEdgeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEdgeMethod(), getCallOptions(), request);
    }

    /**
     */
    public updateEdgeResponse updateEdge(updateEdgeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEdgeMethod(), getCallOptions(), request);
    }

    /**
     */
    public getOutgoingEdgesResponse getOutgoingEdges(getOutgoingEdgesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOutgoingEdgesMethod(), getCallOptions(), request);
    }

    /**
     */
    public getIncomingEdgesResponse getIncomingEdges(getIncomingEdgesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIncomingEdgesMethod(), getCallOptions(), request);
    }

    /**
     */
    public getEdgesResponse getEdges(getEdgesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEdgesMethod(), getCallOptions(), request);
    }

    /**
     */
    public getEdgesResponse getOutgoingEdgesForVertices(getOutGoingEdgesForVerticesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOutgoingEdgesForVerticesMethod(), getCallOptions(), request);
    }

    /**
     */
    public getEdgesResponse getIncomingEdgesForVertices(getIncomingEdgesForVerticesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIncomingEdgesForVerticesMethod(), getCallOptions(), request);
    }

    /**
     */
    public getAllVerticesIdsResponse getAllVerticesIds(getAllVerticesIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllVerticesIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VertexServiceFutureStub extends io.grpc.stub.AbstractFutureStub<VertexServiceFutureStub> {
    private VertexServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected VertexServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VertexServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<getVertexResponse> getVertex(
        getVertexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVertexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<getVerticesResponse> getVertices(
        getVerticesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVerticesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<createVertexResponse> createVertex(
        createVertexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVertexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<deleteVertexResponse> deleteVertex(
        deleteVertexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVertexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<updateVertexResponse> updateVertex(
        updateVertexRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVertexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<createEdgeResponse> createEdge(
        createEdgeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEdgeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<deleteEdgeResponse> deleteEdge(
        deleteEdgeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEdgeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<updateEdgeResponse> updateEdge(
        updateEdgeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEdgeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<getOutgoingEdgesResponse> getOutgoingEdges(
        getOutgoingEdgesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOutgoingEdgesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<getIncomingEdgesResponse> getIncomingEdges(
        getIncomingEdgesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIncomingEdgesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<getEdgesResponse> getEdges(
        getEdgesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEdgesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<getEdgesResponse> getOutgoingEdgesForVertices(
        getOutGoingEdgesForVerticesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOutgoingEdgesForVerticesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<getEdgesResponse> getIncomingEdgesForVertices(
        getIncomingEdgesForVerticesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIncomingEdgesForVerticesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<getAllVerticesIdsResponse> getAllVerticesIds(
        getAllVerticesIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllVerticesIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VERTEX = 0;
  private static final int METHODID_GET_VERTICES = 1;
  private static final int METHODID_CREATE_VERTEX = 2;
  private static final int METHODID_DELETE_VERTEX = 3;
  private static final int METHODID_UPDATE_VERTEX = 4;
  private static final int METHODID_CREATE_EDGE = 5;
  private static final int METHODID_DELETE_EDGE = 6;
  private static final int METHODID_UPDATE_EDGE = 7;
  private static final int METHODID_GET_OUTGOING_EDGES = 8;
  private static final int METHODID_GET_INCOMING_EDGES = 9;
  private static final int METHODID_GET_EDGES = 10;
  private static final int METHODID_GET_OUTGOING_EDGES_FOR_VERTICES = 11;
  private static final int METHODID_GET_INCOMING_EDGES_FOR_VERTICES = 12;
  private static final int METHODID_GET_ALL_VERTICES_IDS = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VertexServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VertexServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VERTEX:
          serviceImpl.getVertex((getVertexRequest) request,
              (io.grpc.stub.StreamObserver<getVertexResponse>) responseObserver);
          break;
        case METHODID_GET_VERTICES:
          serviceImpl.getVertices((getVerticesRequest) request,
              (io.grpc.stub.StreamObserver<getVerticesResponse>) responseObserver);
          break;
        case METHODID_CREATE_VERTEX:
          serviceImpl.createVertex((createVertexRequest) request,
              (io.grpc.stub.StreamObserver<createVertexResponse>) responseObserver);
          break;
        case METHODID_DELETE_VERTEX:
          serviceImpl.deleteVertex((deleteVertexRequest) request,
              (io.grpc.stub.StreamObserver<deleteVertexResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VERTEX:
          serviceImpl.updateVertex((updateVertexRequest) request,
              (io.grpc.stub.StreamObserver<updateVertexResponse>) responseObserver);
          break;
        case METHODID_CREATE_EDGE:
          serviceImpl.createEdge((createEdgeRequest) request,
              (io.grpc.stub.StreamObserver<createEdgeResponse>) responseObserver);
          break;
        case METHODID_DELETE_EDGE:
          serviceImpl.deleteEdge((deleteEdgeRequest) request,
              (io.grpc.stub.StreamObserver<deleteEdgeResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EDGE:
          serviceImpl.updateEdge((updateEdgeRequest) request,
              (io.grpc.stub.StreamObserver<updateEdgeResponse>) responseObserver);
          break;
        case METHODID_GET_OUTGOING_EDGES:
          serviceImpl.getOutgoingEdges((getOutgoingEdgesRequest) request,
              (io.grpc.stub.StreamObserver<getOutgoingEdgesResponse>) responseObserver);
          break;
        case METHODID_GET_INCOMING_EDGES:
          serviceImpl.getIncomingEdges((getIncomingEdgesRequest) request,
              (io.grpc.stub.StreamObserver<getIncomingEdgesResponse>) responseObserver);
          break;
        case METHODID_GET_EDGES:
          serviceImpl.getEdges((getEdgesRequest) request,
              (io.grpc.stub.StreamObserver<getEdgesResponse>) responseObserver);
          break;
        case METHODID_GET_OUTGOING_EDGES_FOR_VERTICES:
          serviceImpl.getOutgoingEdgesForVertices((getOutGoingEdgesForVerticesRequest) request,
              (io.grpc.stub.StreamObserver<getEdgesResponse>) responseObserver);
          break;
        case METHODID_GET_INCOMING_EDGES_FOR_VERTICES:
          serviceImpl.getIncomingEdgesForVertices((getIncomingEdgesForVerticesRequest) request,
              (io.grpc.stub.StreamObserver<getEdgesResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_VERTICES_IDS:
          serviceImpl.getAllVerticesIds((getAllVerticesIdsRequest) request,
              (io.grpc.stub.StreamObserver<getAllVerticesIdsResponse>) responseObserver);
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

  private static abstract class VertexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VertexServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Vertex.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VertexService");
    }
  }

  private static final class VertexServiceFileDescriptorSupplier
      extends VertexServiceBaseDescriptorSupplier {
    VertexServiceFileDescriptorSupplier() {}
  }

  private static final class VertexServiceMethodDescriptorSupplier
      extends VertexServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VertexServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VertexServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VertexServiceFileDescriptorSupplier())
              .addMethod(getGetVertexMethod())
              .addMethod(getGetVerticesMethod())
              .addMethod(getCreateVertexMethod())
              .addMethod(getDeleteVertexMethod())
              .addMethod(getUpdateVertexMethod())
              .addMethod(getCreateEdgeMethod())
              .addMethod(getDeleteEdgeMethod())
              .addMethod(getUpdateEdgeMethod())
              .addMethod(getGetOutgoingEdgesMethod())
              .addMethod(getGetIncomingEdgesMethod())
              .addMethod(getGetEdgesMethod())
              .addMethod(getGetOutgoingEdgesForVerticesMethod())
              .addMethod(getGetIncomingEdgesForVerticesMethod())
              .addMethod(getGetAllVerticesIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
