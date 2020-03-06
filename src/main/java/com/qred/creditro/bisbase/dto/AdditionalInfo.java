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
    "classOfReportingEntity",
    "parentCompany"
})
public class AdditionalInfo {

    @JsonProperty("classOfReportingEntity")
    private String classOfReportingEntity;
    @JsonProperty("parentCompany")
    private String parentCompany;

    @JsonProperty("classOfReportingEntity")
    public String getClassOfReportingEntity() {
        return classOfReportingEntity;
    }

    @JsonProperty("classOfReportingEntity")
    public void setClassOfReportingEntity(String classOfReportingEntity) {
        this.classOfReportingEntity = classOfReportingEntity;
    }

    @JsonProperty("parentCompany")
    public String getParentCompany() {
        return parentCompany;
    }

    @JsonProperty("parentCompany")
    public void setParentCompany(String parentCompany) {
        this.parentCompany = parentCompany;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("classOfReportingEntity", classOfReportingEntity).append("parentCompany", parentCompany).toString();
    }

}
