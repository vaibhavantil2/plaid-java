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
import com.plaid.client.model.AssetReportTransaction;
import com.plaid.client.model.HistoricalBalance;
import com.plaid.client.model.Owner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountAssetsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:49:31.513Z[GMT]")
public class AccountAssetsAllOf {
  public static final String SERIALIZED_NAME_DAYS_AVAILABLE = "days_available";
  @SerializedName(SERIALIZED_NAME_DAYS_AVAILABLE)
  private Double daysAvailable;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<AssetReportTransaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = new ArrayList<>();

  public static final String SERIALIZED_NAME_HISTORICAL_BALANCES = "historical_balances";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_BALANCES)
  private List<HistoricalBalance> historicalBalances = new ArrayList<>();


  public AccountAssetsAllOf daysAvailable(Double daysAvailable) {
    
    this.daysAvailable = daysAvailable;
    return this;
  }

   /**
   * The duration of transaction history available for this Item, typically defined as the time since the date of the earliest transaction in that account. Only returned by Assets endpoints.
   * @return daysAvailable
  **/
  @ApiModelProperty(required = true, value = "The duration of transaction history available for this Item, typically defined as the time since the date of the earliest transaction in that account. Only returned by Assets endpoints.")

  public Double getDaysAvailable() {
    return daysAvailable;
  }


  public void setDaysAvailable(Double daysAvailable) {
    this.daysAvailable = daysAvailable;
  }


  public AccountAssetsAllOf transactions(List<AssetReportTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public AccountAssetsAllOf addTransactionsItem(AssetReportTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Transaction history associated with the account. Only returned by Assets endpoints. Transaction history returned by endpoints such as &#x60;/transactions/get&#x60; or &#x60;/investments/transactions/get&#x60; will be returned in the top-level &#x60;transactions&#x60; field instead.
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "Transaction history associated with the account. Only returned by Assets endpoints. Transaction history returned by endpoints such as `/transactions/get` or `/investments/transactions/get` will be returned in the top-level `transactions` field instead.")

  public List<AssetReportTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<AssetReportTransaction> transactions) {
    this.transactions = transactions;
  }


  public AccountAssetsAllOf owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public AccountAssetsAllOf addOwnersItem(Owner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. Multiple owners on a single account will be represented in the same &#x60;owner&#x60; object, not in multiple owner objects within the array.
   * @return owners
  **/
  @ApiModelProperty(required = true, value = "Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. Multiple owners on a single account will be represented in the same `owner` object, not in multiple owner objects within the array.")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  public AccountAssetsAllOf historicalBalances(List<HistoricalBalance> historicalBalances) {
    
    this.historicalBalances = historicalBalances;
    return this;
  }

  public AccountAssetsAllOf addHistoricalBalancesItem(HistoricalBalance historicalBalancesItem) {
    this.historicalBalances.add(historicalBalancesItem);
    return this;
  }

   /**
   * Calculated data about the historical balances on the account. Only returned by Assets endpoints.
   * @return historicalBalances
  **/
  @ApiModelProperty(required = true, value = "Calculated data about the historical balances on the account. Only returned by Assets endpoints.")

  public List<HistoricalBalance> getHistoricalBalances() {
    return historicalBalances;
  }


  public void setHistoricalBalances(List<HistoricalBalance> historicalBalances) {
    this.historicalBalances = historicalBalances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAssetsAllOf accountAssetsAllOf = (AccountAssetsAllOf) o;
    return Objects.equals(this.daysAvailable, accountAssetsAllOf.daysAvailable) &&
        Objects.equals(this.transactions, accountAssetsAllOf.transactions) &&
        Objects.equals(this.owners, accountAssetsAllOf.owners) &&
        Objects.equals(this.historicalBalances, accountAssetsAllOf.historicalBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysAvailable, transactions, owners, historicalBalances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAssetsAllOf {\n");
    sb.append("    daysAvailable: ").append(toIndentedString(daysAvailable)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    historicalBalances: ").append(toIndentedString(historicalBalances)).append("\n");
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

