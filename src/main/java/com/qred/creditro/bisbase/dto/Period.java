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
"validFrom",
"validTo"
})
public class Period {

@JsonProperty("validFrom")
private String validFrom;
@JsonProperty("validTo")
private Object validTo;

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

@Override
public String toString() {
return new ToStringBuilder(this).append("validFrom", validFrom).append("validTo", validTo).toString();
}

}