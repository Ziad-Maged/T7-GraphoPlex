// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vertex.proto

package com.server.graph_db.grpc.vertex;

/**
 * Protobuf type {@code getEdgesResponse}
 */
public final class getEdgesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:getEdgesResponse)
    getEdgesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getEdgesResponse.newBuilder() to construct.
  private getEdgesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getEdgesResponse() {
    edges_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new getEdgesResponse();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getEdgesResponse(
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
              edges_ = new java.util.ArrayList<edge>();
              mutable_bitField0_ |= 0x00000001;
            }
            edges_.add(
                input.readMessage(edge.parser(), extensionRegistry));
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
        edges_ = java.util.Collections.unmodifiableList(edges_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Vertex.internal_static_getEdgesResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Vertex.internal_static_getEdgesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            getEdgesResponse.class, Builder.class);
  }

  public static final int EDGES_FIELD_NUMBER = 1;
  private java.util.List<edge> edges_;
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  @Override
  public java.util.List<edge> getEdgesList() {
    return edges_;
  }
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  @Override
  public java.util.List<? extends edgeOrBuilder>
      getEdgesOrBuilderList() {
    return edges_;
  }
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  @Override
  public int getEdgesCount() {
    return edges_.size();
  }
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  @Override
  public edge getEdges(int index) {
    return edges_.get(index);
  }
  /**
   * <code>repeated .edge edges = 1;</code>
   */
  @Override
  public edgeOrBuilder getEdgesOrBuilder(
      int index) {
    return edges_.get(index);
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
    for (int i = 0; i < edges_.size(); i++) {
      output.writeMessage(1, edges_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < edges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, edges_.get(i));
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
    if (!(obj instanceof getEdgesResponse)) {
      return super.equals(obj);
    }
    getEdgesResponse other = (getEdgesResponse) obj;

    if (!getEdgesList()
        .equals(other.getEdgesList())) return false;
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
    if (getEdgesCount() > 0) {
      hash = (37 * hash) + EDGES_FIELD_NUMBER;
      hash = (53 * hash) + getEdgesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static getEdgesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static getEdgesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static getEdgesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static getEdgesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static getEdgesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static getEdgesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static getEdgesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static getEdgesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static getEdgesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static getEdgesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static getEdgesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static getEdgesResponse parseFrom(
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
  public static Builder newBuilder(getEdgesResponse prototype) {
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
   * Protobuf type {@code getEdgesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:getEdgesResponse)
      getEdgesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Vertex.internal_static_getEdgesResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Vertex.internal_static_getEdgesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              getEdgesResponse.class, Builder.class);
    }

    // Construct using com.server.graph_db.grpc.vertex.getEdgesResponse.newBuilder()
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
        getEdgesFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (edgesBuilder_ == null) {
        edges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        edgesBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Vertex.internal_static_getEdgesResponse_descriptor;
    }

    @Override
    public getEdgesResponse getDefaultInstanceForType() {
      return getEdgesResponse.getDefaultInstance();
    }

    @Override
    public getEdgesResponse build() {
      getEdgesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public getEdgesResponse buildPartial() {
      getEdgesResponse result = new getEdgesResponse(this);
      int from_bitField0_ = bitField0_;
      if (edgesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          edges_ = java.util.Collections.unmodifiableList(edges_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.edges_ = edges_;
      } else {
        result.edges_ = edgesBuilder_.build();
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
      if (other instanceof getEdgesResponse) {
        return mergeFrom((getEdgesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(getEdgesResponse other) {
      if (other == getEdgesResponse.getDefaultInstance()) return this;
      if (edgesBuilder_ == null) {
        if (!other.edges_.isEmpty()) {
          if (edges_.isEmpty()) {
            edges_ = other.edges_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEdgesIsMutable();
            edges_.addAll(other.edges_);
          }
          onChanged();
        }
      } else {
        if (!other.edges_.isEmpty()) {
          if (edgesBuilder_.isEmpty()) {
            edgesBuilder_.dispose();
            edgesBuilder_ = null;
            edges_ = other.edges_;
            bitField0_ = (bitField0_ & ~0x00000001);
            edgesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEdgesFieldBuilder() : null;
          } else {
            edgesBuilder_.addAllMessages(other.edges_);
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
      getEdgesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (getEdgesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<edge> edges_ =
      java.util.Collections.emptyList();
    private void ensureEdgesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        edges_ = new java.util.ArrayList<edge>(edges_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        edge, edge.Builder, edgeOrBuilder> edgesBuilder_;

    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public java.util.List<edge> getEdgesList() {
      if (edgesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(edges_);
      } else {
        return edgesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public int getEdgesCount() {
      if (edgesBuilder_ == null) {
        return edges_.size();
      } else {
        return edgesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public edge getEdges(int index) {
      if (edgesBuilder_ == null) {
        return edges_.get(index);
      } else {
        return edgesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder setEdges(
        int index, edge value) {
      if (edgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgesIsMutable();
        edges_.set(index, value);
        onChanged();
      } else {
        edgesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder setEdges(
        int index, edge.Builder builderForValue) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        edges_.set(index, builderForValue.build());
        onChanged();
      } else {
        edgesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder addEdges(edge value) {
      if (edgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgesIsMutable();
        edges_.add(value);
        onChanged();
      } else {
        edgesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder addEdges(
        int index, edge value) {
      if (edgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgesIsMutable();
        edges_.add(index, value);
        onChanged();
      } else {
        edgesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder addEdges(
        edge.Builder builderForValue) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        edges_.add(builderForValue.build());
        onChanged();
      } else {
        edgesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder addEdges(
        int index, edge.Builder builderForValue) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        edges_.add(index, builderForValue.build());
        onChanged();
      } else {
        edgesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder addAllEdges(
        Iterable<? extends edge> values) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, edges_);
        onChanged();
      } else {
        edgesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder clearEdges() {
      if (edgesBuilder_ == null) {
        edges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        edgesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public Builder removeEdges(int index) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        edges_.remove(index);
        onChanged();
      } else {
        edgesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public edge.Builder getEdgesBuilder(
        int index) {
      return getEdgesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public edgeOrBuilder getEdgesOrBuilder(
        int index) {
      if (edgesBuilder_ == null) {
        return edges_.get(index);  } else {
        return edgesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public java.util.List<? extends edgeOrBuilder>
         getEdgesOrBuilderList() {
      if (edgesBuilder_ != null) {
        return edgesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(edges_);
      }
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public edge.Builder addEdgesBuilder() {
      return getEdgesFieldBuilder().addBuilder(
          edge.getDefaultInstance());
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public edge.Builder addEdgesBuilder(
        int index) {
      return getEdgesFieldBuilder().addBuilder(
          index, edge.getDefaultInstance());
    }
    /**
     * <code>repeated .edge edges = 1;</code>
     */
    public java.util.List<edge.Builder>
         getEdgesBuilderList() {
      return getEdgesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        edge, edge.Builder, edgeOrBuilder>
        getEdgesFieldBuilder() {
      if (edgesBuilder_ == null) {
        edgesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            edge, edge.Builder, edgeOrBuilder>(
                edges_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        edges_ = null;
      }
      return edgesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:getEdgesResponse)
  }

  // @@protoc_insertion_point(class_scope:getEdgesResponse)
  private static final getEdgesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new getEdgesResponse();
  }

  public static getEdgesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getEdgesResponse>
      PARSER = new com.google.protobuf.AbstractParser<getEdgesResponse>() {
    @Override
    public getEdgesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getEdgesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getEdgesResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<getEdgesResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public getEdgesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

