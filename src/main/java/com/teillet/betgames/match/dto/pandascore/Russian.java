
package com.teillet.betgames.match.dto.pandascore;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "embed_url",
    "raw_url"
})
@Generated("jsonschema2pojo")
public class Russian {

    @JsonProperty("embed_url")
    private Object embedUrl;
    @JsonProperty("raw_url")
    private Object rawUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("embed_url")
    public Object getEmbedUrl() {
        return embedUrl;
    }

    @JsonProperty("embed_url")
    public void setEmbedUrl(Object embedUrl) {
        this.embedUrl = embedUrl;
    }

    @JsonProperty("raw_url")
    public Object getRawUrl() {
        return rawUrl;
    }

    @JsonProperty("raw_url")
    public void setRawUrl(Object rawUrl) {
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
