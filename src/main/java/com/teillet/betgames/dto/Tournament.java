
package com.teillet.betgames.dto;

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
    "begin_at",
    "end_at",
    "id",
    "league_id",
    "live_supported",
    "modified_at",
    "name",
    "prizepool",
    "serie_id",
    "slug",
    "tier",
    "winner_id",
    "winner_type"
})
@Generated("jsonschema2pojo")
public class Tournament {

    @JsonProperty("begin_at")
    private String beginAt;
    @JsonProperty("end_at")
    private Object endAt;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("league_id")
    private Integer leagueId;
    @JsonProperty("live_supported")
    private Boolean liveSupported;
    @JsonProperty("modified_at")
    private String modifiedAt;
    @JsonProperty("name")
    private String name;
    @JsonProperty("prizepool")
    private Object prizepool;
    @JsonProperty("serie_id")
    private Integer serieId;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("tier")
    private String tier;
    @JsonProperty("winner_id")
    private Object winnerId;
    @JsonProperty("winner_type")
    private String winnerType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("begin_at")
    public String getBeginAt() {
        return beginAt;
    }

    @JsonProperty("begin_at")
    public void setBeginAt(String beginAt) {
        this.beginAt = beginAt;
    }

    @JsonProperty("end_at")
    public Object getEndAt() {
        return endAt;
    }

    @JsonProperty("end_at")
    public void setEndAt(Object endAt) {
        this.endAt = endAt;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("league_id")
    public Integer getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("live_supported")
    public Boolean getLiveSupported() {
        return liveSupported;
    }

    @JsonProperty("live_supported")
    public void setLiveSupported(Boolean liveSupported) {
        this.liveSupported = liveSupported;
    }

    @JsonProperty("modified_at")
    public String getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("modified_at")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("prizepool")
    public Object getPrizepool() {
        return prizepool;
    }

    @JsonProperty("prizepool")
    public void setPrizepool(Object prizepool) {
        this.prizepool = prizepool;
    }

    @JsonProperty("serie_id")
    public Integer getSerieId() {
        return serieId;
    }

    @JsonProperty("serie_id")
    public void setSerieId(Integer serieId) {
        this.serieId = serieId;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("tier")
    public String getTier() {
        return tier;
    }

    @JsonProperty("tier")
    public void setTier(String tier) {
        this.tier = tier;
    }

    @JsonProperty("winner_id")
    public Object getWinnerId() {
        return winnerId;
    }

    @JsonProperty("winner_id")
    public void setWinnerId(Object winnerId) {
        this.winnerId = winnerId;
    }

    @JsonProperty("winner_type")
    public String getWinnerType() {
        return winnerType;
    }

    @JsonProperty("winner_type")
    public void setWinnerType(String winnerType) {
        this.winnerType = winnerType;
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
