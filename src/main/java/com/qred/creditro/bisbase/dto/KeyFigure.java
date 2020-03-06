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
    "liquidityRatio",
    "financialGearing",
    "returnOnEquity",
    "returnOnAssets",
    "solidity"
})
public class KeyFigure {

    @JsonProperty("liquidityRatio")
    private Double liquidityRatio;
    @JsonProperty("financialGearing")
    private Integer financialGearing;
    @JsonProperty("returnOnEquity")
    private Double returnOnEquity;
    @JsonProperty("returnOnAssets")
    private Double returnOnAssets;
    @JsonProperty("solidity")
    private Double solidity;

    @JsonProperty("liquidityRatio")
    public Double getLiquidityRatio() {
        return liquidityRatio;
    }

    @JsonProperty("liquidityRatio")
    public void setLiquidityRatio(Double liquidityRatio) {
        this.liquidityRatio = liquidityRatio;
    }

    @JsonProperty("financialGearing")
    public Integer getFinancialGearing() {
        return financialGearing;
    }

    @JsonProperty("financialGearing")
    public void setFinancialGearing(Integer financialGearing) {
        this.financialGearing = financialGearing;
    }

    @JsonProperty("returnOnEquity")
    public Double getReturnOnEquity() {
        return returnOnEquity;
    }

    @JsonProperty("returnOnEquity")
    public void setReturnOnEquity(Double returnOnEquity) {
        this.returnOnEquity = returnOnEquity;
    }

    @JsonProperty("returnOnAssets")
    public Double getReturnOnAssets() {
        return returnOnAssets;
    }

    @JsonProperty("returnOnAssets")
    public void setReturnOnAssets(Double returnOnAssets) {
        this.returnOnAssets = returnOnAssets;
    }

    @JsonProperty("solidity")
    public Double getSolidity() {
        return solidity;
    }

    @JsonProperty("solidity")
    public void setSolidity(Double solidity) {
        this.solidity = solidity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("liquidityRatio", liquidityRatio).append("financialGearing", financialGearing).append("returnOnEquity", returnOnEquity).append("returnOnAssets", returnOnAssets).append("solidity", solidity).toString();
    }

}
