// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vertex.proto

package com.server.graph_db.grpc.vertex;

public interface deleteEdgeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:deleteEdgeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sourceVertexId = 1;</code>
   * @return The sourceVertexId.
   */
  String getSourceVertexId();
  /**
   * <code>string sourceVertexId = 1;</code>
   * @return The bytes for sourceVertexId.
   */
  com.google.protobuf.ByteString
      getSourceVertexIdBytes();

  /**
   * <code>string destinationVertexId = 2;</code>
   * @return The destinationVertexId.
   */
  String getDestinationVertexId();
  /**
   * <code>string destinationVertexId = 2;</code>
   * @return The bytes for destinationVertexId.
   */
  com.google.protobuf.ByteString
      getDestinationVertexIdBytes();

  /**
   * <code>string label = 3;</code>
   * @return The label.
   */
  String getLabel();
  /**
   * <code>string label = 3;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>bool isOutGoing = 4;</code>
   * @return The isOutGoing.
   */
  boolean getIsOutGoing();
}