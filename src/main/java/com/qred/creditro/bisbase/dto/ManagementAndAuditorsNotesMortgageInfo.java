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
    "managementReport",
    "auditorsStatement"
})
public class ManagementAndAuditorsNotesMortgageInfo {

    @JsonProperty("managementReport")
    private String managementReport;
    @JsonProperty("auditorsStatement")
    private String auditorsStatement;

    @JsonProperty("managementReport")
    public String getManagementReport() {
        return managementReport;
    }

    @JsonProperty("managementReport")
    public void setManagementReport(String managementReport) {
        this.managementReport = managementReport;
    }

    @JsonProperty("auditorsStatement")
    public String getAuditorsStatement() {
        return auditorsStatement;
    }

    @JsonProperty("auditorsStatement")
    public void setAuditorsStatement(String auditorsStatement) {
        this.auditorsStatement = auditorsStatement;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("managementReport", managementReport).append("auditorsStatement", auditorsStatement).toString();
    }

}
