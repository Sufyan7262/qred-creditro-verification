/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.service;

import com.qred.creditro.bisbase.dto.MasterResponse;

/**
 *
 * @author Sufyan
 */
public interface ICreditroService {

//    BaseResponse getBaseData(CreditroRequest query);
    Object getBaseData(String query);

}
