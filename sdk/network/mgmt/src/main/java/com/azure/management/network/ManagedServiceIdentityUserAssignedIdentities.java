// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedServiceIdentityUserAssignedIdentities model. */
@Immutable
public final class ManagedServiceIdentityUserAssignedIdentities {
    /*
     * The principal id of user assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The client id of user assigned identity.
     */
    @JsonProperty(value = "clientId", access = JsonProperty.Access.WRITE_ONLY)
    private String clientId;

    /**
     * Get the principalId property: The principal id of user assigned identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the clientId property: The client id of user assigned identity.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }
}
