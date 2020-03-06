/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qred.creditro.bisbase.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "countryCode",
    "freeText",
    "roadCode",
    "houseNumberFrom",
    "addressId",
    "lastValidated",
    "houseNumberTo",
    "letterFrom",
    "letterTo",
    "floor",
    "sideDor",
    "coName",
    "poBox",
    "streetName",
    "cityName",
    "postalCode",
    "lastUpdated",
    "combined",
    "commune",
    "period",
    "city",
    "houseNumber",
    "zipCode",
    "letter",
    "side"
})
public class Address {

    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("freeText")
    private Object freeText;
    @JsonProperty("roadCode")
    private String roadCode;
    @JsonProperty("houseNumberFrom")
    private String houseNumberFrom;
    @JsonProperty("addressId")
    private String addressId;
    @JsonProperty("lastValidated")
    private String lastValidated;
    @JsonProperty("houseNumberTo")
    private Object houseNumberTo;
    @JsonProperty("letterFrom")
    private Object letterFrom;
    @JsonProperty("letterTo")
    private Object letterTo;
    @JsonProperty("floor")
    private String floor;
    @JsonProperty("sideDor")
    private String sideDor;
    @JsonProperty("coName")
    private Object coName;
    @JsonProperty("poBox")
    private Object poBox;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("cityName")
    private String cityName;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("combined")
    private Object combined;
    @JsonProperty("commune")
    private Commune commune;
    @JsonProperty("period")
    private Period period;
    @JsonProperty("city")
    private String city;
    @JsonProperty("houseNumber")
    private Integer houseNumber;
    @JsonProperty("zipCode")
    private Integer zipCode;
    @JsonProperty("letter")
    private Object letter;
    @JsonProperty("side")
    private String side;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Object getLetter() {
        return letter;
    }

    public void setLetter(Object letter) {
        this.letter = letter;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("freeText")
    public Object getFreeText() {
        return freeText;
    }

    @JsonProperty("freeText")
    public void setFreeText(Object freeText) {
        this.freeText = freeText;
    }

    @JsonProperty("roadCode")
    public String getRoadCode() {
        return roadCode;
    }

    @JsonProperty("roadCode")
    public void setRoadCode(String roadCode) {
        this.roadCode = roadCode;
    }

    @JsonProperty("houseNumberFrom")
    public String getHouseNumberFrom() {
        return houseNumberFrom;
    }

    @JsonProperty("houseNumberFrom")
    public void setHouseNumberFrom(String houseNumberFrom) {
        this.houseNumberFrom = houseNumberFrom;
    }

    @JsonProperty("addressId")
    public String getAddressId() {
        return addressId;
    }

    @JsonProperty("addressId")
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("lastValidated")
    public String getLastValidated() {
        return lastValidated;
    }

    @JsonProperty("lastValidated")
    public void setLastValidated(String lastValidated) {
        this.lastValidated = lastValidated;
    }

    @JsonProperty("houseNumberTo")
    public Object getHouseNumberTo() {
        return houseNumberTo;
    }

    @JsonProperty("houseNumberTo")
    public void setHouseNumberTo(Object houseNumberTo) {
        this.houseNumberTo = houseNumberTo;
    }

    @JsonProperty("letterFrom")
    public Object getLetterFrom() {
        return letterFrom;
    }

    @JsonProperty("letterFrom")
    public void setLetterFrom(Object letterFrom) {
        this.letterFrom = letterFrom;
    }

    @JsonProperty("letterTo")
    public Object getLetterTo() {
        return letterTo;
    }

    @JsonProperty("letterTo")
    public void setLetterTo(Object letterTo) {
        this.letterTo = letterTo;
    }

    @JsonProperty("floor")
    public String getFloor() {
        return floor;
    }

    @JsonProperty("floor")
    public void setFloor(String floor) {
        this.floor = floor;
    }

    @JsonProperty("sideDor")
    public String getSideDor() {
        return sideDor;
    }

    @JsonProperty("sideDor")
    public void setSideDor(String sideDor) {
        this.sideDor = sideDor;
    }

    @JsonProperty("coName")
    public Object getCoName() {
        return coName;
    }

    @JsonProperty("coName")
    public void setCoName(Object coName) {
        this.coName = coName;
    }

    @JsonProperty("poBox")
    public Object getPoBox() {
        return poBox;
    }

    @JsonProperty("poBox")
    public void setPoBox(Object poBox) {
        this.poBox = poBox;
    }

    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @JsonProperty("cityName")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("cityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("combined")
    public Object getCombined() {
        return combined;
    }

    @JsonProperty("combined")
    public void setCombined(Object combined) {
        this.combined = combined;
    }

    @JsonProperty("commune")
    public Commune getCommune() {
        return commune;
    }

    @JsonProperty("commune")
    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("countryCode", countryCode).append("freeText", freeText).append("roadCode", roadCode).append("houseNumberFrom", houseNumberFrom).append("addressId", addressId).append("lastValidated", lastValidated).append("houseNumberTo", houseNumberTo).append("letterFrom", letterFrom).append("letterTo", letterTo).append("floor", floor).append("sideDor", sideDor).append("coName", coName).append("poBox", poBox).append("streetName", streetName).append("cityName", cityName).append("postalCode", postalCode).append("lastUpdated", lastUpdated).append("combined", combined).append("commune", commune).append("period", period).toString();
    }

}
