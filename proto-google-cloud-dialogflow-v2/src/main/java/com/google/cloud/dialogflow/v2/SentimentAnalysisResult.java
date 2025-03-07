/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The result of sentiment analysis as configured by
 * `sentiment_analysis_request_config`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.SentimentAnalysisResult}
 */
public final class SentimentAnalysisResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.SentimentAnalysisResult)
    SentimentAnalysisResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SentimentAnalysisResult.newBuilder() to construct.
  private SentimentAnalysisResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SentimentAnalysisResult() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SentimentAnalysisResult(
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
          case 10:
            {
              com.google.cloud.dialogflow.v2.Sentiment.Builder subBuilder = null;
              if (queryTextSentiment_ != null) {
                subBuilder = queryTextSentiment_.toBuilder();
              }
              queryTextSentiment_ =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2.Sentiment.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(queryTextSentiment_);
                queryTextSentiment_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
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
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.SessionProto
        .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.SentimentAnalysisResult.class,
            com.google.cloud.dialogflow.v2.SentimentAnalysisResult.Builder.class);
  }

  public static final int QUERY_TEXT_SENTIMENT_FIELD_NUMBER = 1;
  private com.google.cloud.dialogflow.v2.Sentiment queryTextSentiment_;
  /**
   *
   *
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
   */
  public boolean hasQueryTextSentiment() {
    return queryTextSentiment_ != null;
  }
  /**
   *
   *
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
   */
  public com.google.cloud.dialogflow.v2.Sentiment getQueryTextSentiment() {
    return queryTextSentiment_ == null
        ? com.google.cloud.dialogflow.v2.Sentiment.getDefaultInstance()
        : queryTextSentiment_;
  }
  /**
   *
   *
   * <pre>
   * The sentiment analysis result for `query_text`.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
   */
  public com.google.cloud.dialogflow.v2.SentimentOrBuilder getQueryTextSentimentOrBuilder() {
    return getQueryTextSentiment();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (queryTextSentiment_ != null) {
      output.writeMessage(1, getQueryTextSentiment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (queryTextSentiment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getQueryTextSentiment());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.SentimentAnalysisResult)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.SentimentAnalysisResult other =
        (com.google.cloud.dialogflow.v2.SentimentAnalysisResult) obj;

    if (hasQueryTextSentiment() != other.hasQueryTextSentiment()) return false;
    if (hasQueryTextSentiment()) {
      if (!getQueryTextSentiment().equals(other.getQueryTextSentiment())) return false;
    }
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
    if (hasQueryTextSentiment()) {
      hash = (37 * hash) + QUERY_TEXT_SENTIMENT_FIELD_NUMBER;
      hash = (53 * hash) + getQueryTextSentiment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.dialogflow.v2.SentimentAnalysisResult prototype) {
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
   *
   *
   * <pre>
   * The result of sentiment analysis as configured by
   * `sentiment_analysis_request_config`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.SentimentAnalysisResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.SentimentAnalysisResult)
      com.google.cloud.dialogflow.v2.SentimentAnalysisResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.SentimentAnalysisResult.class,
              com.google.cloud.dialogflow.v2.SentimentAnalysisResult.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.SentimentAnalysisResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (queryTextSentimentBuilder_ == null) {
        queryTextSentiment_ = null;
      } else {
        queryTextSentiment_ = null;
        queryTextSentimentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.SessionProto
          .internal_static_google_cloud_dialogflow_v2_SentimentAnalysisResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SentimentAnalysisResult getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.SentimentAnalysisResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SentimentAnalysisResult build() {
      com.google.cloud.dialogflow.v2.SentimentAnalysisResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.SentimentAnalysisResult buildPartial() {
      com.google.cloud.dialogflow.v2.SentimentAnalysisResult result =
          new com.google.cloud.dialogflow.v2.SentimentAnalysisResult(this);
      if (queryTextSentimentBuilder_ == null) {
        result.queryTextSentiment_ = queryTextSentiment_;
      } else {
        result.queryTextSentiment_ = queryTextSentimentBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
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
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.SentimentAnalysisResult) {
        return mergeFrom((com.google.cloud.dialogflow.v2.SentimentAnalysisResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.SentimentAnalysisResult other) {
      if (other == com.google.cloud.dialogflow.v2.SentimentAnalysisResult.getDefaultInstance())
        return this;
      if (other.hasQueryTextSentiment()) {
        mergeQueryTextSentiment(other.getQueryTextSentiment());
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
      com.google.cloud.dialogflow.v2.SentimentAnalysisResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.SentimentAnalysisResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.dialogflow.v2.Sentiment queryTextSentiment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Sentiment,
            com.google.cloud.dialogflow.v2.Sentiment.Builder,
            com.google.cloud.dialogflow.v2.SentimentOrBuilder>
        queryTextSentimentBuilder_;
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    public boolean hasQueryTextSentiment() {
      return queryTextSentimentBuilder_ != null || queryTextSentiment_ != null;
    }
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Sentiment getQueryTextSentiment() {
      if (queryTextSentimentBuilder_ == null) {
        return queryTextSentiment_ == null
            ? com.google.cloud.dialogflow.v2.Sentiment.getDefaultInstance()
            : queryTextSentiment_;
      } else {
        return queryTextSentimentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    public Builder setQueryTextSentiment(com.google.cloud.dialogflow.v2.Sentiment value) {
      if (queryTextSentimentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queryTextSentiment_ = value;
        onChanged();
      } else {
        queryTextSentimentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    public Builder setQueryTextSentiment(
        com.google.cloud.dialogflow.v2.Sentiment.Builder builderForValue) {
      if (queryTextSentimentBuilder_ == null) {
        queryTextSentiment_ = builderForValue.build();
        onChanged();
      } else {
        queryTextSentimentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    public Builder mergeQueryTextSentiment(com.google.cloud.dialogflow.v2.Sentiment value) {
      if (queryTextSentimentBuilder_ == null) {
        if (queryTextSentiment_ != null) {
          queryTextSentiment_ =
              com.google.cloud.dialogflow.v2.Sentiment.newBuilder(queryTextSentiment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          queryTextSentiment_ = value;
        }
        onChanged();
      } else {
        queryTextSentimentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    public Builder clearQueryTextSentiment() {
      if (queryTextSentimentBuilder_ == null) {
        queryTextSentiment_ = null;
        onChanged();
      } else {
        queryTextSentiment_ = null;
        queryTextSentimentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.Sentiment.Builder getQueryTextSentimentBuilder() {

      onChanged();
      return getQueryTextSentimentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.SentimentOrBuilder getQueryTextSentimentOrBuilder() {
      if (queryTextSentimentBuilder_ != null) {
        return queryTextSentimentBuilder_.getMessageOrBuilder();
      } else {
        return queryTextSentiment_ == null
            ? com.google.cloud.dialogflow.v2.Sentiment.getDefaultInstance()
            : queryTextSentiment_;
      }
    }
    /**
     *
     *
     * <pre>
     * The sentiment analysis result for `query_text`.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2.Sentiment query_text_sentiment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.Sentiment,
            com.google.cloud.dialogflow.v2.Sentiment.Builder,
            com.google.cloud.dialogflow.v2.SentimentOrBuilder>
        getQueryTextSentimentFieldBuilder() {
      if (queryTextSentimentBuilder_ == null) {
        queryTextSentimentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.Sentiment,
                com.google.cloud.dialogflow.v2.Sentiment.Builder,
                com.google.cloud.dialogflow.v2.SentimentOrBuilder>(
                getQueryTextSentiment(), getParentForChildren(), isClean());
        queryTextSentiment_ = null;
      }
      return queryTextSentimentBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.SentimentAnalysisResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.SentimentAnalysisResult)
  private static final com.google.cloud.dialogflow.v2.SentimentAnalysisResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.SentimentAnalysisResult();
  }

  public static com.google.cloud.dialogflow.v2.SentimentAnalysisResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SentimentAnalysisResult> PARSER =
      new com.google.protobuf.AbstractParser<SentimentAnalysisResult>() {
        @java.lang.Override
        public SentimentAnalysisResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SentimentAnalysisResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SentimentAnalysisResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SentimentAnalysisResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.SentimentAnalysisResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
