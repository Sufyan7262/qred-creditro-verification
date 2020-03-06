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
"communeCode",
"communeName",
"period",
"lastUpdated"
})
public class Commune {

@JsonProperty("communeCode")
private Integer communeCode;
@JsonProperty("communeName")
private String communeName;
@JsonProperty("period")
private Period period;
@JsonProperty("lastUpdated")
private String lastUpdated;

@JsonProperty("communeCode")
public Integer getCommuneCode() {
return communeCode;
}

@JsonProperty("communeCode")
public void setCommuneCode(Integer communeCode) {
this.communeCode = communeCode;
}

@JsonProperty("communeName")
public String getCommuneName() {
return communeName;
}

@JsonProperty("communeName")
public void setCommuneName(String communeName) {
this.communeName = communeName;
}

@JsonProperty("period")
public Period getPeriod() {
return period;
}

@JsonProperty("period")
public void setPeriod(Period period) {
this.period = period;
}

@JsonProperty("lastUpdated")
public String getLastUpdated() {
return lastUpdated;
}

@JsonProperty("lastUpdated")
public void setLastUpdated(String lastUpdated) {
this.lastUpdated = lastUpdated;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("communeCode", communeCode).append("communeName", communeName).append("period", period).append("lastUpdated", lastUpdated).toString();
}

}