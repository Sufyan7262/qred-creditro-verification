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
"status",
"name",
"positions",
"identification",
"vatNumber"
})
public class Company {

@JsonProperty("status")
private String status;
@JsonProperty("name")
private String name;
@JsonProperty("positions")
private List<Position> positions = null;
@JsonProperty("identification")
private String identification;
@JsonProperty("vatNumber")
private String vatNumber;

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("positions")
public List<Position> getPositions() {
return positions;
}

@JsonProperty("positions")
public void setPositions(List<Position> positions) {
this.positions = positions;
}

@JsonProperty("identification")
public String getIdentification() {
return identification;
}

@JsonProperty("identification")
public void setIdentification(String identification) {
this.identification = identification;
}

@JsonProperty("vatNumber")
public String getVatNumber() {
return vatNumber;
}

@JsonProperty("vatNumber")
public void setVatNumber(String vatNumber) {
this.vatNumber = vatNumber;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("status", status).append("name", name).append("positions", positions).append("identification", identification).append("vatNumber", vatNumber).toString();
}

}