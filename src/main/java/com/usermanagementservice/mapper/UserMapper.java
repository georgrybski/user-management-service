package com.usermanagementservice.mapper;

import com.usermanagementservice.dto.user.UserDTO;
import com.usermanagementservice.dto.user.UserRegistrationDTO;
import com.usermanagementservice.dto.user.UserUpdateDTO;
import com.usermanagementservice.mapper.config.MappingConfig;
import com.usermanagementservice.model.User;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Mapper(config = MappingConfig.class)
public abstract class UserMapper {

    @Autowired
    AddressMapper addressMapper;

    public abstract UserDTO toDTO(User user);

    public abstract User toEntity(UserDTO userDTO);
    public abstract User toEntity(UserUpdateDTO userUpdateDTO);
    public abstract User toEntity(UserRegistrationDTO userRegistrationDTO);
}
