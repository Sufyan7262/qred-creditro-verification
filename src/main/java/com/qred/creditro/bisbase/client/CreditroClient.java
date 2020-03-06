/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.client;

import com.qred.creditro.bisbase.dto.APIResponse;
import com.qred.creditro.bisbase.dto.MasterResponse;
import com.qred.creditro.bisbase.utility.ConstantUtil;
import java.io.UnsupportedEncodingException;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author sufyanafzal
 */
@Configuration
public class CreditroClient {

   
    RestTemplate restTemplate = new RestTemplate();

    

    public APIResponse getBaseData(String query) throws UnsupportedEncodingException {

        HttpEntity entity;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("jwt", getJWTToken());

        APIResponse httpResponse = new APIResponse();
        entity = new HttpEntity<>(headers);

        ResponseEntity<MasterResponse> responseEntity = null;
        try {
            // Address Data
            responseEntity = restTemplate.exchange("https://api.qred.ninja/creditro/bisbase/?apiuserid=5283&authcid=" + query + "&country=DK&apioutput=JSON&func=company/CompanyGet&lang=EN", HttpMethod.GET, entity, MasterResponse.class);
            if (ConstantUtil.STATUS_OK.equals(responseEntity.getStatusCode().toString())) {
                httpResponse.setObject(responseEntity.getBody());
                httpResponse.setStatus(ConstantUtil.Status.SUCCESS);
            } else {
                httpResponse.setMessage(responseEntity.getStatusCode().getReasonPhrase());
                httpResponse.setStatus(ConstantUtil.Status.FAIL);
            }
        } catch (HttpClientErrorException exception) {
            httpResponse.setMessage(exception.getResponseBodyAsString());
            httpResponse.setStatus(ConstantUtil.Status.ERROR);

        } catch (Exception e) {
            throw e;
        }
        return httpResponse;
    }

   

}
