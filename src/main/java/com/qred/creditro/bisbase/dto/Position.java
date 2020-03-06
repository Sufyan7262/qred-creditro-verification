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
"managementType",
"values"
})
public class Position {

@JsonProperty("managementType")
private String managementType;
@JsonProperty("values")
private List<Value> values = null;

@JsonProperty("managementType")
public String getManagementType() {
return managementType;
}

@JsonProperty("managementType")
public void setManagementType(String managementType) {
this.managementType = managementType;
}

@JsonProperty("values")
public List<Value> getValues() {
return values;
}

@JsonProperty("values")
public void setValues(List<Value> values) {
this.values = values;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("managementType", managementType).append("values", values).toString();
}

}
