/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.utility;

import org.springframework.stereotype.Component;

/**
 *
 * @author Sufyan
 */
@Component
public class ConstantUtil {

    public static String DOMAIN_EMPTY = "Domain Not Found. ";
    public static String CLIENT_ID_EMPTY = "Client Id Empty. ";
    public static String ORGANIZATION_EMPTY = "Organization Number Empty. ";
    public static String REQUEST_MASTERDATA = "/masterdata?";
    public static String KEY = "key=";
    public static String STATUS_OK = "200";
    public static String REQUEST_ADDRESS = "/address?";
    public static String REQUEST_CONTACTINFO = "/contactinfo?";
    public static String REQUEST_RATINGS = "/ratings?";
    public static String REQUEST_MANAGEMENT = "/management?";
    public static String REQUEST_TAXONOMY = "/20?";
    public static String REQUEST_ACCOUNTANT = "/accountant?";
    public static String REQUEST_FINANCIAL = "/financial?";
    public static String REQUEST_KEYFIGURE = "/keyfigure?";
    public static String REQUEST_GENERAL_ASSEMBLY = "/document?";
    public static String NORMAL = "NORMAL";
    public static String AKTIV = "AktivF";
    public static String YYYY_MM_DD = "yyyy-MM-dd";
    public static String DEC2019 = "2019-12-31";

    public enum Status {

        SUCCESS,
        FAIL,
        ERROR
    }

}
