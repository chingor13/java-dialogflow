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
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

public interface DocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The document resource name.
   * The name must be empty when creating a document.
   * Format: `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base
   * ID&gt;/documents/&lt;Document ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The document resource name.
   * The name must be empty when creating a document.
   * Format: `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base
   * ID&gt;/documents/&lt;Document ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the document. The name must be 1024 bytes or
   * less; otherwise, the creation request fails.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the document. The name must be 1024 bytes or
   * less; otherwise, the creation request fails.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The MIME type of this document.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Required. The MIME type of this document.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Document.KnowledgeType>
      getKnowledgeTypesList();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4;
   * </code>
   */
  int getKnowledgeTypesCount();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.Document.KnowledgeType getKnowledgeTypes(int index);
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4;
   * </code>
   */
  java.util.List<java.lang.Integer> getKnowledgeTypesValueList();
  /**
   *
   *
   * <pre>
   * Required. The knowledge type of document content.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Document.KnowledgeType knowledge_types = 4;
   * </code>
   */
  int getKnowledgeTypesValue(int index);

  /**
   *
   *
   * <pre>
   * The URI where the file content is located.
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * NOTE: External URLs must correspond to public webpages, i.e., they must
   * be indexed by Google Search. In particular, URLs for showing documents in
   * Google Cloud Storage (i.e. the URL in your browser) are not supported.
   * Instead use the `gs://` format URI described above.
   * </pre>
   *
   * <code>string content_uri = 5;</code>
   */
  java.lang.String getContentUri();
  /**
   *
   *
   * <pre>
   * The URI where the file content is located.
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * NOTE: External URLs must correspond to public webpages, i.e., they must
   * be indexed by Google Search. In particular, URLs for showing documents in
   * Google Cloud Storage (i.e. the URL in your browser) are not supported.
   * Instead use the `gs://` format URI described above.
   * </pre>
   *
   * <code>string content_uri = 5;</code>
   */
  com.google.protobuf.ByteString getContentUriBytes();

  /**
   *
   *
   * <pre>
   * The raw content of the document. This field is only permitted for
   * EXTRACTIVE_QA and FAQ knowledge types.
   * Note: This field is in the process of being deprecated, please use
   * raw_content instead.
   * </pre>
   *
   * <code>string content = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The raw content of the document. This field is only permitted for
   * EXTRACTIVE_QA and FAQ knowledge types.
   * Note: This field is in the process of being deprecated, please use
   * raw_content instead.
   * </pre>
   *
   * <code>string content = 6 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * The raw content of the document. This field is only permitted for
   * EXTRACTIVE_QA and FAQ knowledge types.
   * </pre>
   *
   * <code>bytes raw_content = 9;</code>
   */
  com.google.protobuf.ByteString getRawContent();

  public com.google.cloud.dialogflow.v2beta1.Document.SourceCase getSourceCase();
}
