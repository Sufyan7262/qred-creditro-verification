/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 *
 * @author sufyanafzal
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "organization_number"

})
public class CreditroRequest {

    @JsonProperty("organization_number")
    private String organizationNumber;

    @JsonProperty("organization_number")
    public String getOrganizationNumber() {
        return organizationNumber;
    }

    @JsonProperty("organization_number")
    public void setOrganizationNumber(String organizationNumber) {
        this.organizationNumber = organizationNumber;
    }

    @Override
    public String toString() {
        return "PageRankRequest{" + "organizationNumber=" + organizationNumber + '}';
    }

}
