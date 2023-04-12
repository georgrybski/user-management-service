package com.usermanagementservice.controller;

import com.usermanagementservice.dto.address.AddressDTO;
import com.usermanagementservice.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/addresses")
public class AddressController {
    private AddressService addressService;

    @GetMapping("/{id}")
    public ResponseEntity<AddressDTO> getAddressById(@PathVariable Long id) {
        return ResponseEntity.ok(addressService.fetchAddressById(id));
    }
}
