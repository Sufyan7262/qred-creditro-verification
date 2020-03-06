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
    "Web",
    "City",
    "Email",
    "POBox",
    "Phone",
    "COName",
    "NACEID",
    "Address",
    "RegionID",
    "StatusID",
    "CompanyID",
    "StartDate",
    "IndustryID",
    "PostalCode",
    "RegionText",
    "StatusText",
    "CompanyName",
    "LegalFormID",
    "IndustryText",
    "AuthCompanyID",
    "LegalFormText",
    "IndustryTypeID",
    "MunicipalityID",
    "AuditExcemption",
    "MunicipalityText",
    "NumberOfEmployees",
    "HasAdvertisingProtection"
})
public class BaseData {

    @JsonProperty("Web")
    private Object web;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Email")
    private Object email;
    @JsonProperty("POBox")
    private Object pOBox;
    @JsonProperty("Phone")
    private Integer phone;
    @JsonProperty("COName")
    private String cOName;
    @JsonProperty("NACEID")
    private Integer nACEID;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("RegionID")
    private Integer regionID;
    @JsonProperty("StatusID")
    private Integer statusID;
    @JsonProperty("CompanyID")
    private String companyID;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("IndustryID")
    private Integer industryID;
    @JsonProperty("PostalCode")
    private Integer postalCode;
    @JsonProperty("RegionText")
    private String regionText;
    @JsonProperty("StatusText")
    private String statusText;
    @JsonProperty("CompanyName")
    private String companyName;
    @JsonProperty("LegalFormID")
    private Integer legalFormID;
    @JsonProperty("IndustryText")
    private String industryText;
    @JsonProperty("AuthCompanyID")
    private Integer authCompanyID;
    @JsonProperty("LegalFormText")
    private String legalFormText;
    @JsonProperty("IndustryTypeID")
    private String industryTypeID;
    @JsonProperty("MunicipalityID")
    private Integer municipalityID;
    @JsonProperty("AuditExcemption")
    private Integer auditExcemption;
    @JsonProperty("MunicipalityText")
    private String municipalityText;
    @JsonProperty("NumberOfEmployees")
    private String numberOfEmployees;
    @JsonProperty("HasAdvertisingProtection")
    private Integer hasAdvertisingProtection;

    @JsonProperty("Web")
    public Object getWeb() {
        return web;
    }

    @JsonProperty("Web")
    public void setWeb(Object web) {
        this.web = web;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("Email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("POBox")
    public Object getPOBox() {
        return pOBox;
    }

    @JsonProperty("POBox")
    public void setPOBox(Object pOBox) {
        this.pOBox = pOBox;
    }

    @JsonProperty("Phone")
    public Integer getPhone() {
        return phone;
    }

    @JsonProperty("Phone")
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @JsonProperty("COName")
    public String getCOName() {
        return cOName;
    }

    @JsonProperty("COName")
    public void setCOName(String cOName) {
        this.cOName = cOName;
    }

    @JsonProperty("NACEID")
    public Integer getNACEID() {
        return nACEID;
    }

    @JsonProperty("NACEID")
    public void setNACEID(Integer nACEID) {
        this.nACEID = nACEID;
    }

    @JsonProperty("Address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("RegionID")
    public Integer getRegionID() {
        return regionID;
    }

    @JsonProperty("RegionID")
    public void setRegionID(Integer regionID) {
        this.regionID = regionID;
    }

    @JsonProperty("StatusID")
    public Integer getStatusID() {
        return statusID;
    }

    @JsonProperty("StatusID")
    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }

    @JsonProperty("CompanyID")
    public String getCompanyID() {
        return companyID;
    }

    @JsonProperty("CompanyID")
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    @JsonProperty("StartDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("IndustryID")
    public Integer getIndustryID() {
        return industryID;
    }

    @JsonProperty("IndustryID")
    public void setIndustryID(Integer industryID) {
        this.industryID = industryID;
    }

    @JsonProperty("PostalCode")
    public Integer getPostalCode() {
        return postalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("RegionText")
    public String getRegionText() {
        return regionText;
    }

    @JsonProperty("RegionText")
    public void setRegionText(String regionText) {
        this.regionText = regionText;
    }

    @JsonProperty("StatusText")
    public String getStatusText() {
        return statusText;
    }

    @JsonProperty("StatusText")
    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    @JsonProperty("CompanyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("CompanyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("LegalFormID")
    public Integer getLegalFormID() {
        return legalFormID;
    }

    @JsonProperty("LegalFormID")
    public void setLegalFormID(Integer legalFormID) {
        this.legalFormID = legalFormID;
    }

    @JsonProperty("IndustryText")
    public String getIndustryText() {
        return industryText;
    }

    @JsonProperty("IndustryText")
    public void setIndustryText(String industryText) {
        this.industryText = industryText;
    }

    @JsonProperty("AuthCompanyID")
    public Integer getAuthCompanyID() {
        return authCompanyID;
    }

    @JsonProperty("AuthCompanyID")
    public void setAuthCompanyID(Integer authCompanyID) {
        this.authCompanyID = authCompanyID;
    }

    @JsonProperty("LegalFormText")
    public String getLegalFormText() {
        return legalFormText;
    }

    @JsonProperty("LegalFormText")
    public void setLegalFormText(String legalFormText) {
        this.legalFormText = legalFormText;
    }

    @JsonProperty("IndustryTypeID")
    public String getIndustryTypeID() {
        return industryTypeID;
    }

    @JsonProperty("IndustryTypeID")
    public void setIndustryTypeID(String industryTypeID) {
        this.industryTypeID = industryTypeID;
    }

    @JsonProperty("MunicipalityID")
    public Integer getMunicipalityID() {
        return municipalityID;
    }

    @JsonProperty("MunicipalityID")
    public void setMunicipalityID(Integer municipalityID) {
        this.municipalityID = municipalityID;
    }

    @JsonProperty("AuditExcemption")
    public Integer getAuditExcemption() {
        return auditExcemption;
    }

    @JsonProperty("AuditExcemption")
    public void setAuditExcemption(Integer auditExcemption) {
        this.auditExcemption = auditExcemption;
    }

    @JsonProperty("MunicipalityText")
    public String getMunicipalityText() {
        return municipalityText;
    }

    @JsonProperty("MunicipalityText")
    public void setMunicipalityText(String municipalityText) {
        this.municipalityText = municipalityText;
    }

    @JsonProperty("NumberOfEmployees")
    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @JsonProperty("NumberOfEmployees")
    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @JsonProperty("HasAdvertisingProtection")
    public Integer getHasAdvertisingProtection() {
        return hasAdvertisingProtection;
    }

    @JsonProperty("HasAdvertisingProtection")
    public void setHasAdvertisingProtection(Integer hasAdvertisingProtection) {
        this.hasAdvertisingProtection = hasAdvertisingProtection;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("web", web).append("city", city).append("email", email).append("pOBox", pOBox).append("phone", phone).append("cOName", cOName).append("nACEID", nACEID).append("address", address).append("regionID", regionID).append("statusID", statusID).append("companyID", companyID).append("startDate", startDate).append("industryID", industryID).append("postalCode", postalCode).append("regionText", regionText).append("statusText", statusText).append("companyName", companyName).append("legalFormID", legalFormID).append("industryText", industryText).append("authCompanyID", authCompanyID).append("legalFormText", legalFormText).append("industryTypeID", industryTypeID).append("municipalityID", municipalityID).append("auditExcemption", auditExcemption).append("municipalityText", municipalityText).append("numberOfEmployees", numberOfEmployees).append("hasAdvertisingProtection", hasAdvertisingProtection).toString();
    }

}
