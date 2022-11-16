package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * DeleteRequestDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class DeleteRequestDto {
  @JsonProperty("username")
  private String username;

  public DeleteRequestDto username(String username) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteRequestDto deleteRequest = (DeleteRequestDto) o;
    return Objects.equals(this.username, deleteRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteRequestDto {\n");

    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

