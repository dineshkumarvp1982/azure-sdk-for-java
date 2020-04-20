// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OAuth2PermissionGrantListResult model. */
@Fluent
public final class OAuth2PermissionGrantListResultInner {
    /*
     * the list of oauth2 permissions grants
     */
    @JsonProperty(value = "value")
    private List<OAuth2PermissionGrantInner> value;

    /*
     * the URL to get the next set of results.
     */
    @JsonProperty(value = "odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: the list of oauth2 permissions grants.
     *
     * @return the value value.
     */
    public List<OAuth2PermissionGrantInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the list of oauth2 permissions grants.
     *
     * @param value the value value to set.
     * @return the OAuth2PermissionGrantListResultInner object itself.
     */
    public OAuth2PermissionGrantListResultInner withValue(List<OAuth2PermissionGrantInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: the URL to get the next set of results.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: the URL to get the next set of results.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the OAuth2PermissionGrantListResultInner object itself.
     */
    public OAuth2PermissionGrantListResultInner withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }
}
