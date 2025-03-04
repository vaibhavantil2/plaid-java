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
 * The receiver details if the type of this event is &#x60;reciever_pending&#x60; or &#x60;reciever_posted&#x60;. Null value otherwise.
 */
@ApiModel(description = "The receiver details if the type of this event is `reciever_pending` or `reciever_posted`. Null value otherwise.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class BankTransferReceiverDetails {
  /**
   * The sign of the available balance for the receiver bank account associated with the receiver event at the time the matching transaction was found. Can be &#x60;positive&#x60;, &#x60;negative&#x60;, or null if the balance was not available at the time.
   */
  @JsonAdapter(AvailableBalanceEnum.Adapter.class)
  public enum AvailableBalanceEnum {
    POSITIVE("positive"),
    
    NEGATIVE("negative"),
    
    NULL("null");

    private String value;

    AvailableBalanceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailableBalanceEnum fromValue(String value) {
      for (AvailableBalanceEnum b : AvailableBalanceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AvailableBalanceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailableBalanceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailableBalanceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AvailableBalanceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "available_balance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private AvailableBalanceEnum availableBalance;


  public BankTransferReceiverDetails availableBalance(AvailableBalanceEnum availableBalance) {
    
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * The sign of the available balance for the receiver bank account associated with the receiver event at the time the matching transaction was found. Can be &#x60;positive&#x60;, &#x60;negative&#x60;, or null if the balance was not available at the time.
   * @return availableBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The sign of the available balance for the receiver bank account associated with the receiver event at the time the matching transaction was found. Can be `positive`, `negative`, or null if the balance was not available at the time.")

  public AvailableBalanceEnum getAvailableBalance() {
    return availableBalance;
  }


  public void setAvailableBalance(AvailableBalanceEnum availableBalance) {
    this.availableBalance = availableBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransferReceiverDetails bankTransferReceiverDetails = (BankTransferReceiverDetails) o;
    return Objects.equals(this.availableBalance, bankTransferReceiverDetails.availableBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransferReceiverDetails {\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
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

