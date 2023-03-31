package com.usermanagementservice.dto.address;

import lombok.Data;

@Data
public class AddressDTO {
    private Long id;
    private String fullName;
    private String phoneNumber;
    private String street;
    private String number;
    private String city;
    private String country;
    private String zipCodeOrPostalCodeOrCEP;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCodeOrPostalCodeOrCEP() {
        return zipCodeOrPostalCodeOrCEP;
    }

    public void setZipCodeOrPostalCodeOrCEP(String zipCodeOrPostalCodeOrCEP) {
        this.zipCodeOrPostalCodeOrCEP = zipCodeOrPostalCodeOrCEP;
    }
}
