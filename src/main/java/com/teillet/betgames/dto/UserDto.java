package com.teillet.betgames.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * This object represents a user with : -mail -password -username -firstName -lastName -birthDate
 */
@ApiModel(description = "This object represents a user with : -mail -password -username -firstName -lastName -birthDate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T22:15:04.936743+01:00[Europe/Paris]")
public class UserDto {
  @JsonProperty("username")
  private String username;

  @JsonProperty("mail")
  private String mail;

  @JsonProperty("password")
  private String password;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("birthDate")
  private String birthDate;

  @JsonProperty("balance")
  private Double balance;

  public UserDto username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   *
   * @return username
   */
  @ApiModelProperty(example = "[\"toto\"]", required = true, value = "")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserDto mail(String mail) {
    this.mail = mail;
    return this;
  }

  /**
   * Get mail
   *
   * @return mail
   */
  @ApiModelProperty(example = "[\"qwerty.uiop@asdf.com\"]", required = true, value = "")
  @NotNull


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public UserDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   *
   * @return password
   */
  @ApiModelProperty(example = "[\"qwertyuiop[1234567890-\"]", required = true, value = "")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   *
   * @return firstName
   */
  @ApiModelProperty(example = "[\"toto\"]", required = true, value = "")
  @NotNull


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   *
   * @return lastName
   */
  @ApiModelProperty(example = "[\"titi\"]", required = true, value = "")
  @NotNull


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserDto birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   *
   * @return birthDate
   */
  @ApiModelProperty(example = "[\"30/10/2022\"]", required = true, value = "")
  @NotNull


  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public UserDto balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * minimum: 0
   *
   * @return balance
   */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DecimalMin("0")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto user = (UserDto) o;
    return Objects.equals(this.username, user.username) &&
            Objects.equals(this.mail, user.mail) &&
            Objects.equals(this.password, user.password) &&
            Objects.equals(this.firstName, user.firstName) &&
            Objects.equals(this.lastName, user.lastName) &&
            Objects.equals(this.birthDate, user.birthDate) &&
            Objects.equals(this.balance, user.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, mail, password, firstName, lastName, birthDate, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");

    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

