/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "status",
    "message",
    "data"
})
public class BisbaseFinancialResponse {

    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("status")
    private String status;
    @JsonProperty("message")
    private Object message;
    @JsonProperty("data")
    private BisbaseFinancialDataResponse data;

    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }

    @JsonProperty("data")
    public BisbaseFinancialDataResponse getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(BisbaseFinancialDataResponse data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apiVersion", apiVersion).append("status", status).append("message", message).append("data", data).toString();
    }

}
