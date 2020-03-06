/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.service;

import com.qred.creditro.bisbase.client.CreditroClient;
import com.qred.creditro.bisbase.dto.APIResponse;
import com.qred.creditro.bisbase.dto.BisbaseBaseDataResponse;
import com.qred.creditro.bisbase.dto.MasterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qred.creditro.bisbase.utility.ConstantUtil;
import com.qred.creditro.bisbase.utility.Util;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sufyan
 */
@Service
public class CreditroService implements ICreditroService {

    @Autowired
    CreditroClient client;

    @Autowired
    Util util;

    boolean flag = false;

    @Override
    public Object getBaseData(String query) {
        List<String> responses = new ArrayList<>();
        try {

            APIResponse response = client.getBaseData(query); //base data api
            if (response.getStatus().equals(ConstantUtil.Status.SUCCESS)) {
                MasterResponse masterResponse = (MasterResponse) response.getObject();
                List<BisbaseBaseDataResponse> baseResponses = masterResponse.getBaseResponses();
                if (baseResponses != null) { // if response != null
//                    ObjectMapper mapper = new ObjectMapper();
//                    String creditroRes = mapper.writeValueAsString(baseResponses.get(0));
//                    String bisbaseRes = mapper.writeValueAsString(baseResponses.get(1));
//                    assertEquals(mapper.readTree(creditroRes), mapper.readTree(bisbaseRes));
//                    
//                    if (baseResponses.get(0).equals(baseResponses.get(1))) {
//                        System.out.println("Equal");
//                    } else if (!baseResponses.get(0).equals(baseResponses.get(1))) {
//                        System.out.println("Creditro is diff");
//                    } else if (baseResponses.get(0) != baseResponses.get(1)) {
//                        System.out.println("Bisbase is diff");
//                    }
                   
                    responses = (List<String>) util.compare(baseResponses.get(0), baseResponses.get(1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
        return responses;
    }

}
