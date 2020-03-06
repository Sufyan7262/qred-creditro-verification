/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.utility;

import com.qred.creditro.bisbase.dto.APIResponse;
import com.qred.creditro.bisbase.dto.BisbaseBaseDataResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Sufyan
 */
@Component
public class Util {

    public APIResponse validateRequest(String request) {

        StringBuilder responseMsg = new StringBuilder();
        APIResponse response = new APIResponse();

        if (request == null || request.isEmpty()) {
            responseMsg.append(ConstantUtil.ORGANIZATION_EMPTY);
        }

        if (responseMsg != null) {

            response.setMessage(responseMsg.toString());
        }
        return response;
    }

    public Object compare(BisbaseBaseDataResponse creditro, BisbaseBaseDataResponse bisbase) {
        List<String> reposnes = new ArrayList<>();
        if (creditro.getData() != null && bisbase.getData() != null) {

            if (creditro.getData().equals(bisbase.getData())) {
                reposnes.add("Objects Equal");
            } else {
                if (creditro.getData().get(0).getAddress() == null && bisbase.getData().get(0).getAddress() != null) {
                    reposnes.add("Address Missing ");

                }
                if (creditro.getData().get(0).getAddress() != null && bisbase.getData().get(0).getAddress() != null) {
                    if (!creditro.getData().get(0).getAddress().equalsIgnoreCase(bisbase.getData().get(0).getAddress())) {
                        reposnes.add("Address different: " + "Creditro: " + creditro.getData().get(0).getAddress() + "  Bisbase: " + bisbase.getData().get(0).getAddress());
                    }
                }
                if (creditro.getData().get(0).getAuditExcemption() == null && bisbase.getData().get(0).getAuditExcemption() != null) {
                    reposnes.add("AuditExcemption Missing ");

                }
                if (creditro.getData().get(0).getAuditExcemption() != null && bisbase.getData().get(0).getAuditExcemption() != null) {
                    if (!creditro.getData().get(0).getAuditExcemption().equals(bisbase.getData().get(0).getAuditExcemption())) {
                        reposnes.add("AuditExcemption different: " + "Creditro: " + creditro.getData().get(0).getAuditExcemption() + "  Bisbase: " + bisbase.getData().get(0).getAuditExcemption());
                    }
                }
                if (creditro.getData().get(0).getAuthCompanyID() == null && bisbase.getData().get(0).getAuthCompanyID() != null) {
                    reposnes.add("AuthCompanyID Missing ");

                }
                if (creditro.getData().get(0).getAuthCompanyID() != null && bisbase.getData().get(0).getAuthCompanyID() != null) {
                    if (!creditro.getData().get(0).getAuthCompanyID().equals(bisbase.getData().get(0).getAuthCompanyID())) {
                        reposnes.add("AuthCompanyID different: " + "Creditro: " + creditro.getData().get(0).getAuthCompanyID() + " Bisbase: " + bisbase.getData().get(0).getAuthCompanyID());
                    }
                }
                if (creditro.getData().get(0).getCOName() == null && bisbase.getData().get(0).getCOName() != null) {
                    reposnes.add("COName Missing ");

                }
                if (creditro.getData().get(0).getCOName() != null && bisbase.getData().get(0).getCOName() != null) {
                    if (!creditro.getData().get(0).getCOName().equals(bisbase.getData().get(0).getCOName())) {
                        reposnes.add("COName different: " + "Creditro: " + creditro.getData().get(0).getCOName() + "  Bisbase: " + bisbase.getData().get(0).getCOName());
                    }
                }
                if (creditro.getData().get(0).getCity() == null && bisbase.getData().get(0).getCity() != null) {
                    reposnes.add("City Missing ");

                }
                if (creditro.getData().get(0).getCity() != null && bisbase.getData().get(0).getCity() != null) {
                    if (!creditro.getData().get(0).getCity().equals(bisbase.getData().get(0).getCity())) {
                        reposnes.add("City different: " + "Creditro: " + creditro.getData().get(0).getCity() + "  Bisbase: " + bisbase.getData().get(0).getCity());
                    }
                }

                if (creditro.getData().get(0).getCompanyID() == null && bisbase.getData().get(0).getCompanyID() != null) {
                    reposnes.add("CompanyID Missing ");

                }
                if (creditro.getData().get(0).getCompanyID() != null && bisbase.getData().get(0).getCompanyID() != null) {
                    if (!creditro.getData().get(0).getCompanyID().equals(bisbase.getData().get(0).getCompanyID())) {
                        reposnes.add("CompanyID different: " + "Creditro: " + creditro.getData().get(0).getCompanyID() + "  Bisbase: " + bisbase.getData().get(0).getCompanyID());
                    }
                }
                if (creditro.getData().get(0).getCompanyName() == null && bisbase.getData().get(0).getCompanyName() != null) {
                    reposnes.add("CompanyName Missing ");

                }
                if (creditro.getData().get(0).getCompanyName() != null && bisbase.getData().get(0).getCompanyName() != null) {
                    if (!creditro.getData().get(0).getCompanyName().equalsIgnoreCase(bisbase.getData().get(0).getCompanyName())) {
                        reposnes.add("CompanyName different: " + "Creditro: " + creditro.getData().get(0).getCompanyName() + "  Bisbase: " + bisbase.getData().get(0).getCompanyName());
                    }
                }
                if (creditro.getData().get(0).getEmail() == null && bisbase.getData().get(0).getEmail() != null) {
                    reposnes.add("Email Missing ");

                }
                if (creditro.getData().get(0).getEmail() != null && bisbase.getData().get(0).getEmail() != null) {
                    if (!creditro.getData().get(0).getEmail().equals(bisbase.getData().get(0).getEmail())) {
                        reposnes.add("Email different: " + "Creditro: " + creditro.getData().get(0).getEmail() + "  Bisbase: " + bisbase.getData().get(0).getEmail());
                    }
                }
                if (creditro.getData().get(0).getHasAdvertisingProtection() == null && bisbase.getData().get(0).getHasAdvertisingProtection() != null) {
                    reposnes.add("HasAdvertisingProtection Missing ");

                }
                if (creditro.getData().get(0).getHasAdvertisingProtection() != null && bisbase.getData().get(0).getHasAdvertisingProtection() != null) {
                    if (!creditro.getData().get(0).getHasAdvertisingProtection().equals(bisbase.getData().get(0).getHasAdvertisingProtection())) {
                        reposnes.add("HasAdvertisingProtection different: " + "Creditro: " + creditro.getData().get(0).getHasAdvertisingProtection() + "  Bisbase: " + bisbase.getData().get(0).getHasAdvertisingProtection());
                    }
                }
                if (creditro.getData().get(0).getIndustryID() == null && bisbase.getData().get(0).getIndustryID() != null) {
                    reposnes.add("IndustryID Missing ");

                }
                if (creditro.getData().get(0).getIndustryID() != null && bisbase.getData().get(0).getIndustryID() != null) {
                    if (!creditro.getData().get(0).getIndustryID().equals(bisbase.getData().get(0).getIndustryID())) {
                        reposnes.add("IndustryID different: " + "Creditro: " + creditro.getData().get(0).getIndustryID() + "  Bisbase: " + bisbase.getData().get(0).getIndustryID());
                    }
                }
                if (creditro.getData().get(0).getIndustryText() == null && bisbase.getData().get(0).getIndustryText() != null) {
                    reposnes.add("getIndustryText Missing ");

                }
                if (creditro.getData().get(0).getIndustryText() != null && bisbase.getData().get(0).getIndustryText() != null) {
                    if (!creditro.getData().get(0).getIndustryText().equals(bisbase.getData().get(0).getIndustryText())) {
                        reposnes.add("getIndustryText different: " + "Creditro: " + creditro.getData().get(0).getIndustryText() + "  Bisbase: " + bisbase.getData().get(0).getIndustryText());
                    }
                }
                if (creditro.getData().get(0).getIndustryTypeID() == null && bisbase.getData().get(0).getIndustryTypeID() != null) {
                    reposnes.add("getIndustryTypeID Missing ");

                }
                if (creditro.getData().get(0).getIndustryTypeID() != null && bisbase.getData().get(0).getIndustryTypeID() != null) {
                    if (!creditro.getData().get(0).getIndustryTypeID().equals(bisbase.getData().get(0).getIndustryTypeID())) {
                        reposnes.add("getIndustryTypeID different: " + "Creditro: " + creditro.getData().get(0).getIndustryTypeID() + "  Bisbase: " + bisbase.getData().get(0).getIndustryTypeID());
                    }
                }
                if (creditro.getData().get(0).getLegalFormID() == null && bisbase.getData().get(0).getLegalFormID() != null) {
                    reposnes.add("LegalFormID Missing ");

                }
                if (creditro.getData().get(0).getLegalFormID() != null && bisbase.getData().get(0).getLegalFormID() != null) {
                    if (!creditro.getData().get(0).getLegalFormID().equals(bisbase.getData().get(0).getLegalFormID())) {
                        reposnes.add("LegalFormID different: " + "Creditro: " + creditro.getData().get(0).getLegalFormID() + "  Bisbase: " + bisbase.getData().get(0).getLegalFormID());
                    }
                }
                if (creditro.getData().get(0).getLegalFormText() == null && bisbase.getData().get(0).getLegalFormText() != null) {
                    reposnes.add("LegalFormText Missing ");

                }
                if (creditro.getData().get(0).getLegalFormText() != null && bisbase.getData().get(0).getLegalFormText() != null) {
                    if (!creditro.getData().get(0).getLegalFormText().equals(bisbase.getData().get(0).getLegalFormText())) {
                        reposnes.add("LegalFormText different: " + "Creditro: " + creditro.getData().get(0).getLegalFormText() + "  Bisbase: " + bisbase.getData().get(0).getLegalFormText());
                    }
                }
                if (creditro.getData().get(0).getMunicipalityID() == null && bisbase.getData().get(0).getMunicipalityID() != null) {
                    reposnes.add("MunicipalityID Missing ");

                }
                if (creditro.getData().get(0).getMunicipalityID() != null && bisbase.getData().get(0).getMunicipalityID() != null) {
                    if (!creditro.getData().get(0).getMunicipalityID().equals(bisbase.getData().get(0).getMunicipalityID())) {
                        reposnes.add("MunicipalityID different: " + "Creditro: " + creditro.getData().get(0).getMunicipalityID() + "  Bisbase: " + bisbase.getData().get(0).getMunicipalityID());
                    }
                }
                if (creditro.getData().get(0).getMunicipalityText() == null && bisbase.getData().get(0).getMunicipalityText() != null) {
                    reposnes.add("MunicipalityText Missing ");

                }
                if (creditro.getData().get(0).getMunicipalityText() != null && bisbase.getData().get(0).getMunicipalityText() != null) {
                    if (!creditro.getData().get(0).getMunicipalityText().equals(bisbase.getData().get(0).getMunicipalityText())) {
                        reposnes.add("MunicipalityText different: " + "Creditro: " + creditro.getData().get(0).getMunicipalityText() + "  Bisbase: " + bisbase.getData().get(0).getMunicipalityText());
                    }
                }
                if (creditro.getData().get(0).getNACEID() == null && bisbase.getData().get(0).getNACEID() != null) {
                    reposnes.add("NACEID Missing ");

                }
                if (creditro.getData().get(0).getNACEID() != null && bisbase.getData().get(0).getNACEID() != null) {
                    if (!creditro.getData().get(0).getNACEID().equals(bisbase.getData().get(0).getNACEID())) {
                        reposnes.add("NACEID different: " + "Creditro: " + creditro.getData().get(0).getNACEID() + "  Bisbase: " + bisbase.getData().get(0).getNACEID());
                    }
                }
                if (creditro.getData().get(0).getNumberOfEmployees() == null && bisbase.getData().get(0).getNumberOfEmployees() != null) {
                    reposnes.add("NumberOfEmployees Missing ");

                }
                if (creditro.getData().get(0).getNumberOfEmployees() != null && bisbase.getData().get(0).getNumberOfEmployees() != null) {
                    if (!creditro.getData().get(0).getNumberOfEmployees().equals(bisbase.getData().get(0).getNumberOfEmployees())) {
                        reposnes.add("NumberOfEmployees different: " + "Creditro: " + creditro.getData().get(0).getNumberOfEmployees() + "Bisbase: " + bisbase.getData().get(0).getNumberOfEmployees());
                    }
                }
                if (creditro.getData().get(0).getPOBox() == null && bisbase.getData().get(0).getPOBox() != null) {
                    reposnes.add("POBox Missing ");

                }
                if (creditro.getData().get(0).getPOBox() != null && bisbase.getData().get(0).getPOBox() != null) {
                    if (!creditro.getData().get(0).getPOBox().equals(bisbase.getData().get(0).getPOBox())) {
                        reposnes.add("POBox different: " + "Creditro: " + creditro.getData().get(0).getPOBox() + "  Bisbase: " + bisbase.getData().get(0).getPOBox());
                    }
                }
                if (creditro.getData().get(0).getPhone() == null && bisbase.getData().get(0).getPhone() != null) {
                    reposnes.add("Phone Missing ");

                }
                if (creditro.getData().get(0).getPhone() != null && bisbase.getData().get(0).getPhone() != null) {
                    if (!creditro.getData().get(0).getPhone().equals(bisbase.getData().get(0).getPhone())) {
                        reposnes.add("Phone different: " + "Creditro: " + creditro.getData().get(0).getPhone() + "  Bisbase: " + bisbase.getData().get(0).getPhone());
                    }
                }
                if (creditro.getData().get(0).getPostalCode() == null && bisbase.getData().get(0).getPostalCode() != null) {
                    reposnes.add("PostalCode Missing ");

                }
                if (creditro.getData().get(0).getPostalCode() != null && bisbase.getData().get(0).getPostalCode() != null) {
                    if (!creditro.getData().get(0).getPostalCode().equals(bisbase.getData().get(0).getPostalCode())) {
                        reposnes.add("PostalCode different: " + "Creditro: " + creditro.getData().get(0).getPostalCode() + "Bisbase: " + bisbase.getData().get(0).getPostalCode());
                    }
                }
                if (creditro.getData().get(0).getRegionID() == null && bisbase.getData().get(0).getRegionID() != null) {
                    reposnes.add("RegionID Missing ");

                }
                if (creditro.getData().get(0).getRegionID() != null && bisbase.getData().get(0).getRegionID() != null) {
                    if (!creditro.getData().get(0).getRegionID().equals(bisbase.getData().get(0).getRegionID())) {
                        reposnes.add("RegionID different: " + "Creditro: " + creditro.getData().get(0).getRegionID() + "  Bisbase: " + bisbase.getData().get(0).getRegionID());
                    }
                }
                if (creditro.getData().get(0).getRegionText() == null && bisbase.getData().get(0).getRegionText() != null) {
                    reposnes.add("RegionText Missing ");

                }
                if (creditro.getData().get(0).getRegionText() != null && bisbase.getData().get(0).getRegionText() != null) {
                    if (!creditro.getData().get(0).getRegionText().equals(bisbase.getData().get(0).getRegionText())) {
                        reposnes.add("RegionText different: " + "Creditro: " + creditro.getData().get(0).getRegionText() + "  Bisbase: " + bisbase.getData().get(0).getRegionText());
                    }
                }
                if (creditro.getData().get(0).getStartDate() == null && bisbase.getData().get(0).getStartDate() != null) {
                    reposnes.add("StartDate Missing ");

                }
                if (creditro.getData().get(0).getStartDate() != null && bisbase.getData().get(0).getStartDate() != null) {

                    if (!creditro.getData().get(0).getStartDate().equals(bisbase.getData().get(0).getStartDate())) {
                        reposnes.add("StartDate different: " + "Creditro: " + creditro.getData().get(0).getStartDate() + "  Bisbase: " + bisbase.getData().get(0).getStartDate());
                    }
                }
                if (creditro.getData().get(0).getStatusID() == null && bisbase.getData().get(0).getStatusID() != null) {
                    reposnes.add("StatusID Missing ");

                }
                if (creditro.getData().get(0).getStatusID() != null && bisbase.getData().get(0).getStatusID() != null) {
                    if (!creditro.getData().get(0).getStatusID().equals(bisbase.getData().get(0).getStatusID())) {
                        reposnes.add("StatusID different: " + "Creditro: " + creditro.getData().get(0).getStatusID() + "  Bisbase: " + bisbase.getData().get(0).getStatusID());
                    }
                }
                if (creditro.getData().get(0).getStatusText() == null && bisbase.getData().get(0).getStatusText() != null) {
                    reposnes.add("StatusText Missing ");

                }
                if (creditro.getData().get(0).getStatusText() != null && bisbase.getData().get(0).getStatusText() != null) {
                    if (!creditro.getData().get(0).getStatusText().equalsIgnoreCase(bisbase.getData().get(0).getStatusText())) {
                        reposnes.add("StatusText different: " + "Creditro: " + creditro.getData().get(0).getStatusText() + "  Bisbase: " + bisbase.getData().get(0).getStatusText());
                    }
                }
                if (creditro.getData().get(0).getWeb() == null && bisbase.getData().get(0).getWeb() != null) {
                    reposnes.add("Web Missing ");

                }
                if (creditro.getData().get(0).getWeb() != null && bisbase.getData().get(0).getWeb() != null) {
                    if (!creditro.getData().get(0).getWeb().equals(bisbase.getData().get(0).getWeb())) {
                        reposnes.add("Web different: " + "Creditro: " + creditro.getData().get(0).getWeb() + "  Bisbase: " + bisbase.getData().get(0).getWeb());
                    }
                }

            }

        }

        return reposnes;
    }
}
