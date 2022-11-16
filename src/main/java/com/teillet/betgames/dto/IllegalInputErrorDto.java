package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * IllegalInputErrorDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class IllegalInputErrorDto {
  @JsonProperty("message")
  private String message;

  @JsonProperty("code")
  private Integer code;

  public IllegalInputErrorDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IllegalInputErrorDto code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * minimum: 400
   * maximum: 400
   *
   * @return code
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Min(400)
  @Max(400)
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IllegalInputErrorDto illegalInputError = (IllegalInputErrorDto) o;
    return Objects.equals(this.message, illegalInputError.message) &&
            Objects.equals(this.code, illegalInputError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IllegalInputErrorDto {\n");

    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

