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
"name",
"address",
"companies",
"totalRelations",
"solutions",
"bankruptcies",
"active",
"unitNumber",
"isActive",
"managementType",
"validFrom",
"validTo",
"position"
})
public class RealOwner {

@JsonProperty("name")
private String name;
@JsonProperty("address")
private Address address;
@JsonProperty("companies")
private List<Company> companies = null;
@JsonProperty("totalRelations")
private Integer totalRelations;
@JsonProperty("solutions")
private Integer solutions;
@JsonProperty("bankruptcies")
private Integer bankruptcies;
@JsonProperty("active")
private Integer active;
@JsonProperty("unitNumber")
private Long unitNumber;
@JsonProperty("isActive")
private Boolean isActive;
@JsonProperty("managementType")
private String managementType;
@JsonProperty("validFrom")
private String validFrom;
@JsonProperty("validTo")
private Object validTo;
@JsonProperty("position")
private String position;

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("address")
public Address getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(Address address) {
this.address = address;
}

@JsonProperty("companies")
public List<Company> getCompanies() {
return companies;
}

@JsonProperty("companies")
public void setCompanies(List<Company> companies) {
this.companies = companies;
}

@JsonProperty("totalRelations")
public Integer getTotalRelations() {
return totalRelations;
}

@JsonProperty("totalRelations")
public void setTotalRelations(Integer totalRelations) {
this.totalRelations = totalRelations;
}

@JsonProperty("solutions")
public Integer getSolutions() {
return solutions;
}

@JsonProperty("solutions")
public void setSolutions(Integer solutions) {
this.solutions = solutions;
}

@JsonProperty("bankruptcies")
public Integer getBankruptcies() {
return bankruptcies;
}

@JsonProperty("bankruptcies")
public void setBankruptcies(Integer bankruptcies) {
this.bankruptcies = bankruptcies;
}

@JsonProperty("active")
public Integer getActive() {
return active;
}

@JsonProperty("active")
public void setActive(Integer active) {
this.active = active;
}

@JsonProperty("unitNumber")
public Long getUnitNumber() {
return unitNumber;
}

@JsonProperty("unitNumber")
public void setUnitNumber(Long unitNumber) {
this.unitNumber = unitNumber;
}

@JsonProperty("isActive")
public Boolean getIsActive() {
return isActive;
}

@JsonProperty("isActive")
public void setIsActive(Boolean isActive) {
this.isActive = isActive;
}

@JsonProperty("managementType")
public String getManagementType() {
return managementType;
}

@JsonProperty("managementType")
public void setManagementType(String managementType) {
this.managementType = managementType;
}

@JsonProperty("validFrom")
public String getValidFrom() {
return validFrom;
}

@JsonProperty("validFrom")
public void setValidFrom(String validFrom) {
this.validFrom = validFrom;
}

@JsonProperty("validTo")
public Object getValidTo() {
return validTo;
}

@JsonProperty("validTo")
public void setValidTo(Object validTo) {
this.validTo = validTo;
}

@JsonProperty("position")
public String getPosition() {
return position;
}

@JsonProperty("position")
public void setPosition(String position) {
this.position = position;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("name", name).append("address", address).append("companies", companies).append("totalRelations", totalRelations).append("solutions", solutions).append("bankruptcies", bankruptcies).append("active", active).append("unitNumber", unitNumber).append("isActive", isActive).append("managementType", managementType).append("validFrom", validFrom).append("validTo", validTo).append("position", position).toString();
}

}