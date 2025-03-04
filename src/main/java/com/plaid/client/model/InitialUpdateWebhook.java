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
import java.math.BigDecimal;

/**
 * Fired when an Item&#39;s initial transaction pull is completed. Once this webhook has been fired, transaction data for the most recent 30 days can be fetched for the Item. If [Account Select v2](https://plaid.com/docs/link/customization/#account-select) is enabled, this webhook will also be fired if account selections for the Item are updated, with &#x60;num_transactions&#x60; set to the number of net new transactions pulled after the account selection update.
 */
@ApiModel(description = "Fired when an Item's initial transaction pull is completed. Once this webhook has been fired, transaction data for the most recent 30 days can be fetched for the Item. If [Account Select v2](https://plaid.com/docs/link/customization/#account-select) is enabled, this webhook will also be fired if account selections for the Item are updated, with `num_transactions` set to the number of net new transactions pulled after the account selection update.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class InitialUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_NEW_TRANSACTIONS = "new_transactions";
  @SerializedName(SERIALIZED_NAME_NEW_TRANSACTIONS)
  private Double newTransactions;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;


  public InitialUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;TRANSACTIONS&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`TRANSACTIONS`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public InitialUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;INITIAL_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`INITIAL_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public InitialUpdateWebhook error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * The error code associated with the webhook.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error code associated with the webhook.")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public InitialUpdateWebhook newTransactions(Double newTransactions) {
    
    this.newTransactions = newTransactions;
    return this;
  }

   /**
   * The number of new, unfetched transactions available.
   * @return newTransactions
  **/
  @ApiModelProperty(required = true, value = "The number of new, unfetched transactions available.")

  public Double getNewTransactions() {
    return newTransactions;
  }


  public void setNewTransactions(Double newTransactions) {
    this.newTransactions = newTransactions;
  }


  public InitialUpdateWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitialUpdateWebhook initialUpdateWebhook = (InitialUpdateWebhook) o;
    return Objects.equals(this.webhookType, initialUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, initialUpdateWebhook.webhookCode) &&
        Objects.equals(this.error, initialUpdateWebhook.error) &&
        Objects.equals(this.newTransactions, initialUpdateWebhook.newTransactions) &&
        Objects.equals(this.itemId, initialUpdateWebhook.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, error, newTransactions, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitialUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    newTransactions: ").append(toIndentedString(newTransactions)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

