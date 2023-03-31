package com.usermanagementservice.dto.user;

import com.usermanagementservice.dto.address.AddressRegistrationDTO;

import java.util.ArrayList;
import java.util.List;

public class UserUpdateDTO {
    private String name;

    private String email;

    private String password;

    private List<AddressRegistrationDTO> addresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AddressRegistrationDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressRegistrationDTO> addresses) {
        this.addresses = addresses;
    }
}
