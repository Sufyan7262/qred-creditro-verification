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
    "auditPlace",
    "auditDate",
    "chairmanOfGeneralAssembly",
    "typeOfAudit",
    "startDate",
    "endDate"
})
public class GeneralAssembly {

    @JsonProperty("auditPlace")
    private String auditPlace;
    @JsonProperty("auditDate")
    private String auditDate;
    @JsonProperty("chairmanOfGeneralAssembly")
    private String chairmanOfGeneralAssembly;
    @JsonProperty("typeOfAudit")
    private String typeOfAudit;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("endDate")
    private String endDate;

    @JsonProperty("auditPlace")
    public String getAuditPlace() {
        return auditPlace;
    }

    @JsonProperty("auditPlace")
    public void setAuditPlace(String auditPlace) {
        this.auditPlace = auditPlace;
    }

    @JsonProperty("auditDate")
    public String getAuditDate() {
        return auditDate;
    }

    @JsonProperty("auditDate")
    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }

    @JsonProperty("chairmanOfGeneralAssembly")
    public String getChairmanOfGeneralAssembly() {
        return chairmanOfGeneralAssembly;
    }

    @JsonProperty("chairmanOfGeneralAssembly")
    public void setChairmanOfGeneralAssembly(String chairmanOfGeneralAssembly) {
        this.chairmanOfGeneralAssembly = chairmanOfGeneralAssembly;
    }

    @JsonProperty("typeOfAudit")
    public String getTypeOfAudit() {
        return typeOfAudit;
    }

    @JsonProperty("typeOfAudit")
    public void setTypeOfAudit(String typeOfAudit) {
        this.typeOfAudit = typeOfAudit;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("auditPlace", auditPlace).append("auditDate", auditDate).append("chairmanOfGeneralAssembly", chairmanOfGeneralAssembly).append("typeOfAudit", typeOfAudit).append("startDate", startDate).append("endDate", endDate).toString();
    }

}
