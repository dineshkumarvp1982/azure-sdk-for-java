// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.appservice.CloningInfo;
import com.azure.management.appservice.HostNameSslState;
import com.azure.management.appservice.HostingEnvironmentProfile;
import com.azure.management.appservice.ManagedServiceIdentity;
import com.azure.management.appservice.RedundancyMode;
import com.azure.management.appservice.SiteAvailabilityState;
import com.azure.management.appservice.SlotSwapStatus;
import com.azure.management.appservice.UsageState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** The Site model. */
@JsonFlatten
@Fluent
public class SiteInner extends Resource {
    /*
     * Managed service identity.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * Current state of the app.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * Hostnames associated with the app.
     */
    @JsonProperty(value = "properties.hostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostNames;

    /*
     * Name of the repository site.
     */
    @JsonProperty(value = "properties.repositorySiteName", access = JsonProperty.Access.WRITE_ONLY)
    private String repositorySiteName;

    /*
     * State indicating whether the app has exceeded its quota usage.
     * Read-only.
     */
    @JsonProperty(value = "properties.usageState", access = JsonProperty.Access.WRITE_ONLY)
    private UsageState usageState;

    /*
     * <code>true</code> if the app is enabled; otherwise, <code>false</code>.
     * Setting this value to false disables the app (takes the app offline).
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /*
     * Enabled hostnames for the app.Hostnames need to be assigned (see
     * HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     */
    @JsonProperty(value = "properties.enabledHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> enabledHostNames;

    /*
     * Management information availability state for the app.
     */
    @JsonProperty(value = "properties.availabilityState", access = JsonProperty.Access.WRITE_ONLY)
    private SiteAvailabilityState availabilityState;

    /*
     * Hostname SSL states are used to manage the SSL bindings for app's
     * hostnames.
     */
    @JsonProperty(value = "properties.hostNameSslStates")
    private List<HostNameSslState> hostNameSslStates;

    /*
     * Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /*
     * <code>true</code> if reserved; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "properties.reserved")
    private Boolean reserved;

    /*
     * Obsolete: Hyper-V sandbox.
     */
    @JsonProperty(value = "properties.isXenon")
    private Boolean isXenon;

    /*
     * Hyper-V sandbox.
     */
    @JsonProperty(value = "properties.hyperV")
    private Boolean hyperV;

    /*
     * Last time the app was modified, in UTC. Read-only.
     */
    @JsonProperty(value = "properties.lastModifiedTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTimeUtc;

    /*
     * Configuration of the app.
     */
    @JsonProperty(value = "properties.siteConfig")
    private SiteConfigInner siteConfig;

    /*
     * Azure Traffic Manager hostnames associated with the app. Read-only.
     */
    @JsonProperty(value = "properties.trafficManagerHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> trafficManagerHostNames;

    /*
     * <code>true</code> to stop SCM (KUDU) site when the app is stopped;
     * otherwise, <code>false</code>. The default is <code>false</code>.
     */
    @JsonProperty(value = "properties.scmSiteAlsoStopped")
    private Boolean scmSiteAlsoStopped;

    /*
     * Specifies which deployment slot this app will swap into. Read-only.
     */
    @JsonProperty(value = "properties.targetSwapSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String targetSwapSlot;

    /*
     * App Service Environment to use for the app.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /*
     * <code>true</code> to enable client affinity; <code>false</code> to stop
     * sending session affinity cookies, which route client requests in the
     * same session to the same instance. Default is <code>true</code>.
     */
    @JsonProperty(value = "properties.clientAffinityEnabled")
    private Boolean clientAffinityEnabled;

    /*
     * <code>true</code> to enable client certificate authentication (TLS
     * mutual authentication); otherwise, <code>false</code>. Default is
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.clientCertEnabled")
    private Boolean clientCertEnabled;

    /*
     * client certificate authentication comma-separated exclusion paths
     */
    @JsonProperty(value = "properties.clientCertExclusionPaths")
    private String clientCertExclusionPaths;

    /*
     * <code>true</code> to disable the public hostnames of the app; otherwise,
     * <code>false</code>.
     * If <code>true</code>, the app is only accessible via API management
     * process.
     */
    @JsonProperty(value = "properties.hostNamesDisabled")
    private Boolean hostNamesDisabled;

    /*
     * List of IP addresses that the app uses for outbound connections (e.g.
     * database access). Includes VIPs from tenants that site can be hosted
     * with current settings. Read-only.
     */
    @JsonProperty(value = "properties.outboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private String outboundIpAddresses;

    /*
     * List of IP addresses that the app uses for outbound connections (e.g.
     * database access). Includes VIPs from all tenants except dataComponent.
     * Read-only.
     */
    @JsonProperty(value = "properties.possibleOutboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private String possibleOutboundIpAddresses;

    /*
     * Size of the function container.
     */
    @JsonProperty(value = "properties.containerSize")
    private Integer containerSize;

    /*
     * Maximum allowed daily memory-time quota (applicable on dynamic apps
     * only).
     */
    @JsonProperty(value = "properties.dailyMemoryTimeQuota")
    private Integer dailyMemoryTimeQuota;

    /*
     * App suspended till in case memory-time quota is exceeded.
     */
    @JsonProperty(value = "properties.suspendedTill", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime suspendedTill;

    /*
     * Maximum number of workers.
     * This only applies to Functions container.
     */
    @JsonProperty(value = "properties.maxNumberOfWorkers", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxNumberOfWorkers;

    /*
     * If specified during app creation, the app is cloned from a source app.
     */
    @JsonProperty(value = "properties.cloningInfo")
    private CloningInfo cloningInfo;

    /*
     * Name of the resource group the app belongs to. Read-only.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * <code>true</code> if the app is a default container; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "properties.isDefaultContainer", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefaultContainer;

    /*
     * Default hostname of the app. Read-only.
     */
    @JsonProperty(value = "properties.defaultHostName", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultHostName;

    /*
     * Status of the last deployment slot swap operation.
     */
    @JsonProperty(value = "properties.slotSwapStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SlotSwapStatus slotSwapStatus;

    /*
     * HttpsOnly: configures a web site to accept only https requests. Issues
     * redirect for
     * http requests
     */
    @JsonProperty(value = "properties.httpsOnly")
    private Boolean httpsOnly;

    /*
     * Site redundancy mode
     */
    @JsonProperty(value = "properties.redundancyMode")
    private RedundancyMode redundancyMode;

    /*
     * Specifies an operation id if this site has a pending operation.
     */
    @JsonProperty(value = "properties.inProgressOperationId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID inProgressOperationId;

    /*
     * Kind of resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Get the identity property: Managed service identity.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity.
     *
     * @param identity the identity value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the state property: Current state of the app.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the hostNames property: Hostnames associated with the app.
     *
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Get the repositorySiteName property: Name of the repository site.
     *
     * @return the repositorySiteName value.
     */
    public String repositorySiteName() {
        return this.repositorySiteName;
    }

    /**
     * Get the usageState property: State indicating whether the app has exceeded its quota usage. Read-only.
     *
     * @return the usageState value.
     */
    public UsageState usageState() {
        return this.usageState;
    }

    /**
     * Get the enabled property: &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     *
     * @param enabled the enabled value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the enabledHostNames property: Enabled hostnames for the app.Hostnames need to be assigned (see HostNames)
     * AND enabled. Otherwise, the app is not served on those hostnames.
     *
     * @return the enabledHostNames value.
     */
    public List<String> enabledHostNames() {
        return this.enabledHostNames;
    }

    /**
     * Get the availabilityState property: Management information availability state for the app.
     *
     * @return the availabilityState value.
     */
    public SiteAvailabilityState availabilityState() {
        return this.availabilityState;
    }

    /**
     * Get the hostNameSslStates property: Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     *
     * @return the hostNameSslStates value.
     */
    public List<HostNameSslState> hostNameSslStates() {
        return this.hostNameSslStates;
    }

    /**
     * Set the hostNameSslStates property: Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     *
     * @param hostNameSslStates the hostNameSslStates value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withHostNameSslStates(List<HostNameSslState> hostNameSslStates) {
        this.hostNameSslStates = hostNameSslStates;
        return this;
    }

    /**
     * Get the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     *
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     *
     * @param serverFarmId the serverFarmId value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get the reserved property: &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the reserved value.
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set the reserved property: &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param reserved the reserved value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get the isXenon property: Obsolete: Hyper-V sandbox.
     *
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.isXenon;
    }

    /**
     * Set the isXenon property: Obsolete: Hyper-V sandbox.
     *
     * @param isXenon the isXenon value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withIsXenon(Boolean isXenon) {
        this.isXenon = isXenon;
        return this;
    }

    /**
     * Get the hyperV property: Hyper-V sandbox.
     *
     * @return the hyperV value.
     */
    public Boolean hyperV() {
        return this.hyperV;
    }

    /**
     * Set the hyperV property: Hyper-V sandbox.
     *
     * @param hyperV the hyperV value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withHyperV(Boolean hyperV) {
        this.hyperV = hyperV;
        return this;
    }

    /**
     * Get the lastModifiedTimeUtc property: Last time the app was modified, in UTC. Read-only.
     *
     * @return the lastModifiedTimeUtc value.
     */
    public OffsetDateTime lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }

    /**
     * Get the siteConfig property: Configuration of the app.
     *
     * @return the siteConfig value.
     */
    public SiteConfigInner siteConfig() {
        return this.siteConfig;
    }

    /**
     * Set the siteConfig property: Configuration of the app.
     *
     * @param siteConfig the siteConfig value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withSiteConfig(SiteConfigInner siteConfig) {
        this.siteConfig = siteConfig;
        return this;
    }

    /**
     * Get the trafficManagerHostNames property: Azure Traffic Manager hostnames associated with the app. Read-only.
     *
     * @return the trafficManagerHostNames value.
     */
    public List<String> trafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }

    /**
     * Get the scmSiteAlsoStopped property: &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is
     * stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the scmSiteAlsoStopped value.
     */
    public Boolean scmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped;
    }

    /**
     * Set the scmSiteAlsoStopped property: &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is
     * stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     *
     * @param scmSiteAlsoStopped the scmSiteAlsoStopped value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        this.scmSiteAlsoStopped = scmSiteAlsoStopped;
        return this;
    }

    /**
     * Get the targetSwapSlot property: Specifies which deployment slot this app will swap into. Read-only.
     *
     * @return the targetSwapSlot value.
     */
    public String targetSwapSlot() {
        return this.targetSwapSlot;
    }

    /**
     * Get the hostingEnvironmentProfile property: App Service Environment to use for the app.
     *
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile property: App Service Environment to use for the app.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get the clientAffinityEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client affinity;
     * &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same
     * session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the clientAffinityEnabled value.
     */
    public Boolean clientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }

    /**
     * Set the clientAffinityEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client affinity;
     * &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same
     * session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     *
     * @param clientAffinityEnabled the clientAffinityEnabled value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        this.clientAffinityEnabled = clientAffinityEnabled;
        return this;
    }

    /**
     * Get the clientCertEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication
     * (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the clientCertEnabled value.
     */
    public Boolean clientCertEnabled() {
        return this.clientCertEnabled;
    }

    /**
     * Set the clientCertEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication
     * (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param clientCertEnabled the clientCertEnabled value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withClientCertEnabled(Boolean clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled;
        return this;
    }

    /**
     * Get the clientCertExclusionPaths property: client certificate authentication comma-separated exclusion paths.
     *
     * @return the clientCertExclusionPaths value.
     */
    public String clientCertExclusionPaths() {
        return this.clientCertExclusionPaths;
    }

    /**
     * Set the clientCertExclusionPaths property: client certificate authentication comma-separated exclusion paths.
     *
     * @param clientCertExclusionPaths the clientCertExclusionPaths value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withClientCertExclusionPaths(String clientCertExclusionPaths) {
        this.clientCertExclusionPaths = clientCertExclusionPaths;
        return this;
    }

    /**
     * Get the hostNamesDisabled property: &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API
     * management process.
     *
     * @return the hostNamesDisabled value.
     */
    public Boolean hostNamesDisabled() {
        return this.hostNamesDisabled;
    }

    /**
     * Set the hostNamesDisabled property: &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;. If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API
     * management process.
     *
     * @param hostNamesDisabled the hostNamesDisabled value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withHostNamesDisabled(Boolean hostNamesDisabled) {
        this.hostNamesDisabled = hostNamesDisabled;
        return this;
    }

    /**
     * Get the outboundIpAddresses property: List of IP addresses that the app uses for outbound connections (e.g.
     * database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     *
     * @return the outboundIpAddresses value.
     */
    public String outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Get the possibleOutboundIpAddresses property: List of IP addresses that the app uses for outbound connections
     * (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     *
     * @return the possibleOutboundIpAddresses value.
     */
    public String possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }

    /**
     * Get the containerSize property: Size of the function container.
     *
     * @return the containerSize value.
     */
    public Integer containerSize() {
        return this.containerSize;
    }

    /**
     * Set the containerSize property: Size of the function container.
     *
     * @param containerSize the containerSize value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
        return this;
    }

    /**
     * Get the dailyMemoryTimeQuota property: Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     *
     * @return the dailyMemoryTimeQuota value.
     */
    public Integer dailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota;
    }

    /**
     * Set the dailyMemoryTimeQuota property: Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     *
     * @param dailyMemoryTimeQuota the dailyMemoryTimeQuota value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
        return this;
    }

    /**
     * Get the suspendedTill property: App suspended till in case memory-time quota is exceeded.
     *
     * @return the suspendedTill value.
     */
    public OffsetDateTime suspendedTill() {
        return this.suspendedTill;
    }

    /**
     * Get the maxNumberOfWorkers property: Maximum number of workers. This only applies to Functions container.
     *
     * @return the maxNumberOfWorkers value.
     */
    public Integer maxNumberOfWorkers() {
        return this.maxNumberOfWorkers;
    }

    /**
     * Get the cloningInfo property: If specified during app creation, the app is cloned from a source app.
     *
     * @return the cloningInfo value.
     */
    public CloningInfo cloningInfo() {
        return this.cloningInfo;
    }

    /**
     * Set the cloningInfo property: If specified during app creation, the app is cloned from a source app.
     *
     * @param cloningInfo the cloningInfo value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withCloningInfo(CloningInfo cloningInfo) {
        this.cloningInfo = cloningInfo;
        return this;
    }

    /**
     * Get the resourceGroup property: Name of the resource group the app belongs to. Read-only.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the isDefaultContainer property: &lt;code&gt;true&lt;/code&gt; if the app is a default container; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDefaultContainer value.
     */
    public Boolean isDefaultContainer() {
        return this.isDefaultContainer;
    }

    /**
     * Get the defaultHostName property: Default hostname of the app. Read-only.
     *
     * @return the defaultHostName value.
     */
    public String defaultHostName() {
        return this.defaultHostName;
    }

    /**
     * Get the slotSwapStatus property: Status of the last deployment slot swap operation.
     *
     * @return the slotSwapStatus value.
     */
    public SlotSwapStatus slotSwapStatus() {
        return this.slotSwapStatus;
    }

    /**
     * Get the httpsOnly property: HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests.
     *
     * @return the httpsOnly value.
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }

    /**
     * Set the httpsOnly property: HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests.
     *
     * @param httpsOnly the httpsOnly value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withHttpsOnly(Boolean httpsOnly) {
        this.httpsOnly = httpsOnly;
        return this;
    }

    /**
     * Get the redundancyMode property: Site redundancy mode.
     *
     * @return the redundancyMode value.
     */
    public RedundancyMode redundancyMode() {
        return this.redundancyMode;
    }

    /**
     * Set the redundancyMode property: Site redundancy mode.
     *
     * @param redundancyMode the redundancyMode value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withRedundancyMode(RedundancyMode redundancyMode) {
        this.redundancyMode = redundancyMode;
        return this;
    }

    /**
     * Get the inProgressOperationId property: Specifies an operation id if this site has a pending operation.
     *
     * @return the inProgressOperationId value.
     */
    public UUID inProgressOperationId() {
        return this.inProgressOperationId;
    }

    /**
     * Get the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of resource.
     *
     * @param kind the kind value to set.
     * @return the SiteInner object itself.
     */
    public SiteInner withKind(String kind) {
        this.kind = kind;
        return this;
    }
}
