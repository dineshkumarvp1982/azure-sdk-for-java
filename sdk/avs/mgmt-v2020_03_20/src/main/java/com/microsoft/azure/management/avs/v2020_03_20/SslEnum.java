/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SslEnum.
 */
public final class SslEnum extends ExpandableStringEnum<SslEnum> {
    /** Static value Enabled for SslEnum. */
    public static final SslEnum ENABLED = fromString("Enabled");

    /** Static value Disabled for SslEnum. */
    public static final SslEnum DISABLED = fromString("Disabled");

    /**
     * Creates or finds a SslEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding SslEnum
     */
    @JsonCreator
    public static SslEnum fromString(String name) {
        return fromString(name, SslEnum.class);
    }

    /**
     * @return known SslEnum values
     */
    public static Collection<SslEnum> values() {
        return values(SslEnum.class);
    }
}
