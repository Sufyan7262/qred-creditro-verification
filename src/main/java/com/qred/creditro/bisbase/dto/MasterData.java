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
public class MasterData {

    private BaseInfoResponse baseInfoResponse;
    private ManagementDataResponse managementDataResponse;
    private TaxonomyResponse[] taxonomyResponse;
    private GeneralAssemblyResponse assemblyResponse;
    private RatingsResponse ratingsResponse;
    private AccountantResponse accountantResponse;

    public BaseInfoResponse getBaseInfoResponse() {
        return baseInfoResponse;
    }

    public void setBaseInfoResponse(BaseInfoResponse baseInfoResponse) {
        this.baseInfoResponse = baseInfoResponse;
    }

    public ManagementDataResponse getManagementDataResponse() {
        return managementDataResponse;
    }

    public void setManagementDataResponse(ManagementDataResponse managementDataResponse) {
        this.managementDataResponse = managementDataResponse;
    }

    public TaxonomyResponse[] getTaxonomyResponse() {
        return taxonomyResponse;
    }

    public void setTaxonomyResponse(TaxonomyResponse[] taxonomyResponse) {
        this.taxonomyResponse = taxonomyResponse;
    }

    public GeneralAssemblyResponse getAssemblyResponse() {
        return assemblyResponse;
    }

    public void setAssemblyResponse(GeneralAssemblyResponse assemblyResponse) {
        this.assemblyResponse = assemblyResponse;
    }

    public RatingsResponse getRatingsResponse() {
        return ratingsResponse;
    }

    public void setRatingsResponse(RatingsResponse ratingsResponse) {
        this.ratingsResponse = ratingsResponse;
    }

    public AccountantResponse getAccountantResponse() {
        return accountantResponse;
    }

    public void setAccountantResponse(AccountantResponse accountantResponse) {
        this.accountantResponse = accountantResponse;
    }

    
}
