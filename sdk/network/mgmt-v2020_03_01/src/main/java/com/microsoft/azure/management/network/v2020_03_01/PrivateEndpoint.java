/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_03_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.implementation.SubnetInner;
import com.microsoft.azure.management.network.v2020_03_01.implementation.PrivateEndpointInner;

/**
 * Type representing PrivateEndpoint.
 */
public interface PrivateEndpoint extends HasInner<PrivateEndpointInner>, Resource, GroupableResourceCore<NetworkManager, PrivateEndpointInner>, HasResourceGroup, Refreshable<PrivateEndpoint>, Updatable<PrivateEndpoint.Update>, HasManager<NetworkManager> {
    /**
     * @return the customDnsConfigs value.
     */
    List<CustomDnsConfigPropertiesFormat> customDnsConfigs();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the manualPrivateLinkServiceConnections value.
     */
    List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections();

    /**
     * @return the networkInterfaces value.
     */
    List<NetworkInterface> networkInterfaces();

    /**
     * @return the privateLinkServiceConnections value.
     */
    List<PrivateLinkServiceConnection> privateLinkServiceConnections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * The entirety of the PrivateEndpoint definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateEndpoint definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateEndpoint definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PrivateEndpoint definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the privateendpoint definition allowing to specify CustomDnsConfigs.
         */
        interface WithCustomDnsConfigs {
            /**
             * Specifies customDnsConfigs.
             * @param customDnsConfigs An array of custom dns configurations
             * @return the next definition stage
             */
            WithCreate withCustomDnsConfigs(List<CustomDnsConfigPropertiesFormat> customDnsConfigs);
        }

        /**
         * The stage of the privateendpoint definition allowing to specify ManualPrivateLinkServiceConnections.
         */
        interface WithManualPrivateLinkServiceConnections {
            /**
             * Specifies manualPrivateLinkServiceConnections.
             * @param manualPrivateLinkServiceConnections A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource
             * @return the next definition stage
             */
            WithCreate withManualPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections);
        }

        /**
         * The stage of the privateendpoint definition allowing to specify PrivateLinkServiceConnections.
         */
        interface WithPrivateLinkServiceConnections {
            /**
             * Specifies privateLinkServiceConnections.
             * @param privateLinkServiceConnections A grouping of information about the connection to the remote resource
             * @return the next definition stage
             */
            WithCreate withPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> privateLinkServiceConnections);
        }

        /**
         * The stage of the privateendpoint definition allowing to specify Subnet.
         */
        interface WithSubnet {
            /**
             * Specifies subnet.
             * @param subnet The ID of the subnet from which the private IP will be allocated
             * @return the next definition stage
             */
            WithCreate withSubnet(SubnetInner subnet);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PrivateEndpoint>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCustomDnsConfigs, DefinitionStages.WithManualPrivateLinkServiceConnections, DefinitionStages.WithPrivateLinkServiceConnections, DefinitionStages.WithSubnet {
        }
    }
    /**
     * The template for a PrivateEndpoint update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateEndpoint>, Resource.UpdateWithTags<Update>, UpdateStages.WithCustomDnsConfigs, UpdateStages.WithManualPrivateLinkServiceConnections, UpdateStages.WithPrivateLinkServiceConnections, UpdateStages.WithSubnet {
    }

    /**
     * Grouping of PrivateEndpoint update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privateendpoint update allowing to specify CustomDnsConfigs.
         */
        interface WithCustomDnsConfigs {
            /**
             * Specifies customDnsConfigs.
             * @param customDnsConfigs An array of custom dns configurations
             * @return the next update stage
             */
            Update withCustomDnsConfigs(List<CustomDnsConfigPropertiesFormat> customDnsConfigs);
        }

        /**
         * The stage of the privateendpoint update allowing to specify ManualPrivateLinkServiceConnections.
         */
        interface WithManualPrivateLinkServiceConnections {
            /**
             * Specifies manualPrivateLinkServiceConnections.
             * @param manualPrivateLinkServiceConnections A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource
             * @return the next update stage
             */
            Update withManualPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections);
        }

        /**
         * The stage of the privateendpoint update allowing to specify PrivateLinkServiceConnections.
         */
        interface WithPrivateLinkServiceConnections {
            /**
             * Specifies privateLinkServiceConnections.
             * @param privateLinkServiceConnections A grouping of information about the connection to the remote resource
             * @return the next update stage
             */
            Update withPrivateLinkServiceConnections(List<PrivateLinkServiceConnection> privateLinkServiceConnections);
        }

        /**
         * The stage of the privateendpoint update allowing to specify Subnet.
         */
        interface WithSubnet {
            /**
             * Specifies subnet.
             * @param subnet The ID of the subnet from which the private IP will be allocated
             * @return the next update stage
             */
            Update withSubnet(SubnetInner subnet);
        }

    }
}
