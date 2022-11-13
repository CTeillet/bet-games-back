package com.teillet.betgames.match.dto.pandascore;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"score", "team_id"})
@Generated("jsonschema2pojo")
public class Result {

	@JsonProperty("score")
	private Integer score;

	@JsonProperty("team_id")
	private Integer teamId;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("score")
	public Integer getScore() {
		return score;
	}

	@JsonProperty("score")
	public void setScore(Integer score) {
		this.score = score;
	}

	@JsonProperty("team_id")
	public Integer getTeamId() {
		return teamId;
	}

	@JsonProperty("team_id")
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
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
