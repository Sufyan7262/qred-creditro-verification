/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.dto;

/**
 *
 * @author sufyanafzal
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "revenue",
    "grossProfit",
    "employeeBenefitsExpense",
    "depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss",
    "profitLossFromOperatingActivities",
    "financeIncome",
    "financeCosts",
    "profitLossBeforeTax",
    "extraordinaryPosts",
    "taxExpense",
    "profitLoss",
    "assets",
    "intangibleAssets",
    "propertyPlantAndEquipment",
    "noncurrentAssets",
    "currentAssets",
    "inventories",
    "shorttermTradeReceivables",
    "cash",
    "issuedCapital",
    "equity",
    "deferredTaxLiabilities",
    "longtermLiabilitiesOtherThanProvisions",
    "currentLiabilities",
    "shorttermTradePayables",
    "otherShorttermPayables",
    "equityAndLiabilities",
    "unit"
})
public class FinancialData {

    @JsonProperty("revenue")
    private Long revenue;
    @JsonProperty("grossProfit")
    private Long grossProfit;
    @JsonProperty("employeeBenefitsExpense")
    private Long employeeBenefitsExpense;
    @JsonProperty("depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss")
    private Long depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss;
    @JsonProperty("profitLossFromOperatingActivities")
    private Long profitLossFromOperatingActivities;
    @JsonProperty("financeIncome")
    private Long financeIncome;
    @JsonProperty("financeCosts")
    private Long financeCosts;
    @JsonProperty("profitLossBeforeTax")
    private Long profitLossBeforeTax;
    @JsonProperty("extraordinaryPosts")
    private Long extraordinaryPosts;
    @JsonProperty("taxExpense")
    private Long taxExpense;
    @JsonProperty("profitLoss")
    private Long profitLoss;
    @JsonProperty("assets")
    private Long assets;
    @JsonProperty("intangibleAssets")
    private Long intangibleAssets;
    @JsonProperty("propertyPlantAndEquipment")
    private Long propertyPlantAndEquipment;
    @JsonProperty("noncurrentAssets")
    private Long noncurrentAssets;
    @JsonProperty("currentAssets")
    private Long currentAssets;
    @JsonProperty("inventories")
    private Long inventories;
    @JsonProperty("shorttermTradeReceivables")
    private Long shorttermTradeReceivables;
    @JsonProperty("cash")
    private Long cash;
    @JsonProperty("issuedCapital")
    private Long issuedCapital;
    @JsonProperty("equity")
    private Long equity;
    @JsonProperty("deferredTaxLiabilities")
    private Long deferredTaxLiabilities;
    @JsonProperty("longtermLiabilitiesOtherThanProvisions")
    private Long longtermLiabilitiesOtherThanProvisions;
    @JsonProperty("currentLiabilities")
    private Long currentLiabilities;
    @JsonProperty("shorttermTradePayables")
    private Long shorttermTradePayables;
    @JsonProperty("otherShorttermPayables")
    private Long otherShorttermPayables;
    @JsonProperty("equityAndLiabilities")
    private Long equityAndLiabilities;
    @JsonProperty("unit")
    private String unit;

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public Long getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(Long grossProfit) {
        this.grossProfit = grossProfit;
    }

    public Long getEmployeeBenefitsExpense() {
        return employeeBenefitsExpense;
    }

    public void setEmployeeBenefitsExpense(Long employeeBenefitsExpense) {
        this.employeeBenefitsExpense = employeeBenefitsExpense;
    }

    public Long getDepreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss() {
        return depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss;
    }

    public void setDepreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss(Long depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss) {
        this.depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss = depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss;
    }

    public Long getProfitLossFromOperatingActivities() {
        return profitLossFromOperatingActivities;
    }

    public void setProfitLossFromOperatingActivities(Long profitLossFromOperatingActivities) {
        this.profitLossFromOperatingActivities = profitLossFromOperatingActivities;
    }

    public Long getFinanceIncome() {
        return financeIncome;
    }

    public void setFinanceIncome(Long financeIncome) {
        this.financeIncome = financeIncome;
    }

    public Long getFinanceCosts() {
        return financeCosts;
    }

    public void setFinanceCosts(Long financeCosts) {
        this.financeCosts = financeCosts;
    }

    public Long getProfitLossBeforeTax() {
        return profitLossBeforeTax;
    }

    public void setProfitLossBeforeTax(Long profitLossBeforeTax) {
        this.profitLossBeforeTax = profitLossBeforeTax;
    }

    public Long getExtraordinaryPosts() {
        return extraordinaryPosts;
    }

    public void setExtraordinaryPosts(Long extraordinaryPosts) {
        this.extraordinaryPosts = extraordinaryPosts;
    }

    public Long getTaxExpense() {
        return taxExpense;
    }

    public void setTaxExpense(Long taxExpense) {
        this.taxExpense = taxExpense;
    }

    public Long getProfitLoss() {
        return profitLoss;
    }

    public void setProfitLoss(Long profitLoss) {
        this.profitLoss = profitLoss;
    }

    public Long getAssets() {
        return assets;
    }

    public void setAssets(Long assets) {
        this.assets = assets;
    }

    public Long getIntangibleAssets() {
        return intangibleAssets;
    }

    public void setIntangibleAssets(Long intangibleAssets) {
        this.intangibleAssets = intangibleAssets;
    }

    public Long getPropertyPlantAndEquipment() {
        return propertyPlantAndEquipment;
    }

    public void setPropertyPlantAndEquipment(Long propertyPlantAndEquipment) {
        this.propertyPlantAndEquipment = propertyPlantAndEquipment;
    }

    public Long getNoncurrentAssets() {
        return noncurrentAssets;
    }

    public void setNoncurrentAssets(Long noncurrentAssets) {
        this.noncurrentAssets = noncurrentAssets;
    }

    public Long getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(Long currentAssets) {
        this.currentAssets = currentAssets;
    }

    public Long getInventories() {
        return inventories;
    }

    public void setInventories(Long inventories) {
        this.inventories = inventories;
    }

    public Long getShorttermTradeReceivables() {
        return shorttermTradeReceivables;
    }

    public void setShorttermTradeReceivables(Long shorttermTradeReceivables) {
        this.shorttermTradeReceivables = shorttermTradeReceivables;
    }

    public Long getCash() {
        return cash;
    }

    public void setCash(Long cash) {
        this.cash = cash;
    }

    public Long getIssuedCapital() {
        return issuedCapital;
    }

    public void setIssuedCapital(Long issuedCapital) {
        this.issuedCapital = issuedCapital;
    }

    public Long getEquity() {
        return equity;
    }

    public void setEquity(Long equity) {
        this.equity = equity;
    }

    public Long getDeferredTaxLiabilities() {
        return deferredTaxLiabilities;
    }

    public void setDeferredTaxLiabilities(Long deferredTaxLiabilities) {
        this.deferredTaxLiabilities = deferredTaxLiabilities;
    }

    public Long getLongtermLiabilitiesOtherThanProvisions() {
        return longtermLiabilitiesOtherThanProvisions;
    }

    public void setLongtermLiabilitiesOtherThanProvisions(Long longtermLiabilitiesOtherThanProvisions) {
        this.longtermLiabilitiesOtherThanProvisions = longtermLiabilitiesOtherThanProvisions;
    }

    public Long getCurrentLiabilities() {
        return currentLiabilities;
    }

    public void setCurrentLiabilities(Long currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
    }

    public Long getShorttermTradePayables() {
        return shorttermTradePayables;
    }

    public void setShorttermTradePayables(Long shorttermTradePayables) {
        this.shorttermTradePayables = shorttermTradePayables;
    }

    public Long getOtherShorttermPayables() {
        return otherShorttermPayables;
    }

    public void setOtherShorttermPayables(Long otherShorttermPayables) {
        this.otherShorttermPayables = otherShorttermPayables;
    }

    public Long getEquityAndLiabilities() {
        return equityAndLiabilities;
    }

    public void setEquityAndLiabilities(Long equityAndLiabilities) {
        this.equityAndLiabilities = equityAndLiabilities;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "FinancialData{" + "revenue=" + revenue + ", grossProfit=" + grossProfit + ", employeeBenefitsExpense=" + employeeBenefitsExpense + ", depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss=" + depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss + ", profitLossFromOperatingActivities=" + profitLossFromOperatingActivities + ", financeIncome=" + financeIncome + ", financeCosts=" + financeCosts + ", profitLossBeforeTax=" + profitLossBeforeTax + ", extraordinaryPosts=" + extraordinaryPosts + ", taxExpense=" + taxExpense + ", profitLoss=" + profitLoss + ", assets=" + assets + ", intangibleAssets=" + intangibleAssets + ", propertyPlantAndEquipment=" + propertyPlantAndEquipment + ", noncurrentAssets=" + noncurrentAssets + ", currentAssets=" + currentAssets + ", inventories=" + inventories + ", shorttermTradeReceivables=" + shorttermTradeReceivables + ", cash=" + cash + ", issuedCapital=" + issuedCapital + ", equity=" + equity + ", deferredTaxLiabilities=" + deferredTaxLiabilities + ", longtermLiabilitiesOtherThanProvisions=" + longtermLiabilitiesOtherThanProvisions + ", currentLiabilities=" + currentLiabilities + ", shorttermTradePayables=" + shorttermTradePayables + ", otherShorttermPayables=" + otherShorttermPayables + ", equityAndLiabilities=" + equityAndLiabilities + ", unit=" + unit + '}';
    }

    

}
