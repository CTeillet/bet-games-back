package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AuthResponseDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class AuthResponseDto {
  @JsonProperty("username")
  private String username;

  @JsonProperty("accessToken")
  private String accessToken;

  public AuthResponseDto username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   *
   * @return username
   */
  @ApiModelProperty(example = "[\"Nono\"]", value = "")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public AuthResponseDto accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   *
   * @return accessToken
   */
  @ApiModelProperty(example = "[\"yJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjVmZjM0ZjQ2ODU1MzU4MDAxM2Q0NzQwZCIsImlhdCI6MTY2NTg2NjIyOCwiZXhwIjoxNjY1OTUyNjI4fQ.8Y0YV7mYKjZc3qZ3jK6W1C5O5x2b3qo3c\"]", value = "")


  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthResponseDto authResponse = (AuthResponseDto) o;
    return Objects.equals(this.username, authResponse.username) &&
            Objects.equals(this.accessToken, authResponse.accessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, accessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthResponseDto {\n");

    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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

