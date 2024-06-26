// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vertex.proto

package com.server.graph_db.grpc.vertex;

public interface createVertexRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:createVertexRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  String getId();
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
  String getLabel();
  /**
   * <code>string label = 2;</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  int getPropertiesCount();
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  boolean containsProperties(
      String key);
  /**
   * Use {@link #getPropertiesMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getProperties();
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */
  java.util.Map<String, String>
  getPropertiesMap();
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */

  String getPropertiesOrDefault(
      String key,
      String defaultValue);
  /**
   * <code>map&lt;string, string&gt; properties = 3;</code>
   */

  String getPropertiesOrThrow(
      String key);
}
