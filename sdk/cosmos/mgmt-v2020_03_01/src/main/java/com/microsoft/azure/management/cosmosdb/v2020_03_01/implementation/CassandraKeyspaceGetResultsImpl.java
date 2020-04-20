/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.CassandraKeyspaceGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CassandraKeyspaceCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CassandraKeyspaceGetPropertiesOptions;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CassandraKeyspaceGetPropertiesResource;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CreateUpdateOptions;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CassandraKeyspaceResource;
import rx.functions.Func1;

class CassandraKeyspaceGetResultsImpl extends CreatableUpdatableImpl<CassandraKeyspaceGetResults, CassandraKeyspaceGetResultsInner, CassandraKeyspaceGetResultsImpl> implements CassandraKeyspaceGetResults, CassandraKeyspaceGetResults.Definition, CassandraKeyspaceGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String keyspaceName;
    private CassandraKeyspaceCreateUpdateParameters createOrUpdateParameter;

    CassandraKeyspaceGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new CassandraKeyspaceGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.keyspaceName = name;
        //
        this.createOrUpdateParameter = new CassandraKeyspaceCreateUpdateParameters();
    }

    CassandraKeyspaceGetResultsImpl(CassandraKeyspaceGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.keyspaceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.keyspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "cassandraKeyspaces");
        //
        this.createOrUpdateParameter = new CassandraKeyspaceCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CassandraKeyspaceGetResults> createResourceAsync() {
        CassandraResourcesInner client = this.manager().inner().cassandraResources();
        return client.createUpdateCassandraKeyspaceAsync(this.resourceGroupName, this.accountName, this.keyspaceName, this.createOrUpdateParameter)
            .map(new Func1<CassandraKeyspaceGetResultsInner, CassandraKeyspaceGetResultsInner>() {
               @Override
               public CassandraKeyspaceGetResultsInner call(CassandraKeyspaceGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CassandraKeyspaceGetResults> updateResourceAsync() {
        CassandraResourcesInner client = this.manager().inner().cassandraResources();
        return client.createUpdateCassandraKeyspaceAsync(this.resourceGroupName, this.accountName, this.keyspaceName, this.createOrUpdateParameter)
            .map(new Func1<CassandraKeyspaceGetResultsInner, CassandraKeyspaceGetResultsInner>() {
               @Override
               public CassandraKeyspaceGetResultsInner call(CassandraKeyspaceGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CassandraKeyspaceGetResultsInner> getInnerAsync() {
        CassandraResourcesInner client = this.manager().inner().cassandraResources();
        return client.getCassandraKeyspaceAsync(this.resourceGroupName, this.accountName, this.keyspaceName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new CassandraKeyspaceCreateUpdateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public CassandraKeyspaceGetPropertiesOptions options() {
        return this.inner().options();
    }

    @Override
    public CassandraKeyspaceGetPropertiesResource resource() {
        return this.inner().resource();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public CassandraKeyspaceGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public CassandraKeyspaceGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public CassandraKeyspaceGetResultsImpl withOptions(CreateUpdateOptions options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public CassandraKeyspaceGetResultsImpl withResource(CassandraKeyspaceResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public CassandraKeyspaceGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
