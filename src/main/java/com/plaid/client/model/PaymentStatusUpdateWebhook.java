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
import com.plaid.client.model.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * Fired when the status of a payment has changed.
 */
@ApiModel(description = "Fired when the status of a payment has changed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class PaymentStatusUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  /**
   * The new status of the payment.  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  &#x60;PAYMENT_STATUS_PROCESSING&#x60;: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  &#x60;PAYMENT_STATUS_INITIATED&#x60;: The payment has been successfully initiated and is considered complete.  &#x60;PAYMENT_STATUS_COMPLETED&#x60;: Indicates that the standing order has been successfully established. This state is only used for standing orders.  &#x60;PAYMENT_STATUS_INSUFFICIENT_FUNDS&#x60;: The payment has failed due to insufficient funds.  &#x60;PAYMENT_STATUS_FAILED&#x60;: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  &#x60;PAYMENT_STATUS_BLOCKED&#x60;: The payment has been blocked. This is a retryable error.  &#x60;PAYMENT_STATUS_UNKNOWN&#x60;: The payment status is unknown.
   */
  @JsonAdapter(NewPaymentStatusEnum.Adapter.class)
  public enum NewPaymentStatusEnum {
    INPUT_NEEDED("PAYMENT_STATUS_INPUT_NEEDED"),
    
    PROCESSING("PAYMENT_STATUS_PROCESSING"),
    
    INITIATED("PAYMENT_STATUS_INITIATED"),
    
    COMPLETED("PAYMENT_STATUS_COMPLETED"),
    
    INSUFFICIENT_FUNDS("PAYMENT_STATUS_INSUFFICIENT_FUNDS"),
    
    FAILED("PAYMENT_STATUS_FAILED"),
    
    BLOCKED("PAYMENT_STATUS_BLOCKED"),
    
    UNKNOWN("PAYMENT_STATUS_UNKNOWN");

    private String value;

    NewPaymentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NewPaymentStatusEnum fromValue(String value) {
      for (NewPaymentStatusEnum b : NewPaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NewPaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NewPaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NewPaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NewPaymentStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NEW_PAYMENT_STATUS = "new_payment_status";
  @SerializedName(SERIALIZED_NAME_NEW_PAYMENT_STATUS)
  private NewPaymentStatusEnum newPaymentStatus;

  /**
   * The previous status of the payment.  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  &#x60;PAYMENT_STATUS_PROCESSING&#x60;: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  &#x60;PAYMENT_STATUS_INITIATED&#x60;: The payment has been successfully initiated and is considered complete.  &#x60;PAYMENT_STATUS_COMPLETED&#x60;: Indicates that the standing order has been successfully established. This state is only used for standing orders.  &#x60;PAYMENT_STATUS_INSUFFICIENT_FUNDS&#x60;: The payment has failed due to insufficient funds.  &#x60;PAYMENT_STATUS_FAILED&#x60;: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  &#x60;PAYMENT_STATUS_BLOCKED&#x60;: The payment has been blocked. This is a retryable error.  &#x60;PAYMENT_STATUS_UNKNOWN&#x60;: The payment status is unknown.
   */
  @JsonAdapter(OldPaymentStatusEnum.Adapter.class)
  public enum OldPaymentStatusEnum {
    INPUT_NEEDED("PAYMENT_STATUS_INPUT_NEEDED"),
    
    PROCESSING("PAYMENT_STATUS_PROCESSING"),
    
    INITIATED("PAYMENT_STATUS_INITIATED"),
    
    COMPLETED("PAYMENT_STATUS_COMPLETED"),
    
    INSUFFICIENT_FUNDS("PAYMENT_STATUS_INSUFFICIENT_FUNDS"),
    
    FAILED("PAYMENT_STATUS_FAILED"),
    
    BLOCKED("PAYMENT_STATUS_BLOCKED"),
    
    UNKNOWN("PAYMENT_STATUS_UNKNOWN");

    private String value;

    OldPaymentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OldPaymentStatusEnum fromValue(String value) {
      for (OldPaymentStatusEnum b : OldPaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OldPaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OldPaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OldPaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OldPaymentStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OLD_PAYMENT_STATUS = "old_payment_status";
  @SerializedName(SERIALIZED_NAME_OLD_PAYMENT_STATUS)
  private OldPaymentStatusEnum oldPaymentStatus;

  public static final String SERIALIZED_NAME_ORIGINAL_REFERENCE = "original_reference";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REFERENCE)
  private String originalReference;

  public static final String SERIALIZED_NAME_ADJUSTED_REFERENCE = "adjusted_reference";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_REFERENCE)
  private String adjustedReference;

  public static final String SERIALIZED_NAME_ORIGINAL_START_DATE = "original_start_date";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_START_DATE)
  private LocalDate originalStartDate;

  public static final String SERIALIZED_NAME_ADJUSTED_START_DATE = "adjusted_start_date";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_START_DATE)
  private LocalDate adjustedStartDate;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;


  public PaymentStatusUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;PAYMENT_INITIATION&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`PAYMENT_INITIATION`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public PaymentStatusUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;PAYMENT_STATUS_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`PAYMENT_STATUS_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public PaymentStatusUpdateWebhook paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The &#x60;payment_id&#x60; for the payment being updated
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "The `payment_id` for the payment being updated")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public PaymentStatusUpdateWebhook newPaymentStatus(NewPaymentStatusEnum newPaymentStatus) {
    
    this.newPaymentStatus = newPaymentStatus;
    return this;
  }

   /**
   * The new status of the payment.  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  &#x60;PAYMENT_STATUS_PROCESSING&#x60;: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  &#x60;PAYMENT_STATUS_INITIATED&#x60;: The payment has been successfully initiated and is considered complete.  &#x60;PAYMENT_STATUS_COMPLETED&#x60;: Indicates that the standing order has been successfully established. This state is only used for standing orders.  &#x60;PAYMENT_STATUS_INSUFFICIENT_FUNDS&#x60;: The payment has failed due to insufficient funds.  &#x60;PAYMENT_STATUS_FAILED&#x60;: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  &#x60;PAYMENT_STATUS_BLOCKED&#x60;: The payment has been blocked. This is a retryable error.  &#x60;PAYMENT_STATUS_UNKNOWN&#x60;: The payment status is unknown.
   * @return newPaymentStatus
  **/
  @ApiModelProperty(required = true, value = "The new status of the payment.  `PAYMENT_STATUS_INPUT_NEEDED`: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  `PAYMENT_STATUS_PROCESSING`: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  `PAYMENT_STATUS_INITIATED`: The payment has been successfully initiated and is considered complete.  `PAYMENT_STATUS_COMPLETED`: Indicates that the standing order has been successfully established. This state is only used for standing orders.  `PAYMENT_STATUS_INSUFFICIENT_FUNDS`: The payment has failed due to insufficient funds.  `PAYMENT_STATUS_FAILED`: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  `PAYMENT_STATUS_BLOCKED`: The payment has been blocked. This is a retryable error.  `PAYMENT_STATUS_UNKNOWN`: The payment status is unknown.")

  public NewPaymentStatusEnum getNewPaymentStatus() {
    return newPaymentStatus;
  }


  public void setNewPaymentStatus(NewPaymentStatusEnum newPaymentStatus) {
    this.newPaymentStatus = newPaymentStatus;
  }


  public PaymentStatusUpdateWebhook oldPaymentStatus(OldPaymentStatusEnum oldPaymentStatus) {
    
    this.oldPaymentStatus = oldPaymentStatus;
    return this;
  }

   /**
   * The previous status of the payment.  &#x60;PAYMENT_STATUS_INPUT_NEEDED&#x60;: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  &#x60;PAYMENT_STATUS_PROCESSING&#x60;: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  &#x60;PAYMENT_STATUS_INITIATED&#x60;: The payment has been successfully initiated and is considered complete.  &#x60;PAYMENT_STATUS_COMPLETED&#x60;: Indicates that the standing order has been successfully established. This state is only used for standing orders.  &#x60;PAYMENT_STATUS_INSUFFICIENT_FUNDS&#x60;: The payment has failed due to insufficient funds.  &#x60;PAYMENT_STATUS_FAILED&#x60;: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  &#x60;PAYMENT_STATUS_BLOCKED&#x60;: The payment has been blocked. This is a retryable error.  &#x60;PAYMENT_STATUS_UNKNOWN&#x60;: The payment status is unknown.
   * @return oldPaymentStatus
  **/
  @ApiModelProperty(required = true, value = "The previous status of the payment.  `PAYMENT_STATUS_INPUT_NEEDED`: This is the initial state of all payments. It indicates that the payment is waiting on user input to continue processing. A payment may re-enter this state later on if further input is needed.  `PAYMENT_STATUS_PROCESSING`: The payment is currently being processed. The payment will automatically exit this state when processing is complete.  `PAYMENT_STATUS_INITIATED`: The payment has been successfully initiated and is considered complete.  `PAYMENT_STATUS_COMPLETED`: Indicates that the standing order has been successfully established. This state is only used for standing orders.  `PAYMENT_STATUS_INSUFFICIENT_FUNDS`: The payment has failed due to insufficient funds.  `PAYMENT_STATUS_FAILED`: The payment has failed to be initiated. This error is retryable once the root cause is resolved.  `PAYMENT_STATUS_BLOCKED`: The payment has been blocked. This is a retryable error.  `PAYMENT_STATUS_UNKNOWN`: The payment status is unknown.")

  public OldPaymentStatusEnum getOldPaymentStatus() {
    return oldPaymentStatus;
  }


  public void setOldPaymentStatus(OldPaymentStatusEnum oldPaymentStatus) {
    this.oldPaymentStatus = oldPaymentStatus;
  }


  public PaymentStatusUpdateWebhook originalReference(String originalReference) {
    
    this.originalReference = originalReference;
    return this;
  }

   /**
   * The original value of the reference when creating the payment.
   * @return originalReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The original value of the reference when creating the payment.")

  public String getOriginalReference() {
    return originalReference;
  }


  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }


  public PaymentStatusUpdateWebhook adjustedReference(String adjustedReference) {
    
    this.adjustedReference = adjustedReference;
    return this;
  }

   /**
   * The value of the reference sent to the bank after adjustment to pass bank validation rules.
   * @return adjustedReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the reference sent to the bank after adjustment to pass bank validation rules.")

  public String getAdjustedReference() {
    return adjustedReference;
  }


  public void setAdjustedReference(String adjustedReference) {
    this.adjustedReference = adjustedReference;
  }


  public PaymentStatusUpdateWebhook originalStartDate(LocalDate originalStartDate) {
    
    this.originalStartDate = originalStartDate;
    return this;
  }

   /**
   * The original value of the &#x60;start_date&#x60; provided during the creation of a standing order. If the payment is not a standing order, this field will be &#x60;null&#x60;.
   * @return originalStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The original value of the `start_date` provided during the creation of a standing order. If the payment is not a standing order, this field will be `null`.")

  public LocalDate getOriginalStartDate() {
    return originalStartDate;
  }


  public void setOriginalStartDate(LocalDate originalStartDate) {
    this.originalStartDate = originalStartDate;
  }


  public PaymentStatusUpdateWebhook adjustedStartDate(LocalDate adjustedStartDate) {
    
    this.adjustedStartDate = adjustedStartDate;
    return this;
  }

   /**
   * The start date sent to the bank after adjusting for holidays or weekends.  Will be provided in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). If the start date did not require adjustment, or if the payment is not a standing order, this field will be &#x60;null&#x60;.
   * @return adjustedStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The start date sent to the bank after adjusting for holidays or weekends.  Will be provided in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). If the start date did not require adjustment, or if the payment is not a standing order, this field will be `null`.")

  public LocalDate getAdjustedStartDate() {
    return adjustedStartDate;
  }


  public void setAdjustedStartDate(LocalDate adjustedStartDate) {
    this.adjustedStartDate = adjustedStartDate;
  }


  public PaymentStatusUpdateWebhook timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. &#x60;\&quot;2017-09-14T14:42:19.350Z\&quot;&#x60;
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The timestamp of the update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. `\"2017-09-14T14:42:19.350Z\"`")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public PaymentStatusUpdateWebhook error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentStatusUpdateWebhook paymentStatusUpdateWebhook = (PaymentStatusUpdateWebhook) o;
    return Objects.equals(this.webhookType, paymentStatusUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, paymentStatusUpdateWebhook.webhookCode) &&
        Objects.equals(this.paymentId, paymentStatusUpdateWebhook.paymentId) &&
        Objects.equals(this.newPaymentStatus, paymentStatusUpdateWebhook.newPaymentStatus) &&
        Objects.equals(this.oldPaymentStatus, paymentStatusUpdateWebhook.oldPaymentStatus) &&
        Objects.equals(this.originalReference, paymentStatusUpdateWebhook.originalReference) &&
        Objects.equals(this.adjustedReference, paymentStatusUpdateWebhook.adjustedReference) &&
        Objects.equals(this.originalStartDate, paymentStatusUpdateWebhook.originalStartDate) &&
        Objects.equals(this.adjustedStartDate, paymentStatusUpdateWebhook.adjustedStartDate) &&
        Objects.equals(this.timestamp, paymentStatusUpdateWebhook.timestamp) &&
        Objects.equals(this.error, paymentStatusUpdateWebhook.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, paymentId, newPaymentStatus, oldPaymentStatus, originalReference, adjustedReference, originalStartDate, adjustedStartDate, timestamp, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentStatusUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    newPaymentStatus: ").append(toIndentedString(newPaymentStatus)).append("\n");
    sb.append("    oldPaymentStatus: ").append(toIndentedString(oldPaymentStatus)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    adjustedReference: ").append(toIndentedString(adjustedReference)).append("\n");
    sb.append("    originalStartDate: ").append(toIndentedString(originalStartDate)).append("\n");
    sb.append("    adjustedStartDate: ").append(toIndentedString(adjustedStartDate)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

