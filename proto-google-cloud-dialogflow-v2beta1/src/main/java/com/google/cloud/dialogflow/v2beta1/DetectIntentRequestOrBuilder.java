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
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public interface DetectIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.DetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the session this query is sent to. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
   * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;`. If `Environment ID` is not specified, we assume
   * default 'draft' environment. If `User ID` is not specified, we are using
   * "-". It's up to the API caller to choose an appropriate `Session ID` and
   * `User Id`. They can be a random number or some type of user and session
   * identifiers (preferably hashed). The length of the `Session ID` and
   * `User ID` must not exceed 36 characters.
   * </pre>
   *
   * <code>string session = 1 [(.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The name of the session this query is sent to. Format:
   * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;`, or
   * `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   * ID&gt;/sessions/&lt;Session ID&gt;`. If `Environment ID` is not specified, we assume
   * default 'draft' environment. If `User ID` is not specified, we are using
   * "-". It's up to the API caller to choose an appropriate `Session ID` and
   * `User Id`. They can be a random number or some type of user and session
   * identifiers (preferably hashed). The length of the `Session ID` and
   * `User ID` must not exceed 36 characters.
   * </pre>
   *
   * <code>string session = 1 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  boolean hasQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParameters getQueryParams();
  /**
   *
   *
   * <pre>
   * Optional. The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config
   *     which instructs the speech recognizer how to process the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   */
  boolean hasQueryInput();
  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config
   *     which instructs the speech recognizer how to process the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryInput getQueryInput();
  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   * 1.  an audio config
   *     which instructs the speech recognizer how to process the speech audio,
   * 2.  a conversational query in the form of text, or
   * 3.  an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryInput query_input = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryInputOrBuilder getQueryInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 4;</code>
   */
  boolean hasOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfig getOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Optional. Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The natural language speech audio to be processed. This field
   * should be populated iff `query_input` is set to an input audio config.
   * A single request can contain up to 1 minute of speech audio data.
   * </pre>
   *
   * <code>bytes input_audio = 5;</code>
   */
  com.google.protobuf.ByteString getInputAudio();
}
