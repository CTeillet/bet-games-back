package com.teillet.betgames.match.dto.pandascore;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"opponent", "type"})
@Generated("jsonschema2pojo")
public class Opponent {

	@JsonProperty("opponent")
	private Opponent__1 opponent;

	@JsonProperty("type")
	private String type;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("opponent")
	public Opponent__1 getOpponent() {
		return opponent;
	}

	@JsonProperty("opponent")
	public void setOpponent(Opponent__1 opponent) {
		this.opponent = opponent;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}
