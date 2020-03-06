package com.qred.creditro.bisbase.controller;

import com.qred.creditro.bisbase.dto.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.qred.creditro.bisbase.utility.Util;
import org.springframework.web.bind.annotation.GetMapping;
import com.qred.creditro.bisbase.service.ICreditroService;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class CreditroController {

    @Autowired
    private ICreditroService creditroService;

    @Autowired
    Util util;

    @GetMapping("verify/")
    public ResponseEntity<Object> getFinancialData(
            @RequestParam(required = true) String authcid) {

        System.out.println("Org #: " + authcid);
        APIResponse response = util.validateRequest(authcid);
        if (response.getMessage().isEmpty()) {

//            String csvFile = "Companies.csv";
//            BufferedReader br = null;
//            String line = "";
//            String cvsSplitBy = ",";
//            List<Object> objects = new ArrayList<>();
//            try {
//
//                br = new BufferedReader(new FileReader(csvFile));
//                while ((line = br.readLine()) != null) {
//
//                    // use comma as separator
//                    String[] company = line.split(cvsSplitBy);
//                    Object res = creditroService.getBaseData(company[0]);
//                    objects.add("Company code= " + company[0]);
//                    objects.add(res);
//                    System.out.println("Company code= " + company[0]);
//
//                }
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                if (br != null) {
//                    try {
//                        br.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
            Object res = creditroService.getBaseData(authcid);

            return new ResponseEntity<>(res, HttpStatus.OK);
        }

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }
}
