// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: traverser.proto

package com.server.graph_db.grpc.traverser;

/**
 * Protobuf type {@code filterEdgesRequest}
 */
public final class filterEdgesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:filterEdgesRequest)
    filterEdgesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use filterEdgesRequest.newBuilder() to construct.
  private filterEdgesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private filterEdgesRequest() {
    verticesIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    edgeLabel_ = "";
    selectOperators_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new filterEdgesRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private filterEdgesRequest(
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
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              verticesIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            verticesIds_.add(s);
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            edgeLabel_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              selectOperators_ = new java.util.ArrayList<selectOperator>();
              mutable_bitField0_ |= 0x00000002;
            }
            selectOperators_.add(
                input.readMessage(selectOperator.parser(), extensionRegistry));
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
        verticesIds_ = verticesIds_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        selectOperators_ = java.util.Collections.unmodifiableList(selectOperators_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Traverser.internal_static_filterEdgesRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Traverser.internal_static_filterEdgesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            filterEdgesRequest.class, Builder.class);
  }

  public static final int VERTICESIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList verticesIds_;
  /**
   * <code>repeated string verticesIds = 1;</code>
   * @return A list containing the verticesIds.
   */
  public com.google.protobuf.ProtocolStringList
      getVerticesIdsList() {
    return verticesIds_;
  }
  /**
   * <code>repeated string verticesIds = 1;</code>
   * @return The count of verticesIds.
   */
  public int getVerticesIdsCount() {
    return verticesIds_.size();
  }
  /**
   * <code>repeated string verticesIds = 1;</code>
   * @param index The index of the element to return.
   * @return The verticesIds at the given index.
   */
  public String getVerticesIds(int index) {
    return verticesIds_.get(index);
  }
  /**
   * <code>repeated string verticesIds = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the verticesIds at the given index.
   */
  public com.google.protobuf.ByteString
      getVerticesIdsBytes(int index) {
    return verticesIds_.getByteString(index);
  }

  public static final int EDGELABEL_FIELD_NUMBER = 2;
  private volatile Object edgeLabel_;
  /**
   * <code>string edgeLabel = 2;</code>
   * @return The edgeLabel.
   */
  @Override
  public String getEdgeLabel() {
    Object ref = edgeLabel_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      edgeLabel_ = s;
      return s;
    }
  }
  /**
   * <code>string edgeLabel = 2;</code>
   * @return The bytes for edgeLabel.
   */
  @Override
  public com.google.protobuf.ByteString
      getEdgeLabelBytes() {
    Object ref = edgeLabel_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      edgeLabel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SELECTOPERATORS_FIELD_NUMBER = 3;
  private java.util.List<selectOperator> selectOperators_;
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  @Override
  public java.util.List<selectOperator> getSelectOperatorsList() {
    return selectOperators_;
  }
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  @Override
  public java.util.List<? extends selectOperatorOrBuilder>
      getSelectOperatorsOrBuilderList() {
    return selectOperators_;
  }
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  @Override
  public int getSelectOperatorsCount() {
    return selectOperators_.size();
  }
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  @Override
  public selectOperator getSelectOperators(int index) {
    return selectOperators_.get(index);
  }
  /**
   * <code>repeated .selectOperator selectOperators = 3;</code>
   */
  @Override
  public selectOperatorOrBuilder getSelectOperatorsOrBuilder(
      int index) {
    return selectOperators_.get(index);
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
    for (int i = 0; i < verticesIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, verticesIds_.getRaw(i));
    }
    if (!getEdgeLabelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, edgeLabel_);
    }
    for (int i = 0; i < selectOperators_.size(); i++) {
      output.writeMessage(3, selectOperators_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < verticesIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(verticesIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getVerticesIdsList().size();
    }
    if (!getEdgeLabelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, edgeLabel_);
    }
    for (int i = 0; i < selectOperators_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, selectOperators_.get(i));
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
    if (!(obj instanceof filterEdgesRequest)) {
      return super.equals(obj);
    }
    filterEdgesRequest other = (filterEdgesRequest) obj;

    if (!getVerticesIdsList()
        .equals(other.getVerticesIdsList())) return false;
    if (!getEdgeLabel()
        .equals(other.getEdgeLabel())) return false;
    if (!getSelectOperatorsList()
        .equals(other.getSelectOperatorsList())) return false;
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
    if (getVerticesIdsCount() > 0) {
      hash = (37 * hash) + VERTICESIDS_FIELD_NUMBER;
      hash = (53 * hash) + getVerticesIdsList().hashCode();
    }
    hash = (37 * hash) + EDGELABEL_FIELD_NUMBER;
    hash = (53 * hash) + getEdgeLabel().hashCode();
    if (getSelectOperatorsCount() > 0) {
      hash = (37 * hash) + SELECTOPERATORS_FIELD_NUMBER;
      hash = (53 * hash) + getSelectOperatorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static filterEdgesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static filterEdgesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static filterEdgesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static filterEdgesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static filterEdgesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static filterEdgesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static filterEdgesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static filterEdgesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static filterEdgesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static filterEdgesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static filterEdgesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static filterEdgesRequest parseFrom(
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
  public static Builder newBuilder(filterEdgesRequest prototype) {
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
   * Protobuf type {@code filterEdgesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:filterEdgesRequest)
      filterEdgesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Traverser.internal_static_filterEdgesRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Traverser.internal_static_filterEdgesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              filterEdgesRequest.class, Builder.class);
    }

    // Construct using com.server.graph_db.grpc.traverser.filterEdgesRequest.newBuilder()
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
        getSelectOperatorsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      verticesIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      edgeLabel_ = "";

      if (selectOperatorsBuilder_ == null) {
        selectOperators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        selectOperatorsBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Traverser.internal_static_filterEdgesRequest_descriptor;
    }

    @Override
    public filterEdgesRequest getDefaultInstanceForType() {
      return filterEdgesRequest.getDefaultInstance();
    }

    @Override
    public filterEdgesRequest build() {
      filterEdgesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public filterEdgesRequest buildPartial() {
      filterEdgesRequest result = new filterEdgesRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        verticesIds_ = verticesIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.verticesIds_ = verticesIds_;
      result.edgeLabel_ = edgeLabel_;
      if (selectOperatorsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          selectOperators_ = java.util.Collections.unmodifiableList(selectOperators_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.selectOperators_ = selectOperators_;
      } else {
        result.selectOperators_ = selectOperatorsBuilder_.build();
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
      if (other instanceof filterEdgesRequest) {
        return mergeFrom((filterEdgesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(filterEdgesRequest other) {
      if (other == filterEdgesRequest.getDefaultInstance()) return this;
      if (!other.verticesIds_.isEmpty()) {
        if (verticesIds_.isEmpty()) {
          verticesIds_ = other.verticesIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureVerticesIdsIsMutable();
          verticesIds_.addAll(other.verticesIds_);
        }
        onChanged();
      }
      if (!other.getEdgeLabel().isEmpty()) {
        edgeLabel_ = other.edgeLabel_;
        onChanged();
      }
      if (selectOperatorsBuilder_ == null) {
        if (!other.selectOperators_.isEmpty()) {
          if (selectOperators_.isEmpty()) {
            selectOperators_ = other.selectOperators_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSelectOperatorsIsMutable();
            selectOperators_.addAll(other.selectOperators_);
          }
          onChanged();
        }
      } else {
        if (!other.selectOperators_.isEmpty()) {
          if (selectOperatorsBuilder_.isEmpty()) {
            selectOperatorsBuilder_.dispose();
            selectOperatorsBuilder_ = null;
            selectOperators_ = other.selectOperators_;
            bitField0_ = (bitField0_ & ~0x00000002);
            selectOperatorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSelectOperatorsFieldBuilder() : null;
          } else {
            selectOperatorsBuilder_.addAllMessages(other.selectOperators_);
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
      filterEdgesRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (filterEdgesRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList verticesIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureVerticesIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        verticesIds_ = new com.google.protobuf.LazyStringArrayList(verticesIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @return A list containing the verticesIds.
     */
    public com.google.protobuf.ProtocolStringList
        getVerticesIdsList() {
      return verticesIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @return The count of verticesIds.
     */
    public int getVerticesIdsCount() {
      return verticesIds_.size();
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @param index The index of the element to return.
     * @return The verticesIds at the given index.
     */
    public String getVerticesIds(int index) {
      return verticesIds_.get(index);
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the verticesIds at the given index.
     */
    public com.google.protobuf.ByteString
        getVerticesIdsBytes(int index) {
      return verticesIds_.getByteString(index);
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @param index The index to set the value at.
     * @param value The verticesIds to set.
     * @return This builder for chaining.
     */
    public Builder setVerticesIds(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureVerticesIdsIsMutable();
      verticesIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @param value The verticesIds to add.
     * @return This builder for chaining.
     */
    public Builder addVerticesIds(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureVerticesIdsIsMutable();
      verticesIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @param values The verticesIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllVerticesIds(
        Iterable<String> values) {
      ensureVerticesIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, verticesIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVerticesIds() {
      verticesIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string verticesIds = 1;</code>
     * @param value The bytes of the verticesIds to add.
     * @return This builder for chaining.
     */
    public Builder addVerticesIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureVerticesIdsIsMutable();
      verticesIds_.add(value);
      onChanged();
      return this;
    }

    private Object edgeLabel_ = "";
    /**
     * <code>string edgeLabel = 2;</code>
     * @return The edgeLabel.
     */
    public String getEdgeLabel() {
      Object ref = edgeLabel_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        edgeLabel_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string edgeLabel = 2;</code>
     * @return The bytes for edgeLabel.
     */
    public com.google.protobuf.ByteString
        getEdgeLabelBytes() {
      Object ref = edgeLabel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        edgeLabel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string edgeLabel = 2;</code>
     * @param value The edgeLabel to set.
     * @return This builder for chaining.
     */
    public Builder setEdgeLabel(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      edgeLabel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string edgeLabel = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEdgeLabel() {
      
      edgeLabel_ = getDefaultInstance().getEdgeLabel();
      onChanged();
      return this;
    }
    /**
     * <code>string edgeLabel = 2;</code>
     * @param value The bytes for edgeLabel to set.
     * @return This builder for chaining.
     */
    public Builder setEdgeLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      edgeLabel_ = value;
      onChanged();
      return this;
    }

    private java.util.List<selectOperator> selectOperators_ =
      java.util.Collections.emptyList();
    private void ensureSelectOperatorsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        selectOperators_ = new java.util.ArrayList<selectOperator>(selectOperators_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        selectOperator, selectOperator.Builder, selectOperatorOrBuilder> selectOperatorsBuilder_;

    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public java.util.List<selectOperator> getSelectOperatorsList() {
      if (selectOperatorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(selectOperators_);
      } else {
        return selectOperatorsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public int getSelectOperatorsCount() {
      if (selectOperatorsBuilder_ == null) {
        return selectOperators_.size();
      } else {
        return selectOperatorsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public selectOperator getSelectOperators(int index) {
      if (selectOperatorsBuilder_ == null) {
        return selectOperators_.get(index);
      } else {
        return selectOperatorsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder setSelectOperators(
        int index, selectOperator value) {
      if (selectOperatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSelectOperatorsIsMutable();
        selectOperators_.set(index, value);
        onChanged();
      } else {
        selectOperatorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder setSelectOperators(
        int index, selectOperator.Builder builderForValue) {
      if (selectOperatorsBuilder_ == null) {
        ensureSelectOperatorsIsMutable();
        selectOperators_.set(index, builderForValue.build());
        onChanged();
      } else {
        selectOperatorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder addSelectOperators(selectOperator value) {
      if (selectOperatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSelectOperatorsIsMutable();
        selectOperators_.add(value);
        onChanged();
      } else {
        selectOperatorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder addSelectOperators(
        int index, selectOperator value) {
      if (selectOperatorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSelectOperatorsIsMutable();
        selectOperators_.add(index, value);
        onChanged();
      } else {
        selectOperatorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder addSelectOperators(
        selectOperator.Builder builderForValue) {
      if (selectOperatorsBuilder_ == null) {
        ensureSelectOperatorsIsMutable();
        selectOperators_.add(builderForValue.build());
        onChanged();
      } else {
        selectOperatorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder addSelectOperators(
        int index, selectOperator.Builder builderForValue) {
      if (selectOperatorsBuilder_ == null) {
        ensureSelectOperatorsIsMutable();
        selectOperators_.add(index, builderForValue.build());
        onChanged();
      } else {
        selectOperatorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder addAllSelectOperators(
        Iterable<? extends selectOperator> values) {
      if (selectOperatorsBuilder_ == null) {
        ensureSelectOperatorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, selectOperators_);
        onChanged();
      } else {
        selectOperatorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder clearSelectOperators() {
      if (selectOperatorsBuilder_ == null) {
        selectOperators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        selectOperatorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public Builder removeSelectOperators(int index) {
      if (selectOperatorsBuilder_ == null) {
        ensureSelectOperatorsIsMutable();
        selectOperators_.remove(index);
        onChanged();
      } else {
        selectOperatorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public selectOperator.Builder getSelectOperatorsBuilder(
        int index) {
      return getSelectOperatorsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public selectOperatorOrBuilder getSelectOperatorsOrBuilder(
        int index) {
      if (selectOperatorsBuilder_ == null) {
        return selectOperators_.get(index);  } else {
        return selectOperatorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public java.util.List<? extends selectOperatorOrBuilder>
         getSelectOperatorsOrBuilderList() {
      if (selectOperatorsBuilder_ != null) {
        return selectOperatorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(selectOperators_);
      }
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public selectOperator.Builder addSelectOperatorsBuilder() {
      return getSelectOperatorsFieldBuilder().addBuilder(
          selectOperator.getDefaultInstance());
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public selectOperator.Builder addSelectOperatorsBuilder(
        int index) {
      return getSelectOperatorsFieldBuilder().addBuilder(
          index, selectOperator.getDefaultInstance());
    }
    /**
     * <code>repeated .selectOperator selectOperators = 3;</code>
     */
    public java.util.List<selectOperator.Builder>
         getSelectOperatorsBuilderList() {
      return getSelectOperatorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        selectOperator, selectOperator.Builder, selectOperatorOrBuilder>
        getSelectOperatorsFieldBuilder() {
      if (selectOperatorsBuilder_ == null) {
        selectOperatorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            selectOperator, selectOperator.Builder, selectOperatorOrBuilder>(
                selectOperators_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        selectOperators_ = null;
      }
      return selectOperatorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:filterEdgesRequest)
  }

  // @@protoc_insertion_point(class_scope:filterEdgesRequest)
  private static final filterEdgesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new filterEdgesRequest();
  }

  public static filterEdgesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<filterEdgesRequest>
      PARSER = new com.google.protobuf.AbstractParser<filterEdgesRequest>() {
    @Override
    public filterEdgesRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new filterEdgesRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<filterEdgesRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<filterEdgesRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public filterEdgesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

