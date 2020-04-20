// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PcStatus. */
public final class PcStatus extends ExpandableStringEnum<PcStatus> {
    /** Static value NotStarted for PcStatus. */
    public static final PcStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Running for PcStatus. */
    public static final PcStatus RUNNING = fromString("Running");

    /** Static value Stopped for PcStatus. */
    public static final PcStatus STOPPED = fromString("Stopped");

    /** Static value Error for PcStatus. */
    public static final PcStatus ERROR = fromString("Error");

    /** Static value Unknown for PcStatus. */
    public static final PcStatus UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a PcStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PcStatus.
     */
    @JsonCreator
    public static PcStatus fromString(String name) {
        return fromString(name, PcStatus.class);
    }

    /** @return known PcStatus values. */
    public static Collection<PcStatus> values() {
        return values(PcStatus.class);
    }
}
