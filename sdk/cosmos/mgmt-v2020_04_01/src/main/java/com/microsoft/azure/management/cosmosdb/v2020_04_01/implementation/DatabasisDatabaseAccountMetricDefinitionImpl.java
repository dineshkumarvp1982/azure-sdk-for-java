/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_04_01.DatabasisDatabaseAccountMetricDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.MetricAvailability;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.MetricName;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.PrimaryAggregationType;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.UnitType;

class DatabasisDatabaseAccountMetricDefinitionImpl extends WrapperImpl<MetricDefinitionInner> implements DatabasisDatabaseAccountMetricDefinition {
    private final CosmosDBManager manager;

    DatabasisDatabaseAccountMetricDefinitionImpl(MetricDefinitionInner inner,  CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }



    @Override
    public List<MetricAvailability> metricAvailabilities() {
        return this.inner().metricAvailabilities();
    }

    @Override
    public MetricName name() {
        return this.inner().name();
    }

    @Override
    public PrimaryAggregationType primaryAggregationType() {
        return this.inner().primaryAggregationType();
    }

    @Override
    public String resourceUri() {
        return this.inner().resourceUri();
    }

    @Override
    public UnitType unit() {
        return this.inner().unit();
    }

}
