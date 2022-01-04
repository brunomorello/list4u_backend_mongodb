// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: itemcategory/itemcategory.proto

package br.com.l4u.itemcategory;

/**
 * Protobuf type {@code itemcategory.ItemCategoryListResponse}
 */
public final class ItemCategoryListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:itemcategory.ItemCategoryListResponse)
    ItemCategoryListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ItemCategoryListResponse.newBuilder() to construct.
  private ItemCategoryListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ItemCategoryListResponse() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ItemCategoryListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ItemCategoryListResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
              items_ = new java.util.ArrayList<br.com.l4u.itemcategory.ItemCategory>();
              mutable_bitField0_ |= 0x00000001;
            }
            items_.add(
                input.readMessage(br.com.l4u.itemcategory.ItemCategory.parser(), extensionRegistry));
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
        items_ = java.util.Collections.unmodifiableList(items_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.l4u.itemcategory.Itemcategory.internal_static_itemcategory_ItemCategoryListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.l4u.itemcategory.Itemcategory.internal_static_itemcategory_ItemCategoryListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.l4u.itemcategory.ItemCategoryListResponse.class, br.com.l4u.itemcategory.ItemCategoryListResponse.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  private java.util.List<br.com.l4u.itemcategory.ItemCategory> items_;
  /**
   * <code>repeated .itemcategory.ItemCategory items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<br.com.l4u.itemcategory.ItemCategory> getItemsList() {
    return items_;
  }
  /**
   * <code>repeated .itemcategory.ItemCategory items = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends br.com.l4u.itemcategory.ItemCategoryOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <code>repeated .itemcategory.ItemCategory items = 1;</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <code>repeated .itemcategory.ItemCategory items = 1;</code>
   */
  @java.lang.Override
  public br.com.l4u.itemcategory.ItemCategory getItems(int index) {
    return items_.get(index);
  }
  /**
   * <code>repeated .itemcategory.ItemCategory items = 1;</code>
   */
  @java.lang.Override
  public br.com.l4u.itemcategory.ItemCategoryOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(1, items_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, items_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.l4u.itemcategory.ItemCategoryListResponse)) {
      return super.equals(obj);
    }
    br.com.l4u.itemcategory.ItemCategoryListResponse other = (br.com.l4u.itemcategory.ItemCategoryListResponse) obj;

    if (!getItemsList()
        .equals(other.getItemsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.l4u.itemcategory.ItemCategoryListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.l4u.itemcategory.ItemCategoryListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code itemcategory.ItemCategoryListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:itemcategory.ItemCategoryListResponse)
      br.com.l4u.itemcategory.ItemCategoryListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.l4u.itemcategory.Itemcategory.internal_static_itemcategory_ItemCategoryListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.l4u.itemcategory.Itemcategory.internal_static_itemcategory_ItemCategoryListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.l4u.itemcategory.ItemCategoryListResponse.class, br.com.l4u.itemcategory.ItemCategoryListResponse.Builder.class);
    }

    // Construct using br.com.l4u.itemcategory.ItemCategoryListResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.l4u.itemcategory.Itemcategory.internal_static_itemcategory_ItemCategoryListResponse_descriptor;
    }

    @java.lang.Override
    public br.com.l4u.itemcategory.ItemCategoryListResponse getDefaultInstanceForType() {
      return br.com.l4u.itemcategory.ItemCategoryListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.l4u.itemcategory.ItemCategoryListResponse build() {
      br.com.l4u.itemcategory.ItemCategoryListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.l4u.itemcategory.ItemCategoryListResponse buildPartial() {
      br.com.l4u.itemcategory.ItemCategoryListResponse result = new br.com.l4u.itemcategory.ItemCategoryListResponse(this);
      int from_bitField0_ = bitField0_;
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.l4u.itemcategory.ItemCategoryListResponse) {
        return mergeFrom((br.com.l4u.itemcategory.ItemCategoryListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.l4u.itemcategory.ItemCategoryListResponse other) {
      if (other == br.com.l4u.itemcategory.ItemCategoryListResponse.getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.l4u.itemcategory.ItemCategoryListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.l4u.itemcategory.ItemCategoryListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<br.com.l4u.itemcategory.ItemCategory> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<br.com.l4u.itemcategory.ItemCategory>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.l4u.itemcategory.ItemCategory, br.com.l4u.itemcategory.ItemCategory.Builder, br.com.l4u.itemcategory.ItemCategoryOrBuilder> itemsBuilder_;

    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public java.util.List<br.com.l4u.itemcategory.ItemCategory> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public br.com.l4u.itemcategory.ItemCategory getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder setItems(
        int index, br.com.l4u.itemcategory.ItemCategory value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder setItems(
        int index, br.com.l4u.itemcategory.ItemCategory.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder addItems(br.com.l4u.itemcategory.ItemCategory value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder addItems(
        int index, br.com.l4u.itemcategory.ItemCategory value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder addItems(
        br.com.l4u.itemcategory.ItemCategory.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder addItems(
        int index, br.com.l4u.itemcategory.ItemCategory.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends br.com.l4u.itemcategory.ItemCategory> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public br.com.l4u.itemcategory.ItemCategory.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public br.com.l4u.itemcategory.ItemCategoryOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public java.util.List<? extends br.com.l4u.itemcategory.ItemCategoryOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public br.com.l4u.itemcategory.ItemCategory.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          br.com.l4u.itemcategory.ItemCategory.getDefaultInstance());
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public br.com.l4u.itemcategory.ItemCategory.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, br.com.l4u.itemcategory.ItemCategory.getDefaultInstance());
    }
    /**
     * <code>repeated .itemcategory.ItemCategory items = 1;</code>
     */
    public java.util.List<br.com.l4u.itemcategory.ItemCategory.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        br.com.l4u.itemcategory.ItemCategory, br.com.l4u.itemcategory.ItemCategory.Builder, br.com.l4u.itemcategory.ItemCategoryOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            br.com.l4u.itemcategory.ItemCategory, br.com.l4u.itemcategory.ItemCategory.Builder, br.com.l4u.itemcategory.ItemCategoryOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:itemcategory.ItemCategoryListResponse)
  }

  // @@protoc_insertion_point(class_scope:itemcategory.ItemCategoryListResponse)
  private static final br.com.l4u.itemcategory.ItemCategoryListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.l4u.itemcategory.ItemCategoryListResponse();
  }

  public static br.com.l4u.itemcategory.ItemCategoryListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ItemCategoryListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ItemCategoryListResponse>() {
    @java.lang.Override
    public ItemCategoryListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ItemCategoryListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ItemCategoryListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ItemCategoryListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.l4u.itemcategory.ItemCategoryListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
