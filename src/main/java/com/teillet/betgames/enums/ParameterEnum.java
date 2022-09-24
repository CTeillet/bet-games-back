package com.teillet.betgames.enums;

public enum ParameterEnum {
    LAST_UPDATE("lastUpdate");

    ParameterEnum(String value) {
    }

    public String getValue() {
        return name();
    }


}
