// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ComponentNames. */
public enum ComponentNames {
    /** Enum value Microsoft-Windows-Shell-Setup. */
    MICROSOFT_WINDOWS_SHELL_SETUP("Microsoft-Windows-Shell-Setup");

    /** The actual serialized value for a ComponentNames instance. */
    private final String value;

    ComponentNames(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComponentNames instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComponentNames object, or null if unable to parse.
     */
    @JsonCreator
    public static ComponentNames fromString(String value) {
        ComponentNames[] items = ComponentNames.values();
        for (ComponentNames item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
