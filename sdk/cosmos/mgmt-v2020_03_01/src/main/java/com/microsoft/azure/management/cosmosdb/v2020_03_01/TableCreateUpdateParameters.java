/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation.TableResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters to create and update Cosmos DB Table.
 */
@JsonFlatten
public class TableCreateUpdateParameters extends ARMResourceProperties {
    /**
     * The standard JSON format of a Table.
     */
    @JsonProperty(value = "properties.resource", required = true)
    private TableResourceInner resource;

    /**
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options", required = true)
    private CreateUpdateOptions options;

    /**
     * Get the standard JSON format of a Table.
     *
     * @return the resource value
     */
    public TableResourceInner resource() {
        return this.resource;
    }

    /**
     * Set the standard JSON format of a Table.
     *
     * @param resource the resource value to set
     * @return the TableCreateUpdateParameters object itself.
     */
    public TableCreateUpdateParameters withResource(TableResourceInner resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get a key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     *
     * @return the options value
     */
    public CreateUpdateOptions options() {
        return this.options;
    }

    /**
     * Set a key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     *
     * @param options the options value to set
     * @return the TableCreateUpdateParameters object itself.
     */
    public TableCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        this.options = options;
        return this;
    }

}
