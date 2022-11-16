package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AuthRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class AuthRequestDto {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  public AuthRequestDto username(String username) {
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

  public AuthRequestDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   *
   * @return password
   */
  @ApiModelProperty(example = "[\"qwertyuiop\"]", value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthRequestDto authRequest = (AuthRequestDto) o;
    return Objects.equals(this.username, authRequest.username) &&
            Objects.equals(this.password, authRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRequestDto {\n");

    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

