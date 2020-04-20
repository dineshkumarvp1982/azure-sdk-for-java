/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.MongoDBCollectionGetPropertiesResource;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.MongoDBCollectionGetPropertiesOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.ARMResourceProperties;

/**
 * An Azure Cosmos DB MongoDB collection.
 */
@JsonFlatten
public class MongoDBCollectionGetResultsInner extends ARMResourceProperties {
    /**
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private MongoDBCollectionGetPropertiesResource resource;

    /**
     * The options property.
     */
    @JsonProperty(value = "properties.options")
    private MongoDBCollectionGetPropertiesOptions options;

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public MongoDBCollectionGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withResource(MongoDBCollectionGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options value.
     *
     * @return the options value
     */
    public MongoDBCollectionGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options value.
     *
     * @param options the options value to set
     * @return the MongoDBCollectionGetResultsInner object itself.
     */
    public MongoDBCollectionGetResultsInner withOptions(MongoDBCollectionGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

}
