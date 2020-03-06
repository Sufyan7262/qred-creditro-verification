/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "directors",
    "boardMembers",
    "realOwners",
    "legalOwners",
    "accountants"
})
public class ManagementData {

    @JsonProperty("directors")
    private List<Director> directors = null;
    @JsonProperty("boardMembers")
    private List<BoardMember> boardMembers = null;
    @JsonProperty("realOwners")
    private List<RealOwner> realOwners = null;
    @JsonProperty("legalOwners")
    private List<LegalOwner> legalOwners = null;
    @JsonProperty("accountants")
    private List<Accountant> accountants = null;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("directors", directors).append("boardMembers", boardMembers).append("realOwners", realOwners).append("legalOwners", legalOwners).append("accountants", accountants).toString();
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public List<BoardMember> getBoardMembers() {
        return boardMembers;
    }

    public void setBoardMembers(List<BoardMember> boardMembers) {
        this.boardMembers = boardMembers;
    }

    public List<RealOwner> getRealOwners() {
        return realOwners;
    }

    public void setRealOwners(List<RealOwner> realOwners) {
        this.realOwners = realOwners;
    }

    public List<LegalOwner> getLegalOwners() {
        return legalOwners;
    }

    public void setLegalOwners(List<LegalOwner> legalOwners) {
        this.legalOwners = legalOwners;
    }

    public List<Accountant> getAccountants() {
        return accountants;
    }

    public void setAccountants(List<Accountant> accountants) {
        this.accountants = accountants;
    }

}
