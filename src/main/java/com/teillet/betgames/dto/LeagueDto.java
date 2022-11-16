package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LeagueDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class LeagueDto {
  @JsonProperty("name")
  private String name;

  @JsonProperty("matches")
  @Valid
  private List<MatchDto> matches = null;

  public LeagueDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @ApiModelProperty(example = "[\"LEC\"]", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeagueDto matches(List<MatchDto> matches) {
    this.matches = matches;
    return this;
  }

  public LeagueDto addMatchesItem(MatchDto matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<>();
    }
    this.matches.add(matchesItem);
    return this;
  }

  /**
   * Get matches
   *
   * @return matches
   */
  @ApiModelProperty(value = "")

  @Valid

  public List<MatchDto> getMatches() {
    return matches;
  }

  public void setMatches(List<MatchDto> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeagueDto league = (LeagueDto) o;
    return Objects.equals(this.name, league.name) &&
            Objects.equals(this.matches, league.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeagueDto {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

