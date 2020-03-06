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
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accountantInfo",
    "generalAssembly",
    "additionalInfo",
    "managementAndAuditorsNotesMortgageInfo",
    "financialData",
    "keyFigure",
    "accountingPeriod",
    "xbrlVersion",
    "_id",
    "executiveAndBoardMembers",
    "rating",
    "vatNumber",
    "PublicationTime",
    "LoadingTime",
    "documents",
    "createdAt",
    "updatedAt",
    "__v",
    "year"
})
public class TaxonomyResponse {

    @JsonProperty("accountantInfo")
    private AccountantInfo accountantInfo;
    @JsonProperty("generalAssembly")
    private GeneralAssembly generalAssembly;
    @JsonProperty("additionalInfo")
    private AdditionalInfo additionalInfo;
    @JsonProperty("managementAndAuditorsNotesMortgageInfo")
    private ManagementAndAuditorsNotesMortgageInfo managementAndAuditorsNotesMortgageInfo;
    @JsonProperty("financialData")
    private FinancialData financialData;
    @JsonProperty("keyFigure")
    private KeyFigure keyFigure;
    @JsonProperty("accountingPeriod")
    private AccountingPeriod accountingPeriod;
    @JsonProperty("xbrlVersion")
    private Double xbrlVersion;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("executiveAndBoardMembers")
    private List<Object> executiveAndBoardMembers = null;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("vatNumber")
    private String vatNumber;
    @JsonProperty("PublicationTime")
    private String publicationTime;
    @JsonProperty("LoadingTime")
    private String loadingTime;
    @JsonProperty("documents")
    private List<Document> documents = null;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("updatedAt")
    private String updatedAt;
    @JsonProperty("__v")
    private Integer v;
    @JsonProperty("year")
    private Integer year;

    @JsonProperty("accountantInfo")
    public AccountantInfo getAccountantInfo() {
        return accountantInfo;
    }

    @JsonProperty("accountantInfo")
    public void setAccountantInfo(AccountantInfo accountantInfo) {
        this.accountantInfo = accountantInfo;
    }

    @JsonProperty("generalAssembly")
    public GeneralAssembly getGeneralAssembly() {
        return generalAssembly;
    }

    @JsonProperty("generalAssembly")
    public void setGeneralAssembly(GeneralAssembly generalAssembly) {
        this.generalAssembly = generalAssembly;
    }

    @JsonProperty("additionalInfo")
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @JsonProperty("managementAndAuditorsNotesMortgageInfo")
    public ManagementAndAuditorsNotesMortgageInfo getManagementAndAuditorsNotesMortgageInfo() {
        return managementAndAuditorsNotesMortgageInfo;
    }

    @JsonProperty("managementAndAuditorsNotesMortgageInfo")
    public void setManagementAndAuditorsNotesMortgageInfo(ManagementAndAuditorsNotesMortgageInfo managementAndAuditorsNotesMortgageInfo) {
        this.managementAndAuditorsNotesMortgageInfo = managementAndAuditorsNotesMortgageInfo;
    }

    @JsonProperty("financialData")
    public FinancialData getFinancialData() {
        return financialData;
    }

    @JsonProperty("financialData")
    public void setFinancialData(FinancialData financialData) {
        this.financialData = financialData;
    }

    @JsonProperty("keyFigure")
    public KeyFigure getKeyFigure() {
        return keyFigure;
    }

    @JsonProperty("keyFigure")
    public void setKeyFigure(KeyFigure keyFigure) {
        this.keyFigure = keyFigure;
    }

    @JsonProperty("accountingPeriod")
    public AccountingPeriod getAccountingPeriod() {
        return accountingPeriod;
    }

    @JsonProperty("accountingPeriod")
    public void setAccountingPeriod(AccountingPeriod accountingPeriod) {
        this.accountingPeriod = accountingPeriod;
    }

    @JsonProperty("xbrlVersion")
    public Double getXbrlVersion() {
        return xbrlVersion;
    }

    @JsonProperty("xbrlVersion")
    public void setXbrlVersion(Double xbrlVersion) {
        this.xbrlVersion = xbrlVersion;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("executiveAndBoardMembers")
    public List<Object> getExecutiveAndBoardMembers() {
        return executiveAndBoardMembers;
    }

    @JsonProperty("executiveAndBoardMembers")
    public void setExecutiveAndBoardMembers(List<Object> executiveAndBoardMembers) {
        this.executiveAndBoardMembers = executiveAndBoardMembers;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("vatNumber")
    public String getVatNumber() {
        return vatNumber;
    }

    @JsonProperty("vatNumber")
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @JsonProperty("PublicationTime")
    public String getPublicationTime() {
        return publicationTime;
    }

    @JsonProperty("PublicationTime")
    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
    }

    @JsonProperty("LoadingTime")
    public String getLoadingTime() {
        return loadingTime;
    }

    @JsonProperty("LoadingTime")
    public void setLoadingTime(String loadingTime) {
        this.loadingTime = loadingTime;
    }

    @JsonProperty("documents")
    public List<Document> getDocuments() {
        return documents;
    }

    @JsonProperty("documents")
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedAt")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("__v")
    public Integer getV() {
        return v;
    }

    @JsonProperty("__v")
    public void setV(Integer v) {
        this.v = v;
    }

    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accountantInfo", accountantInfo).append("generalAssembly", generalAssembly).append("additionalInfo", additionalInfo).append("managementAndAuditorsNotesMortgageInfo", managementAndAuditorsNotesMortgageInfo).append("financialData", financialData).append("keyFigure", keyFigure).append("accountingPeriod", accountingPeriod).append("xbrlVersion", xbrlVersion).append("id", id).append("executiveAndBoardMembers", executiveAndBoardMembers).append("rating", rating).append("vatNumber", vatNumber).append("publicationTime", publicationTime).append("loadingTime", loadingTime).append("documents", documents).append("createdAt", createdAt).append("updatedAt", updatedAt).append("v", v).append("year", year).toString();
    }

}
