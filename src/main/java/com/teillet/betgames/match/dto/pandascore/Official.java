package com.teillet.betgames.match.dto.pandascore;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"embed_url", "raw_url"})
@Generated("jsonschema2pojo")
public class Official {

	@JsonProperty("embed_url")
	private String embedUrl;

	@JsonProperty("raw_url")
	private String rawUrl;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("embed_url")
	public String getEmbedUrl() {
		return embedUrl;
	}

	@JsonProperty("embed_url")
	public void setEmbedUrl(String embedUrl) {
		this.embedUrl = embedUrl;
	}

	@JsonProperty("raw_url")
	public String getRawUrl() {
		return rawUrl;
	}

	@JsonProperty("raw_url")
	public void setRawUrl(String rawUrl) {
		this.rawUrl = rawUrl;
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
