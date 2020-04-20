/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.network.v2020_03_01.implementation.FlowLogInformationInner;
import com.microsoft.azure.management.network.v2020_03_01.implementation.NetworkWatchersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NetworkWatchers.
 */
public interface NetworkWatchers extends SupportsCreating<NetworkWatcher.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<NetworkWatcher>, SupportsListingByResourceGroup<NetworkWatcher>, SupportsListing<NetworkWatcher>, HasInner<NetworkWatchersInner> {
    /**
     * Gets the current network topology by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the representation of topology.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Topology> getTopologyAsync(String resourceGroupName, String networkWatcherName, TopologyParameters parameters);

    /**
     * Verify IP flow from the specified VM to a location given the currently configured NSG rules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the IP flow to be verified.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VerificationIPFlowResult> verifyIPFlowAsync(String resourceGroupName, String networkWatcherName, VerificationIPFlowParameters parameters);

    /**
     * Gets the next hop from the specified VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters that define the source and destination endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NextHopResult> getNextHopAsync(String resourceGroupName, String networkWatcherName, NextHopParameters parameters);

    /**
     * Gets the configured and effective security group rules on the specified VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param targetResourceId ID of the target VM.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SecurityGroupViewResult> getVMSecurityRulesAsync(String resourceGroupName, String networkWatcherName, String targetResourceId);

    /**
     * Initiate troubleshooting on a specified resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define the resource to troubleshoot.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TroubleshootingResult> getTroubleshootingAsync(String resourceGroupName, String networkWatcherName, TroubleshootingParameters parameters);

    /**
     * Get the last completed troubleshooting result on a specified resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param targetResourceId The target resource ID to query the troubleshooting result.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TroubleshootingResult> getTroubleshootingResultAsync(String resourceGroupName, String networkWatcherName, String targetResourceId);

    /**
     * Configures flow log and traffic analytics (optional) on a specified resource.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that define the configuration of flow log.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FlowLogInformation> setFlowLogConfigurationAsync(String resourceGroupName, String networkWatcherName, FlowLogInformationInner parameters);

    /**
     * Queries status of flow log and traffic analytics (optional) on a specified resource.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param targetResourceId The target resource where getting the flow log and traffic analytics (optional) status.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FlowLogInformation> getFlowLogStatusAsync(String resourceGroupName, String networkWatcherName, String targetResourceId);

    /**
     * Verifies the possibility of establishing a direct TCP connection from a virtual machine to a given endpoint including another VM or an arbitrary remote server.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that determine how the connectivity check will be performed.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ConnectivityInformation> checkConnectivityAsync(String resourceGroupName, String networkWatcherName, ConnectivityParameters parameters);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Gets the relative latency score for internet service providers from a specified location to Azure regions.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that determine Azure reachability report configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AzureReachabilityReport> getAzureReachabilityReportAsync(String resourceGroupName, String networkWatcherName, AzureReachabilityReportParameters parameters);

    /**
     * NOTE: This feature is currently in preview and still being tested for stability. Lists all available internet service providers for a specified Azure region.
     *
     * @param resourceGroupName The name of the network watcher resource group.
     * @param networkWatcherName The name of the network watcher resource.
     * @param parameters Parameters that scope the list of available providers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AvailableProvidersList> listAvailableProvidersAsync(String resourceGroupName, String networkWatcherName, AvailableProvidersListParameters parameters);

    /**
     * Gets Network Configuration Diagnostic data to help customers understand and debug network behavior. It provides detailed information on what security rules were applied to a specified traffic flow and the result of evaluating these rules. Customers must provide details of a flow like source, destination, protocol, etc. The API returns whether traffic was allowed or denied, the rules evaluated for the specified flow and the evaluation results.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param parameters Parameters to get network configuration diagnostic.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkConfigurationDiagnosticResponse> getNetworkConfigurationDiagnosticAsync(String resourceGroupName, String networkWatcherName, NetworkConfigurationDiagnosticParameters parameters);

}
