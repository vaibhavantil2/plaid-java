/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.40.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaystubAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class PaystubAddress {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_LINE1 = "line1";
  @SerializedName(SERIALIZED_NAME_LINE1)
  private String line1;

  public static final String SERIALIZED_NAME_LINE2 = "line2";
  @SerializedName(SERIALIZED_NAME_LINE2)
  private String line2;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;


  public PaystubAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The full city name.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full city name.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public PaystubAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The ISO 3166-1 alpha-2 country code.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO 3166-1 alpha-2 country code.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PaystubAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code of the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code of the address.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PaystubAddress region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region or state Example: &#x60;\&quot;NC\&quot;&#x60;
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region or state Example: `\"NC\"`")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public PaystubAddress street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The full street address.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full street address.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public PaystubAddress line1(String line1) {
    
    this.line1 = line1;
    return this;
  }

   /**
   * Street address line 1.
   * @return line1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street address line 1.")

  public String getLine1() {
    return line1;
  }


  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public PaystubAddress line2(String line2) {
    
    this.line2 = line2;
    return this;
  }

   /**
   * Street address line 2.
   * @return line2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street address line 2.")

  public String getLine2() {
    return line2;
  }


  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public PaystubAddress stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * The region or state Example: &#x60;\&quot;NC\&quot;&#x60;
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region or state Example: `\"NC\"`")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubAddress paystubAddress = (PaystubAddress) o;
    return Objects.equals(this.city, paystubAddress.city) &&
        Objects.equals(this.country, paystubAddress.country) &&
        Objects.equals(this.postalCode, paystubAddress.postalCode) &&
        Objects.equals(this.region, paystubAddress.region) &&
        Objects.equals(this.street, paystubAddress.street) &&
        Objects.equals(this.line1, paystubAddress.line1) &&
        Objects.equals(this.line2, paystubAddress.line2) &&
        Objects.equals(this.stateCode, paystubAddress.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, postalCode, region, street, line1, line2, stateCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

