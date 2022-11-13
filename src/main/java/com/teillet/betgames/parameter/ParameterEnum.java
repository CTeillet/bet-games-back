package com.teillet.betgames.parameter;

public enum ParameterEnum {
	LAST_UPDATE("lastUpdate");

	ParameterEnum(String value) {
	}

	public String getValue() {
		return name();
	}
}
