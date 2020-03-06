/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.dto;

import java.util.List;

/**
 *
 * @author sufyanafzal
 */
public class MasterResponse {

    List<BisbaseBaseDataResponse> baseResponses = null;

    public List<BisbaseBaseDataResponse> getBaseResponses() {
        return baseResponses;
    }

    public void setBaseResponses(List<BisbaseBaseDataResponse> baseResponses) {
        this.baseResponses = baseResponses;
    }

}
