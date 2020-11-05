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
package org.apache.camel.kafkaconnector.arangodb;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelArangodbSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_ARANGODB_PATH_DATABASE_CONF = "camel.sink.path.database";
    public static final String CAMEL_SINK_ARANGODB_PATH_DATABASE_DOC = "database name";
    public static final String CAMEL_SINK_ARANGODB_PATH_DATABASE_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_DOCUMENT_COLLECTION_CONF = "camel.sink.endpoint.documentCollection";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_DOCUMENT_COLLECTION_DOC = "Collection name, when using ArangoDb as a Document Database. Set the documentCollection name when using the CRUD operation on the document database collections (SAVE_DOCUMENT , FIND_DOCUMENT_BY_KEY, UPDATE_DOCUMENT, DELETE_DOCUMENT).";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_DOCUMENT_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_EDGE_COLLECTION_CONF = "camel.sink.endpoint.edgeCollection";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_EDGE_COLLECTION_DOC = "Collection name of vertices, when using ArangoDb as a Graph Database. Set the edgeCollection name to perform CRUD operation on edges using these operations : SAVE_VERTEX, FIND_VERTEX_BY_KEY, UPDATE_VERTEX, DELETE_VERTEX. The graph attribute is mandatory.";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_EDGE_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_GRAPH_CONF = "camel.sink.endpoint.graph";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_GRAPH_DOC = "Graph name, when using ArangoDb as a Graph Database. Combine this attribute with one of the two attributes vertexCollection and edgeCollection.";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_GRAPH_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_HOST_CONF = "camel.sink.endpoint.host";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_HOST_DOC = "ArangoDB host. If host and port are default, this field is Optional.";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ARANGODB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_OPERATION_DOC = "Operations to perform on ArangoDb. For the operation AQL_QUERY, no need to specify a collection or graph. One of: [SAVE_DOCUMENT] [FIND_DOCUMENT_BY_KEY] [UPDATE_DOCUMENT] [DELETE_DOCUMENT] [AQL_QUERY] [SAVE_VERTEX] [FIND_VERTEX_BY_KEY] [UPDATE_VERTEX] [DELETE_VERTEX] [SAVE_EDGE] [FIND_EDGE_BY_KEY] [UPDATE_EDGE] [DELETE_EDGE]";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_PORT_CONF = "camel.sink.endpoint.port";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_PORT_DOC = "ArangoDB exposed port. If host and port are default, this field is Optional.";
    public static final Integer CAMEL_SINK_ARANGODB_ENDPOINT_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_VERTEX_COLLECTION_CONF = "camel.sink.endpoint.vertexCollection";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_VERTEX_COLLECTION_DOC = "Collection name of vertices, when using ArangoDb as a Graph Database. Set the vertexCollection name to perform CRUD operation on vertices using these operations : SAVE_EDGE, FIND_EDGE_BY_KEY, UPDATE_EDGE, DELETE_EDGE. The graph attribute is mandatory.";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_VERTEX_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_ARANGODB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_ARANGODB_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_PASSWORD_DOC = "ArangoDB password. If user and password are default, this field is Optional.";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_USER_CONF = "camel.sink.endpoint.user";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_USER_DOC = "ArangoDB user. If user and password are default, this field is Optional.";
    public static final String CAMEL_SINK_ARANGODB_ENDPOINT_USER_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_CONFIGURATION_CONF = "camel.component.arangodb.configuration";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_CONFIGURATION_DOC = "Component configuration";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_DOCUMENT_COLLECTION_CONF = "camel.component.arangodb.documentCollection";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_DOCUMENT_COLLECTION_DOC = "Collection name, when using ArangoDb as a Document Database. Set the documentCollection name when using the CRUD operation on the document database collections (SAVE_DOCUMENT , FIND_DOCUMENT_BY_KEY, UPDATE_DOCUMENT, DELETE_DOCUMENT).";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_DOCUMENT_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_EDGE_COLLECTION_CONF = "camel.component.arangodb.edgeCollection";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_EDGE_COLLECTION_DOC = "Collection name of vertices, when using ArangoDb as a Graph Database. Set the edgeCollection name to perform CRUD operation on edges using these operations : SAVE_VERTEX, FIND_VERTEX_BY_KEY, UPDATE_VERTEX, DELETE_VERTEX. The graph attribute is mandatory.";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_EDGE_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_GRAPH_CONF = "camel.component.arangodb.graph";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_GRAPH_DOC = "Graph name, when using ArangoDb as a Graph Database. Combine this attribute with one of the two attributes vertexCollection and edgeCollection.";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_GRAPH_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_HOST_CONF = "camel.component.arangodb.host";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_HOST_DOC = "ArangoDB host. If host and port are default, this field is Optional.";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.arangodb.lazyStartProducer";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_ARANGODB_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_OPERATION_CONF = "camel.component.arangodb.operation";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_OPERATION_DOC = "Operations to perform on ArangoDb. For the operation AQL_QUERY, no need to specify a collection or graph. One of: [SAVE_DOCUMENT] [FIND_DOCUMENT_BY_KEY] [UPDATE_DOCUMENT] [DELETE_DOCUMENT] [AQL_QUERY] [SAVE_VERTEX] [FIND_VERTEX_BY_KEY] [UPDATE_VERTEX] [DELETE_VERTEX] [SAVE_EDGE] [FIND_EDGE_BY_KEY] [UPDATE_EDGE] [DELETE_EDGE]";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_PORT_CONF = "camel.component.arangodb.port";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_PORT_DOC = "ArangoDB exposed port. If host and port are default, this field is Optional.";
    public static final Integer CAMEL_SINK_ARANGODB_COMPONENT_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_VERTEX_COLLECTION_CONF = "camel.component.arangodb.vertexCollection";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_VERTEX_COLLECTION_DOC = "Collection name of vertices, when using ArangoDb as a Graph Database. Set the vertexCollection name to perform CRUD operation on vertices using these operations : SAVE_EDGE, FIND_EDGE_BY_KEY, UPDATE_EDGE, DELETE_EDGE. The graph attribute is mandatory.";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_VERTEX_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.arangodb.basicPropertyBinding";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_ARANGODB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_PASSWORD_CONF = "camel.component.arangodb.password";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_PASSWORD_DOC = "ArangoDB password. If user and password are default, this field is Optional.";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_USER_CONF = "camel.component.arangodb.user";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_USER_DOC = "ArangoDB user. If user and password are default, this field is Optional.";
    public static final String CAMEL_SINK_ARANGODB_COMPONENT_USER_DEFAULT = null;

    public CamelArangodbSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelArangodbSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_ARANGODB_PATH_DATABASE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_PATH_DATABASE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_ARANGODB_PATH_DATABASE_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_DOCUMENT_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_ENDPOINT_DOCUMENT_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_DOCUMENT_COLLECTION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_EDGE_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_ENDPOINT_EDGE_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_EDGE_COLLECTION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_GRAPH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_ENDPOINT_GRAPH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_GRAPH_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_ENDPOINT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_HOST_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ARANGODB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_ARANGODB_ENDPOINT_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_PORT_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_VERTEX_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_ENDPOINT_VERTEX_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_VERTEX_COLLECTION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ARANGODB_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ARANGODB_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_ARANGODB_ENDPOINT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_ENDPOINT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_ENDPOINT_USER_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_DOCUMENT_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_DOCUMENT_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_DOCUMENT_COLLECTION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_EDGE_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_EDGE_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_EDGE_COLLECTION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_GRAPH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_GRAPH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_GRAPH_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_HOST_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ARANGODB_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_ARANGODB_COMPONENT_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_PORT_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_VERTEX_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_VERTEX_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_VERTEX_COLLECTION_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_ARANGODB_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_ARANGODB_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_PASSWORD_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_ARANGODB_COMPONENT_USER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_ARANGODB_COMPONENT_USER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_ARANGODB_COMPONENT_USER_DOC);
        return conf;
    }
}