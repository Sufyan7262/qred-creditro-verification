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

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
"data",
"status",
"message",
"apiVersion"
})
public class BisbaseBaseDataResponse {

@JsonProperty("data")
private List<BaseData> data = null;
@JsonProperty("status")
private String status;
@JsonProperty("message")
private Object message;
@JsonProperty("apiVersion")
private String apiVersion;

@JsonProperty("data")
public List<BaseData> getData() {
return data;
}

@JsonProperty("data")
public void setData(List<BaseData> data) {
this.data = data;
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

@JsonProperty("apiVersion")
public String getApiVersion() {
return apiVersion;
}

@JsonProperty("apiVersion")
public void setApiVersion(String apiVersion) {
this.apiVersion = apiVersion;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("data", data).append("status", status).append("message", message).append("apiVersion", apiVersion).toString();
}

}