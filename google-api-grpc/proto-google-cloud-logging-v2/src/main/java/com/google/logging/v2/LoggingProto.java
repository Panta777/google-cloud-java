// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public final class LoggingProto {
  private LoggingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_DeleteLogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_DeleteLogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListLogEntriesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListLogEntriesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListLogsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_logging_v2_ListLogsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_logging_v2_ListLogsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037google/logging/v2/logging.proto\022\021googl" +
      "e.logging.v2\032\034google/api/annotations.pro" +
      "to\032#google/api/monitored_resource.proto\032" +
      "!google/logging/v2/log_entry.proto\032\036goog" +
      "le/protobuf/duration.proto\032\033google/proto" +
      "buf/empty.proto\032\037google/protobuf/timesta" +
      "mp.proto\032\027google/rpc/status.proto\"$\n\020Del" +
      "eteLogRequest\022\020\n\010log_name\030\001 \001(\t\"\251\002\n\026Writ" +
      "eLogEntriesRequest\022\020\n\010log_name\030\001 \001(\t\022/\n\010" +
      "resource\030\002 \001(\0132\035.google.api.MonitoredRes",
      "ource\022E\n\006labels\030\003 \003(\01325.google.logging.v" +
      "2.WriteLogEntriesRequest.LabelsEntry\022,\n\007" +
      "entries\030\004 \003(\0132\033.google.logging.v2.LogEnt" +
      "ry\022\027\n\017partial_success\030\005 \001(\010\022\017\n\007dry_run\030\006" +
      " \001(\010\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001\"\031\n\027WriteLogEntriesResponse\"\310" +
      "\001\n\034WriteLogEntriesPartialErrors\022]\n\020log_e" +
      "ntry_errors\030\001 \003(\0132C.google.logging.v2.Wr" +
      "iteLogEntriesPartialErrors.LogEntryError" +
      "sEntry\032I\n\023LogEntryErrorsEntry\022\013\n\003key\030\001 \001",
      "(\005\022!\n\005value\030\002 \001(\0132\022.google.rpc.Status:\0028" +
      "\001\"\221\001\n\025ListLogEntriesRequest\022\027\n\013project_i" +
      "ds\030\001 \003(\tB\002\030\001\022\026\n\016resource_names\030\010 \003(\t\022\016\n\006" +
      "filter\030\002 \001(\t\022\020\n\010order_by\030\003 \001(\t\022\021\n\tpage_s" +
      "ize\030\004 \001(\005\022\022\n\npage_token\030\005 \001(\t\"_\n\026ListLog" +
      "EntriesResponse\022,\n\007entries\030\001 \003(\0132\033.googl" +
      "e.logging.v2.LogEntry\022\027\n\017next_page_token" +
      "\030\002 \001(\t\"P\n\'ListMonitoredResourceDescripto" +
      "rsRequest\022\021\n\tpage_size\030\001 \001(\005\022\022\n\npage_tok" +
      "en\030\002 \001(\t\"\212\001\n(ListMonitoredResourceDescri",
      "ptorsResponse\022E\n\024resource_descriptors\030\001 " +
      "\003(\0132\'.google.api.MonitoredResourceDescri" +
      "ptor\022\027\n\017next_page_token\030\002 \001(\t\"H\n\017ListLog" +
      "sRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 " +
      "\001(\005\022\022\n\npage_token\030\003 \001(\t\">\n\020ListLogsRespo" +
      "nse\022\021\n\tlog_names\030\003 \003(\t\022\027\n\017next_page_toke" +
      "n\030\002 \001(\t2\330\007\n\020LoggingServiceV2\022\353\001\n\tDeleteL" +
      "og\022#.google.logging.v2.DeleteLogRequest\032" +
      "\026.google.protobuf.Empty\"\240\001\202\323\344\223\002\231\001* /v2/{" +
      "log_name=projects/*/logs/*}Z\'*%/v2/{log_",
      "name=organizations/*/logs/*}Z!*\037/v2/{log" +
      "_name=folders/*/logs/*}Z)*\'/v2/{log_name" +
      "=billingAccounts/*/logs/*}\022\206\001\n\017WriteLogE" +
      "ntries\022).google.logging.v2.WriteLogEntri" +
      "esRequest\032*.google.logging.v2.WriteLogEn" +
      "triesResponse\"\034\202\323\344\223\002\026\"\021/v2/entries:write" +
      ":\001*\022\202\001\n\016ListLogEntries\022(.google.logging." +
      "v2.ListLogEntriesRequest\032).google.loggin" +
      "g.v2.ListLogEntriesResponse\"\033\202\323\344\223\002\025\"\020/v2" +
      "/entries:list:\001*\022\305\001\n ListMonitoredResour",
      "ceDescriptors\022:.google.logging.v2.ListMo" +
      "nitoredResourceDescriptorsRequest\032;.goog" +
      "le.logging.v2.ListMonitoredResourceDescr" +
      "iptorsResponse\"(\202\323\344\223\002\"\022 /v2/monitoredRes" +
      "ourceDescriptors\022\377\001\n\010ListLogs\022\".google.l" +
      "ogging.v2.ListLogsRequest\032#.google.loggi" +
      "ng.v2.ListLogsResponse\"\251\001\202\323\344\223\002\242\001\022\025/v2/{p" +
      "arent=*/*}/logsZ\036\022\034/v2/{parent=projects/" +
      "*}/logsZ#\022!/v2/{parent=organizations/*}/" +
      "logsZ\035\022\033/v2/{parent=folders/*}/logsZ%\022#/",
      "v2/{parent=billingAccounts/*}/logsB\230\001\n\025c" +
      "om.google.logging.v2B\014LoggingProtoP\001Z8go" +
      "ogle.golang.org/genproto/googleapis/logg" +
      "ing/v2;logging\370\001\001\252\002\027Google.Cloud.Logging" +
      ".V2\312\002\027Google\\Cloud\\Logging\\V2b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.MonitoredResourceProto.getDescriptor(),
          com.google.logging.v2.LogEntryProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_logging_v2_DeleteLogRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_logging_v2_DeleteLogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_DeleteLogRequest_descriptor,
        new java.lang.String[] { "LogName", });
    internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_logging_v2_WriteLogEntriesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor,
        new java.lang.String[] { "LogName", "Resource", "Labels", "Entries", "PartialSuccess", "DryRun", });
    internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor =
      internal_static_google_logging_v2_WriteLogEntriesRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_WriteLogEntriesRequest_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_logging_v2_WriteLogEntriesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_WriteLogEntriesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor,
        new java.lang.String[] { "LogEntryErrors", });
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor =
      internal_static_google_logging_v2_WriteLogEntriesPartialErrors_descriptor.getNestedTypes().get(0);
    internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_WriteLogEntriesPartialErrors_LogEntryErrorsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_logging_v2_ListLogEntriesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_logging_v2_ListLogEntriesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListLogEntriesRequest_descriptor,
        new java.lang.String[] { "ProjectIds", "ResourceNames", "Filter", "OrderBy", "PageSize", "PageToken", });
    internal_static_google_logging_v2_ListLogEntriesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_logging_v2_ListLogEntriesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListLogEntriesResponse_descriptor,
        new java.lang.String[] { "Entries", "NextPageToken", });
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListMonitoredResourceDescriptorsRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", });
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListMonitoredResourceDescriptorsResponse_descriptor,
        new java.lang.String[] { "ResourceDescriptors", "NextPageToken", });
    internal_static_google_logging_v2_ListLogsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_logging_v2_ListLogsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListLogsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_logging_v2_ListLogsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_logging_v2_ListLogsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_logging_v2_ListLogsResponse_descriptor,
        new java.lang.String[] { "LogNames", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.logging.v2.LogEntryProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}