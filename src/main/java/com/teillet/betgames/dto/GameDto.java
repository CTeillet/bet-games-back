package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GameDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class GameDto {
  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private String id;

  @JsonProperty("leagues")
  @Valid
  private List<GameLeaguesDto> leagues = null;

  public GameDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(example = "[\"League of Legends\"]", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GameDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(example = "[\"leagueoflegends\"]", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GameDto leagues(List<GameLeaguesDto> leagues) {
    this.leagues = leagues;
    return this;
  }

  public GameDto addLeaguesItem(GameLeaguesDto leaguesItem) {
    if (this.leagues == null) {
      this.leagues = new ArrayList<>();
    }
    this.leagues.add(leaguesItem);
    return this;
  }

  /**
   * Get leagues
   *
   * @return leagues
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<GameLeaguesDto> getLeagues() {
    return leagues;
  }

  public void setLeagues(List<GameLeaguesDto> leagues) {
    this.leagues = leagues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameDto game = (GameDto) o;
    return Objects.equals(this.name, game.name) &&
            Objects.equals(this.id, game.id) &&
            Objects.equals(this.leagues, game.leagues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, leagues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameDto {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leagues: ").append(toIndentedString(leagues)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

