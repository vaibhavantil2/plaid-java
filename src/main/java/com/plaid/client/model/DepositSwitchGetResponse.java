/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.16.6
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
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * DepositSwitchGetResponse defines the response schema for &#x60;/deposit_switch/get&#x60;
 */
@ApiModel(description = "DepositSwitchGetResponse defines the response schema for `/deposit_switch/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-21T20:55:49.221Z[GMT]")
public class DepositSwitchGetResponse {
  public static final String SERIALIZED_NAME_DEPOSIT_SWITCH_ID = "deposit_switch_id";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_SWITCH_ID)
  private String depositSwitchId;

  public static final String SERIALIZED_NAME_TARGET_ACCOUNT_ID = "target_account_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ACCOUNT_ID)
  private String targetAccountId;

  public static final String SERIALIZED_NAME_TARGET_ITEM_ID = "target_item_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ITEM_ID)
  private String targetItemId;

  /**
   * The state of the deposit switch.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    INITIALIZED("initialized"),
    
    COMPLETED("completed"),
    
    ERROR("error");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_ACCOUNT_HAS_MULTIPLE_ALLOCATIONS = "account_has_multiple_allocations";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HAS_MULTIPLE_ALLOCATIONS)
  private Boolean accountHasMultipleAllocations;

  public static final String SERIALIZED_NAME_IS_ALLOCATED_REMAINDER = "is_allocated_remainder";
  @SerializedName(SERIALIZED_NAME_IS_ALLOCATED_REMAINDER)
  private Boolean isAllocatedRemainder;

  public static final String SERIALIZED_NAME_PERCENT_ALLOCATED = "percent_allocated";
  @SerializedName(SERIALIZED_NAME_PERCENT_ALLOCATED)
  private Double percentAllocated;

  public static final String SERIALIZED_NAME_AMOUNT_ALLOCATED = "amount_allocated";
  @SerializedName(SERIALIZED_NAME_AMOUNT_ALLOCATED)
  private Double amountAllocated;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private LocalDate dateCreated;

  public static final String SERIALIZED_NAME_DATE_COMPLETED = "date_completed";
  @SerializedName(SERIALIZED_NAME_DATE_COMPLETED)
  private LocalDate dateCompleted;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public DepositSwitchGetResponse depositSwitchId(String depositSwitchId) {
    
    this.depositSwitchId = depositSwitchId;
    return this;
  }

   /**
   * The ID of the deposit switch
   * @return depositSwitchId
  **/
  @ApiModelProperty(required = true, value = "The ID of the deposit switch")

  public String getDepositSwitchId() {
    return depositSwitchId;
  }


  public void setDepositSwitchId(String depositSwitchId) {
    this.depositSwitchId = depositSwitchId;
  }


  public DepositSwitchGetResponse targetAccountId(String targetAccountId) {
    
    this.targetAccountId = targetAccountId;
    return this;
  }

   /**
   * The ID of the bank account the direct deposit was switched to
   * @return targetAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the bank account the direct deposit was switched to")

  public String getTargetAccountId() {
    return targetAccountId;
  }


  public void setTargetAccountId(String targetAccountId) {
    this.targetAccountId = targetAccountId;
  }


  public DepositSwitchGetResponse targetItemId(String targetItemId) {
    
    this.targetItemId = targetItemId;
    return this;
  }

   /**
   * The ID of the Item the direct deposit was switched to.
   * @return targetItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ID of the Item the direct deposit was switched to.")

  public String getTargetItemId() {
    return targetItemId;
  }


  public void setTargetItemId(String targetItemId) {
    this.targetItemId = targetItemId;
  }


  public DepositSwitchGetResponse state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the deposit switch.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "The state of the deposit switch.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public DepositSwitchGetResponse accountHasMultipleAllocations(Boolean accountHasMultipleAllocations) {
    
    this.accountHasMultipleAllocations = accountHasMultipleAllocations;
    return this;
  }

   /**
   * When &#x60;true&#x60;, user’s direct deposit goes to multiple banks. When false, user’s direct deposit only goes to the target account. Always &#x60;null&#x60; if the deposit switch has not been completed.
   * @return accountHasMultipleAllocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "When `true`, user’s direct deposit goes to multiple banks. When false, user’s direct deposit only goes to the target account. Always `null` if the deposit switch has not been completed.")

  public Boolean getAccountHasMultipleAllocations() {
    return accountHasMultipleAllocations;
  }


  public void setAccountHasMultipleAllocations(Boolean accountHasMultipleAllocations) {
    this.accountHasMultipleAllocations = accountHasMultipleAllocations;
  }


  public DepositSwitchGetResponse isAllocatedRemainder(Boolean isAllocatedRemainder) {
    
    this.isAllocatedRemainder = isAllocatedRemainder;
    return this;
  }

   /**
   * When &#x60;true&#x60;, the target account is allocated the remainder of direct deposit after all other allocations have been deducted. When &#x60;false&#x60;, user’s direct deposit is allocated as a percent or amount. Always &#x60;null&#x60; if the deposit switch has not been completed.
   * @return isAllocatedRemainder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "When `true`, the target account is allocated the remainder of direct deposit after all other allocations have been deducted. When `false`, user’s direct deposit is allocated as a percent or amount. Always `null` if the deposit switch has not been completed.")

  public Boolean getIsAllocatedRemainder() {
    return isAllocatedRemainder;
  }


  public void setIsAllocatedRemainder(Boolean isAllocatedRemainder) {
    this.isAllocatedRemainder = isAllocatedRemainder;
  }


  public DepositSwitchGetResponse percentAllocated(Double percentAllocated) {
    
    this.percentAllocated = percentAllocated;
    return this;
  }

   /**
   * The percentage of direct deposit allocated to the target account. Always &#x60;null&#x60; if the target account is not allocated a percentage or if the deposit switch has not been completed or if &#x60;is_allocated_remainder&#x60; is true.
   * @return percentAllocated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The percentage of direct deposit allocated to the target account. Always `null` if the target account is not allocated a percentage or if the deposit switch has not been completed or if `is_allocated_remainder` is true.")

  public Double getPercentAllocated() {
    return percentAllocated;
  }


  public void setPercentAllocated(Double percentAllocated) {
    this.percentAllocated = percentAllocated;
  }


  public DepositSwitchGetResponse amountAllocated(Double amountAllocated) {
    
    this.amountAllocated = amountAllocated;
    return this;
  }

   /**
   * The dollar amount of direct deposit allocated to the target account. Always &#x60;null&#x60; if the target account is not allocated an amount or if the deposit switch has not been completed.
   * @return amountAllocated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The dollar amount of direct deposit allocated to the target account. Always `null` if the target account is not allocated an amount or if the deposit switch has not been completed.")

  public Double getAmountAllocated() {
    return amountAllocated;
  }


  public void setAmountAllocated(Double amountAllocated) {
    this.amountAllocated = amountAllocated;
  }


  public DepositSwitchGetResponse dateCreated(LocalDate dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * ISO8601 date the deposit switch was created.
   * @return dateCreated
  **/
  @ApiModelProperty(required = true, value = "ISO8601 date the deposit switch was created.")

  public LocalDate getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }


  public DepositSwitchGetResponse dateCompleted(LocalDate dateCompleted) {
    
    this.dateCompleted = dateCompleted;
    return this;
  }

   /**
   * ISO8601 date the deposit switch was completed. Always &#x60;null&#x60; if the deposit switch has not been completed.
   * @return dateCompleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "ISO8601 date the deposit switch was completed. Always `null` if the deposit switch has not been completed.")

  public LocalDate getDateCompleted() {
    return dateCompleted;
  }


  public void setDateCompleted(LocalDate dateCompleted) {
    this.dateCompleted = dateCompleted;
  }


  public DepositSwitchGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSwitchGetResponse depositSwitchGetResponse = (DepositSwitchGetResponse) o;
    return Objects.equals(this.depositSwitchId, depositSwitchGetResponse.depositSwitchId) &&
        Objects.equals(this.targetAccountId, depositSwitchGetResponse.targetAccountId) &&
        Objects.equals(this.targetItemId, depositSwitchGetResponse.targetItemId) &&
        Objects.equals(this.state, depositSwitchGetResponse.state) &&
        Objects.equals(this.accountHasMultipleAllocations, depositSwitchGetResponse.accountHasMultipleAllocations) &&
        Objects.equals(this.isAllocatedRemainder, depositSwitchGetResponse.isAllocatedRemainder) &&
        Objects.equals(this.percentAllocated, depositSwitchGetResponse.percentAllocated) &&
        Objects.equals(this.amountAllocated, depositSwitchGetResponse.amountAllocated) &&
        Objects.equals(this.dateCreated, depositSwitchGetResponse.dateCreated) &&
        Objects.equals(this.dateCompleted, depositSwitchGetResponse.dateCompleted) &&
        Objects.equals(this.requestId, depositSwitchGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositSwitchId, targetAccountId, targetItemId, state, accountHasMultipleAllocations, isAllocatedRemainder, percentAllocated, amountAllocated, dateCreated, dateCompleted, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSwitchGetResponse {\n");
    sb.append("    depositSwitchId: ").append(toIndentedString(depositSwitchId)).append("\n");
    sb.append("    targetAccountId: ").append(toIndentedString(targetAccountId)).append("\n");
    sb.append("    targetItemId: ").append(toIndentedString(targetItemId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    accountHasMultipleAllocations: ").append(toIndentedString(accountHasMultipleAllocations)).append("\n");
    sb.append("    isAllocatedRemainder: ").append(toIndentedString(isAllocatedRemainder)).append("\n");
    sb.append("    percentAllocated: ").append(toIndentedString(percentAllocated)).append("\n");
    sb.append("    amountAllocated: ").append(toIndentedString(amountAllocated)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
