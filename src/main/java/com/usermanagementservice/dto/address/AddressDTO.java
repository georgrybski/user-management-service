package com.usermanagementservice.dto.address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private Long id;
    private String fullName;
    private String phoneNumber;
    private String street;
    private String number;
    private String city;
    private String country;
    private String zipCodeOrPostalCodeOrCEP;
}
