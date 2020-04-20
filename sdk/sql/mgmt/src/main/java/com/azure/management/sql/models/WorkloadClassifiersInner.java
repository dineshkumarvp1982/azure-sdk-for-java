// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in WorkloadClassifiers. */
public final class WorkloadClassifiersInner {
    /** The proxy service used to perform REST calls. */
    private final WorkloadClassifiersService service;

    /** The service client containing this operation class. */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of WorkloadClassifiersInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    WorkloadClassifiersInner(SqlManagementClientImpl client) {
        this.service =
            RestProxy.create(WorkloadClassifiersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientWorkloadClassifiers to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientW")
    private interface WorkloadClassifiersService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}"
                + "/workloadClassifiers/{workloadClassifierName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<WorkloadClassifierInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("workloadGroupName") String workloadGroupName,
            @PathParam("workloadClassifierName") String workloadClassifierName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}"
                + "/workloadClassifiers/{workloadClassifierName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("workloadGroupName") String workloadGroupName,
            @PathParam("workloadClassifierName") String workloadClassifierName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") WorkloadClassifierInner parameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}"
                + "/workloadClassifiers/{workloadClassifierName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("workloadGroupName") String workloadGroupName,
            @PathParam("workloadClassifierName") String workloadClassifierName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}"
                + "/workloadClassifiers")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<WorkloadClassifierListResultInner>> listByWorkloadGroup(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("workloadGroupName") String workloadGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}"
                + "/workloadClassifiers/{workloadClassifierName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<WorkloadClassifierInner>> beginCreateOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("workloadGroupName") String workloadGroupName,
            @PathParam("workloadClassifierName") String workloadClassifierName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") WorkloadClassifierInner parameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql"
                + "/servers/{serverName}/databases/{databaseName}/workloadGroups/{workloadGroupName}"
                + "/workloadClassifiers/{workloadClassifierName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("workloadGroupName") String workloadGroupName,
            @PathParam("workloadClassifierName") String workloadClassifierName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<WorkloadClassifierListResultInner>> listByWorkloadGroupNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<WorkloadClassifierInner>> getWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            workloadGroupName,
                            workloadClassifierName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WorkloadClassifierInner> getAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        return getWithResponseAsync(
                resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName)
            .flatMap(
                (SimpleResponse<WorkloadClassifierInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a workload classifier.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkloadClassifierInner get(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        return getAsync(resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName).block();
    }

    /**
     * Creates or updates a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters Workload classifier operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName,
        WorkloadClassifierInner parameters) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            workloadGroupName,
                            workloadClassifierName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters Workload classifier operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WorkloadClassifierInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName,
        WorkloadClassifierInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(
                resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName, parameters);
        return this
            .client
            .<WorkloadClassifierInner, WorkloadClassifierInner>getLroResultAsync(
                mono, this.client.getHttpPipeline(), WorkloadClassifierInner.class, WorkloadClassifierInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters Workload classifier operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkloadClassifierInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName,
        WorkloadClassifierInner parameters) {
        return createOrUpdateAsync(
                resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName, parameters)
            .block();
    }

    /**
     * Deletes a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            workloadGroupName,
                            workloadClassifierName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            deleteWithResponseAsync(
                resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName);
        return this
            .client
            .<Void, Void>getLroResultAsync(mono, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        deleteAsync(resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName).block();
    }

    /**
     * Gets the list of workload classifiers for a workload group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifiers from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workload classifiers for a workload group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<WorkloadClassifierInner>> listByWorkloadGroupSinglePageAsync(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByWorkloadGroup(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            workloadGroupName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .<PagedResponse<WorkloadClassifierInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the list of workload classifiers for a workload group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifiers from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workload classifiers for a workload group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<WorkloadClassifierInner> listByWorkloadGroupAsync(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        return new PagedFlux<>(
            () -> listByWorkloadGroupSinglePageAsync(resourceGroupName, serverName, databaseName, workloadGroupName),
            nextLink -> listByWorkloadGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets the list of workload classifiers for a workload group.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifiers from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of workload classifiers for a workload group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<WorkloadClassifierInner> listByWorkloadGroup(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        return new PagedIterable<>(
            listByWorkloadGroupAsync(resourceGroupName, serverName, databaseName, workloadGroupName));
    }

    /**
     * Creates or updates a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters Workload classifier operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<WorkloadClassifierInner>> beginCreateOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName,
        WorkloadClassifierInner parameters) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginCreateOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            workloadGroupName,
                            workloadClassifierName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters Workload classifier operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WorkloadClassifierInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName,
        WorkloadClassifierInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(
                resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName, parameters)
            .flatMap(
                (SimpleResponse<WorkloadClassifierInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to create/update.
     * @param parameters Workload classifier operations for a data warehouse.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return workload classifier operations for a data warehouse.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkloadClassifierInner beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName,
        WorkloadClassifierInner parameters) {
        return beginCreateOrUpdateAsync(
                resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName, parameters)
            .block();
    }

    /**
     * Deletes a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        final String apiVersion = "2019-06-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginDelete(
                            this.client.getHost(),
                            resourceGroupName,
                            serverName,
                            databaseName,
                            workloadGroupName,
                            workloadClassifierName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        return beginDeleteWithResponseAsync(
                resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a workload classifier.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param workloadGroupName The name of the workload group from which to receive the classifier from.
     * @param workloadClassifierName The name of the workload classifier to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String workloadGroupName,
        String workloadClassifierName) {
        beginDeleteAsync(resourceGroupName, serverName, databaseName, workloadGroupName, workloadClassifierName)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of workload classifiers for a workload group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<WorkloadClassifierInner>> listByWorkloadGroupNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listByWorkloadGroupNext(nextLink, context))
            .<PagedResponse<WorkloadClassifierInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
