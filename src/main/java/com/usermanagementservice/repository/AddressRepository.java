package com.usermanagementservice.repository;

import com.usermanagementservice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
