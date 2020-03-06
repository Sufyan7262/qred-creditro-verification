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
"documentUrl",
"documentMimeType",
"documentType",
"_id"
})
public class Document {

@JsonProperty("documentUrl")
private String documentUrl;
@JsonProperty("documentMimeType")
private String documentMimeType;
@JsonProperty("documentType")
private String documentType;
@JsonProperty("_id")
private String id;

@JsonProperty("documentUrl")
public String getDocumentUrl() {
return documentUrl;
}

@JsonProperty("documentUrl")
public void setDocumentUrl(String documentUrl) {
this.documentUrl = documentUrl;
}

@JsonProperty("documentMimeType")
public String getDocumentMimeType() {
return documentMimeType;
}

@JsonProperty("documentMimeType")
public void setDocumentMimeType(String documentMimeType) {
this.documentMimeType = documentMimeType;
}

@JsonProperty("documentType")
public String getDocumentType() {
return documentType;
}

@JsonProperty("documentType")
public void setDocumentType(String documentType) {
this.documentType = documentType;
}

@JsonProperty("_id")
public String getId() {
return id;
}

@JsonProperty("_id")
public void setId(String id) {
this.id = id;
}

@Override
public String toString() {
return new ToStringBuilder(this).append("documentUrl", documentUrl).append("documentMimeType", documentMimeType).append("documentType", documentType).append("id", id).toString();
}

}