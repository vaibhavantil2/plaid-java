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
import com.plaid.client.model.Pay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing both the current pay period and year to date amount for a category.
 */
@ApiModel(description = "An object representing both the current pay period and year to date amount for a category.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class Total {
  /**
   * Commonly used term to describe the line item.
   */
  @JsonAdapter(CanonicalDescriptionEnum.Adapter.class)
  public enum CanonicalDescriptionEnum {
    BONUS("BONUS"),
    
    COMMISSION("COMMISSION"),
    
    OVERTIME("OVERTIME"),
    
    PAID_TIME_OFF("PAID TIME OFF"),
    
    REGULAR_PAY("REGULAR PAY"),
    
    VACATION("VACATION"),
    
    EMPLOYEE_MEDICARE("EMPLOYEE MEDICARE"),
    
    FICA("FICA"),
    
    SOCIAL_SECURITY_EMPLOYEE_TAX("SOCIAL SECURITY EMPLOYEE TAX"),
    
    MEDICAL("MEDICAL"),
    
    VISION("VISION"),
    
    DENTAL("DENTAL"),
    
    NET_PAY("NET PAY"),
    
    TAXES("TAXES"),
    
    NOT_FOUND("NOT_FOUND"),
    
    OTHER("OTHER");

    private String value;

    CanonicalDescriptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CanonicalDescriptionEnum fromValue(String value) {
      for (CanonicalDescriptionEnum b : CanonicalDescriptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CanonicalDescriptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CanonicalDescriptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CanonicalDescriptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CanonicalDescriptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CANONICAL_DESCRIPTION = "canonical_description";
  @SerializedName(SERIALIZED_NAME_CANONICAL_DESCRIPTION)
  private CanonicalDescriptionEnum canonicalDescription;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENT_PAY = "current_pay";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAY)
  private Pay currentPay;

  public static final String SERIALIZED_NAME_YTD_PAY = "ytd_pay";
  @SerializedName(SERIALIZED_NAME_YTD_PAY)
  private Pay ytdPay;


  public Total canonicalDescription(CanonicalDescriptionEnum canonicalDescription) {
    
    this.canonicalDescription = canonicalDescription;
    return this;
  }

   /**
   * Commonly used term to describe the line item.
   * @return canonicalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Commonly used term to describe the line item.")

  public CanonicalDescriptionEnum getCanonicalDescription() {
    return canonicalDescription;
  }


  public void setCanonicalDescription(CanonicalDescriptionEnum canonicalDescription) {
    this.canonicalDescription = canonicalDescription;
  }


  public Total description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Text of the line item as printed on the paystub.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text of the line item as printed on the paystub.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Total currentPay(Pay currentPay) {
    
    this.currentPay = currentPay;
    return this;
  }

   /**
   * Get currentPay
   * @return currentPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getCurrentPay() {
    return currentPay;
  }


  public void setCurrentPay(Pay currentPay) {
    this.currentPay = currentPay;
  }


  public Total ytdPay(Pay ytdPay) {
    
    this.ytdPay = ytdPay;
    return this;
  }

   /**
   * Get ytdPay
   * @return ytdPay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Pay getYtdPay() {
    return ytdPay;
  }


  public void setYtdPay(Pay ytdPay) {
    this.ytdPay = ytdPay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Total total = (Total) o;
    return Objects.equals(this.canonicalDescription, total.canonicalDescription) &&
        Objects.equals(this.description, total.description) &&
        Objects.equals(this.currentPay, total.currentPay) &&
        Objects.equals(this.ytdPay, total.ytdPay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalDescription, description, currentPay, ytdPay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Total {\n");
    sb.append("    canonicalDescription: ").append(toIndentedString(canonicalDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currentPay: ").append(toIndentedString(currentPay)).append("\n");
    sb.append("    ytdPay: ").append(toIndentedString(ytdPay)).append("\n");
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

