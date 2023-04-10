package com.usermanagementservice.dto.user;

import com.usermanagementservice.dto.address.AddressRegistrationDTO;
import lombok.Getter;
import lombok.Setter;


import java.util.List;

@Getter
@Setter
public class UserUpdateDTO {
    private String name;

    private String email;

    private String password;

    private List<AddressRegistrationDTO> addresses;
}
