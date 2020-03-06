/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "FinancialStatementType",
    "ClassOfReporting",
    "FinancialStatementStartDate",
    "FinancialStatementEndDate",
    "PublicationTime",
    "CurrencyCodeFrom",
    "CurrencyCodeTo",
    "CurrencyRate",
    "PeriodInMonths",
    "PeriodInDays",
    "AuditAssistanceType",
    "NumberOfEmployeesFinancial",
    "Revenue",
    "GrossResult",
    "PrimaryResult",
    "ResultBeforeTax",
    "AnnualResult",
    "DepreciationAmortisationExpenseAndImpairmentL",
    "EmployeeBenefitsExpense",
    "FinanceIncome",
    "FinanceExpenses",
    "TaxExpense",
    "CostOfSales",
    "OtherOperatingIncome",
    "PropertyCost",
    "AdministrativeExpenses",
    "OtherExternalExpenses",
    "WagesAndSalaries",
    "PostemploymentBenefitExpense",
    "SocialSecurityContributions",
    "EmployeeExpensesTranferredToAssets",
    "OtherEmployeeExpense",
    "OtherOperatingExpenses",
    "IncomeFromOtherLongtermInvestmentsAndReceivables",
    "OtherFinanceIncomeFromGroupEnterprises",
    "ImpairmentOfFinancialAssets",
    "FinanceExpensesArisingFromGroupEnterprises",
    "RestOfOtherFinanceExpenses",
    "IncomeFromInvestmentsInGroupEnterprises",
    "IncomeFromInvestmentsInAssociates",
    "OtherTaxExpenses",
    "DistributionCosts",
    "CostOfProduction",
    "ChangeInInventoriesOfFinishedGoods",
    "WorkPerformedByEntityAndCapitalised",
    "ExternalExpenses",
    "RawMaterialsAndConsumablesUsed",
    "WritedownsOfCurrentAssets",
    "GLFCVAInvestmentProperty",
    "GLFCVAOtherInvestmentAssets",
    "GLFCVADLCInvestmentProperty",
    "GLFCVADLCOtherInvestmentAssets",
    "RDExpenditure",
    "Assets",
    "CurrentAssets",
    "Equity",
    "ShorttermLiabilitiesOtherThanProvisions",
    "NoncurrentAssets",
    "PropertyPlantAndEquipment",
    "LongtermInvestmentsAndReceivables",
    "Inventories",
    "ShorttermReceivables",
    "ShorttermInvestments",
    "CashAndCashEquivalents",
    "LiabilitiesAndEquity",
    "Provisions",
    "LiabilitiesOtherThanProvisions",
    "LongtermLiabilitiesOtherThanProvisions",
    "IntangibleAssets",
    "Goodwill",
    "LandAndBuildings",
    "PlantAndMachinery",
    "FixturesFittingsToolsAndEquipment",
    "LeaseholdImprovements",
    "LongtermInvestmentsInGroupEnterprises",
    "LongtermInvestmentsInAssociates",
    "OtherLongtermInvestments",
    "OtherLongtermReceivables",
    "RawMaterialsAndConsumables",
    "ManufacturedGoodsAndGoodsForResale",
    "ShorttermTradeReceivables",
    "ContractWorkInProgress",
    "ShorttermReceivablesFromGroupEnterprises",
    "ShorttermReceivablesFromAssociates",
    "CurrentDeferredTaxAssets",
    "OtherShorttermReceivables",
    "ShorttermTaxReceivables",
    "DeferredIncomeAssets",
    "OtherShorttermInvestments",
    "ContributedCapital",
    "PaidContributedCapital",
    "RetainedEarnings",
    "ProposedDividendRecognisedInEquity",
    "ProvisionsForDeferredTax",
    "ShorttermMortgageDebt",
    "ShorttermDebtToBanks",
    "ShorttermDebtToOtherCreditInstitutions",
    "ShorttermTradePayables",
    "ShorttermPayablesToGroupEnterprises",
    "ShorttermTaxPayables",
    "OtherShorttermPayables",
    "ShorttermPayablesToShareholdersAndManagement",
    "ShorttermPartOfLongtermLiabilitiesOtherThanProvisions",
    "LongtermMortgageDebt",
    "LongtermDebtToBanks",
    "OtherLongtermPayables",
    "GrossResultGrowthrate",
    "RevenueGrowthrate",
    "PrimaryResultGrowthrate",
    "ResultBeforeTaxGrowthrate",
    "AnnualResultGrowthrate",
    "TotalEquityGrowthrate",
    "BalanceSheetGrowthrate",
    "ReturnOnTotalAssets",
    "EquityRatio",
    "CurrentRatio",
    "ReturnOnEquity",
    "OperatingMarginRatio",
    "Gearing",
    "WorkingCapital",
    "WorkingCapitalRatio",
    "WorkingCapitalRatio2",
    "DSO",
    "DPO",
    "DIO",
    "DWC",
    "CapitalTurnover",
    "CapitalEmployed",
    "QuickRatio",
    "ReturnOnCapitalEmployed",
    "GrossProfitMarginRatio",
    "TurnoverPerEmployee",
    "GrossResultPerEmployee",
    "PrimaryResultPerEmployee",
    "AnnualResultPerEmployee",
    "EmployeeBenefitsExpensePerEmployee",
    "WagesAndSalariesPerEmployee",
    "PosResult",
    "PosResult3years",
    "FinancialConditionClassId1",
    "FinancialConditionClassId2",
    "MinorityInterest",
    "TotalFinanceCosts",
    "ResultAfterFinancialItems",
    "TotalOperatingExpenses",
    "TotalFinanceIncome",
    "IncomeBeforeDeprication",
    "ExtraOrdinaryItems",
    "ExternalInterestIncome",
    "ExternalInterestExpenses",
    "TotalOperatingCosts",
    "ResultBeforeAllocations",
    "Allocations",
    "NetSales",
    "ExtraOrdinaryExpenses",
    "TotalExtraOrdinaryItems",
    "TotalInterestExpenses",
    "TotalAssets",
    "TotalRestrictedEquity",
    "UntaxedReserves",
    "TotalSubordLoanCapital",
    "TotalSecurities",
    "TotalContingentLiabilities"
})
public class BisbaseFinancialStatement {

    @JsonProperty("FinancialStatementType")
    private String financialStatementType;
    @JsonProperty("ClassOfReporting")
    private String classOfReporting;
    @JsonProperty("FinancialStatementStartDate")
    private String financialStatementStartDate;
    @JsonProperty("FinancialStatementEndDate")
    private String financialStatementEndDate;
    @JsonProperty("PublicationTime")
    private String publicationTime;
    @JsonProperty("CurrencyCodeFrom")
    private String currencyCodeFrom;
    @JsonProperty("CurrencyCodeTo")
    private String currencyCodeTo;
    @JsonProperty("CurrencyRate")
    private Integer currencyRate;
    @JsonProperty("PeriodInMonths")
    private Integer periodInMonths;
    @JsonProperty("PeriodInDays")
    private Integer periodInDays;
    @JsonProperty("AuditAssistanceType")
    private String auditAssistanceType;
    @JsonProperty("NumberOfEmployeesFinancial")
    private Object numberOfEmployeesFinancial;
    @JsonProperty("Revenue")
    private Object revenue;
    @JsonProperty("GrossResult")
    private Long grossResult;
    @JsonProperty("PrimaryResult")
    private Object primaryResult;
    @JsonProperty("ResultBeforeTax")
    private Object resultBeforeTax;
    @JsonProperty("AnnualResult")
    private Long annualResult;
    @JsonProperty("DepreciationAmortisationExpenseAndImpairmentL")
    private Object depreciationAmortisationExpenseAndImpairmentL;
    @JsonProperty("EmployeeBenefitsExpense")
    private Object employeeBenefitsExpense;
    @JsonProperty("FinanceIncome")
    private Long financeIncome;
    @JsonProperty("FinanceExpenses")
    private Long financeExpenses;
    @JsonProperty("TaxExpense")
    private Object taxExpense;
    @JsonProperty("CostOfSales")
    private Object costOfSales;
    @JsonProperty("OtherOperatingIncome")
    private Object otherOperatingIncome;
    @JsonProperty("PropertyCost")
    private Object propertyCost;
    @JsonProperty("AdministrativeExpenses")
    private Object administrativeExpenses;
    @JsonProperty("OtherExternalExpenses")
    private Object otherExternalExpenses;
    @JsonProperty("WagesAndSalaries")
    private Object wagesAndSalaries;
    @JsonProperty("PostemploymentBenefitExpense")
    private Object postemploymentBenefitExpense;
    @JsonProperty("SocialSecurityContributions")
    private Object socialSecurityContributions;
    @JsonProperty("EmployeeExpensesTranferredToAssets")
    private Object employeeExpensesTranferredToAssets;
    @JsonProperty("OtherEmployeeExpense")
    private Object otherEmployeeExpense;
    @JsonProperty("OtherOperatingExpenses")
    private Object otherOperatingExpenses;
    @JsonProperty("IncomeFromOtherLongtermInvestmentsAndReceivables")
    private Object incomeFromOtherLongtermInvestmentsAndReceivables;
    @JsonProperty("OtherFinanceIncomeFromGroupEnterprises")
    private Object otherFinanceIncomeFromGroupEnterprises;
    @JsonProperty("ImpairmentOfFinancialAssets")
    private Object impairmentOfFinancialAssets;
    @JsonProperty("FinanceExpensesArisingFromGroupEnterprises")
    private Object financeExpensesArisingFromGroupEnterprises;
    @JsonProperty("RestOfOtherFinanceExpenses")
    private Object restOfOtherFinanceExpenses;
    @JsonProperty("IncomeFromInvestmentsInGroupEnterprises")
    private Object incomeFromInvestmentsInGroupEnterprises;
    @JsonProperty("IncomeFromInvestmentsInAssociates")
    private Object incomeFromInvestmentsInAssociates;
    @JsonProperty("OtherTaxExpenses")
    private Object otherTaxExpenses;
    @JsonProperty("DistributionCosts")
    private Object distributionCosts;
    @JsonProperty("CostOfProduction")
    private Object costOfProduction;
    @JsonProperty("ChangeInInventoriesOfFinishedGoods")
    private Object changeInInventoriesOfFinishedGoods;
    @JsonProperty("WorkPerformedByEntityAndCapitalised")
    private Object workPerformedByEntityAndCapitalised;
    @JsonProperty("ExternalExpenses")
    private Object externalExpenses;
    @JsonProperty("RawMaterialsAndConsumablesUsed")
    private Object rawMaterialsAndConsumablesUsed;
    @JsonProperty("WritedownsOfCurrentAssets")
    private Object writedownsOfCurrentAssets;
    @JsonProperty("GLFCVAInvestmentProperty")
    private Integer gLFCVAInvestmentProperty;
    @JsonProperty("GLFCVAOtherInvestmentAssets")
    private Object gLFCVAOtherInvestmentAssets;
    @JsonProperty("GLFCVADLCInvestmentProperty")
    private Object gLFCVADLCInvestmentProperty;
    @JsonProperty("GLFCVADLCOtherInvestmentAssets")
    private Object gLFCVADLCOtherInvestmentAssets;
    @JsonProperty("RDExpenditure")
    private Object rDExpenditure;
    @JsonProperty("Assets")
    private Long assets;
    @JsonProperty("CurrentAssets")
    private Long currentAssets;
    @JsonProperty("Equity")
    private Long equity;
    @JsonProperty("ShorttermLiabilitiesOtherThanProvisions")
    private Long shorttermLiabilitiesOtherThanProvisions;
    @JsonProperty("NoncurrentAssets")
    private Long noncurrentAssets;
    @JsonProperty("PropertyPlantAndEquipment")
    private Long propertyPlantAndEquipment;
    @JsonProperty("LongtermInvestmentsAndReceivables")
    private Object longtermInvestmentsAndReceivables;
    @JsonProperty("Inventories")
    private Object inventories;
    @JsonProperty("ShorttermReceivables")
    private Long shorttermReceivables;
    @JsonProperty("ShorttermInvestments")
    private Object shorttermInvestments;
    @JsonProperty("CashAndCashEquivalents")
    private Long cashAndCashEquivalents;
    @JsonProperty("LiabilitiesAndEquity")
    private Long liabilitiesAndEquity;
    @JsonProperty("Provisions")
    private Object provisions;
    @JsonProperty("LiabilitiesOtherThanProvisions")
    private Long liabilitiesOtherThanProvisions;
    @JsonProperty("LongtermLiabilitiesOtherThanProvisions")
    private Long longtermLiabilitiesOtherThanProvisions;
    @JsonProperty("IntangibleAssets")
    private Object intangibleAssets;
    @JsonProperty("Goodwill")
    private Object goodwill;
    @JsonProperty("LandAndBuildings")
    private Object landAndBuildings;
    @JsonProperty("PlantAndMachinery")
    private Object plantAndMachinery;
    @JsonProperty("FixturesFittingsToolsAndEquipment")
    private Object fixturesFittingsToolsAndEquipment;
    @JsonProperty("LeaseholdImprovements")
    private Object leaseholdImprovements;
    @JsonProperty("LongtermInvestmentsInGroupEnterprises")
    private Object longtermInvestmentsInGroupEnterprises;
    @JsonProperty("LongtermInvestmentsInAssociates")
    private Object longtermInvestmentsInAssociates;
    @JsonProperty("OtherLongtermInvestments")
    private Object otherLongtermInvestments;
    @JsonProperty("OtherLongtermReceivables")
    private Object otherLongtermReceivables;
    @JsonProperty("RawMaterialsAndConsumables")
    private Object rawMaterialsAndConsumables;
    @JsonProperty("ManufacturedGoodsAndGoodsForResale")
    private Object manufacturedGoodsAndGoodsForResale;
    @JsonProperty("ShorttermTradeReceivables")
    private Object shorttermTradeReceivables;
    @JsonProperty("ContractWorkInProgress")
    private Object contractWorkInProgress;
    @JsonProperty("ShorttermReceivablesFromGroupEnterprises")
    private Object shorttermReceivablesFromGroupEnterprises;
    @JsonProperty("ShorttermReceivablesFromAssociates")
    private Object shorttermReceivablesFromAssociates;
    @JsonProperty("CurrentDeferredTaxAssets")
    private Object currentDeferredTaxAssets;
    @JsonProperty("OtherShorttermReceivables")
    private Long otherShorttermReceivables;
    @JsonProperty("ShorttermTaxReceivables")
    private Object shorttermTaxReceivables;
    @JsonProperty("DeferredIncomeAssets")
    private Long deferredIncomeAssets;
    @JsonProperty("OtherShorttermInvestments")
    private Object otherShorttermInvestments;
    @JsonProperty("ContributedCapital")
    private Long contributedCapital;
    @JsonProperty("PaidContributedCapital")
    private Long paidContributedCapital;
    @JsonProperty("RetainedEarnings")
    private Long retainedEarnings;
    @JsonProperty("ProposedDividendRecognisedInEquity")
    private Object proposedDividendRecognisedInEquity;
    @JsonProperty("ProvisionsForDeferredTax")
    private Object provisionsForDeferredTax;
    @JsonProperty("ShorttermMortgageDebt")
    private Object shorttermMortgageDebt;
    @JsonProperty("ShorttermDebtToBanks")
    private Object shorttermDebtToBanks;
    @JsonProperty("ShorttermDebtToOtherCreditInstitutions")
    private Long shorttermDebtToOtherCreditInstitutions;
    @JsonProperty("ShorttermTradePayables")
    private Object shorttermTradePayables;
    @JsonProperty("ShorttermPayablesToGroupEnterprises")
    private Object shorttermPayablesToGroupEnterprises;
    @JsonProperty("ShorttermTaxPayables")
    private Object shorttermTaxPayables;
    @JsonProperty("OtherShorttermPayables")
    private Long otherShorttermPayables;
    @JsonProperty("ShorttermPayablesToShareholdersAndManagement")
    private Long shorttermPayablesToShareholdersAndManagement;
    @JsonProperty("ShorttermPartOfLongtermLiabilitiesOtherThanProvisions")
    private Object shorttermPartOfLongtermLiabilitiesOtherThanProvisions;
    @JsonProperty("LongtermMortgageDebt")
    private Object longtermMortgageDebt;
    @JsonProperty("LongtermDebtToBanks")
    private Object longtermDebtToBanks;
    @JsonProperty("OtherLongtermPayables")
    private Object otherLongtermPayables;
    @JsonProperty("GrossResultGrowthrate")
    private Object grossResultGrowthrate;
    @JsonProperty("RevenueGrowthrate")
    private Object revenueGrowthrate;
    @JsonProperty("PrimaryResultGrowthrate")
    private Object primaryResultGrowthrate;
    @JsonProperty("ResultBeforeTaxGrowthrate")
    private Object resultBeforeTaxGrowthrate;
    @JsonProperty("AnnualResultGrowthrate")
    private Object annualResultGrowthrate;
    @JsonProperty("TotalEquityGrowthrate")
    private Double totalEquityGrowthrate;
    @JsonProperty("BalanceSheetGrowthrate")
    private Double balanceSheetGrowthrate;
    @JsonProperty("ReturnOnTotalAssets")
    private Object returnOnTotalAssets;
    @JsonProperty("EquityRatio")
    private Double equityRatio;
    @JsonProperty("CurrentRatio")
    private Double currentRatio;
    @JsonProperty("ReturnOnEquity")
    private Double returnOnEquity;
    @JsonProperty("OperatingMarginRatio")
    private Object operatingMarginRatio;
    @JsonProperty("Gearing")
    private Double gearing;
    @JsonProperty("WorkingCapital")
    private Long workingCapital;
    @JsonProperty("WorkingCapitalRatio")
    private Double workingCapitalRatio;
    @JsonProperty("WorkingCapitalRatio2")
    private Object workingCapitalRatio2;
    @JsonProperty("DSO")
    private Object dSO;
    @JsonProperty("DPO")
    private Object dPO;
    @JsonProperty("DIO")
    private Object dIO;
    @JsonProperty("DWC")
    private Object dWC;
    @JsonProperty("CapitalTurnover")
    private Object capitalTurnover;
    @JsonProperty("CapitalEmployed")
    private Long capitalEmployed;
    @JsonProperty("QuickRatio")
    private Double quickRatio;
    @JsonProperty("ReturnOnCapitalEmployed")
    private Object returnOnCapitalEmployed;
    @JsonProperty("GrossProfitMarginRatio")
    private Object grossProfitMarginRatio;
    @JsonProperty("TurnoverPerEmployee")
    private Object turnoverPerEmployee;
    @JsonProperty("GrossResultPerEmployee")
    private Object grossResultPerEmployee;
    @JsonProperty("PrimaryResultPerEmployee")
    private Object primaryResultPerEmployee;
    @JsonProperty("AnnualResultPerEmployee")
    private Object annualResultPerEmployee;
    @JsonProperty("EmployeeBenefitsExpensePerEmployee")
    private Object employeeBenefitsExpensePerEmployee;
    @JsonProperty("WagesAndSalariesPerEmployee")
    private Object wagesAndSalariesPerEmployee;
    @JsonProperty("PosResult")
    private Integer posResult;
    @JsonProperty("PosResult3years")
    private Object posResult3years;
    @JsonProperty("FinancialConditionClassId1")
    private Long financialConditionClassId1;
    @JsonProperty("FinancialConditionClassId2")
    private Long financialConditionClassId2;
    @JsonProperty("MinorityInterest")
    private Object minorityInterest;
    @JsonProperty("TotalFinanceCosts")
    private Object totalFinanceCosts;
    @JsonProperty("ResultAfterFinancialItems")
    private Object resultAfterFinancialItems;
    @JsonProperty("TotalOperatingExpenses")
    private Object totalOperatingExpenses;
    @JsonProperty("TotalFinanceIncome")
    private Object totalFinanceIncome;
    @JsonProperty("IncomeBeforeDeprication")
    private Object incomeBeforeDeprication;
    @JsonProperty("ExtraOrdinaryItems")
    private Object extraOrdinaryItems;
    @JsonProperty("ExternalInterestIncome")
    private Object externalInterestIncome;
    @JsonProperty("ExternalInterestExpenses")
    private Object externalInterestExpenses;
    @JsonProperty("TotalOperatingCosts")
    private Object totalOperatingCosts;
    @JsonProperty("ResultBeforeAllocations")
    private Object resultBeforeAllocations;
    @JsonProperty("Allocations")
    private Object allocations;
    @JsonProperty("NetSales")
    private Object netSales;
    @JsonProperty("ExtraOrdinaryExpenses")
    private Object extraOrdinaryExpenses;
    @JsonProperty("TotalExtraOrdinaryItems")
    private Object totalExtraOrdinaryItems;
    @JsonProperty("TotalInterestExpenses")
    private Object totalInterestExpenses;
    @JsonProperty("TotalAssets")
    private Long totalAssets;
    @JsonProperty("TotalRestrictedEquity")
    private Object totalRestrictedEquity;
    @JsonProperty("UntaxedReserves")
    private Object untaxedReserves;
    @JsonProperty("TotalSubordLoanCapital")
    private Object totalSubordLoanCapital;
    @JsonProperty("TotalSecurities")
    private Object totalSecurities;
    @JsonProperty("TotalContingentLiabilities")
    private Object totalContingentLiabilities;

    @JsonProperty("FinancialStatementType")
    public String getFinancialStatementType() {
        return financialStatementType;
    }

    @JsonProperty("FinancialStatementType")
    public void setFinancialStatementType(String financialStatementType) {
        this.financialStatementType = financialStatementType;
    }

    @JsonProperty("ClassOfReporting")
    public String getClassOfReporting() {
        return classOfReporting;
    }

    @JsonProperty("ClassOfReporting")
    public void setClassOfReporting(String classOfReporting) {
        this.classOfReporting = classOfReporting;
    }

    @JsonProperty("FinancialStatementStartDate")
    public String getFinancialStatementStartDate() {
        return financialStatementStartDate;
    }

    @JsonProperty("FinancialStatementStartDate")
    public void setFinancialStatementStartDate(String financialStatementStartDate) {
        this.financialStatementStartDate = financialStatementStartDate;
    }

    @JsonProperty("FinancialStatementEndDate")
    public String getFinancialStatementEndDate() {
        return financialStatementEndDate;
    }

    @JsonProperty("FinancialStatementEndDate")
    public void setFinancialStatementEndDate(String financialStatementEndDate) {
        this.financialStatementEndDate = financialStatementEndDate;
    }

    @JsonProperty("PublicationTime")
    public String getPublicationTime() {
        return publicationTime;
    }

    @JsonProperty("PublicationTime")
    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
    }

    @JsonProperty("CurrencyCodeFrom")
    public String getCurrencyCodeFrom() {
        return currencyCodeFrom;
    }

    @JsonProperty("CurrencyCodeFrom")
    public void setCurrencyCodeFrom(String currencyCodeFrom) {
        this.currencyCodeFrom = currencyCodeFrom;
    }

    @JsonProperty("CurrencyCodeTo")
    public String getCurrencyCodeTo() {
        return currencyCodeTo;
    }

    @JsonProperty("CurrencyCodeTo")
    public void setCurrencyCodeTo(String currencyCodeTo) {
        this.currencyCodeTo = currencyCodeTo;
    }

    @JsonProperty("CurrencyRate")
    public Integer getCurrencyRate() {
        return currencyRate;
    }

    @JsonProperty("CurrencyRate")
    public void setCurrencyRate(Integer currencyRate) {
        this.currencyRate = currencyRate;
    }

    @JsonProperty("PeriodInMonths")
    public Integer getPeriodInMonths() {
        return periodInMonths;
    }

    @JsonProperty("PeriodInMonths")
    public void setPeriodInMonths(Integer periodInMonths) {
        this.periodInMonths = periodInMonths;
    }

    @JsonProperty("PeriodInDays")
    public Integer getPeriodInDays() {
        return periodInDays;
    }

    @JsonProperty("PeriodInDays")
    public void setPeriodInDays(Integer periodInDays) {
        this.periodInDays = periodInDays;
    }

    @JsonProperty("AuditAssistanceType")
    public String getAuditAssistanceType() {
        return auditAssistanceType;
    }

    @JsonProperty("AuditAssistanceType")
    public void setAuditAssistanceType(String auditAssistanceType) {
        this.auditAssistanceType = auditAssistanceType;
    }

    @JsonProperty("NumberOfEmployeesFinancial")
    public Object getNumberOfEmployeesFinancial() {
        return numberOfEmployeesFinancial;
    }

    @JsonProperty("NumberOfEmployeesFinancial")
    public void setNumberOfEmployeesFinancial(Object numberOfEmployeesFinancial) {
        this.numberOfEmployeesFinancial = numberOfEmployeesFinancial;
    }

    @JsonProperty("Revenue")
    public Object getRevenue() {
        return revenue;
    }

    @JsonProperty("Revenue")
    public void setRevenue(Object revenue) {
        this.revenue = revenue;
    }

    @JsonProperty("GrossResult")
    public Long getGrossResult() {
        return grossResult;
    }

    @JsonProperty("GrossResult")
    public void setGrossResult(Long grossResult) {
        this.grossResult = grossResult;
    }

    @JsonProperty("PrimaryResult")
    public Object getPrimaryResult() {
        return primaryResult;
    }

    @JsonProperty("PrimaryResult")
    public void setPrimaryResult(Object primaryResult) {
        this.primaryResult = primaryResult;
    }

    @JsonProperty("ResultBeforeTax")
    public Object getResultBeforeTax() {
        return resultBeforeTax;
    }

    @JsonProperty("ResultBeforeTax")
    public void setResultBeforeTax(Object resultBeforeTax) {
        this.resultBeforeTax = resultBeforeTax;
    }

    @JsonProperty("AnnualResult")
    public Long getAnnualResult() {
        return annualResult;
    }

    @JsonProperty("AnnualResult")
    public void setAnnualResult(Long annualResult) {
        this.annualResult = annualResult;
    }

    @JsonProperty("DepreciationAmortisationExpenseAndImpairmentL")
    public Object getDepreciationAmortisationExpenseAndImpairmentL() {
        return depreciationAmortisationExpenseAndImpairmentL;
    }

    @JsonProperty("DepreciationAmortisationExpenseAndImpairmentL")
    public void setDepreciationAmortisationExpenseAndImpairmentL(Object depreciationAmortisationExpenseAndImpairmentL) {
        this.depreciationAmortisationExpenseAndImpairmentL = depreciationAmortisationExpenseAndImpairmentL;
    }

    @JsonProperty("EmployeeBenefitsExpense")
    public Object getEmployeeBenefitsExpense() {
        return employeeBenefitsExpense;
    }

    @JsonProperty("EmployeeBenefitsExpense")
    public void setEmployeeBenefitsExpense(Object employeeBenefitsExpense) {
        this.employeeBenefitsExpense = employeeBenefitsExpense;
    }

    @JsonProperty("FinanceIncome")
    public Long getFinanceIncome() {
        return financeIncome;
    }

    @JsonProperty("FinanceIncome")
    public void setFinanceIncome(Long financeIncome) {
        this.financeIncome = financeIncome;
    }

    @JsonProperty("FinanceExpenses")
    public Long getFinanceExpenses() {
        return financeExpenses;
    }

    @JsonProperty("FinanceExpenses")
    public void setFinanceExpenses(Long financeExpenses) {
        this.financeExpenses = financeExpenses;
    }

    @JsonProperty("TaxExpense")
    public Object getTaxExpense() {
        return taxExpense;
    }

    @JsonProperty("TaxExpense")
    public void setTaxExpense(Object taxExpense) {
        this.taxExpense = taxExpense;
    }

    @JsonProperty("CostOfSales")
    public Object getCostOfSales() {
        return costOfSales;
    }

    @JsonProperty("CostOfSales")
    public void setCostOfSales(Object costOfSales) {
        this.costOfSales = costOfSales;
    }

    @JsonProperty("OtherOperatingIncome")
    public Object getOtherOperatingIncome() {
        return otherOperatingIncome;
    }

    @JsonProperty("OtherOperatingIncome")
    public void setOtherOperatingIncome(Object otherOperatingIncome) {
        this.otherOperatingIncome = otherOperatingIncome;
    }

    @JsonProperty("PropertyCost")
    public Object getPropertyCost() {
        return propertyCost;
    }

    @JsonProperty("PropertyCost")
    public void setPropertyCost(Object propertyCost) {
        this.propertyCost = propertyCost;
    }

    @JsonProperty("AdministrativeExpenses")
    public Object getAdministrativeExpenses() {
        return administrativeExpenses;
    }

    @JsonProperty("AdministrativeExpenses")
    public void setAdministrativeExpenses(Object administrativeExpenses) {
        this.administrativeExpenses = administrativeExpenses;
    }

    @JsonProperty("OtherExternalExpenses")
    public Object getOtherExternalExpenses() {
        return otherExternalExpenses;
    }

    @JsonProperty("OtherExternalExpenses")
    public void setOtherExternalExpenses(Object otherExternalExpenses) {
        this.otherExternalExpenses = otherExternalExpenses;
    }

    @JsonProperty("WagesAndSalaries")
    public Object getWagesAndSalaries() {
        return wagesAndSalaries;
    }

    @JsonProperty("WagesAndSalaries")
    public void setWagesAndSalaries(Object wagesAndSalaries) {
        this.wagesAndSalaries = wagesAndSalaries;
    }

    @JsonProperty("PostemploymentBenefitExpense")
    public Object getPostemploymentBenefitExpense() {
        return postemploymentBenefitExpense;
    }

    @JsonProperty("PostemploymentBenefitExpense")
    public void setPostemploymentBenefitExpense(Object postemploymentBenefitExpense) {
        this.postemploymentBenefitExpense = postemploymentBenefitExpense;
    }

    @JsonProperty("SocialSecurityContributions")
    public Object getSocialSecurityContributions() {
        return socialSecurityContributions;
    }

    @JsonProperty("SocialSecurityContributions")
    public void setSocialSecurityContributions(Object socialSecurityContributions) {
        this.socialSecurityContributions = socialSecurityContributions;
    }

    @JsonProperty("EmployeeExpensesTranferredToAssets")
    public Object getEmployeeExpensesTranferredToAssets() {
        return employeeExpensesTranferredToAssets;
    }

    @JsonProperty("EmployeeExpensesTranferredToAssets")
    public void setEmployeeExpensesTranferredToAssets(Object employeeExpensesTranferredToAssets) {
        this.employeeExpensesTranferredToAssets = employeeExpensesTranferredToAssets;
    }

    @JsonProperty("OtherEmployeeExpense")
    public Object getOtherEmployeeExpense() {
        return otherEmployeeExpense;
    }

    @JsonProperty("OtherEmployeeExpense")
    public void setOtherEmployeeExpense(Object otherEmployeeExpense) {
        this.otherEmployeeExpense = otherEmployeeExpense;
    }

    @JsonProperty("OtherOperatingExpenses")
    public Object getOtherOperatingExpenses() {
        return otherOperatingExpenses;
    }

    @JsonProperty("OtherOperatingExpenses")
    public void setOtherOperatingExpenses(Object otherOperatingExpenses) {
        this.otherOperatingExpenses = otherOperatingExpenses;
    }

    @JsonProperty("IncomeFromOtherLongtermInvestmentsAndReceivables")
    public Object getIncomeFromOtherLongtermInvestmentsAndReceivables() {
        return incomeFromOtherLongtermInvestmentsAndReceivables;
    }

    @JsonProperty("IncomeFromOtherLongtermInvestmentsAndReceivables")
    public void setIncomeFromOtherLongtermInvestmentsAndReceivables(Object incomeFromOtherLongtermInvestmentsAndReceivables) {
        this.incomeFromOtherLongtermInvestmentsAndReceivables = incomeFromOtherLongtermInvestmentsAndReceivables;
    }

    @JsonProperty("OtherFinanceIncomeFromGroupEnterprises")
    public Object getOtherFinanceIncomeFromGroupEnterprises() {
        return otherFinanceIncomeFromGroupEnterprises;
    }

    @JsonProperty("OtherFinanceIncomeFromGroupEnterprises")
    public void setOtherFinanceIncomeFromGroupEnterprises(Object otherFinanceIncomeFromGroupEnterprises) {
        this.otherFinanceIncomeFromGroupEnterprises = otherFinanceIncomeFromGroupEnterprises;
    }

    @JsonProperty("ImpairmentOfFinancialAssets")
    public Object getImpairmentOfFinancialAssets() {
        return impairmentOfFinancialAssets;
    }

    @JsonProperty("ImpairmentOfFinancialAssets")
    public void setImpairmentOfFinancialAssets(Object impairmentOfFinancialAssets) {
        this.impairmentOfFinancialAssets = impairmentOfFinancialAssets;
    }

    @JsonProperty("FinanceExpensesArisingFromGroupEnterprises")
    public Object getFinanceExpensesArisingFromGroupEnterprises() {
        return financeExpensesArisingFromGroupEnterprises;
    }

    @JsonProperty("FinanceExpensesArisingFromGroupEnterprises")
    public void setFinanceExpensesArisingFromGroupEnterprises(Object financeExpensesArisingFromGroupEnterprises) {
        this.financeExpensesArisingFromGroupEnterprises = financeExpensesArisingFromGroupEnterprises;
    }

    @JsonProperty("RestOfOtherFinanceExpenses")
    public Object getRestOfOtherFinanceExpenses() {
        return restOfOtherFinanceExpenses;
    }

    @JsonProperty("RestOfOtherFinanceExpenses")
    public void setRestOfOtherFinanceExpenses(Object restOfOtherFinanceExpenses) {
        this.restOfOtherFinanceExpenses = restOfOtherFinanceExpenses;
    }

    @JsonProperty("IncomeFromInvestmentsInGroupEnterprises")
    public Object getIncomeFromInvestmentsInGroupEnterprises() {
        return incomeFromInvestmentsInGroupEnterprises;
    }

    @JsonProperty("IncomeFromInvestmentsInGroupEnterprises")
    public void setIncomeFromInvestmentsInGroupEnterprises(Object incomeFromInvestmentsInGroupEnterprises) {
        this.incomeFromInvestmentsInGroupEnterprises = incomeFromInvestmentsInGroupEnterprises;
    }

    @JsonProperty("IncomeFromInvestmentsInAssociates")
    public Object getIncomeFromInvestmentsInAssociates() {
        return incomeFromInvestmentsInAssociates;
    }

    @JsonProperty("IncomeFromInvestmentsInAssociates")
    public void setIncomeFromInvestmentsInAssociates(Object incomeFromInvestmentsInAssociates) {
        this.incomeFromInvestmentsInAssociates = incomeFromInvestmentsInAssociates;
    }

    @JsonProperty("OtherTaxExpenses")
    public Object getOtherTaxExpenses() {
        return otherTaxExpenses;
    }

    @JsonProperty("OtherTaxExpenses")
    public void setOtherTaxExpenses(Object otherTaxExpenses) {
        this.otherTaxExpenses = otherTaxExpenses;
    }

    @JsonProperty("DistributionCosts")
    public Object getDistributionCosts() {
        return distributionCosts;
    }

    @JsonProperty("DistributionCosts")
    public void setDistributionCosts(Object distributionCosts) {
        this.distributionCosts = distributionCosts;
    }

    @JsonProperty("CostOfProduction")
    public Object getCostOfProduction() {
        return costOfProduction;
    }

    @JsonProperty("CostOfProduction")
    public void setCostOfProduction(Object costOfProduction) {
        this.costOfProduction = costOfProduction;
    }

    @JsonProperty("ChangeInInventoriesOfFinishedGoods")
    public Object getChangeInInventoriesOfFinishedGoods() {
        return changeInInventoriesOfFinishedGoods;
    }

    @JsonProperty("ChangeInInventoriesOfFinishedGoods")
    public void setChangeInInventoriesOfFinishedGoods(Object changeInInventoriesOfFinishedGoods) {
        this.changeInInventoriesOfFinishedGoods = changeInInventoriesOfFinishedGoods;
    }

    @JsonProperty("WorkPerformedByEntityAndCapitalised")
    public Object getWorkPerformedByEntityAndCapitalised() {
        return workPerformedByEntityAndCapitalised;
    }

    @JsonProperty("WorkPerformedByEntityAndCapitalised")
    public void setWorkPerformedByEntityAndCapitalised(Object workPerformedByEntityAndCapitalised) {
        this.workPerformedByEntityAndCapitalised = workPerformedByEntityAndCapitalised;
    }

    @JsonProperty("ExternalExpenses")
    public Object getExternalExpenses() {
        return externalExpenses;
    }

    @JsonProperty("ExternalExpenses")
    public void setExternalExpenses(Object externalExpenses) {
        this.externalExpenses = externalExpenses;
    }

    @JsonProperty("RawMaterialsAndConsumablesUsed")
    public Object getRawMaterialsAndConsumablesUsed() {
        return rawMaterialsAndConsumablesUsed;
    }

    @JsonProperty("RawMaterialsAndConsumablesUsed")
    public void setRawMaterialsAndConsumablesUsed(Object rawMaterialsAndConsumablesUsed) {
        this.rawMaterialsAndConsumablesUsed = rawMaterialsAndConsumablesUsed;
    }

    @JsonProperty("WritedownsOfCurrentAssets")
    public Object getWritedownsOfCurrentAssets() {
        return writedownsOfCurrentAssets;
    }

    @JsonProperty("WritedownsOfCurrentAssets")
    public void setWritedownsOfCurrentAssets(Object writedownsOfCurrentAssets) {
        this.writedownsOfCurrentAssets = writedownsOfCurrentAssets;
    }

    @JsonProperty("GLFCVAInvestmentProperty")
    public Integer getGLFCVAInvestmentProperty() {
        return gLFCVAInvestmentProperty;
    }

    @JsonProperty("GLFCVAInvestmentProperty")
    public void setGLFCVAInvestmentProperty(Integer gLFCVAInvestmentProperty) {
        this.gLFCVAInvestmentProperty = gLFCVAInvestmentProperty;
    }

    @JsonProperty("GLFCVAOtherInvestmentAssets")
    public Object getGLFCVAOtherInvestmentAssets() {
        return gLFCVAOtherInvestmentAssets;
    }

    @JsonProperty("GLFCVAOtherInvestmentAssets")
    public void setGLFCVAOtherInvestmentAssets(Object gLFCVAOtherInvestmentAssets) {
        this.gLFCVAOtherInvestmentAssets = gLFCVAOtherInvestmentAssets;
    }

    @JsonProperty("GLFCVADLCInvestmentProperty")
    public Object getGLFCVADLCInvestmentProperty() {
        return gLFCVADLCInvestmentProperty;
    }

    @JsonProperty("GLFCVADLCInvestmentProperty")
    public void setGLFCVADLCInvestmentProperty(Object gLFCVADLCInvestmentProperty) {
        this.gLFCVADLCInvestmentProperty = gLFCVADLCInvestmentProperty;
    }

    @JsonProperty("GLFCVADLCOtherInvestmentAssets")
    public Object getGLFCVADLCOtherInvestmentAssets() {
        return gLFCVADLCOtherInvestmentAssets;
    }

    @JsonProperty("GLFCVADLCOtherInvestmentAssets")
    public void setGLFCVADLCOtherInvestmentAssets(Object gLFCVADLCOtherInvestmentAssets) {
        this.gLFCVADLCOtherInvestmentAssets = gLFCVADLCOtherInvestmentAssets;
    }

    @JsonProperty("RDExpenditure")
    public Object getRDExpenditure() {
        return rDExpenditure;
    }

    @JsonProperty("RDExpenditure")
    public void setRDExpenditure(Object rDExpenditure) {
        this.rDExpenditure = rDExpenditure;
    }

    @JsonProperty("LongtermInvestmentsAndReceivables")
    public Object getLongtermInvestmentsAndReceivables() {
        return longtermInvestmentsAndReceivables;
    }

    @JsonProperty("LongtermInvestmentsAndReceivables")
    public void setLongtermInvestmentsAndReceivables(Object longtermInvestmentsAndReceivables) {
        this.longtermInvestmentsAndReceivables = longtermInvestmentsAndReceivables;
    }

    @JsonProperty("Inventories")
    public Object getInventories() {
        return inventories;
    }

    @JsonProperty("Inventories")
    public void setInventories(Object inventories) {
        this.inventories = inventories;
    }

    @JsonProperty("ShorttermInvestments")
    public Object getShorttermInvestments() {
        return shorttermInvestments;
    }

    @JsonProperty("ShorttermInvestments")
    public void setShorttermInvestments(Object shorttermInvestments) {
        this.shorttermInvestments = shorttermInvestments;
    }

    public Integer getgLFCVAInvestmentProperty() {
        return gLFCVAInvestmentProperty;
    }

    public void setgLFCVAInvestmentProperty(Integer gLFCVAInvestmentProperty) {
        this.gLFCVAInvestmentProperty = gLFCVAInvestmentProperty;
    }

    public Object getgLFCVAOtherInvestmentAssets() {
        return gLFCVAOtherInvestmentAssets;
    }

    public void setgLFCVAOtherInvestmentAssets(Object gLFCVAOtherInvestmentAssets) {
        this.gLFCVAOtherInvestmentAssets = gLFCVAOtherInvestmentAssets;
    }

    public Object getgLFCVADLCInvestmentProperty() {
        return gLFCVADLCInvestmentProperty;
    }

    public void setgLFCVADLCInvestmentProperty(Object gLFCVADLCInvestmentProperty) {
        this.gLFCVADLCInvestmentProperty = gLFCVADLCInvestmentProperty;
    }

    public Object getgLFCVADLCOtherInvestmentAssets() {
        return gLFCVADLCOtherInvestmentAssets;
    }

    public void setgLFCVADLCOtherInvestmentAssets(Object gLFCVADLCOtherInvestmentAssets) {
        this.gLFCVADLCOtherInvestmentAssets = gLFCVADLCOtherInvestmentAssets;
    }

    public Object getrDExpenditure() {
        return rDExpenditure;
    }

    public void setrDExpenditure(Object rDExpenditure) {
        this.rDExpenditure = rDExpenditure;
    }

    public Long getAssets() {
        return assets;
    }

    public void setAssets(Long assets) {
        this.assets = assets;
    }

    public Long getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(Long currentAssets) {
        this.currentAssets = currentAssets;
    }

    public Long getEquity() {
        return equity;
    }

    public void setEquity(Long equity) {
        this.equity = equity;
    }

    public Long getShorttermLiabilitiesOtherThanProvisions() {
        return shorttermLiabilitiesOtherThanProvisions;
    }

    public void setShorttermLiabilitiesOtherThanProvisions(Long shorttermLiabilitiesOtherThanProvisions) {
        this.shorttermLiabilitiesOtherThanProvisions = shorttermLiabilitiesOtherThanProvisions;
    }

    public Long getNoncurrentAssets() {
        return noncurrentAssets;
    }

    public void setNoncurrentAssets(Long noncurrentAssets) {
        this.noncurrentAssets = noncurrentAssets;
    }

    public Long getPropertyPlantAndEquipment() {
        return propertyPlantAndEquipment;
    }

    public void setPropertyPlantAndEquipment(Long propertyPlantAndEquipment) {
        this.propertyPlantAndEquipment = propertyPlantAndEquipment;
    }

    public Long getShorttermReceivables() {
        return shorttermReceivables;
    }

    public void setShorttermReceivables(Long shorttermReceivables) {
        this.shorttermReceivables = shorttermReceivables;
    }

    public Long getCashAndCashEquivalents() {
        return cashAndCashEquivalents;
    }

    public void setCashAndCashEquivalents(Long cashAndCashEquivalents) {
        this.cashAndCashEquivalents = cashAndCashEquivalents;
    }

    public Long getLiabilitiesAndEquity() {
        return liabilitiesAndEquity;
    }

    public void setLiabilitiesAndEquity(Long liabilitiesAndEquity) {
        this.liabilitiesAndEquity = liabilitiesAndEquity;
    }

    public Object getProvisions() {
        return provisions;
    }

    public void setProvisions(Object provisions) {
        this.provisions = provisions;
    }

    public Long getLiabilitiesOtherThanProvisions() {
        return liabilitiesOtherThanProvisions;
    }

    public void setLiabilitiesOtherThanProvisions(Long liabilitiesOtherThanProvisions) {
        this.liabilitiesOtherThanProvisions = liabilitiesOtherThanProvisions;
    }

    public Long getLongtermLiabilitiesOtherThanProvisions() {
        return longtermLiabilitiesOtherThanProvisions;
    }

    public void setLongtermLiabilitiesOtherThanProvisions(Long longtermLiabilitiesOtherThanProvisions) {
        this.longtermLiabilitiesOtherThanProvisions = longtermLiabilitiesOtherThanProvisions;
    }

    public Object getIntangibleAssets() {
        return intangibleAssets;
    }

    public void setIntangibleAssets(Object intangibleAssets) {
        this.intangibleAssets = intangibleAssets;
    }

    public Object getGoodwill() {
        return goodwill;
    }

    public void setGoodwill(Object goodwill) {
        this.goodwill = goodwill;
    }

    public Object getLandAndBuildings() {
        return landAndBuildings;
    }

    public void setLandAndBuildings(Object landAndBuildings) {
        this.landAndBuildings = landAndBuildings;
    }

    public Object getPlantAndMachinery() {
        return plantAndMachinery;
    }

    public void setPlantAndMachinery(Object plantAndMachinery) {
        this.plantAndMachinery = plantAndMachinery;
    }

    public Object getFixturesFittingsToolsAndEquipment() {
        return fixturesFittingsToolsAndEquipment;
    }

    public void setFixturesFittingsToolsAndEquipment(Object fixturesFittingsToolsAndEquipment) {
        this.fixturesFittingsToolsAndEquipment = fixturesFittingsToolsAndEquipment;
    }

    public Object getLeaseholdImprovements() {
        return leaseholdImprovements;
    }

    public void setLeaseholdImprovements(Object leaseholdImprovements) {
        this.leaseholdImprovements = leaseholdImprovements;
    }

    public Object getLongtermInvestmentsInGroupEnterprises() {
        return longtermInvestmentsInGroupEnterprises;
    }

    public void setLongtermInvestmentsInGroupEnterprises(Object longtermInvestmentsInGroupEnterprises) {
        this.longtermInvestmentsInGroupEnterprises = longtermInvestmentsInGroupEnterprises;
    }

    public Object getLongtermInvestmentsInAssociates() {
        return longtermInvestmentsInAssociates;
    }

    public void setLongtermInvestmentsInAssociates(Object longtermInvestmentsInAssociates) {
        this.longtermInvestmentsInAssociates = longtermInvestmentsInAssociates;
    }

    public Object getOtherLongtermInvestments() {
        return otherLongtermInvestments;
    }

    public void setOtherLongtermInvestments(Object otherLongtermInvestments) {
        this.otherLongtermInvestments = otherLongtermInvestments;
    }

    public Object getOtherLongtermReceivables() {
        return otherLongtermReceivables;
    }

    public void setOtherLongtermReceivables(Object otherLongtermReceivables) {
        this.otherLongtermReceivables = otherLongtermReceivables;
    }

    public Object getRawMaterialsAndConsumables() {
        return rawMaterialsAndConsumables;
    }

    public void setRawMaterialsAndConsumables(Object rawMaterialsAndConsumables) {
        this.rawMaterialsAndConsumables = rawMaterialsAndConsumables;
    }

    public Object getManufacturedGoodsAndGoodsForResale() {
        return manufacturedGoodsAndGoodsForResale;
    }

    public void setManufacturedGoodsAndGoodsForResale(Object manufacturedGoodsAndGoodsForResale) {
        this.manufacturedGoodsAndGoodsForResale = manufacturedGoodsAndGoodsForResale;
    }

    public Object getShorttermTradeReceivables() {
        return shorttermTradeReceivables;
    }

    public void setShorttermTradeReceivables(Object shorttermTradeReceivables) {
        this.shorttermTradeReceivables = shorttermTradeReceivables;
    }

    public Object getContractWorkInProgress() {
        return contractWorkInProgress;
    }

    public void setContractWorkInProgress(Object contractWorkInProgress) {
        this.contractWorkInProgress = contractWorkInProgress;
    }

    public Object getShorttermReceivablesFromGroupEnterprises() {
        return shorttermReceivablesFromGroupEnterprises;
    }

    public void setShorttermReceivablesFromGroupEnterprises(Object shorttermReceivablesFromGroupEnterprises) {
        this.shorttermReceivablesFromGroupEnterprises = shorttermReceivablesFromGroupEnterprises;
    }

    public Object getShorttermReceivablesFromAssociates() {
        return shorttermReceivablesFromAssociates;
    }

    public void setShorttermReceivablesFromAssociates(Object shorttermReceivablesFromAssociates) {
        this.shorttermReceivablesFromAssociates = shorttermReceivablesFromAssociates;
    }

    public Object getCurrentDeferredTaxAssets() {
        return currentDeferredTaxAssets;
    }

    public void setCurrentDeferredTaxAssets(Object currentDeferredTaxAssets) {
        this.currentDeferredTaxAssets = currentDeferredTaxAssets;
    }

    public Long getOtherShorttermReceivables() {
        return otherShorttermReceivables;
    }

    public void setOtherShorttermReceivables(Long otherShorttermReceivables) {
        this.otherShorttermReceivables = otherShorttermReceivables;
    }

    public Object getShorttermTaxReceivables() {
        return shorttermTaxReceivables;
    }

    public void setShorttermTaxReceivables(Object shorttermTaxReceivables) {
        this.shorttermTaxReceivables = shorttermTaxReceivables;
    }

    public Long getDeferredIncomeAssets() {
        return deferredIncomeAssets;
    }

    public void setDeferredIncomeAssets(Long deferredIncomeAssets) {
        this.deferredIncomeAssets = deferredIncomeAssets;
    }

    public Object getOtherShorttermInvestments() {
        return otherShorttermInvestments;
    }

    public void setOtherShorttermInvestments(Object otherShorttermInvestments) {
        this.otherShorttermInvestments = otherShorttermInvestments;
    }

    public Long getContributedCapital() {
        return contributedCapital;
    }

    public void setContributedCapital(Long contributedCapital) {
        this.contributedCapital = contributedCapital;
    }

    public Long getPaidContributedCapital() {
        return paidContributedCapital;
    }

    public void setPaidContributedCapital(Long paidContributedCapital) {
        this.paidContributedCapital = paidContributedCapital;
    }

    public Long getRetainedEarnings() {
        return retainedEarnings;
    }

    public void setRetainedEarnings(Long retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
    }

    public Object getProposedDividendRecognisedInEquity() {
        return proposedDividendRecognisedInEquity;
    }

    public void setProposedDividendRecognisedInEquity(Object proposedDividendRecognisedInEquity) {
        this.proposedDividendRecognisedInEquity = proposedDividendRecognisedInEquity;
    }

    public Object getProvisionsForDeferredTax() {
        return provisionsForDeferredTax;
    }

    public void setProvisionsForDeferredTax(Object provisionsForDeferredTax) {
        this.provisionsForDeferredTax = provisionsForDeferredTax;
    }

    public Object getShorttermMortgageDebt() {
        return shorttermMortgageDebt;
    }

    public void setShorttermMortgageDebt(Object shorttermMortgageDebt) {
        this.shorttermMortgageDebt = shorttermMortgageDebt;
    }

    public Object getShorttermDebtToBanks() {
        return shorttermDebtToBanks;
    }

    public void setShorttermDebtToBanks(Object shorttermDebtToBanks) {
        this.shorttermDebtToBanks = shorttermDebtToBanks;
    }

    public Long getShorttermDebtToOtherCreditInstitutions() {
        return shorttermDebtToOtherCreditInstitutions;
    }

    public void setShorttermDebtToOtherCreditInstitutions(Long shorttermDebtToOtherCreditInstitutions) {
        this.shorttermDebtToOtherCreditInstitutions = shorttermDebtToOtherCreditInstitutions;
    }

    public Object getShorttermTradePayables() {
        return shorttermTradePayables;
    }

    public void setShorttermTradePayables(Object shorttermTradePayables) {
        this.shorttermTradePayables = shorttermTradePayables;
    }

    public Object getShorttermPayablesToGroupEnterprises() {
        return shorttermPayablesToGroupEnterprises;
    }

    public void setShorttermPayablesToGroupEnterprises(Object shorttermPayablesToGroupEnterprises) {
        this.shorttermPayablesToGroupEnterprises = shorttermPayablesToGroupEnterprises;
    }

    public Object getShorttermTaxPayables() {
        return shorttermTaxPayables;
    }

    public void setShorttermTaxPayables(Object shorttermTaxPayables) {
        this.shorttermTaxPayables = shorttermTaxPayables;
    }

    public Long getOtherShorttermPayables() {
        return otherShorttermPayables;
    }

    public void setOtherShorttermPayables(Long otherShorttermPayables) {
        this.otherShorttermPayables = otherShorttermPayables;
    }

    public Long getShorttermPayablesToShareholdersAndManagement() {
        return shorttermPayablesToShareholdersAndManagement;
    }

    public void setShorttermPayablesToShareholdersAndManagement(Long shorttermPayablesToShareholdersAndManagement) {
        this.shorttermPayablesToShareholdersAndManagement = shorttermPayablesToShareholdersAndManagement;
    }

    public Object getShorttermPartOfLongtermLiabilitiesOtherThanProvisions() {
        return shorttermPartOfLongtermLiabilitiesOtherThanProvisions;
    }

    public void setShorttermPartOfLongtermLiabilitiesOtherThanProvisions(Object shorttermPartOfLongtermLiabilitiesOtherThanProvisions) {
        this.shorttermPartOfLongtermLiabilitiesOtherThanProvisions = shorttermPartOfLongtermLiabilitiesOtherThanProvisions;
    }

    public Object getLongtermMortgageDebt() {
        return longtermMortgageDebt;
    }

    public void setLongtermMortgageDebt(Object longtermMortgageDebt) {
        this.longtermMortgageDebt = longtermMortgageDebt;
    }

    public Object getLongtermDebtToBanks() {
        return longtermDebtToBanks;
    }

    public void setLongtermDebtToBanks(Object longtermDebtToBanks) {
        this.longtermDebtToBanks = longtermDebtToBanks;
    }

    public Object getOtherLongtermPayables() {
        return otherLongtermPayables;
    }

    public void setOtherLongtermPayables(Object otherLongtermPayables) {
        this.otherLongtermPayables = otherLongtermPayables;
    }

    public Object getGrossResultGrowthrate() {
        return grossResultGrowthrate;
    }

    public void setGrossResultGrowthrate(Object grossResultGrowthrate) {
        this.grossResultGrowthrate = grossResultGrowthrate;
    }

    public Object getRevenueGrowthrate() {
        return revenueGrowthrate;
    }

    public void setRevenueGrowthrate(Object revenueGrowthrate) {
        this.revenueGrowthrate = revenueGrowthrate;
    }

    public Object getPrimaryResultGrowthrate() {
        return primaryResultGrowthrate;
    }

    public void setPrimaryResultGrowthrate(Object primaryResultGrowthrate) {
        this.primaryResultGrowthrate = primaryResultGrowthrate;
    }

    public Object getResultBeforeTaxGrowthrate() {
        return resultBeforeTaxGrowthrate;
    }

    public void setResultBeforeTaxGrowthrate(Object resultBeforeTaxGrowthrate) {
        this.resultBeforeTaxGrowthrate = resultBeforeTaxGrowthrate;
    }

    public Object getAnnualResultGrowthrate() {
        return annualResultGrowthrate;
    }

    public void setAnnualResultGrowthrate(Object annualResultGrowthrate) {
        this.annualResultGrowthrate = annualResultGrowthrate;
    }

    public Double getTotalEquityGrowthrate() {
        return totalEquityGrowthrate;
    }

    public void setTotalEquityGrowthrate(Double totalEquityGrowthrate) {
        this.totalEquityGrowthrate = totalEquityGrowthrate;
    }

    public Double getBalanceSheetGrowthrate() {
        return balanceSheetGrowthrate;
    }

    public void setBalanceSheetGrowthrate(Double balanceSheetGrowthrate) {
        this.balanceSheetGrowthrate = balanceSheetGrowthrate;
    }

    public Object getReturnOnTotalAssets() {
        return returnOnTotalAssets;
    }

    public void setReturnOnTotalAssets(Object returnOnTotalAssets) {
        this.returnOnTotalAssets = returnOnTotalAssets;
    }

    public Double getEquityRatio() {
        return equityRatio;
    }

    public void setEquityRatio(Double equityRatio) {
        this.equityRatio = equityRatio;
    }

    public Double getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(Double currentRatio) {
        this.currentRatio = currentRatio;
    }

    public Double getReturnOnEquity() {
        return returnOnEquity;
    }

    public void setReturnOnEquity(Double returnOnEquity) {
        this.returnOnEquity = returnOnEquity;
    }

    public Object getOperatingMarginRatio() {
        return operatingMarginRatio;
    }

    public void setOperatingMarginRatio(Object operatingMarginRatio) {
        this.operatingMarginRatio = operatingMarginRatio;
    }

    public Double getGearing() {
        return gearing;
    }

    public void setGearing(Double gearing) {
        this.gearing = gearing;
    }

    public Long getWorkingCapital() {
        return workingCapital;
    }

    public void setWorkingCapital(Long workingCapital) {
        this.workingCapital = workingCapital;
    }

    public Double getWorkingCapitalRatio() {
        return workingCapitalRatio;
    }

    public void setWorkingCapitalRatio(Double workingCapitalRatio) {
        this.workingCapitalRatio = workingCapitalRatio;
    }

    public Object getWorkingCapitalRatio2() {
        return workingCapitalRatio2;
    }

    public void setWorkingCapitalRatio2(Object workingCapitalRatio2) {
        this.workingCapitalRatio2 = workingCapitalRatio2;
    }

    public Object getdSO() {
        return dSO;
    }

    public void setdSO(Object dSO) {
        this.dSO = dSO;
    }

    public Object getdPO() {
        return dPO;
    }

    public void setdPO(Object dPO) {
        this.dPO = dPO;
    }

    public Object getdIO() {
        return dIO;
    }

    public void setdIO(Object dIO) {
        this.dIO = dIO;
    }

    public Object getdWC() {
        return dWC;
    }

    public void setdWC(Object dWC) {
        this.dWC = dWC;
    }

    public Object getCapitalTurnover() {
        return capitalTurnover;
    }

    public void setCapitalTurnover(Object capitalTurnover) {
        this.capitalTurnover = capitalTurnover;
    }

    public Long getCapitalEmployed() {
        return capitalEmployed;
    }

    public void setCapitalEmployed(Long capitalEmployed) {
        this.capitalEmployed = capitalEmployed;
    }

    public Double getQuickRatio() {
        return quickRatio;
    }

    public void setQuickRatio(Double quickRatio) {
        this.quickRatio = quickRatio;
    }

    public Object getReturnOnCapitalEmployed() {
        return returnOnCapitalEmployed;
    }

    public void setReturnOnCapitalEmployed(Object returnOnCapitalEmployed) {
        this.returnOnCapitalEmployed = returnOnCapitalEmployed;
    }

    public Object getGrossProfitMarginRatio() {
        return grossProfitMarginRatio;
    }

    public void setGrossProfitMarginRatio(Object grossProfitMarginRatio) {
        this.grossProfitMarginRatio = grossProfitMarginRatio;
    }

    public Object getTurnoverPerEmployee() {
        return turnoverPerEmployee;
    }

    public void setTurnoverPerEmployee(Object turnoverPerEmployee) {
        this.turnoverPerEmployee = turnoverPerEmployee;
    }

    public Object getGrossResultPerEmployee() {
        return grossResultPerEmployee;
    }

    public void setGrossResultPerEmployee(Object grossResultPerEmployee) {
        this.grossResultPerEmployee = grossResultPerEmployee;
    }

    public Object getPrimaryResultPerEmployee() {
        return primaryResultPerEmployee;
    }

    public void setPrimaryResultPerEmployee(Object primaryResultPerEmployee) {
        this.primaryResultPerEmployee = primaryResultPerEmployee;
    }

    public Object getAnnualResultPerEmployee() {
        return annualResultPerEmployee;
    }

    public void setAnnualResultPerEmployee(Object annualResultPerEmployee) {
        this.annualResultPerEmployee = annualResultPerEmployee;
    }

    public Object getEmployeeBenefitsExpensePerEmployee() {
        return employeeBenefitsExpensePerEmployee;
    }

    public void setEmployeeBenefitsExpensePerEmployee(Object employeeBenefitsExpensePerEmployee) {
        this.employeeBenefitsExpensePerEmployee = employeeBenefitsExpensePerEmployee;
    }

    public Object getWagesAndSalariesPerEmployee() {
        return wagesAndSalariesPerEmployee;
    }

    public void setWagesAndSalariesPerEmployee(Object wagesAndSalariesPerEmployee) {
        this.wagesAndSalariesPerEmployee = wagesAndSalariesPerEmployee;
    }

    public Integer getPosResult() {
        return posResult;
    }

    public void setPosResult(Integer posResult) {
        this.posResult = posResult;
    }

    public Object getPosResult3years() {
        return posResult3years;
    }

    public void setPosResult3years(Object posResult3years) {
        this.posResult3years = posResult3years;
    }

    public Long getFinancialConditionClassId1() {
        return financialConditionClassId1;
    }

    public void setFinancialConditionClassId1(Long financialConditionClassId1) {
        this.financialConditionClassId1 = financialConditionClassId1;
    }

    public Long getFinancialConditionClassId2() {
        return financialConditionClassId2;
    }

    public void setFinancialConditionClassId2(Long financialConditionClassId2) {
        this.financialConditionClassId2 = financialConditionClassId2;
    }

    public Object getMinorityInterest() {
        return minorityInterest;
    }

    public void setMinorityInterest(Object minorityInterest) {
        this.minorityInterest = minorityInterest;
    }

    public Object getTotalFinanceCosts() {
        return totalFinanceCosts;
    }

    public void setTotalFinanceCosts(Object totalFinanceCosts) {
        this.totalFinanceCosts = totalFinanceCosts;
    }

    public Object getResultAfterFinancialItems() {
        return resultAfterFinancialItems;
    }

    public void setResultAfterFinancialItems(Object resultAfterFinancialItems) {
        this.resultAfterFinancialItems = resultAfterFinancialItems;
    }

    public Object getTotalOperatingExpenses() {
        return totalOperatingExpenses;
    }

    public void setTotalOperatingExpenses(Object totalOperatingExpenses) {
        this.totalOperatingExpenses = totalOperatingExpenses;
    }

    public Object getTotalFinanceIncome() {
        return totalFinanceIncome;
    }

    public void setTotalFinanceIncome(Object totalFinanceIncome) {
        this.totalFinanceIncome = totalFinanceIncome;
    }

    public Object getIncomeBeforeDeprication() {
        return incomeBeforeDeprication;
    }

    public void setIncomeBeforeDeprication(Object incomeBeforeDeprication) {
        this.incomeBeforeDeprication = incomeBeforeDeprication;
    }

    public Object getExtraOrdinaryItems() {
        return extraOrdinaryItems;
    }

    public void setExtraOrdinaryItems(Object extraOrdinaryItems) {
        this.extraOrdinaryItems = extraOrdinaryItems;
    }

    public Object getExternalInterestIncome() {
        return externalInterestIncome;
    }

    public void setExternalInterestIncome(Object externalInterestIncome) {
        this.externalInterestIncome = externalInterestIncome;
    }

    public Object getExternalInterestExpenses() {
        return externalInterestExpenses;
    }

    public void setExternalInterestExpenses(Object externalInterestExpenses) {
        this.externalInterestExpenses = externalInterestExpenses;
    }

    public Object getTotalOperatingCosts() {
        return totalOperatingCosts;
    }

    public void setTotalOperatingCosts(Object totalOperatingCosts) {
        this.totalOperatingCosts = totalOperatingCosts;
    }

    public Object getResultBeforeAllocations() {
        return resultBeforeAllocations;
    }

    public void setResultBeforeAllocations(Object resultBeforeAllocations) {
        this.resultBeforeAllocations = resultBeforeAllocations;
    }

    public Object getAllocations() {
        return allocations;
    }

    public void setAllocations(Object allocations) {
        this.allocations = allocations;
    }

    public Object getNetSales() {
        return netSales;
    }

    public void setNetSales(Object netSales) {
        this.netSales = netSales;
    }

    public Object getExtraOrdinaryExpenses() {
        return extraOrdinaryExpenses;
    }

    public void setExtraOrdinaryExpenses(Object extraOrdinaryExpenses) {
        this.extraOrdinaryExpenses = extraOrdinaryExpenses;
    }

    public Object getTotalExtraOrdinaryItems() {
        return totalExtraOrdinaryItems;
    }

    public void setTotalExtraOrdinaryItems(Object totalExtraOrdinaryItems) {
        this.totalExtraOrdinaryItems = totalExtraOrdinaryItems;
    }

    public Object getTotalInterestExpenses() {
        return totalInterestExpenses;
    }

    public void setTotalInterestExpenses(Object totalInterestExpenses) {
        this.totalInterestExpenses = totalInterestExpenses;
    }

    public Long getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(Long totalAssets) {
        this.totalAssets = totalAssets;
    }

    public Object getTotalRestrictedEquity() {
        return totalRestrictedEquity;
    }

    public void setTotalRestrictedEquity(Object totalRestrictedEquity) {
        this.totalRestrictedEquity = totalRestrictedEquity;
    }

    public Object getUntaxedReserves() {
        return untaxedReserves;
    }

    public void setUntaxedReserves(Object untaxedReserves) {
        this.untaxedReserves = untaxedReserves;
    }

    public Object getTotalSubordLoanCapital() {
        return totalSubordLoanCapital;
    }

    public void setTotalSubordLoanCapital(Object totalSubordLoanCapital) {
        this.totalSubordLoanCapital = totalSubordLoanCapital;
    }

    public Object getTotalSecurities() {
        return totalSecurities;
    }

    public void setTotalSecurities(Object totalSecurities) {
        this.totalSecurities = totalSecurities;
    }

    public Object getTotalContingentLiabilities() {
        return totalContingentLiabilities;
    }

    public void setTotalContingentLiabilities(Object totalContingentLiabilities) {
        this.totalContingentLiabilities = totalContingentLiabilities;
    }

    @Override
    public String toString() {
        return "BisbaseFinancialStatement{" + "financialStatementType=" + financialStatementType + ", classOfReporting=" + classOfReporting + ", financialStatementStartDate=" + financialStatementStartDate + ", financialStatementEndDate=" + financialStatementEndDate + ", publicationTime=" + publicationTime + ", currencyCodeFrom=" + currencyCodeFrom + ", currencyCodeTo=" + currencyCodeTo + ", currencyRate=" + currencyRate + ", periodInMonths=" + periodInMonths + ", periodInDays=" + periodInDays + ", auditAssistanceType=" + auditAssistanceType + ", numberOfEmployeesFinancial=" + numberOfEmployeesFinancial + ", revenue=" + revenue + ", grossResult=" + grossResult + ", primaryResult=" + primaryResult + ", resultBeforeTax=" + resultBeforeTax + ", annualResult=" + annualResult + ", depreciationAmortisationExpenseAndImpairmentL=" + depreciationAmortisationExpenseAndImpairmentL + ", employeeBenefitsExpense=" + employeeBenefitsExpense + ", financeIncome=" + financeIncome + ", financeExpenses=" + financeExpenses + ", taxExpense=" + taxExpense + ", costOfSales=" + costOfSales + ", otherOperatingIncome=" + otherOperatingIncome + ", propertyCost=" + propertyCost + ", administrativeExpenses=" + administrativeExpenses + ", otherExternalExpenses=" + otherExternalExpenses + ", wagesAndSalaries=" + wagesAndSalaries + ", postemploymentBenefitExpense=" + postemploymentBenefitExpense + ", socialSecurityContributions=" + socialSecurityContributions + ", employeeExpensesTranferredToAssets=" + employeeExpensesTranferredToAssets + ", otherEmployeeExpense=" + otherEmployeeExpense + ", otherOperatingExpenses=" + otherOperatingExpenses + ", incomeFromOtherLongtermInvestmentsAndReceivables=" + incomeFromOtherLongtermInvestmentsAndReceivables + ", otherFinanceIncomeFromGroupEnterprises=" + otherFinanceIncomeFromGroupEnterprises + ", impairmentOfFinancialAssets=" + impairmentOfFinancialAssets + ", financeExpensesArisingFromGroupEnterprises=" + financeExpensesArisingFromGroupEnterprises + ", restOfOtherFinanceExpenses=" + restOfOtherFinanceExpenses + ", incomeFromInvestmentsInGroupEnterprises=" + incomeFromInvestmentsInGroupEnterprises + ", incomeFromInvestmentsInAssociates=" + incomeFromInvestmentsInAssociates + ", otherTaxExpenses=" + otherTaxExpenses + ", distributionCosts=" + distributionCosts + ", costOfProduction=" + costOfProduction + ", changeInInventoriesOfFinishedGoods=" + changeInInventoriesOfFinishedGoods + ", workPerformedByEntityAndCapitalised=" + workPerformedByEntityAndCapitalised + ", externalExpenses=" + externalExpenses + ", rawMaterialsAndConsumablesUsed=" + rawMaterialsAndConsumablesUsed + ", writedownsOfCurrentAssets=" + writedownsOfCurrentAssets + ", gLFCVAInvestmentProperty=" + gLFCVAInvestmentProperty + ", gLFCVAOtherInvestmentAssets=" + gLFCVAOtherInvestmentAssets + ", gLFCVADLCInvestmentProperty=" + gLFCVADLCInvestmentProperty + ", gLFCVADLCOtherInvestmentAssets=" + gLFCVADLCOtherInvestmentAssets + ", rDExpenditure=" + rDExpenditure + ", assets=" + assets + ", currentAssets=" + currentAssets + ", equity=" + equity + ", shorttermLiabilitiesOtherThanProvisions=" + shorttermLiabilitiesOtherThanProvisions + ", noncurrentAssets=" + noncurrentAssets + ", propertyPlantAndEquipment=" + propertyPlantAndEquipment + ", longtermInvestmentsAndReceivables=" + longtermInvestmentsAndReceivables + ", inventories=" + inventories + ", shorttermReceivables=" + shorttermReceivables + ", shorttermInvestments=" + shorttermInvestments + ", cashAndCashEquivalents=" + cashAndCashEquivalents + ", liabilitiesAndEquity=" + liabilitiesAndEquity + ", provisions=" + provisions + ", liabilitiesOtherThanProvisions=" + liabilitiesOtherThanProvisions + ", longtermLiabilitiesOtherThanProvisions=" + longtermLiabilitiesOtherThanProvisions + ", intangibleAssets=" + intangibleAssets + ", goodwill=" + goodwill + ", landAndBuildings=" + landAndBuildings + ", plantAndMachinery=" + plantAndMachinery + ", fixturesFittingsToolsAndEquipment=" + fixturesFittingsToolsAndEquipment + ", leaseholdImprovements=" + leaseholdImprovements + ", longtermInvestmentsInGroupEnterprises=" + longtermInvestmentsInGroupEnterprises + ", longtermInvestmentsInAssociates=" + longtermInvestmentsInAssociates + ", otherLongtermInvestments=" + otherLongtermInvestments + ", otherLongtermReceivables=" + otherLongtermReceivables + ", rawMaterialsAndConsumables=" + rawMaterialsAndConsumables + ", manufacturedGoodsAndGoodsForResale=" + manufacturedGoodsAndGoodsForResale + ", shorttermTradeReceivables=" + shorttermTradeReceivables + ", contractWorkInProgress=" + contractWorkInProgress + ", shorttermReceivablesFromGroupEnterprises=" + shorttermReceivablesFromGroupEnterprises + ", shorttermReceivablesFromAssociates=" + shorttermReceivablesFromAssociates + ", currentDeferredTaxAssets=" + currentDeferredTaxAssets + ", otherShorttermReceivables=" + otherShorttermReceivables + ", shorttermTaxReceivables=" + shorttermTaxReceivables + ", deferredIncomeAssets=" + deferredIncomeAssets + ", otherShorttermInvestments=" + otherShorttermInvestments + ", contributedCapital=" + contributedCapital + ", paidContributedCapital=" + paidContributedCapital + ", retainedEarnings=" + retainedEarnings + ", proposedDividendRecognisedInEquity=" + proposedDividendRecognisedInEquity + ", provisionsForDeferredTax=" + provisionsForDeferredTax + ", shorttermMortgageDebt=" + shorttermMortgageDebt + ", shorttermDebtToBanks=" + shorttermDebtToBanks + ", shorttermDebtToOtherCreditInstitutions=" + shorttermDebtToOtherCreditInstitutions + ", shorttermTradePayables=" + shorttermTradePayables + ", shorttermPayablesToGroupEnterprises=" + shorttermPayablesToGroupEnterprises + ", shorttermTaxPayables=" + shorttermTaxPayables + ", otherShorttermPayables=" + otherShorttermPayables + ", shorttermPayablesToShareholdersAndManagement=" + shorttermPayablesToShareholdersAndManagement + ", shorttermPartOfLongtermLiabilitiesOtherThanProvisions=" + shorttermPartOfLongtermLiabilitiesOtherThanProvisions + ", longtermMortgageDebt=" + longtermMortgageDebt + ", longtermDebtToBanks=" + longtermDebtToBanks + ", otherLongtermPayables=" + otherLongtermPayables + ", grossResultGrowthrate=" + grossResultGrowthrate + ", revenueGrowthrate=" + revenueGrowthrate + ", primaryResultGrowthrate=" + primaryResultGrowthrate + ", resultBeforeTaxGrowthrate=" + resultBeforeTaxGrowthrate + ", annualResultGrowthrate=" + annualResultGrowthrate + ", totalEquityGrowthrate=" + totalEquityGrowthrate + ", balanceSheetGrowthrate=" + balanceSheetGrowthrate + ", returnOnTotalAssets=" + returnOnTotalAssets + ", equityRatio=" + equityRatio + ", currentRatio=" + currentRatio + ", returnOnEquity=" + returnOnEquity + ", operatingMarginRatio=" + operatingMarginRatio + ", gearing=" + gearing + ", workingCapital=" + workingCapital + ", workingCapitalRatio=" + workingCapitalRatio + ", workingCapitalRatio2=" + workingCapitalRatio2 + ", dSO=" + dSO + ", dPO=" + dPO + ", dIO=" + dIO + ", dWC=" + dWC + ", capitalTurnover=" + capitalTurnover + ", capitalEmployed=" + capitalEmployed + ", quickRatio=" + quickRatio + ", returnOnCapitalEmployed=" + returnOnCapitalEmployed + ", grossProfitMarginRatio=" + grossProfitMarginRatio + ", turnoverPerEmployee=" + turnoverPerEmployee + ", grossResultPerEmployee=" + grossResultPerEmployee + ", primaryResultPerEmployee=" + primaryResultPerEmployee + ", annualResultPerEmployee=" + annualResultPerEmployee + ", employeeBenefitsExpensePerEmployee=" + employeeBenefitsExpensePerEmployee + ", wagesAndSalariesPerEmployee=" + wagesAndSalariesPerEmployee + ", posResult=" + posResult + ", posResult3years=" + posResult3years + ", financialConditionClassId1=" + financialConditionClassId1 + ", financialConditionClassId2=" + financialConditionClassId2 + ", minorityInterest=" + minorityInterest + ", totalFinanceCosts=" + totalFinanceCosts + ", resultAfterFinancialItems=" + resultAfterFinancialItems + ", totalOperatingExpenses=" + totalOperatingExpenses + ", totalFinanceIncome=" + totalFinanceIncome + ", incomeBeforeDeprication=" + incomeBeforeDeprication + ", extraOrdinaryItems=" + extraOrdinaryItems + ", externalInterestIncome=" + externalInterestIncome + ", externalInterestExpenses=" + externalInterestExpenses + ", totalOperatingCosts=" + totalOperatingCosts + ", resultBeforeAllocations=" + resultBeforeAllocations + ", allocations=" + allocations + ", netSales=" + netSales + ", extraOrdinaryExpenses=" + extraOrdinaryExpenses + ", totalExtraOrdinaryItems=" + totalExtraOrdinaryItems + ", totalInterestExpenses=" + totalInterestExpenses + ", totalAssets=" + totalAssets + ", totalRestrictedEquity=" + totalRestrictedEquity + ", untaxedReserves=" + untaxedReserves + ", totalSubordLoanCapital=" + totalSubordLoanCapital + ", totalSecurities=" + totalSecurities + ", totalContingentLiabilities=" + totalContingentLiabilities + '}';
    }

}
