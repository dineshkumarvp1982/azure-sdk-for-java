// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ArmIdWrapper;
import com.azure.management.appservice.PrivateLinkConnectionState;
import com.azure.management.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrivateEndpointConnectionResource model. */
@JsonFlatten
@Fluent
public class PrivateEndpointConnectionResourceInner extends ProxyOnlyResource {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * PrivateEndpoint of a remote private endpoint connection
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private ArmIdWrapper privateEndpoint;

    /*
     * The state of a private link connection
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private PrivateLinkConnectionState privateLinkServiceConnectionState;

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @return the privateEndpoint value.
     */
    public ArmIdWrapper privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: PrivateEndpoint of a remote private endpoint connection.
     *
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionResourceInner object itself.
     */
    public PrivateEndpointConnectionResourceInner withPrivateEndpoint(ArmIdWrapper privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    public PrivateLinkConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: The state of a private link connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionResourceInner object itself.
     */
    public PrivateEndpointConnectionResourceInner withPrivateLinkServiceConnectionState(
        PrivateLinkConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }
}
