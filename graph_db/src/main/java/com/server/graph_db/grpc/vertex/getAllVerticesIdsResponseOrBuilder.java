// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vertex.proto

package com.server.graph_db.grpc.vertex;

public interface getAllVerticesIdsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:getAllVerticesIdsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string vertexIds = 1;</code>
   * @return A list containing the vertexIds.
   */
  java.util.List<String>
      getVertexIdsList();
  /**
   * <code>repeated string vertexIds = 1;</code>
   * @return The count of vertexIds.
   */
  int getVertexIdsCount();
  /**
   * <code>repeated string vertexIds = 1;</code>
   * @param index The index of the element to return.
   * @return The vertexIds at the given index.
   */
  String getVertexIds(int index);
  /**
   * <code>repeated string vertexIds = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the vertexIds at the given index.
   */
  com.google.protobuf.ByteString
      getVertexIdsBytes(int index);
}
