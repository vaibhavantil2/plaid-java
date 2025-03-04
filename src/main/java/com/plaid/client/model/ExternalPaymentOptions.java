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
import com.plaid.client.model.PaymentInitiationOptionalRestrictionBacs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Additional payment options
 */
@ApiModel(description = "Additional payment options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class ExternalPaymentOptions {
  public static final String SERIALIZED_NAME_REQUEST_REFUND_DETAILS = "request_refund_details";
  @SerializedName(SERIALIZED_NAME_REQUEST_REFUND_DETAILS)
  private Boolean requestRefundDetails;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_BACS = "bacs";
  @SerializedName(SERIALIZED_NAME_BACS)
  private PaymentInitiationOptionalRestrictionBacs bacs = null;

  public static final String SERIALIZED_NAME_EMI_ACCOUNT_ID = "emi_account_id";
  @SerializedName(SERIALIZED_NAME_EMI_ACCOUNT_ID)
  private String emiAccountId;


  public ExternalPaymentOptions requestRefundDetails(Boolean requestRefundDetails) {
    
    this.requestRefundDetails = requestRefundDetails;
    return this;
  }

   /**
   * When &#x60;true&#x60;, Plaid will attempt to request refund details from the payee&#39;s financial institution.  Support varies between financial institutions and will not always be available.  If refund details could be retrieved, they will be available in the &#x60;/payment_initiation/payment/get&#x60; response.
   * @return requestRefundDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `true`, Plaid will attempt to request refund details from the payee's financial institution.  Support varies between financial institutions and will not always be available.  If refund details could be retrieved, they will be available in the `/payment_initiation/payment/get` response.")

  public Boolean getRequestRefundDetails() {
    return requestRefundDetails;
  }


  public void setRequestRefundDetails(Boolean requestRefundDetails) {
    this.requestRefundDetails = requestRefundDetails;
  }


  public ExternalPaymentOptions iban(String iban) {
    
    this.iban = iban;
    return this;
  }

   /**
   * The International Bank Account Number (IBAN) for the payer&#39;s account. If provided, the end user will be able to send payments only from the specified bank account.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Bank Account Number (IBAN) for the payer's account. If provided, the end user will be able to send payments only from the specified bank account.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    this.iban = iban;
  }


  public ExternalPaymentOptions bacs(PaymentInitiationOptionalRestrictionBacs bacs) {
    
    this.bacs = bacs;
    return this;
  }

   /**
   * Get bacs
   * @return bacs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInitiationOptionalRestrictionBacs getBacs() {
    return bacs;
  }


  public void setBacs(PaymentInitiationOptionalRestrictionBacs bacs) {
    this.bacs = bacs;
  }


  public ExternalPaymentOptions emiAccountId(String emiAccountId) {
    
    this.emiAccountId = emiAccountId;
    return this;
  }

   /**
   * The EMI (E-Money Institution) account that this payment is associated with, if any. This EMI account is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.
   * @return emiAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EMI (E-Money Institution) account that this payment is associated with, if any. This EMI account is used as an intermediary account to enable Plaid to reconcile the settlement of funds for Payment Initiation requests.")

  public String getEmiAccountId() {
    return emiAccountId;
  }


  public void setEmiAccountId(String emiAccountId) {
    this.emiAccountId = emiAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPaymentOptions externalPaymentOptions = (ExternalPaymentOptions) o;
    return Objects.equals(this.requestRefundDetails, externalPaymentOptions.requestRefundDetails) &&
        Objects.equals(this.iban, externalPaymentOptions.iban) &&
        Objects.equals(this.bacs, externalPaymentOptions.bacs) &&
        Objects.equals(this.emiAccountId, externalPaymentOptions.emiAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestRefundDetails, iban, bacs, emiAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPaymentOptions {\n");
    sb.append("    requestRefundDetails: ").append(toIndentedString(requestRefundDetails)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bacs: ").append(toIndentedString(bacs)).append("\n");
    sb.append("    emiAccountId: ").append(toIndentedString(emiAccountId)).append("\n");
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

