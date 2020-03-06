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
"name",
"address",
"number",
"zipCodeAndCity",
"vatNumber",
"auditorName"
})
public class AccountantInfo {

@JsonProperty("name")
private String name;
@JsonProperty("address")
private String address;
@JsonProperty("number")
private String number;
@JsonProperty("zipCodeAndCity")
private String zipCodeAndCity;
@JsonProperty("vatNumber")
private String vatNumber;
@JsonProperty("auditorName")
private String auditorName;

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("address")
public String getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(String address) {
this.address = address;
}

@JsonProperty("number")
public String getNumber() {
return number;
}

@JsonProperty("number")
public void setNumber(String number) {
this.number = number;
}

@JsonProperty("zipCodeAndCity")
public String getZipCodeAndCity() {
return zipCodeAndCity;
}

@JsonProperty("zipCodeAndCity")
public void setZipCodeAndCity(String zipCodeAndCity) {
this.zipCodeAndCity = zipCodeAndCity;
}

@JsonProperty("vatNumber")
public String getVatNumber() {
return vatNumber;
}

@JsonProperty("vatNumber")
public void setVatNumber(String vatNumber) {
this.vatNumber = vatNumber;
}

@JsonProperty("auditorName")
public String getAuditorName() {
return auditorName;
}

@JsonProperty("auditorName")
public void setAuditorName(String auditorName) {
this.auditorName = auditorName;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("name", name).append("address", address).append("number", number).append("zipCodeAndCity", zipCodeAndCity).append("vatNumber", vatNumber).append("auditorName", auditorName).toString();
}

}