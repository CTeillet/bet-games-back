package com.teillet.betgames.enums;

public enum SportEnum {
    LOL("LOL");

    private final String value;

    SportEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
