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
    "app",
    "aud",
    "sub",
    "iss",
    "exp",
    "iat"
})
public class TokenPayload {

    @JsonProperty("app")
    private String app;
    @JsonProperty("aud")
    private String aud;
    @JsonProperty("sub")
    private String sub;
    @JsonProperty("iss")
    private String iss;
    @JsonProperty("exp")
    private Long exp;
    @JsonProperty("iat")
    private Long iat;

    @JsonProperty("app")
    public String getApp() {
        return app;
    }

    @JsonProperty("app")
    public void setApp(String app) {
        this.app = app;
    }

    @JsonProperty("aud")
    public String getAud() {
        return aud;
    }

    @JsonProperty("aud")
    public void setAud(String aud) {
        this.aud = aud;
    }

    @JsonProperty("sub")
    public String getSub() {
        return sub;
    }

    @JsonProperty("sub")
    public void setSub(String sub) {
        this.sub = sub;
    }

    @JsonProperty("iss")
    public String getIss() {
        return iss;
    }

    @JsonProperty("iss")
    public void setIss(String iss) {
        this.iss = iss;
    }

    @JsonProperty("exp")
    public Long getExp() {
        return exp;
    }

    @JsonProperty("exp")
    public void setExp(Long exp) {
        this.exp = exp;
    }

    @JsonProperty("iat")
    public Long getIat() {
        return iat;
    }

    @JsonProperty("iat")
    public void setIat(Long iat) {
        this.iat = iat;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("app", app).append("aud", aud).append("sub", sub).append("iss", iss).append("exp", exp).append("iat", iat).toString();
    }

}
