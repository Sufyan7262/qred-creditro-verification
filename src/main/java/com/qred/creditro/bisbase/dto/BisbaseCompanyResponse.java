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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"CompanyID",
"AuthCompanyID",
"CompanyName"
})
public class BisbaseCompanyResponse {

@JsonProperty("CompanyID")
private String companyID;
@JsonProperty("AuthCompanyID")
private Integer authCompanyID;
@JsonProperty("CompanyName")
private String companyName;

@JsonProperty("CompanyID")
public String getCompanyID() {
return companyID;
}

@JsonProperty("CompanyID")
public void setCompanyID(String companyID) {
this.companyID = companyID;
}

@JsonProperty("AuthCompanyID")
public Integer getAuthCompanyID() {
return authCompanyID;
}

@JsonProperty("AuthCompanyID")
public void setAuthCompanyID(Integer authCompanyID) {
this.authCompanyID = authCompanyID;
}

@JsonProperty("CompanyName")
public String getCompanyName() {
return companyName;
}

@JsonProperty("CompanyName")
public void setCompanyName(String companyName) {
this.companyName = companyName;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("companyID", companyID).append("authCompanyID", authCompanyID).append("companyName", companyName).toString();
}

}