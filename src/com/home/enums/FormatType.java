package com.home.enums;

public enum FormatType {
    JSON("json"),
    XML("xml");

    public final String label;

    FormatType(String label) {
        this.label = label;
    }
}
