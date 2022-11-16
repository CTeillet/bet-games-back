package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * MatchDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class MatchDto {
  @JsonProperty("id")
  private BigDecimal id;

  @JsonProperty("teamA")
  private String teamA;

  @JsonProperty("coteA")
  private BigDecimal coteA;

  @JsonProperty("teamB")
  private String teamB;

  @JsonProperty("coteB")
  private BigDecimal coteB;

  @JsonProperty("date")
  private String date;

  @JsonProperty("status")
  private String status;

  @JsonProperty("scoreA")
  private BigDecimal scoreA;

  @JsonProperty("scoreB")
  private BigDecimal scoreB;

  public MatchDto id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public MatchDto teamA(String teamA) {
    this.teamA = teamA;
    return this;
  }

  /**
   * Get teamA
   *
   * @return teamA
   */
  @ApiModelProperty(example = "[\"G2\"]", value = "")


  public String getTeamA() {
    return teamA;
  }

  public void setTeamA(String teamA) {
    this.teamA = teamA;
  }

  public MatchDto coteA(BigDecimal coteA) {
    this.coteA = coteA;
    return this;
  }

  /**
   * Get coteA
   *
   * @return coteA
   */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCoteA() {
    return coteA;
  }

  public void setCoteA(BigDecimal coteA) {
    this.coteA = coteA;
  }

  public MatchDto teamB(String teamB) {
    this.teamB = teamB;
    return this;
  }

  /**
   * Get teamB
   *
   * @return teamB
   */
  @ApiModelProperty(example = "[\"FNC\"]", value = "")


  public String getTeamB() {
    return teamB;
  }

  public void setTeamB(String teamB) {
    this.teamB = teamB;
  }

  public MatchDto coteB(BigDecimal coteB) {
    this.coteB = coteB;
    return this;
  }

  /**
   * Get coteB
   *
   * @return coteB
   */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCoteB() {
    return coteB;
  }

  public void setCoteB(BigDecimal coteB) {
    this.coteB = coteB;
  }

  public MatchDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   *
   * @return date
   */
  @ApiModelProperty(example = "[\"2020-10-10T12:00:00Z\"]", value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public MatchDto status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(example = "[\"finished\"]", value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MatchDto scoreA(BigDecimal scoreA) {
    this.scoreA = scoreA;
    return this;
  }

  /**
   * Get scoreA
   *
   * @return scoreA
   */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getScoreA() {
    return scoreA;
  }

  public void setScoreA(BigDecimal scoreA) {
    this.scoreA = scoreA;
  }

  public MatchDto scoreB(BigDecimal scoreB) {
    this.scoreB = scoreB;
    return this;
  }

  /**
   * Get scoreB
   *
   * @return scoreB
   */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getScoreB() {
    return scoreB;
  }

  public void setScoreB(BigDecimal scoreB) {
    this.scoreB = scoreB;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchDto match = (MatchDto) o;
    return Objects.equals(this.id, match.id) &&
            Objects.equals(this.teamA, match.teamA) &&
            Objects.equals(this.coteA, match.coteA) &&
            Objects.equals(this.teamB, match.teamB) &&
            Objects.equals(this.coteB, match.coteB) &&
            Objects.equals(this.date, match.date) &&
            Objects.equals(this.status, match.status) &&
            Objects.equals(this.scoreA, match.scoreA) &&
            Objects.equals(this.scoreB, match.scoreB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, teamA, coteA, teamB, coteB, date, status, scoreA, scoreB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchDto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    teamA: ").append(toIndentedString(teamA)).append("\n");
    sb.append("    coteA: ").append(toIndentedString(coteA)).append("\n");
    sb.append("    teamB: ").append(toIndentedString(teamB)).append("\n");
    sb.append("    coteB: ").append(toIndentedString(coteB)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scoreA: ").append(toIndentedString(scoreA)).append("\n");
    sb.append("    scoreB: ").append(toIndentedString(scoreB)).append("\n");
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

