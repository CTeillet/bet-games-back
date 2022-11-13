package com.teillet.betgames.bet;

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
