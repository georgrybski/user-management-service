package com.usermanagementservice.service;

import com.usermanagementservice.dto.address.AddressDTO;
import com.usermanagementservice.dto.address.AddressRegistrationDTO;
import com.usermanagementservice.mapper.AddressMapper;
import com.usermanagementservice.model.Address;
import com.usermanagementservice.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressService {
    private AddressRepository addressRepository;
    private AddressMapper addressMapper;

    public void deleteAddressById(Long id) {
        addressRepository.deleteById(id);
    }

    public AddressDTO fetchAddressById(Long id) {
        return addressMapper.toDTO(fetchByIdOrThrow(id));
    }

    public Address createAddress(AddressRegistrationDTO addressRegistrationDTO) {
        return addressRepository.save(addressMapper.toEntity(addressRegistrationDTO));
    }

    public Address updateAddress(Long id, AddressRegistrationDTO addressRegistrationDTO) {
        Address address = addressMapper.toEntity(addressRegistrationDTO);
        address.setId(id);
        return addressRepository.save(address);
    }

    private Address fetchByIdOrThrow(Long id) {
        return addressRepository.findById(id).orElseThrow();
    }
}
