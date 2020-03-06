/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Company",
"FinancialStatements"
})
public class BisbaseFinancialDataResponse {

@JsonProperty("Company")
private BisbaseCompanyResponse company;
@JsonProperty("FinancialStatements")
private List<BisbaseFinancialStatement> financialStatements = null;

@JsonProperty("Company")
public BisbaseCompanyResponse getCompany() {
return company;
}

@JsonProperty("Company")
public void setCompany(BisbaseCompanyResponse company) {
this.company = company;
}

@JsonProperty("FinancialStatements")
public List<BisbaseFinancialStatement> getFinancialStatements() {
return financialStatements;
}

@JsonProperty("FinancialStatements")
public void setFinancialStatements(List<BisbaseFinancialStatement> financialStatements) {
this.financialStatements = financialStatements;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("company", company).append("financialStatements", financialStatements).toString();
}

}