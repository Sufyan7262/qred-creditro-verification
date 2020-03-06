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
"error",
"message",
"data"
})
public class GeneralAssemblyResponse {

@JsonProperty("error")
private Boolean error;
@JsonProperty("message")
private String message;
@JsonProperty("data")
private List<Datum> data = null;

@JsonProperty("error")
public Boolean getError() {
return error;
}

@JsonProperty("error")
public void setError(Boolean error) {
this.error = error;
}

@JsonProperty("message")
public String getMessage() {
return message;
}

@JsonProperty("message")
public void setMessage(String message) {
this.message = message;
}

@JsonProperty("data")
public List<Datum> getData() {
return data;
}

@JsonProperty("data")
public void setData(List<Datum> data) {
this.data = data;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("error", error).append("message", message).append("data", data).toString();
}

}