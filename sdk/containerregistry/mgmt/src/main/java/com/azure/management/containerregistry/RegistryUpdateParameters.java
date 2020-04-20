// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The RegistryUpdateParameters model. */
@JsonFlatten
@Fluent
public class RegistryUpdateParameters {
    /*
     * The tags for the container registry.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The SKU of the container registry.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The value that indicates whether the admin user is enabled.
     */
    @JsonProperty(value = "properties.adminUserEnabled")
    private Boolean adminUserEnabled;

    /*
     * The parameters of a storage account for the container registry. Only
     * applicable to Classic SKU. If specified, the storage account must be in
     * the same physical location as the container registry.
     */
    @JsonProperty(value = "properties.storageAccount")
    private StorageAccountProperties storageAccount;

    /*
     * The network rule set for a container registry.
     */
    @JsonProperty(value = "properties.networkRuleSet")
    private NetworkRuleSet networkRuleSet;

    /**
     * Get the tags property: The tags for the container registry.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags for the container registry.
     *
     * @param tags the tags value to set.
     * @return the RegistryUpdateParameters object itself.
     */
    public RegistryUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The SKU of the container registry.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the container registry.
     *
     * @param sku the sku value to set.
     * @return the RegistryUpdateParameters object itself.
     */
    public RegistryUpdateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the adminUserEnabled property: The value that indicates whether the admin user is enabled.
     *
     * @return the adminUserEnabled value.
     */
    public Boolean adminUserEnabled() {
        return this.adminUserEnabled;
    }

    /**
     * Set the adminUserEnabled property: The value that indicates whether the admin user is enabled.
     *
     * @param adminUserEnabled the adminUserEnabled value to set.
     * @return the RegistryUpdateParameters object itself.
     */
    public RegistryUpdateParameters withAdminUserEnabled(Boolean adminUserEnabled) {
        this.adminUserEnabled = adminUserEnabled;
        return this;
    }

    /**
     * Get the storageAccount property: The parameters of a storage account for the container registry. Only applicable
     * to Classic SKU. If specified, the storage account must be in the same physical location as the container
     * registry.
     *
     * @return the storageAccount value.
     */
    public StorageAccountProperties storageAccount() {
        return this.storageAccount;
    }

    /**
     * Set the storageAccount property: The parameters of a storage account for the container registry. Only applicable
     * to Classic SKU. If specified, the storage account must be in the same physical location as the container
     * registry.
     *
     * @param storageAccount the storageAccount value to set.
     * @return the RegistryUpdateParameters object itself.
     */
    public RegistryUpdateParameters withStorageAccount(StorageAccountProperties storageAccount) {
        this.storageAccount = storageAccount;
        return this;
    }

    /**
     * Get the networkRuleSet property: The network rule set for a container registry.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.networkRuleSet;
    }

    /**
     * Set the networkRuleSet property: The network rule set for a container registry.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the RegistryUpdateParameters object itself.
     */
    public RegistryUpdateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        this.networkRuleSet = networkRuleSet;
        return this;
    }
}
