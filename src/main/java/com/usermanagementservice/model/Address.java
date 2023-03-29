package com.usermanagementservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private String number;

    @Column(name = "city")
    private String city;
    private String country;
    @Column(name = "zip_code_or_postal_code_or_cep")
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
