
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
    "begin_at",
    "complete",
    "detailed_stats",
    "end_at",
    "finished",
    "forfeit",
    "id",
    "length",
    "match_id",
    "position",
    "status",
    "video_url",
    "winner",
    "winner_type"
})
@Generated("jsonschema2pojo")
public class Game {

    @JsonProperty("begin_at")
    private String beginAt;
    @JsonProperty("complete")
    private Boolean complete;
    @JsonProperty("detailed_stats")
    private Boolean detailedStats;
    @JsonProperty("end_at")
    private String endAt;
    @JsonProperty("finished")
    private Boolean finished;
    @JsonProperty("forfeit")
    private Boolean forfeit;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("match_id")
    private Integer matchId;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("status")
    private String status;
    @JsonProperty("video_url")
    private Object videoUrl;
    @JsonProperty("winner")
    private Winner__1 winner;
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

    @JsonProperty("complete")
    public Boolean getComplete() {
        return complete;
    }

    @JsonProperty("complete")
    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    @JsonProperty("detailed_stats")
    public Boolean getDetailedStats() {
        return detailedStats;
    }

    @JsonProperty("detailed_stats")
    public void setDetailedStats(Boolean detailedStats) {
        this.detailedStats = detailedStats;
    }

    @JsonProperty("end_at")
    public String getEndAt() {
        return endAt;
    }

    @JsonProperty("end_at")
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    @JsonProperty("finished")
    public Boolean getFinished() {
        return finished;
    }

    @JsonProperty("finished")
    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    @JsonProperty("forfeit")
    public Boolean getForfeit() {
        return forfeit;
    }

    @JsonProperty("forfeit")
    public void setForfeit(Boolean forfeit) {
        this.forfeit = forfeit;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("length")
    public Integer getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    @JsonProperty("match_id")
    public Integer getMatchId() {
        return matchId;
    }

    @JsonProperty("match_id")
    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("video_url")
    public Object getVideoUrl() {
        return videoUrl;
    }

    @JsonProperty("video_url")
    public void setVideoUrl(Object videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonProperty("winner")
    public Winner__1 getWinner() {
        return winner;
    }

    @JsonProperty("winner")
    public void setWinner(Winner__1 winner) {
        this.winner = winner;
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
