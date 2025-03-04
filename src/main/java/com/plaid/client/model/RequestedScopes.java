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
import com.plaid.client.model.AccountFilter;
import com.plaid.client.model.AccountSelectionCardinality;
import com.plaid.client.model.ProductAccess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Scope of required and optional account features or content from a ConnectedApplication.
 */
@ApiModel(description = "Scope of required and optional account features or content from a ConnectedApplication.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class RequestedScopes {
  public static final String SERIALIZED_NAME_REQUIRED_PRODUCT_ACCESS = "required_product_access";
  @SerializedName(SERIALIZED_NAME_REQUIRED_PRODUCT_ACCESS)
  private ProductAccess requiredProductAccess;

  public static final String SERIALIZED_NAME_OPTIONAL_PRODUCT_ACCESS = "optional_product_access";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_PRODUCT_ACCESS)
  private ProductAccess optionalProductAccess;

  public static final String SERIALIZED_NAME_ACCOUNT_FILTERS = "account_filters";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_FILTERS)
  private AccountFilter accountFilters;

  public static final String SERIALIZED_NAME_ACCOUNT_SELECTION_CARDINALITY = "account_selection_cardinality";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SELECTION_CARDINALITY)
  private AccountSelectionCardinality accountSelectionCardinality;


  public RequestedScopes requiredProductAccess(ProductAccess requiredProductAccess) {
    
    this.requiredProductAccess = requiredProductAccess;
    return this;
  }

   /**
   * Get requiredProductAccess
   * @return requiredProductAccess
  **/
  @ApiModelProperty(required = true, value = "")

  public ProductAccess getRequiredProductAccess() {
    return requiredProductAccess;
  }


  public void setRequiredProductAccess(ProductAccess requiredProductAccess) {
    this.requiredProductAccess = requiredProductAccess;
  }


  public RequestedScopes optionalProductAccess(ProductAccess optionalProductAccess) {
    
    this.optionalProductAccess = optionalProductAccess;
    return this;
  }

   /**
   * Get optionalProductAccess
   * @return optionalProductAccess
  **/
  @ApiModelProperty(required = true, value = "")

  public ProductAccess getOptionalProductAccess() {
    return optionalProductAccess;
  }


  public void setOptionalProductAccess(ProductAccess optionalProductAccess) {
    this.optionalProductAccess = optionalProductAccess;
  }


  public RequestedScopes accountFilters(AccountFilter accountFilters) {
    
    this.accountFilters = accountFilters;
    return this;
  }

   /**
   * Get accountFilters
   * @return accountFilters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountFilter getAccountFilters() {
    return accountFilters;
  }


  public void setAccountFilters(AccountFilter accountFilters) {
    this.accountFilters = accountFilters;
  }


  public RequestedScopes accountSelectionCardinality(AccountSelectionCardinality accountSelectionCardinality) {
    
    this.accountSelectionCardinality = accountSelectionCardinality;
    return this;
  }

   /**
   * Get accountSelectionCardinality
   * @return accountSelectionCardinality
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountSelectionCardinality getAccountSelectionCardinality() {
    return accountSelectionCardinality;
  }


  public void setAccountSelectionCardinality(AccountSelectionCardinality accountSelectionCardinality) {
    this.accountSelectionCardinality = accountSelectionCardinality;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedScopes requestedScopes = (RequestedScopes) o;
    return Objects.equals(this.requiredProductAccess, requestedScopes.requiredProductAccess) &&
        Objects.equals(this.optionalProductAccess, requestedScopes.optionalProductAccess) &&
        Objects.equals(this.accountFilters, requestedScopes.accountFilters) &&
        Objects.equals(this.accountSelectionCardinality, requestedScopes.accountSelectionCardinality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredProductAccess, optionalProductAccess, accountFilters, accountSelectionCardinality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedScopes {\n");
    sb.append("    requiredProductAccess: ").append(toIndentedString(requiredProductAccess)).append("\n");
    sb.append("    optionalProductAccess: ").append(toIndentedString(optionalProductAccess)).append("\n");
    sb.append("    accountFilters: ").append(toIndentedString(accountFilters)).append("\n");
    sb.append("    accountSelectionCardinality: ").append(toIndentedString(accountSelectionCardinality)).append("\n");
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

