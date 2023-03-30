package com.usermanagementservice.mapper;

import com.usermanagementservice.dto.address.AddressDTO;
import com.usermanagementservice.dto.address.AddressRegistrationDTO;
import com.usermanagementservice.mapper.config.MappingConfig;
import com.usermanagementservice.model.Address;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(config = MappingConfig.class)
public interface AddressMapper {

    Address toEntity(AddressDTO addressDTO);

    AddressDTO toDTO(Address address);

    Address toEntity(AddressRegistrationDTO addressRegistrationDTO);
}
