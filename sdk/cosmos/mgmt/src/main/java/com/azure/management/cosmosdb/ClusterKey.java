// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ClusterKey model. */
@Fluent
public final class ClusterKey {
    /*
     * Name of the Cosmos DB Cassandra table cluster key
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Order of the Cosmos DB Cassandra table cluster key, only support "Asc"
     * and "Desc"
     */
    @JsonProperty(value = "orderBy")
    private String orderBy;

    /**
     * Get the name property: Name of the Cosmos DB Cassandra table cluster key.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Cosmos DB Cassandra table cluster key.
     *
     * @param name the name value to set.
     * @return the ClusterKey object itself.
     */
    public ClusterKey withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the orderBy property: Order of the Cosmos DB Cassandra table cluster key, only support "Asc" and "Desc".
     *
     * @return the orderBy value.
     */
    public String orderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: Order of the Cosmos DB Cassandra table cluster key, only support "Asc" and "Desc".
     *
     * @param orderBy the orderBy value to set.
     * @return the ClusterKey object itself.
     */
    public ClusterKey withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
}
