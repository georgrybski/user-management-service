package com.usermanagementservice.dto.user;

import com.usermanagementservice.dto.address.AddressDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private List<AddressDTO> addresses;
}
