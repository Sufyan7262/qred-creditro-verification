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
    "identification",
    "isActive",
    "managementType",
    "validFrom",
    "validTo",
    "position"
})
public class LegalOwner {

    @JsonProperty("name")
    private String name;
    @JsonProperty("identification")
    private String identification;
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

    @JsonProperty("identification")
    public String getIdentification() {
        return identification;
    }

    @JsonProperty("identification")
    public void setIdentification(String identification) {
        this.identification = identification;
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
        return new ToStringBuilder(this).append("name", name).append("identification", identification).append("isActive", isActive).append("managementType", managementType).append("validFrom", validFrom).append("validTo", validTo).append("position", position).toString();
    }

}
