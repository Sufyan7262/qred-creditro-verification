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
"type",
"value",
"period",
"lastupdated"
})
public class Value {

@JsonProperty("type")
private String type;
@JsonProperty("value")
private String value;
@JsonProperty("period")
private Period period;
@JsonProperty("lastupdated")
private String lastupdated;

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("value")
public String getValue() {
return value;
}

@JsonProperty("value")
public void setValue(String value) {
this.value = value;
}

@JsonProperty("period")
public Period getPeriod() {
return period;
}

@JsonProperty("period")
public void setPeriod(Period period) {
this.period = period;
}

@JsonProperty("lastupdated")
public String getLastupdated() {
return lastupdated;
}

@JsonProperty("lastupdated")
public void setLastupdated(String lastupdated) {
this.lastupdated = lastupdated;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("type", type).append("value", value).append("period", period).append("lastupdated", lastupdated).toString();
}

}