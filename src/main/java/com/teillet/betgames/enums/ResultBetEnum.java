package com.teillet.betgames.enums;

public enum ResultBetEnum {
    WIN("WIN"),
    LOSE("LOSE"),
    NOT_FINISHED("NOT_FINISHED");

    ResultBetEnum(String value) {
    }

    public String getValue() {
        return name();
    }
}
