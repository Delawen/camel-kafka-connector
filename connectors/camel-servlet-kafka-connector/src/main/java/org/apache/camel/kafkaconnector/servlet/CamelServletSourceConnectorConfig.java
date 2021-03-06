/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.servlet;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelServletSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_SERVLET_PATH_CONTEXT_PATH_CONF = "camel.source.path.contextPath";
    public static final String CAMEL_SOURCE_SERVLET_PATH_CONTEXT_PATH_DOC = "The context-path to use";
    public static final String CAMEL_SOURCE_SERVLET_PATH_CONTEXT_PATH_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_CHUNKED_CONF = "camel.source.endpoint.chunked";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_CHUNKED_DOC = "If this option is false the Servlet will disable the HTTP streaming and set the content-length header on the response";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_CHUNKED_DEFAULT = true;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_DISABLE_STREAM_CACHE_CONF = "camel.source.endpoint.disableStreamCache";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_DISABLE_STREAM_CACHE_DOC = "Determines whether or not the raw input stream from Servlet is cached or not (Camel will read the stream into a in memory/overflow to file, Stream caching) cache. By default Camel will cache the Servlet input stream to support reading it multiple times to ensure it Camel can retrieve all data from the stream. However you can set this option to true when you for example need to access the raw stream, such as streaming it directly to a file or other persistent store. DefaultHttpBinding will copy the request input stream into a stream cache and put it into message body if this option is false to support reading the stream multiple times. If you use Servlet to bridge/proxy an endpoint then consider enabling this option to improve performance, in case you do not need to read the message payload multiple times. The http producer will by default cache the response body stream. If setting this option to true, then the producers will not cache the response body stream but use the response stream as-is as the message body.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_DISABLE_STREAM_CACHE_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HEADER_FILTER_STRATEGY_CONF = "camel.source.endpoint.headerFilterStrategy";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HEADER_FILTER_STRATEGY_DOC = "To use a custom HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_BINDING_CONF = "camel.source.endpoint.httpBinding";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_BINDING_DOC = "To use a custom HttpBinding to control the mapping between Camel message and HttpClient.";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_BINDING_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_ASYNC_CONF = "camel.source.endpoint.async";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_ASYNC_DOC = "Configure the consumer to work in async mode";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_ASYNC_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_METHOD_RESTRICT_CONF = "camel.source.endpoint.httpMethodRestrict";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_METHOD_RESTRICT_DOC = "Used to only allow consuming if the HttpMethod matches, such as GET/POST/PUT etc. Multiple methods can be specified separated by comma.";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_METHOD_RESTRICT_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MATCH_ON_URI_PREFIX_CONF = "camel.source.endpoint.matchOnUriPrefix";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MATCH_ON_URI_PREFIX_DOC = "Whether or not the consumer should try to find a target consumer by matching the URI prefix if no exact match is found.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_MATCH_ON_URI_PREFIX_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MUTE_EXCEPTION_CONF = "camel.source.endpoint.muteException";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MUTE_EXCEPTION_DOC = "If enabled and an Exchange failed processing on the consumer side the response's body won't contain the exception's stack trace.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_MUTE_EXCEPTION_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_RESPONSE_BUFFER_SIZE_CONF = "camel.source.endpoint.responseBufferSize";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_RESPONSE_BUFFER_SIZE_DOC = "To use a custom buffer size on the javax.servlet.ServletResponse.";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_RESPONSE_BUFFER_SIZE_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_SERVLET_NAME_CONF = "camel.source.endpoint.servletName";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_SERVLET_NAME_DOC = "Name of the servlet to use";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_SERVLET_NAME_DEFAULT = "CamelServlet";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_TRANSFER_EXCEPTION_CONF = "camel.source.endpoint.transferException";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_TRANSFER_EXCEPTION_DOC = "If enabled and an Exchange failed processing on the consumer side, and if the caused Exception was send back serialized in the response as a application/x-java-serialized-object content type. On the producer side the exception will be deserialized and thrown as is, instead of the HttpOperationFailedException. The caused exception is required to be serialized. This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_ATTACHMENT_MULTIPART_BINDING_CONF = "camel.source.endpoint.attachmentMultipartBinding";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_ATTACHMENT_MULTIPART_BINDING_DOC = "Whether to automatic bind multipart/form-data as attachments on the Camel Exchange. The options attachmentMultipartBinding=true and disableStreamCache=false cannot work together. Remove disableStreamCache to use AttachmentMultipartBinding. This is turn off by default as this may require servlet specific configuration to enable this when using Servlet's.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_ATTACHMENT_MULTIPART_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_EAGER_CHECK_CONTENT_AVAILABLE_CONF = "camel.source.endpoint.eagerCheckContentAvailable";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_EAGER_CHECK_CONTENT_AVAILABLE_DOC = "Whether to eager check whether the HTTP requests has content if the content-length header is 0 or not present. This can be turned on in case HTTP clients do not send streamed data.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_EAGER_CHECK_CONTENT_AVAILABLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_FILE_NAME_EXT_WHITELIST_CONF = "camel.source.endpoint.fileNameExtWhitelist";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_FILE_NAME_EXT_WHITELIST_DOC = "Whitelist of accepted filename extensions for accepting uploaded files. Multiple extensions can be separated by comma, such as txt,xml.";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_FILE_NAME_EXT_WHITELIST_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_OPTIONS_ENABLED_CONF = "camel.source.endpoint.optionsEnabled";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_OPTIONS_ENABLED_DOC = "Specifies whether to enable HTTP OPTIONS for this Servlet consumer. By default OPTIONS is turned off.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_OPTIONS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_TRACE_ENABLED_CONF = "camel.source.endpoint.traceEnabled";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_TRACE_ENABLED_DOC = "Specifies whether to enable HTTP TRACE for this Servlet consumer. By default TRACE is turned off.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_TRACE_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_CONF = "camel.source.endpoint.mapHttpMessageBody";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_DOC = "If this option is true then IN exchange Body of the exchange will be mapped to HTTP body. Setting this to false will avoid the HTTP mapping.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_CONF = "camel.source.endpoint.mapHttpMessageFormUrlEncodedBody";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_DOC = "If this option is true then IN exchange Form Encoded body of the exchange will be mapped to HTTP. Setting this to false will avoid the HTTP Form Encoded body mapping.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_CONF = "camel.source.endpoint.mapHttpMessageHeaders";
    public static final String CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_DOC = "If this option is true then IN exchange Headers of the exchange will be mapped to HTTP headers. Setting this to false will avoid the HTTP Headers mapping.";
    public static final Boolean CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_DEFAULT = true;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.servlet.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_SERVLET_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_SERVLET_NAME_CONF = "camel.component.servlet.servletName";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_SERVLET_NAME_DOC = "Default name of servlet to use. The default name is CamelServlet.";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_SERVLET_NAME_DEFAULT = "CamelServlet";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_ATTACHMENT_MULTIPART_BINDING_CONF = "camel.component.servlet.attachmentMultipartBinding";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_ATTACHMENT_MULTIPART_BINDING_DOC = "Whether to automatic bind multipart/form-data as attachments on the Camel Exchange. The options attachmentMultipartBinding=true and disableStreamCache=false cannot work together. Remove disableStreamCache to use AttachmentMultipartBinding. This is turn off by default as this may require servlet specific configuration to enable this when using Servlet's.";
    public static final Boolean CAMEL_SOURCE_SERVLET_COMPONENT_ATTACHMENT_MULTIPART_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_FILE_NAME_EXT_WHITELIST_CONF = "camel.component.servlet.fileNameExtWhitelist";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_FILE_NAME_EXT_WHITELIST_DOC = "Whitelist of accepted filename extensions for accepting uploaded files. Multiple extensions can be separated by comma, such as txt,xml.";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_FILE_NAME_EXT_WHITELIST_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_REGISTRY_CONF = "camel.component.servlet.httpRegistry";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_REGISTRY_DOC = "To use a custom org.apache.camel.component.servlet.HttpRegistry.";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_REGISTRY_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_CONF = "camel.component.servlet.allowJavaSerializedObject";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DOC = "Whether to allow java serialization when a request uses context-type=application/x-java-serialized-object. This is by default turned off. If you enable this then be aware that Java will deserialize the incoming data from the request to Java and that can be a potential security risk.";
    public static final Boolean CAMEL_SOURCE_SERVLET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DEFAULT = false;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.servlet.autowiredEnabled";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SOURCE_SERVLET_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_BINDING_CONF = "camel.component.servlet.httpBinding";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_BINDING_DOC = "To use a custom HttpBinding to control the mapping between Camel message and HttpClient.";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_BINDING_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_CONFIGURATION_CONF = "camel.component.servlet.httpConfiguration";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_CONFIGURATION_DOC = "To use the shared HttpConfiguration as base configuration.";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HEADER_FILTER_STRATEGY_CONF = "camel.component.servlet.headerFilterStrategy";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HEADER_FILTER_STRATEGY_DOC = "To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter header to and from Camel message.";
    public static final String CAMEL_SOURCE_SERVLET_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT = null;

    public CamelServletSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelServletSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_SERVLET_PATH_CONTEXT_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_PATH_CONTEXT_PATH_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_SERVLET_PATH_CONTEXT_PATH_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_CHUNKED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_CHUNKED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_CHUNKED_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_DISABLE_STREAM_CACHE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_DISABLE_STREAM_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_DISABLE_STREAM_CACHE_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_ENDPOINT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_HEADER_FILTER_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_BINDING_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_ASYNC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_ASYNC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_ASYNC_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_METHOD_RESTRICT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_METHOD_RESTRICT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_HTTP_METHOD_RESTRICT_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_MATCH_ON_URI_PREFIX_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_MATCH_ON_URI_PREFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_MATCH_ON_URI_PREFIX_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_MUTE_EXCEPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_MUTE_EXCEPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_MUTE_EXCEPTION_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_RESPONSE_BUFFER_SIZE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_ENDPOINT_RESPONSE_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_RESPONSE_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_SERVLET_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_ENDPOINT_SERVLET_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_SERVLET_NAME_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_TRANSFER_EXCEPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_TRANSFER_EXCEPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_TRANSFER_EXCEPTION_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_ATTACHMENT_MULTIPART_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_ATTACHMENT_MULTIPART_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_ATTACHMENT_MULTIPART_BINDING_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_EAGER_CHECK_CONTENT_AVAILABLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_EAGER_CHECK_CONTENT_AVAILABLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_EAGER_CHECK_CONTENT_AVAILABLE_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_FILE_NAME_EXT_WHITELIST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_ENDPOINT_FILE_NAME_EXT_WHITELIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_FILE_NAME_EXT_WHITELIST_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_OPTIONS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_OPTIONS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_OPTIONS_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_TRACE_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_TRACE_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_TRACE_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_BODY_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_FORM_URL_ENCODED_BODY_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_ENDPOINT_MAP_HTTP_MESSAGE_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_SERVLET_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_COMPONENT_SERVLET_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_SERVLET_NAME_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_ATTACHMENT_MULTIPART_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_COMPONENT_ATTACHMENT_MULTIPART_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_ATTACHMENT_MULTIPART_BINDING_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_FILE_NAME_EXT_WHITELIST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_COMPONENT_FILE_NAME_EXT_WHITELIST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_FILE_NAME_EXT_WHITELIST_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_REGISTRY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_REGISTRY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_REGISTRY_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_ALLOW_JAVA_SERIALIZED_OBJECT_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_SERVLET_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_BINDING_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_BINDING_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_HTTP_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_SERVLET_COMPONENT_HEADER_FILTER_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_SERVLET_COMPONENT_HEADER_FILTER_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_SERVLET_COMPONENT_HEADER_FILTER_STRATEGY_DOC);
        return conf;
    }
}