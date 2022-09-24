
package com.teillet.betgames.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
    "end_at",
    "original_scheduled_at",
    "live_embed_url",
    "number_of_games",
    "videogame",
    "serie",
    "videogame_version",
    "tournament_id",
    "league",
    "id",
    "streams",
    "game_advantage",
    "forfeit",
    "winner",
    "draw",
    "rescheduled",
    "serie_id",
    "match_type",
    "slug",
    "status",
    "league_id",
    "games",
    "winner_id",
    "streams_list",
    "live",
    "scheduled_at",
    "results",
    "begin_at",
    "official_stream_url",
    "modified_at",
    "name",
    "tournament",
    "opponents",
    "detailed_stats"
})
@Generated("jsonschema2pojo")
public class PandaScoreMatch {

    @JsonProperty("end_at")
    private Date endAt;
    @JsonProperty("original_scheduled_at")
    private Date originalScheduledAt;
    @JsonProperty("live_embed_url")
    private String liveEmbedUrl;
    @JsonProperty("number_of_games")
    private Integer numberOfGames;
    @JsonProperty("videogame")
    private Videogame videogame;
    @JsonProperty("serie")
    private Serie serie;
    @JsonProperty("videogame_version")
    private Object videogameVersion;
    @JsonProperty("tournament_id")
    private Integer tournamentId;
    @JsonProperty("league")
    private League league;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("streams")
    private Streams streams;
    @JsonProperty("game_advantage")
    private Object gameAdvantage;
    @JsonProperty("forfeit")
    private Boolean forfeit;
    @JsonProperty("winner")
    private Winner winner;
    @JsonProperty("draw")
    private Boolean draw;
    @JsonProperty("rescheduled")
    private Boolean rescheduled;
    @JsonProperty("serie_id")
    private Integer serieId;
    @JsonProperty("match_type")
    private String matchType;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("status")
    private String status;
    @JsonProperty("league_id")
    private Integer leagueId;
    @JsonProperty("games")
    private List<Game> games = null;
    @JsonProperty("winner_id")
    private Integer winnerId;
    @JsonProperty("streams_list")
    private List<Streams__1> streamsList = null;
    @JsonProperty("live")
    private Live live;
    @JsonProperty("scheduled_at")
    private Date scheduledAt;
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonProperty("begin_at")
    private Date beginAt;
    @JsonProperty("official_stream_url")
    private String officialStreamUrl;
    @JsonProperty("modified_at")
    private Date modifiedAt;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tournament")
    private Tournament tournament;
    @JsonProperty("opponents")
    private List<Opponent> opponents = null;
    @JsonProperty("detailed_stats")
    private Boolean detailedStats;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("end_at")
    public Date getEndAt() {
        return endAt;
    }

    @JsonProperty("end_at")
    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    @JsonProperty("original_scheduled_at")
    public Date getOriginalScheduledAt() {
        return originalScheduledAt;
    }

    @JsonProperty("original_scheduled_at")
    public void setOriginalScheduledAt(Date originalScheduledAt) {
        this.originalScheduledAt = originalScheduledAt;
    }

    @JsonProperty("live_embed_url")
    public String getLiveEmbedUrl() {
        return liveEmbedUrl;
    }

    @JsonProperty("live_embed_url")
    public void setLiveEmbedUrl(String liveEmbedUrl) {
        this.liveEmbedUrl = liveEmbedUrl;
    }

    @JsonProperty("number_of_games")
    public Integer getNumberOfGames() {
        return numberOfGames;
    }

    @JsonProperty("number_of_games")
    public void setNumberOfGames(Integer numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    @JsonProperty("videogame")
    public Videogame getVideogame() {
        return videogame;
    }

    @JsonProperty("videogame")
    public void setVideogame(Videogame videogame) {
        this.videogame = videogame;
    }

    @JsonProperty("serie")
    public Serie getSerie() {
        return serie;
    }

    @JsonProperty("serie")
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @JsonProperty("videogame_version")
    public Object getVideogameVersion() {
        return videogameVersion;
    }

    @JsonProperty("videogame_version")
    public void setVideogameVersion(Object videogameVersion) {
        this.videogameVersion = videogameVersion;
    }

    @JsonProperty("tournament_id")
    public Integer getTournamentId() {
        return tournamentId;
    }

    @JsonProperty("tournament_id")
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    @JsonProperty("league")
    public League getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(League league) {
        this.league = league;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("streams")
    public Streams getStreams() {
        return streams;
    }

    @JsonProperty("streams")
    public void setStreams(Streams streams) {
        this.streams = streams;
    }

    @JsonProperty("game_advantage")
    public Object getGameAdvantage() {
        return gameAdvantage;
    }

    @JsonProperty("game_advantage")
    public void setGameAdvantage(Object gameAdvantage) {
        this.gameAdvantage = gameAdvantage;
    }

    @JsonProperty("forfeit")
    public Boolean getForfeit() {
        return forfeit;
    }

    @JsonProperty("forfeit")
    public void setForfeit(Boolean forfeit) {
        this.forfeit = forfeit;
    }

    @JsonProperty("winner")
    public Winner getWinner() {
        return winner;
    }

    @JsonProperty("winner")
    public void setWinner(Winner winner) {
        this.winner = winner;
    }

    @JsonProperty("draw")
    public Boolean getDraw() {
        return draw;
    }

    @JsonProperty("draw")
    public void setDraw(Boolean draw) {
        this.draw = draw;
    }

    @JsonProperty("rescheduled")
    public Boolean getRescheduled() {
        return rescheduled;
    }

    @JsonProperty("rescheduled")
    public void setRescheduled(Boolean rescheduled) {
        this.rescheduled = rescheduled;
    }

    @JsonProperty("serie_id")
    public Integer getSerieId() {
        return serieId;
    }

    @JsonProperty("serie_id")
    public void setSerieId(Integer serieId) {
        this.serieId = serieId;
    }

    @JsonProperty("match_type")
    public String getMatchType() {
        return matchType;
    }

    @JsonProperty("match_type")
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("league_id")
    public Integer getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("games")
    public List<Game> getGames() {
        return games;
    }

    @JsonProperty("games")
    public void setGames(List<Game> games) {
        this.games = games;
    }

    @JsonProperty("winner_id")
    public Integer getWinnerId() {
        return winnerId;
    }

    @JsonProperty("winner_id")
    public void setWinnerId(Integer winnerId) {
        this.winnerId = winnerId;
    }

    @JsonProperty("streams_list")
    public List<Streams__1> getStreamsList() {
        return streamsList;
    }

    @JsonProperty("streams_list")
    public void setStreamsList(List<Streams__1> streamsList) {
        this.streamsList = streamsList;
    }

    @JsonProperty("live")
    public Live getLive() {
        return live;
    }

    @JsonProperty("live")
    public void setLive(Live live) {
        this.live = live;
    }

    @JsonProperty("scheduled_at")
    public Date getScheduledAt() {
        return scheduledAt;
    }

    @JsonProperty("scheduled_at")
    public void setScheduledAt(Date scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("begin_at")
    public Date getBeginAt() {
        return beginAt;
    }

    @JsonProperty("begin_at")
    public void setBeginAt(Date beginAt) {
        this.beginAt = beginAt;
    }

    @JsonProperty("official_stream_url")
    public String getOfficialStreamUrl() {
        return officialStreamUrl;
    }

    @JsonProperty("official_stream_url")
    public void setOfficialStreamUrl(String officialStreamUrl) {
        this.officialStreamUrl = officialStreamUrl;
    }

    @JsonProperty("modified_at")
    public Date getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("modified_at")
    public void setModifiedAt(Date modifiedAt) {
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

    @JsonProperty("tournament")
    public Tournament getTournament() {
        return tournament;
    }

    @JsonProperty("tournament")
    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    @JsonProperty("opponents")
    public List<Opponent> getOpponents() {
        return opponents;
    }

    @JsonProperty("opponents")
    public void setOpponents(List<Opponent> opponents) {
        this.opponents = opponents;
    }

    @JsonProperty("detailed_stats")
    public Boolean getDetailedStats() {
        return detailedStats;
    }

    @JsonProperty("detailed_stats")
    public void setDetailedStats(Boolean detailedStats) {
        this.detailedStats = detailedStats;
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
