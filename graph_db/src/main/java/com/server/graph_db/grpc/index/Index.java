// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: index.proto

package com.server.graph_db.grpc.index;

public final class Index {
  private Index() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_createIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_createIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_createIndexResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_createIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteIndexResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_createIndicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_createIndicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_createIndicesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_createIndicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteIndicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteIndicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_deleteIndicesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_deleteIndicesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013index.proto\"\'\n\022createIndexRequest\022\021\n\ti" +
      "ndexName\030\001 \001(\t\"&\n\023createIndexResponse\022\017\n" +
      "\007success\030\001 \001(\010\"\'\n\022deleteIndexRequest\022\021\n\t" +
      "indexName\030\001 \001(\t\"&\n\023deleteIndexResponse\022\017" +
      "\n\007success\030\001 \001(\010\",\n\024createIndicesRequest\022" +
      "\024\n\014indicesNames\030\001 \003(\t\"(\n\025createIndicesRe" +
      "sponse\022\017\n\007success\030\001 \001(\010\",\n\024deleteIndices" +
      "Request\022\024\n\014indicesNames\030\001 \003(\t\"(\n\025deleteI" +
      "ndicesResponse\022\017\n\007success\030\001 \001(\0102\202\002\n\014inde" +
      "xService\0228\n\013createIndex\022\023.createIndexReq" +
      "uest\032\024.createIndexResponse\0228\n\013deleteInde" +
      "x\022\023.deleteIndexRequest\032\024.deleteIndexResp" +
      "onse\022>\n\rcreateIndices\022\025.createIndicesReq" +
      "uest\032\026.createIndicesResponse\022>\n\rdeleteIn" +
      "dices\022\025.deleteIndicesRequest\032\026.deleteInd" +
      "icesResponseB\"\n\036com.server.graph_db.grpc" +
      ".indexP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_createIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_createIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_createIndexRequest_descriptor,
        new java.lang.String[] { "IndexName", });
    internal_static_createIndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_createIndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_createIndexResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_deleteIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_deleteIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteIndexRequest_descriptor,
        new java.lang.String[] { "IndexName", });
    internal_static_deleteIndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_deleteIndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteIndexResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_createIndicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_createIndicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_createIndicesRequest_descriptor,
        new java.lang.String[] { "IndicesNames", });
    internal_static_createIndicesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_createIndicesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_createIndicesResponse_descriptor,
        new java.lang.String[] { "Success", });
    internal_static_deleteIndicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_deleteIndicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteIndicesRequest_descriptor,
        new java.lang.String[] { "IndicesNames", });
    internal_static_deleteIndicesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_deleteIndicesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_deleteIndicesResponse_descriptor,
        new java.lang.String[] { "Success", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
