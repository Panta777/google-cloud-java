// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1alpha/finding.proto

package com.google.cloud.websecurityscanner.v1alpha;

public interface FindingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1alpha.Finding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only.
   * The resource name of the Finding. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanruns/{scanRunId}/findings/{findingId}'.
   * The finding IDs are generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only.
   * The resource name of the Finding. The name follows the format of
   * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanruns/{scanRunId}/findings/{findingId}'.
   * The finding IDs are generated by the system.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only.
   * The type of the Finding.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 2;</code>
   */
  int getFindingTypeValue();
  /**
   * <pre>
   * Output only.
   * The type of the Finding.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Finding.FindingType finding_type = 2;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.Finding.FindingType getFindingType();

  /**
   * <pre>
   * Output only.
   * The http method of the request that triggered the vulnerability, in
   * uppercase.
   * </pre>
   *
   * <code>string http_method = 3;</code>
   */
  java.lang.String getHttpMethod();
  /**
   * <pre>
   * Output only.
   * The http method of the request that triggered the vulnerability, in
   * uppercase.
   * </pre>
   *
   * <code>string http_method = 3;</code>
   */
  com.google.protobuf.ByteString
      getHttpMethodBytes();

  /**
   * <pre>
   * Output only.
   * The URL produced by the server-side fuzzer and used in the request that
   * triggered the vulnerability.
   * </pre>
   *
   * <code>string fuzzed_url = 4;</code>
   */
  java.lang.String getFuzzedUrl();
  /**
   * <pre>
   * Output only.
   * The URL produced by the server-side fuzzer and used in the request that
   * triggered the vulnerability.
   * </pre>
   *
   * <code>string fuzzed_url = 4;</code>
   */
  com.google.protobuf.ByteString
      getFuzzedUrlBytes();

  /**
   * <pre>
   * Output only.
   * The body of the request that triggered the vulnerability.
   * </pre>
   *
   * <code>string body = 5;</code>
   */
  java.lang.String getBody();
  /**
   * <pre>
   * Output only.
   * The body of the request that triggered the vulnerability.
   * </pre>
   *
   * <code>string body = 5;</code>
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * Output only.
   * The description of the vulnerability.
   * </pre>
   *
   * <code>string description = 6;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Output only.
   * The description of the vulnerability.
   * </pre>
   *
   * <code>string description = 6;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only.
   * The URL containing human-readable payload that user can leverage to
   * reproduce the vulnerability.
   * </pre>
   *
   * <code>string reproduction_url = 7;</code>
   */
  java.lang.String getReproductionUrl();
  /**
   * <pre>
   * Output only.
   * The URL containing human-readable payload that user can leverage to
   * reproduce the vulnerability.
   * </pre>
   *
   * <code>string reproduction_url = 7;</code>
   */
  com.google.protobuf.ByteString
      getReproductionUrlBytes();

  /**
   * <pre>
   * Output only.
   * If the vulnerability was originated from nested IFrame, the immediate
   * parent IFrame is reported.
   * </pre>
   *
   * <code>string frame_url = 8;</code>
   */
  java.lang.String getFrameUrl();
  /**
   * <pre>
   * Output only.
   * If the vulnerability was originated from nested IFrame, the immediate
   * parent IFrame is reported.
   * </pre>
   *
   * <code>string frame_url = 8;</code>
   */
  com.google.protobuf.ByteString
      getFrameUrlBytes();

  /**
   * <pre>
   * Output only.
   * The URL where the browser lands when the vulnerability is detected.
   * </pre>
   *
   * <code>string final_url = 9;</code>
   */
  java.lang.String getFinalUrl();
  /**
   * <pre>
   * Output only.
   * The URL where the browser lands when the vulnerability is detected.
   * </pre>
   *
   * <code>string final_url = 9;</code>
   */
  com.google.protobuf.ByteString
      getFinalUrlBytes();

  /**
   * <pre>
   * Output only.
   * The tracking ID uniquely identifies a vulnerability instance across
   * multiple ScanRuns.
   * </pre>
   *
   * <code>string tracking_id = 10;</code>
   */
  java.lang.String getTrackingId();
  /**
   * <pre>
   * Output only.
   * The tracking ID uniquely identifies a vulnerability instance across
   * multiple ScanRuns.
   * </pre>
   *
   * <code>string tracking_id = 10;</code>
   */
  com.google.protobuf.ByteString
      getTrackingIdBytes();

  /**
   * <pre>
   * Output only.
   * An addon containing information about outdated libraries.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary outdated_library = 11;</code>
   */
  boolean hasOutdatedLibrary();
  /**
   * <pre>
   * Output only.
   * An addon containing information about outdated libraries.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary outdated_library = 11;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary getOutdatedLibrary();
  /**
   * <pre>
   * Output only.
   * An addon containing information about outdated libraries.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.OutdatedLibrary outdated_library = 11;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.OutdatedLibraryOrBuilder getOutdatedLibraryOrBuilder();

  /**
   * <pre>
   * Output only.
   * An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ViolatingResource violating_resource = 12;</code>
   */
  boolean hasViolatingResource();
  /**
   * <pre>
   * Output only.
   * An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ViolatingResource violating_resource = 12;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ViolatingResource getViolatingResource();
  /**
   * <pre>
   * Output only.
   * An addon containing detailed information regarding any resource causing the
   * vulnerability such as JavaScript sources, image, audio files, etc.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.ViolatingResource violating_resource = 12;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.ViolatingResourceOrBuilder getViolatingResourceOrBuilder();

  /**
   * <pre>
   * Output only.
   * An addon containing information about request parameters which were found
   * to be vulnerable.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableParameters vulnerable_parameters = 13;</code>
   */
  boolean hasVulnerableParameters();
  /**
   * <pre>
   * Output only.
   * An addon containing information about request parameters which were found
   * to be vulnerable.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableParameters vulnerable_parameters = 13;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableParameters getVulnerableParameters();
  /**
   * <pre>
   * Output only.
   * An addon containing information about request parameters which were found
   * to be vulnerable.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.VulnerableParameters vulnerable_parameters = 13;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.VulnerableParametersOrBuilder getVulnerableParametersOrBuilder();

  /**
   * <pre>
   * Output only.
   * An addon containing information reported for an XSS, if any.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Xss xss = 14;</code>
   */
  boolean hasXss();
  /**
   * <pre>
   * Output only.
   * An addon containing information reported for an XSS, if any.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Xss xss = 14;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.Xss getXss();
  /**
   * <pre>
   * Output only.
   * An addon containing information reported for an XSS, if any.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1alpha.Xss xss = 14;</code>
   */
  com.google.cloud.websecurityscanner.v1alpha.XssOrBuilder getXssOrBuilder();
}
