// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RunCommandInputParameter model. */
@Fluent
public final class RunCommandInputParameter {
    /*
     * The run command parameter name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The run command parameter value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name property: The run command parameter name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The run command parameter name.
     *
     * @param name the name value to set.
     * @return the RunCommandInputParameter object itself.
     */
    public RunCommandInputParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The run command parameter value.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The run command parameter value.
     *
     * @param value the value value to set.
     * @return the RunCommandInputParameter object itself.
     */
    public RunCommandInputParameter withValue(String value) {
        this.value = value;
        return this;
    }
}
