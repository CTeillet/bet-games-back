package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GameLeaguesDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class GameLeaguesDto {
	@JsonProperty("name")
	private String name;

	@JsonProperty("matches")
	@Valid
	private List<LeagueDto> matches = null;

	public GameLeaguesDto name(String name) {
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

	public GameLeaguesDto matches(List<LeagueDto> matches) {
		this.matches = matches;
		return this;
	}

	public GameLeaguesDto addMatchesItem(LeagueDto matchesItem) {
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

	public List<LeagueDto> getMatches() {
		return matches;
	}

	public void setMatches(List<LeagueDto> matches) {
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
		GameLeaguesDto gameLeagues = (GameLeaguesDto) o;
		return Objects.equals(this.name, gameLeagues.name) &&
				Objects.equals(this.matches, gameLeagues.matches);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, matches);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GameLeaguesDto {\n");

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

