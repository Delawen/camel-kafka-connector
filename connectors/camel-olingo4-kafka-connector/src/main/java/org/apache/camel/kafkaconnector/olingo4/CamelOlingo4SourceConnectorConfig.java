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
package org.apache.camel.kafkaconnector.olingo4;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelOlingo4SourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_OLINGO4_PATH_API_NAME_CONF = "camel.source.path.apiName";
    public static final String CAMEL_SOURCE_OLINGO4_PATH_API_NAME_DOC = "What kind of operation to perform One of: [DEFAULT]";
    public static final String CAMEL_SOURCE_OLINGO4_PATH_API_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_PATH_METHOD_NAME_CONF = "camel.source.path.methodName";
    public static final String CAMEL_SOURCE_OLINGO4_PATH_METHOD_NAME_DOC = "What sub operation to use for the selected operation";
    public static final String CAMEL_SOURCE_OLINGO4_PATH_METHOD_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_CONNECT_TIMEOUT_CONF = "camel.source.endpoint.connectTimeout";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_CONNECT_TIMEOUT_DOC = "HTTP connection creation timeout in milliseconds, defaults to 30,000 (30 seconds)";
    public static final Integer CAMEL_SOURCE_OLINGO4_ENDPOINT_CONNECT_TIMEOUT_DEFAULT = 30000;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_CONTENT_TYPE_CONF = "camel.source.endpoint.contentType";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_CONTENT_TYPE_DOC = "Content-Type header value can be used to specify JSON or XML message format, defaults to application/json;charset=utf-8";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_CONTENT_TYPE_DEFAULT = "application/json;charset=utf-8";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_FILTER_ALREADY_SEEN_CONF = "camel.source.endpoint.filterAlreadySeen";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_FILTER_ALREADY_SEEN_DOC = "Set this to true to filter out results that have already been communicated by this component.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_FILTER_ALREADY_SEEN_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_HEADERS_CONF = "camel.source.endpoint.httpHeaders";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_HEADERS_DOC = "Custom HTTP headers to inject into every request, this could include OAuth tokens, etc.";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_HEADERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_IN_BODY_CONF = "camel.source.endpoint.inBody";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_IN_BODY_DOC = "Sets the name of a parameter to be passed in the exchange In Body";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_IN_BODY_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_PROXY_CONF = "camel.source.endpoint.proxy";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_PROXY_DOC = "HTTP proxy server configuration";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_PROXY_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SERVICE_URI_CONF = "camel.source.endpoint.serviceUri";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SERVICE_URI_DOC = "Target OData service base URI, e.g. http://services.odata.org/OData/OData.svc";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SERVICE_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SOCKET_TIMEOUT_CONF = "camel.source.endpoint.socketTimeout";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SOCKET_TIMEOUT_DOC = "HTTP request timeout in milliseconds, defaults to 30,000 (30 seconds)";
    public static final Integer CAMEL_SOURCE_OLINGO4_ENDPOINT_SOCKET_TIMEOUT_DEFAULT = 30000;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SPLIT_RESULT_CONF = "camel.source.endpoint.splitResult";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SPLIT_RESULT_DOC = "For endpoints that return an array or collection, a consumer endpoint will map every element to distinct messages, unless splitResult is set to false.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_SPLIT_RESULT_DEFAULT = true;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_ASYNC_CLIENT_BUILDER_CONF = "camel.source.endpoint.httpAsyncClientBuilder";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_ASYNC_CLIENT_BUILDER_DOC = "Custom HTTP async client builder for more complex HTTP client configuration, overrides connectionTimeout, socketTimeout, proxy and sslContext. Note that a socketTimeout MUST be specified in the builder, otherwise OData requests could block indefinitely";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_ASYNC_CLIENT_BUILDER_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_CLIENT_BUILDER_CONF = "camel.source.endpoint.httpClientBuilder";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_CLIENT_BUILDER_DOC = "Custom HTTP client builder for more complex HTTP client configuration, overrides connectionTimeout, socketTimeout, proxy and sslContext. Note that a socketTimeout MUST be specified in the builder, otherwise OData requests could block indefinitely";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_CLIENT_BUILDER_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll.";
    public static final Long CAMEL_SOURCE_OLINGO4_ENDPOINT_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts.";
    public static final Long CAMEL_SOURCE_OLINGO4_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_OLINGO4_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component. Use value spring or quartz for built in scheduler";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF = "camel.source.endpoint.sslContextParameters";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SOURCE_OLINGO4_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_CONFIGURATION_CONF = "camel.component.olingo4.configuration";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_CONFIGURATION_DOC = "To use the shared configuration";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_CONNECT_TIMEOUT_CONF = "camel.component.olingo4.connectTimeout";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_CONNECT_TIMEOUT_DOC = "HTTP connection creation timeout in milliseconds, defaults to 30,000 (30 seconds)";
    public static final Integer CAMEL_SOURCE_OLINGO4_COMPONENT_CONNECT_TIMEOUT_DEFAULT = 30000;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_CONTENT_TYPE_CONF = "camel.component.olingo4.contentType";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_CONTENT_TYPE_DOC = "Content-Type header value can be used to specify JSON or XML message format, defaults to application/json;charset=utf-8";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_CONTENT_TYPE_DEFAULT = "application/json;charset=utf-8";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_FILTER_ALREADY_SEEN_CONF = "camel.component.olingo4.filterAlreadySeen";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_FILTER_ALREADY_SEEN_DOC = "Set this to true to filter out results that have already been communicated by this component.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_COMPONENT_FILTER_ALREADY_SEEN_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_HEADERS_CONF = "camel.component.olingo4.httpHeaders";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_HEADERS_DOC = "Custom HTTP headers to inject into every request, this could include OAuth tokens, etc.";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_HEADERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_PROXY_CONF = "camel.component.olingo4.proxy";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_PROXY_DOC = "HTTP proxy server configuration";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_PROXY_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SERVICE_URI_CONF = "camel.component.olingo4.serviceUri";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SERVICE_URI_DOC = "Target OData service base URI, e.g. http://services.odata.org/OData/OData.svc";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SERVICE_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SOCKET_TIMEOUT_CONF = "camel.component.olingo4.socketTimeout";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SOCKET_TIMEOUT_DOC = "HTTP request timeout in milliseconds, defaults to 30,000 (30 seconds)";
    public static final Integer CAMEL_SOURCE_OLINGO4_COMPONENT_SOCKET_TIMEOUT_DEFAULT = 30000;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.olingo4.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SPLIT_RESULT_CONF = "camel.component.olingo4.splitResult";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SPLIT_RESULT_DOC = "For endpoints that return an array or collection, a consumer endpoint will map every element to distinct messages, unless splitResult is set to false.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_COMPONENT_SPLIT_RESULT_DEFAULT = true;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.olingo4.basicPropertyBinding";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_OLINGO4_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_ASYNC_CLIENT_BUILDER_CONF = "camel.component.olingo4.httpAsyncClientBuilder";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_ASYNC_CLIENT_BUILDER_DOC = "Custom HTTP async client builder for more complex HTTP client configuration, overrides connectionTimeout, socketTimeout, proxy and sslContext. Note that a socketTimeout MUST be specified in the builder, otherwise OData requests could block indefinitely";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_ASYNC_CLIENT_BUILDER_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_CLIENT_BUILDER_CONF = "camel.component.olingo4.httpClientBuilder";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_CLIENT_BUILDER_DOC = "Custom HTTP client builder for more complex HTTP client configuration, overrides connectionTimeout, socketTimeout, proxy and sslContext. Note that a socketTimeout MUST be specified in the builder, otherwise OData requests could block indefinitely";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_CLIENT_BUILDER_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.olingo4.sslContextParameters";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC = "To configure security using SSLContextParameters";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT = null;
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF = "camel.component.olingo4.useGlobalSslContextParameters";
    public static final String CAMEL_SOURCE_OLINGO4_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC = "Enable usage of global SSL context parameters.";
    public static final Boolean CAMEL_SOURCE_OLINGO4_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT = false;

    public CamelOlingo4SourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelOlingo4SourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_OLINGO4_PATH_API_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_PATH_API_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_OLINGO4_PATH_API_NAME_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_PATH_METHOD_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_PATH_METHOD_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_OLINGO4_PATH_METHOD_NAME_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_CONNECT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_OLINGO4_ENDPOINT_CONNECT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_CONNECT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_CONTENT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_CONTENT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_CONTENT_TYPE_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_FILTER_ALREADY_SEEN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_FILTER_ALREADY_SEEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_FILTER_ALREADY_SEEN_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_HEADERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_IN_BODY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_IN_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_IN_BODY_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_PROXY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_PROXY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_PROXY_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SERVICE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_SERVICE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SERVICE_URI_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SOCKET_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_OLINGO4_ENDPOINT_SOCKET_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SOCKET_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SPLIT_RESULT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_SPLIT_RESULT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SPLIT_RESULT_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_ASYNC_CLIENT_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_ASYNC_CLIENT_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_ASYNC_CLIENT_BUILDER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_CLIENT_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_CLIENT_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_HTTP_CLIENT_BUILDER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_OLINGO4_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_OLINGO4_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_OLINGO4_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_ENDPOINT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_ENDPOINT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_ENDPOINT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_CONNECT_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_OLINGO4_COMPONENT_CONNECT_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_CONNECT_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_CONTENT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_COMPONENT_CONTENT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_CONTENT_TYPE_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_FILTER_ALREADY_SEEN_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_COMPONENT_FILTER_ALREADY_SEEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_FILTER_ALREADY_SEEN_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_HEADERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_HEADERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_HEADERS_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_PROXY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_COMPONENT_PROXY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_PROXY_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_SERVICE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_COMPONENT_SERVICE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_SERVICE_URI_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_SOCKET_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_OLINGO4_COMPONENT_SOCKET_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_SOCKET_TIMEOUT_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_SPLIT_RESULT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_COMPONENT_SPLIT_RESULT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_SPLIT_RESULT_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_ASYNC_CLIENT_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_ASYNC_CLIENT_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_ASYNC_CLIENT_BUILDER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_CLIENT_BUILDER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_CLIENT_BUILDER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_HTTP_CLIENT_BUILDER_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_OLINGO4_COMPONENT_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_SSL_CONTEXT_PARAMETERS_DOC);
        conf.define(CAMEL_SOURCE_OLINGO4_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_OLINGO4_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_OLINGO4_COMPONENT_USE_GLOBAL_SSL_CONTEXT_PARAMETERS_DOC);
        return conf;
    }
}