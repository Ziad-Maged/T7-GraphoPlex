// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vertex.proto

package com.server.graph_db.grpc.vertex;

/**
 * Protobuf type {@code getEdgesRequest}
 */
public final class getEdgesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:getEdgesRequest)
    getEdgesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getEdgesRequest.newBuilder() to construct.
  private getEdgesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getEdgesRequest() {
    edgeIds_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new getEdgesRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getEdgesRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              edgeIds_ = new java.util.ArrayList<com.server.graph_db.grpc.traverser.edgeId>();
              mutable_bitField0_ |= 0x00000001;
            }
            edgeIds_.add(
                input.readMessage(com.server.graph_db.grpc.traverser.edgeId.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        edgeIds_ = java.util.Collections.unmodifiableList(edgeIds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Vertex.internal_static_getEdgesRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Vertex.internal_static_getEdgesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            getEdgesRequest.class, Builder.class);
  }

  public static final int EDGEIDS_FIELD_NUMBER = 1;
  private java.util.List<com.server.graph_db.grpc.traverser.edgeId> edgeIds_;
  /**
   * <code>repeated .edgeId edgeIds = 1;</code>
   */
  @Override
  public java.util.List<com.server.graph_db.grpc.traverser.edgeId> getEdgeIdsList() {
    return edgeIds_;
  }
  /**
   * <code>repeated .edgeId edgeIds = 1;</code>
   */
  @Override
  public java.util.List<? extends com.server.graph_db.grpc.traverser.edgeIdOrBuilder> 
      getEdgeIdsOrBuilderList() {
    return edgeIds_;
  }
  /**
   * <code>repeated .edgeId edgeIds = 1;</code>
   */
  @Override
  public int getEdgeIdsCount() {
    return edgeIds_.size();
  }
  /**
   * <code>repeated .edgeId edgeIds = 1;</code>
   */
  @Override
  public com.server.graph_db.grpc.traverser.edgeId getEdgeIds(int index) {
    return edgeIds_.get(index);
  }
  /**
   * <code>repeated .edgeId edgeIds = 1;</code>
   */
  @Override
  public com.server.graph_db.grpc.traverser.edgeIdOrBuilder getEdgeIdsOrBuilder(
      int index) {
    return edgeIds_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < edgeIds_.size(); i++) {
      output.writeMessage(1, edgeIds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < edgeIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, edgeIds_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof getEdgesRequest)) {
      return super.equals(obj);
    }
    getEdgesRequest other = (getEdgesRequest) obj;

    if (!getEdgeIdsList()
        .equals(other.getEdgeIdsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEdgeIdsCount() > 0) {
      hash = (37 * hash) + EDGEIDS_FIELD_NUMBER;
      hash = (53 * hash) + getEdgeIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static getEdgesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static getEdgesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static getEdgesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static getEdgesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static getEdgesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static getEdgesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static getEdgesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static getEdgesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static getEdgesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static getEdgesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static getEdgesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static getEdgesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(getEdgesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code getEdgesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:getEdgesRequest)
      getEdgesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Vertex.internal_static_getEdgesRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Vertex.internal_static_getEdgesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              getEdgesRequest.class, Builder.class);
    }

    // Construct using com.server.graph_db.grpc.vertex.getEdgesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getEdgeIdsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (edgeIdsBuilder_ == null) {
        edgeIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        edgeIdsBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Vertex.internal_static_getEdgesRequest_descriptor;
    }

    @Override
    public getEdgesRequest getDefaultInstanceForType() {
      return getEdgesRequest.getDefaultInstance();
    }

    @Override
    public getEdgesRequest build() {
      getEdgesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public getEdgesRequest buildPartial() {
      getEdgesRequest result = new getEdgesRequest(this);
      int from_bitField0_ = bitField0_;
      if (edgeIdsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          edgeIds_ = java.util.Collections.unmodifiableList(edgeIds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.edgeIds_ = edgeIds_;
      } else {
        result.edgeIds_ = edgeIdsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof getEdgesRequest) {
        return mergeFrom((getEdgesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(getEdgesRequest other) {
      if (other == getEdgesRequest.getDefaultInstance()) return this;
      if (edgeIdsBuilder_ == null) {
        if (!other.edgeIds_.isEmpty()) {
          if (edgeIds_.isEmpty()) {
            edgeIds_ = other.edgeIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEdgeIdsIsMutable();
            edgeIds_.addAll(other.edgeIds_);
          }
          onChanged();
        }
      } else {
        if (!other.edgeIds_.isEmpty()) {
          if (edgeIdsBuilder_.isEmpty()) {
            edgeIdsBuilder_.dispose();
            edgeIdsBuilder_ = null;
            edgeIds_ = other.edgeIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            edgeIdsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEdgeIdsFieldBuilder() : null;
          } else {
            edgeIdsBuilder_.addAllMessages(other.edgeIds_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      getEdgesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (getEdgesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.server.graph_db.grpc.traverser.edgeId> edgeIds_ =
      java.util.Collections.emptyList();
    private void ensureEdgeIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        edgeIds_ = new java.util.ArrayList<com.server.graph_db.grpc.traverser.edgeId>(edgeIds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.server.graph_db.grpc.traverser.edgeId, com.server.graph_db.grpc.traverser.edgeId.Builder, com.server.graph_db.grpc.traverser.edgeIdOrBuilder> edgeIdsBuilder_;

    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public java.util.List<com.server.graph_db.grpc.traverser.edgeId> getEdgeIdsList() {
      if (edgeIdsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(edgeIds_);
      } else {
        return edgeIdsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public int getEdgeIdsCount() {
      if (edgeIdsBuilder_ == null) {
        return edgeIds_.size();
      } else {
        return edgeIdsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public com.server.graph_db.grpc.traverser.edgeId getEdgeIds(int index) {
      if (edgeIdsBuilder_ == null) {
        return edgeIds_.get(index);
      } else {
        return edgeIdsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder setEdgeIds(
        int index, com.server.graph_db.grpc.traverser.edgeId value) {
      if (edgeIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgeIdsIsMutable();
        edgeIds_.set(index, value);
        onChanged();
      } else {
        edgeIdsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder setEdgeIds(
        int index, com.server.graph_db.grpc.traverser.edgeId.Builder builderForValue) {
      if (edgeIdsBuilder_ == null) {
        ensureEdgeIdsIsMutable();
        edgeIds_.set(index, builderForValue.build());
        onChanged();
      } else {
        edgeIdsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder addEdgeIds(com.server.graph_db.grpc.traverser.edgeId value) {
      if (edgeIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgeIdsIsMutable();
        edgeIds_.add(value);
        onChanged();
      } else {
        edgeIdsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder addEdgeIds(
        int index, com.server.graph_db.grpc.traverser.edgeId value) {
      if (edgeIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgeIdsIsMutable();
        edgeIds_.add(index, value);
        onChanged();
      } else {
        edgeIdsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder addEdgeIds(
        com.server.graph_db.grpc.traverser.edgeId.Builder builderForValue) {
      if (edgeIdsBuilder_ == null) {
        ensureEdgeIdsIsMutable();
        edgeIds_.add(builderForValue.build());
        onChanged();
      } else {
        edgeIdsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder addEdgeIds(
        int index, com.server.graph_db.grpc.traverser.edgeId.Builder builderForValue) {
      if (edgeIdsBuilder_ == null) {
        ensureEdgeIdsIsMutable();
        edgeIds_.add(index, builderForValue.build());
        onChanged();
      } else {
        edgeIdsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder addAllEdgeIds(
        Iterable<? extends com.server.graph_db.grpc.traverser.edgeId> values) {
      if (edgeIdsBuilder_ == null) {
        ensureEdgeIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, edgeIds_);
        onChanged();
      } else {
        edgeIdsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder clearEdgeIds() {
      if (edgeIdsBuilder_ == null) {
        edgeIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        edgeIdsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public Builder removeEdgeIds(int index) {
      if (edgeIdsBuilder_ == null) {
        ensureEdgeIdsIsMutable();
        edgeIds_.remove(index);
        onChanged();
      } else {
        edgeIdsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public com.server.graph_db.grpc.traverser.edgeId.Builder getEdgeIdsBuilder(
        int index) {
      return getEdgeIdsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public com.server.graph_db.grpc.traverser.edgeIdOrBuilder getEdgeIdsOrBuilder(
        int index) {
      if (edgeIdsBuilder_ == null) {
        return edgeIds_.get(index);  } else {
        return edgeIdsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public java.util.List<? extends com.server.graph_db.grpc.traverser.edgeIdOrBuilder> 
         getEdgeIdsOrBuilderList() {
      if (edgeIdsBuilder_ != null) {
        return edgeIdsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(edgeIds_);
      }
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public com.server.graph_db.grpc.traverser.edgeId.Builder addEdgeIdsBuilder() {
      return getEdgeIdsFieldBuilder().addBuilder(
          com.server.graph_db.grpc.traverser.edgeId.getDefaultInstance());
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public com.server.graph_db.grpc.traverser.edgeId.Builder addEdgeIdsBuilder(
        int index) {
      return getEdgeIdsFieldBuilder().addBuilder(
          index, com.server.graph_db.grpc.traverser.edgeId.getDefaultInstance());
    }
    /**
     * <code>repeated .edgeId edgeIds = 1;</code>
     */
    public java.util.List<com.server.graph_db.grpc.traverser.edgeId.Builder> 
         getEdgeIdsBuilderList() {
      return getEdgeIdsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.server.graph_db.grpc.traverser.edgeId, com.server.graph_db.grpc.traverser.edgeId.Builder, com.server.graph_db.grpc.traverser.edgeIdOrBuilder> 
        getEdgeIdsFieldBuilder() {
      if (edgeIdsBuilder_ == null) {
        edgeIdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.server.graph_db.grpc.traverser.edgeId, com.server.graph_db.grpc.traverser.edgeId.Builder, com.server.graph_db.grpc.traverser.edgeIdOrBuilder>(
                edgeIds_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        edgeIds_ = null;
      }
      return edgeIdsBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:getEdgesRequest)
  }

  // @@protoc_insertion_point(class_scope:getEdgesRequest)
  private static final getEdgesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new getEdgesRequest();
  }

  public static getEdgesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getEdgesRequest>
      PARSER = new com.google.protobuf.AbstractParser<getEdgesRequest>() {
    @Override
    public getEdgesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getEdgesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getEdgesRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<getEdgesRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public getEdgesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

