// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: index.proto

package com.server.graph_db.grpc.index;

public interface deleteIndicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:deleteIndicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string indicesNames = 1;</code>
   * @return A list containing the indicesNames.
   */
  java.util.List<java.lang.String>
      getIndicesNamesList();
  /**
   * <code>repeated string indicesNames = 1;</code>
   * @return The count of indicesNames.
   */
  int getIndicesNamesCount();
  /**
   * <code>repeated string indicesNames = 1;</code>
   * @param index The index of the element to return.
   * @return The indicesNames at the given index.
   */
  java.lang.String getIndicesNames(int index);
  /**
   * <code>repeated string indicesNames = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the indicesNames at the given index.
   */
  com.google.protobuf.ByteString
      getIndicesNamesBytes(int index);
}
