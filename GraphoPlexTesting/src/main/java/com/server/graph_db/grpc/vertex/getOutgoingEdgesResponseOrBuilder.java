// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vertex.proto

package com.server.graph_db.grpc.vertex;

public interface getOutgoingEdgesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:getOutgoingEdgesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .edge edges = 1;</code>
   */
  java.util.List<edge>
      getEdgesList();
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  edge getEdges(int index);
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  int getEdgesCount();
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  java.util.List<? extends edgeOrBuilder>
      getEdgesOrBuilderList();
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  edgeOrBuilder getEdgesOrBuilder(
      int index);
}
