/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: local_file_meta.proto

package com.alipay.sofa.jraft.entity;

public final class LocalFileMetaOutter {
  private LocalFileMetaOutter() {
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  /**
   * Protobuf enum {@code jraft.FileSource}
   */
  public enum FileSource implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FILE_SOURCE_LOCAL = 0;</code>
     */
    FILE_SOURCE_LOCAL(0),
    /**
     * <code>FILE_SOURCE_REFERENCE = 1;</code>
     */
    FILE_SOURCE_REFERENCE(1), ;

    /**
     * <code>FILE_SOURCE_LOCAL = 0;</code>
     */
    public static final int FILE_SOURCE_LOCAL_VALUE     = 0;
    /**
     * <code>FILE_SOURCE_REFERENCE = 1;</code>
     */
    public static final int FILE_SOURCE_REFERENCE_VALUE = 1;

    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FileSource valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FileSource forNumber(int value) {
      switch (value) {
        case 0:
          return FILE_SOURCE_LOCAL;
        case 1:
          return FILE_SOURCE_REFERENCE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FileSource> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<FileSource> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<FileSource>() {
      public FileSource findValueByNumber(int number) {
        return FileSource
                .forNumber(number);
      }
    };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.alipay.sofa.jraft.entity.LocalFileMetaOutter.getDescriptor().getEnumTypes().get(0);
    }

    private static final FileSource[] VALUES = values();

    public static FileSource valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FileSource(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:jraft.FileSource)
  }

  public interface LocalFileMetaOrBuilder extends
          // @@protoc_insertion_point(interface_extends:jraft.LocalFileMeta)
          com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes user_meta = 1;</code>
     * @return Whether the userMeta field is set.
     */
    boolean hasUserMeta();

    /**
     * <code>optional bytes user_meta = 1;</code>
     * @return The userMeta.
     */
    com.google.protobuf.ByteString getUserMeta();

    /**
     * <code>optional .jraft.FileSource source = 2;</code>
     * @return Whether the source field is set.
     */
    boolean hasSource();

    /**
     * <code>optional .jraft.FileSource source = 2;</code>
     * @return The source.
     */
    com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource getSource();

    /**
     * <code>optional string checksum = 3;</code>
     * @return Whether the checksum field is set.
     */
    boolean hasChecksum();

    /**
     * <code>optional string checksum = 3;</code>
     * @return The checksum.
     */
    java.lang.String getChecksum();

    /**
     * <code>optional string checksum = 3;</code>
     * @return The bytes for checksum.
     */
    com.google.protobuf.ByteString getChecksumBytes();
  }

  /**
   * Protobuf type {@code jraft.LocalFileMeta}
   */
  public static final class LocalFileMeta extends com.google.protobuf.GeneratedMessageV3 implements
          // @@protoc_insertion_point(message_implements:jraft.LocalFileMeta)
          LocalFileMetaOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use LocalFileMeta.newBuilder() to construct.
    private LocalFileMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private LocalFileMeta() {
      userMeta_ = com.google.protobuf.ByteString.EMPTY;
      source_ = 0;
      checksum_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private LocalFileMeta(com.google.protobuf.CodedInputStream input,
                          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields = com.google.protobuf.UnknownFieldSet
              .newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              bitField0_ |= 0x00000001;
              userMeta_ = input.readBytes();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
              com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource value = com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource
                      .valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                source_ = rawValue;
              }
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              checksum_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.alipay.sofa.jraft.entity.LocalFileMetaOutter.internal_static_jraft_LocalFileMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.alipay.sofa.jraft.entity.LocalFileMetaOutter.internal_static_jraft_LocalFileMeta_fieldAccessorTable
              .ensureFieldAccessorsInitialized(com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta.class,
                      com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta.Builder.class);
    }

    private int                            bitField0_;
    public static final int                USER_META_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString userMeta_;

    /**
     * <code>optional bytes user_meta = 1;</code>
     * @return Whether the userMeta field is set.
     */
    @java.lang.Override
    public boolean hasUserMeta() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional bytes user_meta = 1;</code>
     * @return The userMeta.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUserMeta() {
      return userMeta_;
    }

    public static final int SOURCE_FIELD_NUMBER = 2;
    private int             source_;

    /**
     * <code>optional .jraft.FileSource source = 2;</code>
     * @return Whether the source field is set.
     */
    @java.lang.Override
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional .jraft.FileSource source = 2;</code>
     * @return The source.
     */
    @java.lang.Override
    public com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource getSource() {
      @SuppressWarnings("deprecation")
      com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource result = com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource
              .valueOf(source_);
      return result == null ? com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource.FILE_SOURCE_LOCAL
              : result;
    }

    public static final int           CHECKSUM_FIELD_NUMBER = 3;
    private volatile java.lang.Object checksum_;

    /**
     * <code>optional string checksum = 3;</code>
     * @return Whether the checksum field is set.
     */
    @java.lang.Override
    public boolean hasChecksum() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional string checksum = 3;</code>
     * @return The checksum.
     */
    @java.lang.Override
    public java.lang.String getChecksum() {
      java.lang.Object ref = checksum_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          checksum_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string checksum = 3;</code>
     * @return The bytes for checksum.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getChecksumBytes() {
      java.lang.Object ref = checksum_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        checksum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBytes(1, userMeta_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeEnum(2, source_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, checksum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, userMeta_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, source_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, checksum_);
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
      if (!(obj instanceof com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta)) {
        return super.equals(obj);
      }
      com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta other = (com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta) obj;

      if (hasUserMeta() != other.hasUserMeta())
        return false;
      if (hasUserMeta()) {
        if (!getUserMeta().equals(other.getUserMeta()))
          return false;
      }
      if (hasSource() != other.hasSource())
        return false;
      if (hasSource()) {
        if (source_ != other.source_)
          return false;
      }
      if (hasChecksum() != other.hasChecksum())
        return false;
      if (hasChecksum()) {
        if (!getChecksum().equals(other.getChecksum()))
          return false;
      }
      if (!unknownFields.equals(other.unknownFields))
        return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasUserMeta()) {
        hash = (37 * hash) + USER_META_FIELD_NUMBER;
        hash = (53 * hash) + getUserMeta().hashCode();
      }
      if (hasSource()) {
        hash = (37 * hash) + SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + source_;
      }
      if (hasChecksum()) {
        hash = (37 * hash) + CHECKSUM_FIELD_NUMBER;
        hash = (53 * hash) + getChecksum().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(java.nio.ByteBuffer data,
                                                                                           com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(com.google.protobuf.ByteString data,
                                                                                           com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(byte[] data,
                                                                                           com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(java.io.InputStream input,
                                                                                           com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseDelimitedFrom(java.io.InputStream input,
                                                                                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
              extensionRegistry);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parseFrom(com.google.protobuf.CodedInputStream input,
                                                                                           com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code jraft.LocalFileMeta}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:jraft.LocalFileMeta)
            com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMetaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.alipay.sofa.jraft.entity.LocalFileMetaOutter.internal_static_jraft_LocalFileMeta_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.alipay.sofa.jraft.entity.LocalFileMetaOutter.internal_static_jraft_LocalFileMeta_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta.class,
                        com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta.Builder.class);
      }

      // Construct using com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        userMeta_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        source_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        checksum_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.alipay.sofa.jraft.entity.LocalFileMetaOutter.internal_static_jraft_LocalFileMeta_descriptor;
      }

      @java.lang.Override
      public com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta getDefaultInstanceForType() {
        return com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta.getDefaultInstance();
      }

      @java.lang.Override
      public com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta build() {
        com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta buildPartial() {
        com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta result = new com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta(
                this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userMeta_ = userMeta_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.source_ = source_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.checksum_ = checksum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }

      @java.lang.Override
      public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                                      java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
                                      java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta) {
          return mergeFrom((com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta other) {
        if (other == com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta.getDefaultInstance())
          return this;
        if (other.hasUserMeta()) {
          setUserMeta(other.getUserMeta());
        }
        if (other.hasSource()) {
          setSource(other.getSource());
        }
        if (other.hasChecksum()) {
          bitField0_ |= 0x00000004;
          checksum_ = other.checksum_;
          onChanged();
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
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                               com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws java.io.IOException {
        com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta) e
                  .getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int                            bitField0_;

      private com.google.protobuf.ByteString userMeta_ = com.google.protobuf.ByteString.EMPTY;

      /**
       * <code>optional bytes user_meta = 1;</code>
       * @return Whether the userMeta field is set.
       */
      @java.lang.Override
      public boolean hasUserMeta() {
        return ((bitField0_ & 0x00000001) != 0);
      }

      /**
       * <code>optional bytes user_meta = 1;</code>
       * @return The userMeta.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getUserMeta() {
        return userMeta_;
      }

      /**
       * <code>optional bytes user_meta = 1;</code>
       * @param value The userMeta to set.
       * @return This builder for chaining.
       */
      public Builder setUserMeta(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        userMeta_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bytes user_meta = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUserMeta() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userMeta_ = getDefaultInstance().getUserMeta();
        onChanged();
        return this;
      }

      private int source_ = 0;

      /**
       * <code>optional .jraft.FileSource source = 2;</code>
       * @return Whether the source field is set.
       */
      @java.lang.Override
      public boolean hasSource() {
        return ((bitField0_ & 0x00000002) != 0);
      }

      /**
       * <code>optional .jraft.FileSource source = 2;</code>
       * @return The source.
       */
      @java.lang.Override
      public com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource getSource() {
        @SuppressWarnings("deprecation")
        com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource result = com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource
                .valueOf(source_);
        return result == null ? com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource.FILE_SOURCE_LOCAL
                : result;
      }

      /**
       * <code>optional .jraft.FileSource source = 2;</code>
       * @param value The source to set.
       * @return This builder for chaining.
       */
      public Builder setSource(com.alipay.sofa.jraft.entity.LocalFileMetaOutter.FileSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        source_ = value.getNumber();
        onChanged();
        return this;
      }

      /**
       * <code>optional .jraft.FileSource source = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSource() {
        bitField0_ = (bitField0_ & ~0x00000002);
        source_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object checksum_ = "";

      /**
       * <code>optional string checksum = 3;</code>
       * @return Whether the checksum field is set.
       */
      public boolean hasChecksum() {
        return ((bitField0_ & 0x00000004) != 0);
      }

      /**
       * <code>optional string checksum = 3;</code>
       * @return The checksum.
       */
      public java.lang.String getChecksum() {
        java.lang.Object ref = checksum_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            checksum_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string checksum = 3;</code>
       * @return The bytes for checksum.
       */
      public com.google.protobuf.ByteString getChecksumBytes() {
        java.lang.Object ref = checksum_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = com.google.protobuf.ByteString
                  .copyFromUtf8((java.lang.String) ref);
          checksum_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string checksum = 3;</code>
       * @param value The checksum to set.
       * @return This builder for chaining.
       */
      public Builder setChecksum(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        checksum_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string checksum = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearChecksum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        checksum_ = getDefaultInstance().getChecksum();
        onChanged();
        return this;
      }

      /**
       * <code>optional string checksum = 3;</code>
       * @param value The bytes for checksum to set.
       * @return This builder for chaining.
       */
      public Builder setChecksumBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        checksum_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:jraft.LocalFileMeta)
    }

    // @@protoc_insertion_point(class_scope:jraft.LocalFileMeta)
    private static final com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta();
    }

    public static com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<LocalFileMeta> PARSER = new com.google.protobuf.AbstractParser<LocalFileMeta>() {
      @java.lang.Override
      public LocalFileMeta parsePartialFrom(com.google.protobuf.CodedInputStream input,
                                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
        return new LocalFileMeta(input,
                extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LocalFileMeta> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LocalFileMeta> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.alipay.sofa.jraft.entity.LocalFileMetaOutter.LocalFileMeta getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor                internal_static_jraft_LocalFileMeta_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_jraft_LocalFileMeta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
  static {
    java.lang.String[] descriptorData = { "\n\025local_file_meta.proto\022\005jraft\"W\n\rLocalF"
            + "ileMeta\022\021\n\tuser_meta\030\001 \001(\014\022!\n\006source\030\002 \001"
            + "(\0162\021.jraft.FileSource\022\020\n\010checksum\030\003 \001(\t*"
            + ">\n\nFileSource\022\025\n\021FILE_SOURCE_LOCAL\020\000\022\031\n\025"
            + "FILE_SOURCE_REFERENCE\020\001B3\n\034com.alipay.so"
            + "fa.jraft.entityB\023LocalFileMetaOutter" };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
      public com.google.protobuf.ExtensionRegistry assignDescriptors(com.google.protobuf.Descriptors.FileDescriptor root) {
        descriptor = root;
        return null;
      }
    };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_jraft_LocalFileMeta_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_jraft_LocalFileMeta_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_jraft_LocalFileMeta_descriptor,
            new java.lang.String[] { "UserMeta", "Source", "Checksum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
