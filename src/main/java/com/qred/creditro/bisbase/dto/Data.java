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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    
//    `modify it
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
    "unit",
    "phone",
    "auditorName",
    "fax",
    "email",
    "homepage",
    "streetName",
    "city",
    "houseNumber",
    "zipCode",
    "letter",
    "floor",
    "side",
    "identification",
    "status",
    "name",
    "address",
    "phone",
    "fax",
    "email",
    "homepage",
    "startDate",
    "secondaryNames",
    "industryCode",
    "industryName",
    "capital",
    "capitalCurrency",
    "number",
    "numberOfEmployees",
    "bind",
    "directors",
    "boardMembers",
    "realOwners",
    "legalOwners",
    "accountants",
    "fraudScore",
    "riskScore",
    "creditRating",
    "vatNumber",
    "zipCodeAndCity",
    "liquidityRatio",
    "financialGearing",
    "returnOnEquity",
    "returnOnAssets",
    "solidity",
    "documentUrl",
    "documentMimeType",
    "documentType",
    "_id"

})
public class Data {

    @JsonProperty("documentUrl")
    private String documentUrl;
    @JsonProperty("documentMimeType")
    private String documentMimeType;
    @JsonProperty("documentType")
    private String documentType;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("liquidityRatio")
    private Double liquidityRatio;
    @JsonProperty("financialGearing")
    private Integer financialGearing;
    @JsonProperty("returnOnEquity")
    private Double returnOnEquity;
    @JsonProperty("returnOnAssets")
    private Double returnOnAssets;
    @JsonProperty("solidity")
    private Double solidity;
    @JsonProperty("revenue")
    private Integer revenue;
    @JsonProperty("grossProfit")
    private Integer grossProfit;
    @JsonProperty("employeeBenefitsExpense")
    private Integer employeeBenefitsExpense;
    @JsonProperty("depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss")
    private Integer depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss;
    @JsonProperty("profitLossFromOperatingActivities")
    private Integer profitLossFromOperatingActivities;
    @JsonProperty("financeIncome")
    private Integer financeIncome;
    @JsonProperty("financeCosts")
    private Integer financeCosts;
    @JsonProperty("profitLossBeforeTax")
    private Integer profitLossBeforeTax;
    @JsonProperty("extraordinaryPosts")
    private Integer extraordinaryPosts;
    @JsonProperty("taxExpense")
    private Integer taxExpense;
    @JsonProperty("profitLoss")
    private Integer profitLoss;
    @JsonProperty("assets")
    private Integer assets;
    @JsonProperty("intangibleAssets")
    private Integer intangibleAssets;
    @JsonProperty("propertyPlantAndEquipment")
    private Integer propertyPlantAndEquipment;
    @JsonProperty("noncurrentAssets")
    private Integer noncurrentAssets;
    @JsonProperty("currentAssets")
    private Integer currentAssets;
    @JsonProperty("inventories")
    private Integer inventories;
    @JsonProperty("shorttermTradeReceivables")
    private Integer shorttermTradeReceivables;
    @JsonProperty("cash")
    private Integer cash;
    @JsonProperty("issuedCapital")
    private Integer issuedCapital;
    @JsonProperty("equity")
    private Integer equity;
    @JsonProperty("deferredTaxLiabilities")
    private Integer deferredTaxLiabilities;
    @JsonProperty("longtermLiabilitiesOtherThanProvisions")
    private Integer longtermLiabilitiesOtherThanProvisions;
    @JsonProperty("currentLiabilities")
    private Integer currentLiabilities;
    @JsonProperty("shorttermTradePayables")
    private Integer shorttermTradePayables;
    @JsonProperty("otherShorttermPayables")
    private Integer otherShorttermPayables;
    @JsonProperty("equityAndLiabilities")
    private Integer equityAndLiabilities;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("auditorName")
    private String auditorName;
    @JsonProperty("fax")
    private Object fax;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("homepage")
    private Object homepage;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("city")
    private String city;
    @JsonProperty("houseNumber")
    private Integer houseNumber;
    @JsonProperty("zipCode")
    private Integer zipCode;
    @JsonProperty("letter")
    private Object letter;
    @JsonProperty("floor")
    private String floor;
    @JsonProperty("side")
    private Object side;
    @JsonProperty("identification")
    private String identification;
    @JsonProperty("status")
    private String status;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("secondaryNames")
    private List<Object> secondaryNames = null;
    @JsonProperty("industryCode")
    private String industryCode;
    @JsonProperty("industryName")
    private String industryName;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("capitalCurrency")
    private String capitalCurrency;
    @JsonProperty("number")
    private String number;
    @JsonProperty("numberOfEmployees")
    private String numberOfEmployees;
    @JsonProperty("bind")
    private String bind;
    @JsonProperty("fraudScore")
    private Double fraudScore;
    @JsonProperty("riskScore")
    private Integer riskScore;
    @JsonProperty("creditRating")
    private String creditRating;
    @JsonProperty("vatNumber")
    private String vatNumber;
    @JsonProperty("zipCodeAndCity")
    private String zipCodeAndCity;
    @JsonProperty("directors")
    private List<Director> directors = null;
    @JsonProperty("boardMembers")
    private List<BoardMember> boardMembers = null;
    @JsonProperty("realOwners")
    private List<RealOwner> realOwners = null;
    @JsonProperty("legalOwners")
    private List<Object> legalOwners = null;
    @JsonProperty("accountants")
    private List<Accountant> accountants = null;

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getDocumentMimeType() {
        return documentMimeType;
    }

    public void setDocumentMimeType(String documentMimeType) {
        this.documentMimeType = documentMimeType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLiquidityRatio() {
        return liquidityRatio;
    }

    public void setLiquidityRatio(Double liquidityRatio) {
        this.liquidityRatio = liquidityRatio;
    }

    public Integer getFinancialGearing() {
        return financialGearing;
    }

    public void setFinancialGearing(Integer financialGearing) {
        this.financialGearing = financialGearing;
    }

    public Double getReturnOnEquity() {
        return returnOnEquity;
    }

    public void setReturnOnEquity(Double returnOnEquity) {
        this.returnOnEquity = returnOnEquity;
    }

    public Double getReturnOnAssets() {
        return returnOnAssets;
    }

    public void setReturnOnAssets(Double returnOnAssets) {
        this.returnOnAssets = returnOnAssets;
    }

    public Double getSolidity() {
        return solidity;
    }

    public void setSolidity(Double solidity) {
        this.solidity = solidity;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public Integer getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(Integer grossProfit) {
        this.grossProfit = grossProfit;
    }

    public Integer getEmployeeBenefitsExpense() {
        return employeeBenefitsExpense;
    }

    public void setEmployeeBenefitsExpense(Integer employeeBenefitsExpense) {
        this.employeeBenefitsExpense = employeeBenefitsExpense;
    }

    public Integer getDepreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss() {
        return depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss;
    }

    public void setDepreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss(Integer depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss) {
        this.depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss = depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss;
    }

    public Integer getProfitLossFromOperatingActivities() {
        return profitLossFromOperatingActivities;
    }

    public void setProfitLossFromOperatingActivities(Integer profitLossFromOperatingActivities) {
        this.profitLossFromOperatingActivities = profitLossFromOperatingActivities;
    }

    public Integer getFinanceIncome() {
        return financeIncome;
    }

    public void setFinanceIncome(Integer financeIncome) {
        this.financeIncome = financeIncome;
    }

    public Integer getFinanceCosts() {
        return financeCosts;
    }

    public void setFinanceCosts(Integer financeCosts) {
        this.financeCosts = financeCosts;
    }

    public Integer getProfitLossBeforeTax() {
        return profitLossBeforeTax;
    }

    public void setProfitLossBeforeTax(Integer profitLossBeforeTax) {
        this.profitLossBeforeTax = profitLossBeforeTax;
    }

    public Integer getExtraordinaryPosts() {
        return extraordinaryPosts;
    }

    public void setExtraordinaryPosts(Integer extraordinaryPosts) {
        this.extraordinaryPosts = extraordinaryPosts;
    }

    public Integer getTaxExpense() {
        return taxExpense;
    }

    public void setTaxExpense(Integer taxExpense) {
        this.taxExpense = taxExpense;
    }

    public Integer getProfitLoss() {
        return profitLoss;
    }

    public void setProfitLoss(Integer profitLoss) {
        this.profitLoss = profitLoss;
    }

    public Integer getAssets() {
        return assets;
    }

    public void setAssets(Integer assets) {
        this.assets = assets;
    }

    public Integer getIntangibleAssets() {
        return intangibleAssets;
    }

    public void setIntangibleAssets(Integer intangibleAssets) {
        this.intangibleAssets = intangibleAssets;
    }

    public Integer getPropertyPlantAndEquipment() {
        return propertyPlantAndEquipment;
    }

    public void setPropertyPlantAndEquipment(Integer propertyPlantAndEquipment) {
        this.propertyPlantAndEquipment = propertyPlantAndEquipment;
    }

    public Integer getNoncurrentAssets() {
        return noncurrentAssets;
    }

    public void setNoncurrentAssets(Integer noncurrentAssets) {
        this.noncurrentAssets = noncurrentAssets;
    }

    public Integer getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(Integer currentAssets) {
        this.currentAssets = currentAssets;
    }

    public Integer getInventories() {
        return inventories;
    }

    public void setInventories(Integer inventories) {
        this.inventories = inventories;
    }

    public Integer getShorttermTradeReceivables() {
        return shorttermTradeReceivables;
    }

    public void setShorttermTradeReceivables(Integer shorttermTradeReceivables) {
        this.shorttermTradeReceivables = shorttermTradeReceivables;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public Integer getIssuedCapital() {
        return issuedCapital;
    }

    public void setIssuedCapital(Integer issuedCapital) {
        this.issuedCapital = issuedCapital;
    }

    public Integer getEquity() {
        return equity;
    }

    public void setEquity(Integer equity) {
        this.equity = equity;
    }

    public Integer getDeferredTaxLiabilities() {
        return deferredTaxLiabilities;
    }

    public void setDeferredTaxLiabilities(Integer deferredTaxLiabilities) {
        this.deferredTaxLiabilities = deferredTaxLiabilities;
    }

    public Integer getLongtermLiabilitiesOtherThanProvisions() {
        return longtermLiabilitiesOtherThanProvisions;
    }

    public void setLongtermLiabilitiesOtherThanProvisions(Integer longtermLiabilitiesOtherThanProvisions) {
        this.longtermLiabilitiesOtherThanProvisions = longtermLiabilitiesOtherThanProvisions;
    }

    public Integer getCurrentLiabilities() {
        return currentLiabilities;
    }

    public void setCurrentLiabilities(Integer currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
    }

    public Integer getShorttermTradePayables() {
        return shorttermTradePayables;
    }

    public void setShorttermTradePayables(Integer shorttermTradePayables) {
        this.shorttermTradePayables = shorttermTradePayables;
    }

    public Integer getOtherShorttermPayables() {
        return otherShorttermPayables;
    }

    public void setOtherShorttermPayables(Integer otherShorttermPayables) {
        this.otherShorttermPayables = otherShorttermPayables;
    }

    public Integer getEquityAndLiabilities() {
        return equityAndLiabilities;
    }

    public void setEquityAndLiabilities(Integer equityAndLiabilities) {
        this.equityAndLiabilities = equityAndLiabilities;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getZipCodeAndCity() {
        return zipCodeAndCity;
    }

    public void setZipCodeAndCity(String zipCodeAndCity) {
        this.zipCodeAndCity = zipCodeAndCity;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Object getLetter() {
        return letter;
    }

    public void setLetter(Object letter) {
        this.letter = letter;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Object getSide() {
        return side;
    }

    public void setSide(Object side) {
        this.side = side;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getFax() {
        return fax;
    }

    public void setFax(Object fax) {
        this.fax = fax;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getHomepage() {
        return homepage;
    }

    public void setHomepage(Object homepage) {
        this.homepage = homepage;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public List<Object> getSecondaryNames() {
        return secondaryNames;
    }

    public void setSecondaryNames(List<Object> secondaryNames) {
        this.secondaryNames = secondaryNames;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapitalCurrency() {
        return capitalCurrency;
    }

    public void setCapitalCurrency(String capitalCurrency) {
        this.capitalCurrency = capitalCurrency;

    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    public Double getFraudScore() {
        return fraudScore;
    }

    public void setFraudScore(Double fraudScore) {
        this.fraudScore = fraudScore;
    }

    public Integer getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    @JsonProperty("directors")
    public List<Director> getDirectors() {
        return directors;
    }

    @JsonProperty("directors")
    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    @JsonProperty("boardMembers")
    public List<BoardMember> getBoardMembers() {
        return boardMembers;
    }

    @JsonProperty("boardMembers")
    public void setBoardMembers(List<BoardMember> boardMembers) {
        this.boardMembers = boardMembers;
    }

    @JsonProperty("realOwners")
    public List<RealOwner> getRealOwners() {
        return realOwners;
    }

    @JsonProperty("realOwners")
    public void setRealOwners(List<RealOwner> realOwners) {
        this.realOwners = realOwners;
    }

    @JsonProperty("legalOwners")
    public List<Object> getLegalOwners() {
        return legalOwners;
    }

    @JsonProperty("legalOwners")
    public void setLegalOwners(List<Object> legalOwners) {
        this.legalOwners = legalOwners;
    }

    @JsonProperty("accountants")
    public List<Accountant> getAccountants() {
        return accountants;
    }

    @JsonProperty("accountants")
    public void setAccountants(List<Accountant> accountants) {
        this.accountants = accountants;
    }

    @Override
    public String toString() {
        return "Data{" + "documentUrl=" + documentUrl + ", documentMimeType=" + documentMimeType + ", documentType=" + documentType + ", id=" + id + ", liquidityRatio=" + liquidityRatio + ", financialGearing=" + financialGearing + ", returnOnEquity=" + returnOnEquity + ", returnOnAssets=" + returnOnAssets + ", solidity=" + solidity + ", revenue=" + revenue + ", grossProfit=" + grossProfit + ", employeeBenefitsExpense=" + employeeBenefitsExpense + ", depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss=" + depreciationAmortisationExpenseAndImpairmentLossesOfPropertyPlantAndEquipmentAndIntangibleAssetsRecognisedInProfitOrLoss + ", profitLossFromOperatingActivities=" + profitLossFromOperatingActivities + ", financeIncome=" + financeIncome + ", financeCosts=" + financeCosts + ", profitLossBeforeTax=" + profitLossBeforeTax + ", extraordinaryPosts=" + extraordinaryPosts + ", taxExpense=" + taxExpense + ", profitLoss=" + profitLoss + ", assets=" + assets + ", intangibleAssets=" + intangibleAssets + ", propertyPlantAndEquipment=" + propertyPlantAndEquipment + ", noncurrentAssets=" + noncurrentAssets + ", currentAssets=" + currentAssets + ", inventories=" + inventories + ", shorttermTradeReceivables=" + shorttermTradeReceivables + ", cash=" + cash + ", issuedCapital=" + issuedCapital + ", equity=" + equity + ", deferredTaxLiabilities=" + deferredTaxLiabilities + ", longtermLiabilitiesOtherThanProvisions=" + longtermLiabilitiesOtherThanProvisions + ", currentLiabilities=" + currentLiabilities + ", shorttermTradePayables=" + shorttermTradePayables + ", otherShorttermPayables=" + otherShorttermPayables + ", equityAndLiabilities=" + equityAndLiabilities + ", unit=" + unit + ", phone=" + phone + ", auditorName=" + auditorName + ", fax=" + fax + ", email=" + email + ", homepage=" + homepage + ", streetName=" + streetName + ", city=" + city + ", houseNumber=" + houseNumber + ", zipCode=" + zipCode + ", letter=" + letter + ", floor=" + floor + ", side=" + side + ", identification=" + identification + ", status=" + status + ", name=" + name + ", address=" + address + ", startDate=" + startDate + ", secondaryNames=" + secondaryNames + ", industryCode=" + industryCode + ", industryName=" + industryName + ", capital=" + capital + ", capitalCurrency=" + capitalCurrency + ", number=" + number + ", numberOfEmployees=" + numberOfEmployees + ", bind=" + bind + ", fraudScore=" + fraudScore + ", riskScore=" + riskScore + ", creditRating=" + creditRating + ", vatNumber=" + vatNumber + ", zipCodeAndCity=" + zipCodeAndCity + ", directors=" + directors + ", boardMembers=" + boardMembers + ", realOwners=" + realOwners + ", legalOwners=" + legalOwners + ", accountants=" + accountants + '}';
    }

}
