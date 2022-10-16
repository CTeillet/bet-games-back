
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
    "opens_at",
    "supported",
    "url"
})
@Generated("jsonschema2pojo")
public class Live {

    @JsonProperty("opens_at")
    private Object opensAt;
    @JsonProperty("supported")
    private Boolean supported;
    @JsonProperty("url")
    private Object url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("opens_at")
    public Object getOpensAt() {
        return opensAt;
    }

    @JsonProperty("opens_at")
    public void setOpensAt(Object opensAt) {
        this.opensAt = opensAt;
    }

    @JsonProperty("supported")
    public Boolean getSupported() {
        return supported;
    }

    @JsonProperty("supported")
    public void setSupported(Boolean supported) {
        this.supported = supported;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
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
