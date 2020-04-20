// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReadOnlyEndpointFailoverPolicy. */
public final class ReadOnlyEndpointFailoverPolicy extends ExpandableStringEnum<ReadOnlyEndpointFailoverPolicy> {
    /** Static value Disabled for ReadOnlyEndpointFailoverPolicy. */
    public static final ReadOnlyEndpointFailoverPolicy DISABLED = fromString("Disabled");

    /** Static value Enabled for ReadOnlyEndpointFailoverPolicy. */
    public static final ReadOnlyEndpointFailoverPolicy ENABLED = fromString("Enabled");

    /**
     * Creates or finds a ReadOnlyEndpointFailoverPolicy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReadOnlyEndpointFailoverPolicy.
     */
    @JsonCreator
    public static ReadOnlyEndpointFailoverPolicy fromString(String name) {
        return fromString(name, ReadOnlyEndpointFailoverPolicy.class);
    }

    /** @return known ReadOnlyEndpointFailoverPolicy values. */
    public static Collection<ReadOnlyEndpointFailoverPolicy> values() {
        return values(ReadOnlyEndpointFailoverPolicy.class);
    }
}
