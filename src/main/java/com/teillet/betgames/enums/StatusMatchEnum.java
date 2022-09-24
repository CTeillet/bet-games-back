package com.teillet.betgames.enums;

public enum StatusMatchEnum {
    NOT_STARTED("NOT_STARTED"),
    RUNNING("RUNNING"),
    FINISHED("FINISHED"),
    CANCELED("CANCELED"),
    POSTPONED("POSTPONED");

    private final String value;
    StatusMatchEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
