
package com.teillet.betgames.dto.pandascore;

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
    "description",
    "end_at",
    "full_name",
    "id",
    "league_id",
    "modified_at",
    "name",
    "season",
    "slug",
    "tier",
    "winner_id",
    "winner_type",
    "year"
})
@Generated("jsonschema2pojo")
public class Serie {

    @JsonProperty("begin_at")
    private String beginAt;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("end_at")
    private Object endAt;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("league_id")
    private Integer leagueId;
    @JsonProperty("modified_at")
    private String modifiedAt;
    @JsonProperty("name")
    private Object name;
    @JsonProperty("season")
    private String season;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("tier")
    private String tier;
    @JsonProperty("winner_id")
    private Object winnerId;
    @JsonProperty("winner_type")
    private Object winnerType;
    @JsonProperty("year")
    private Integer year;
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

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("end_at")
    public Object getEndAt() {
        return endAt;
    }

    @JsonProperty("end_at")
    public void setEndAt(Object endAt) {
        this.endAt = endAt;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    @JsonProperty("modified_at")
    public String getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("modified_at")
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @JsonProperty("name")
    public Object getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Object name) {
        this.name = name;
    }

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(String season) {
        this.season = season;
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
    public Object getWinnerType() {
        return winnerType;
    }

    @JsonProperty("winner_type")
    public void setWinnerType(Object winnerType) {
        this.winnerType = winnerType;
    }

    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
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
