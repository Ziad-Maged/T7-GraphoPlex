// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: traverser.proto

package com.server.graph_db.grpc.traverser;

public interface vertexBindingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:vertexBinding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string label = 2;</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <code>string label = 2;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  java.util.List<com.server.graph_db.grpc.traverser.selectOperator> 
      getSelectOperatorsList();
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  com.server.graph_db.grpc.traverser.selectOperator getSelectOperators(int index);
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  int getSelectOperatorsCount();
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  java.util.List<? extends com.server.graph_db.grpc.traverser.selectOperatorOrBuilder> 
      getSelectOperatorsOrBuilderList();
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  com.server.graph_db.grpc.traverser.selectOperatorOrBuilder getSelectOperatorsOrBuilder(
      int index);
}