// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FailoverGroupReadWriteEndpoint model. */
@Fluent
public final class FailoverGroupReadWriteEndpoint {
    /*
     * Failover policy of the read-write endpoint for the failover group. If
     * failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes
     * is required.
     */
    @JsonProperty(value = "failoverPolicy", required = true)
    private ReadWriteEndpointFailoverPolicy failoverPolicy;

    /*
     * Grace period before failover with data loss is attempted for the
     * read-write endpoint. If failoverPolicy is Automatic then
     * failoverWithDataLossGracePeriodMinutes is required.
     */
    @JsonProperty(value = "failoverWithDataLossGracePeriodMinutes")
    private Integer failoverWithDataLossGracePeriodMinutes;

    /**
     * Get the failoverPolicy property: Failover policy of the read-write endpoint for the failover group. If
     * failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     *
     * @return the failoverPolicy value.
     */
    public ReadWriteEndpointFailoverPolicy failoverPolicy() {
        return this.failoverPolicy;
    }

    /**
     * Set the failoverPolicy property: Failover policy of the read-write endpoint for the failover group. If
     * failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is required.
     *
     * @param failoverPolicy the failoverPolicy value to set.
     * @return the FailoverGroupReadWriteEndpoint object itself.
     */
    public FailoverGroupReadWriteEndpoint withFailoverPolicy(ReadWriteEndpointFailoverPolicy failoverPolicy) {
        this.failoverPolicy = failoverPolicy;
        return this;
    }

    /**
     * Get the failoverWithDataLossGracePeriodMinutes property: Grace period before failover with data loss is attempted
     * for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is
     * required.
     *
     * @return the failoverWithDataLossGracePeriodMinutes value.
     */
    public Integer failoverWithDataLossGracePeriodMinutes() {
        return this.failoverWithDataLossGracePeriodMinutes;
    }

    /**
     * Set the failoverWithDataLossGracePeriodMinutes property: Grace period before failover with data loss is attempted
     * for the read-write endpoint. If failoverPolicy is Automatic then failoverWithDataLossGracePeriodMinutes is
     * required.
     *
     * @param failoverWithDataLossGracePeriodMinutes the failoverWithDataLossGracePeriodMinutes value to set.
     * @return the FailoverGroupReadWriteEndpoint object itself.
     */
    public FailoverGroupReadWriteEndpoint withFailoverWithDataLossGracePeriodMinutes(
        Integer failoverWithDataLossGracePeriodMinutes) {
        this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
        return this;
    }
}
