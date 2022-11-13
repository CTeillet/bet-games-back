package com.teillet.betgames.match.dto.pandascore;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"english", "official", "russian"})
@Generated("jsonschema2pojo")
public class Streams {

	@JsonProperty("english")
	private English english;

	@JsonProperty("official")
	private Official official;

	@JsonProperty("russian")
	private Russian russian;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("english")
	public English getEnglish() {
		return english;
	}

	@JsonProperty("english")
	public void setEnglish(English english) {
		this.english = english;
	}

	@JsonProperty("official")
	public Official getOfficial() {
		return official;
	}

	@JsonProperty("official")
	public void setOfficial(Official official) {
		this.official = official;
	}

	@JsonProperty("russian")
	public Russian getRussian() {
		return russian;
	}

	@JsonProperty("russian")
	public void setRussian(Russian russian) {
		this.russian = russian;
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
