package com.usermanagementservice.service;

import com.usermanagementservice.dto.user.UserUpdateDTO;
import com.usermanagementservice.dto.address.AddressRegistrationDTO;
import com.usermanagementservice.dto.user.UserDTO;
import com.usermanagementservice.dto.user.UserRegistrationDTO;
import com.usermanagementservice.exeption.UserNotFoundExeption;
import com.usermanagementservice.mapper.UserMapper;
import com.usermanagementservice.model.User;
import com.usermanagementservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private PasswordService passwordService;
    private UserRepository userRepository;
    private UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper, PasswordService passwordService) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordService = passwordService;
    }

    public void createUser(UserRegistrationDTO user) {
        User userEntity = userMapper.toEntity(user);
        passwordService.hashUserPassword(userEntity);
        userRepository.save(userEntity);
    }

    public List<UserDTO> findAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toDTO).toList();
    }

    public UserDTO findUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserNotFoundExeption(id);
        }
        return userMapper.toDTO(user.get());
    }

    public UserDTO findUserByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isEmpty()) {
            throw new UserNotFoundExeption(email);
        }
        return userMapper.toDTO(user.get());
    }

    public void updateUser(Long id, UserUpdateDTO userDTO) {;
        if (userRepository.findById(id).isEmpty()) {
            throw new UserNotFoundExeption(id);
        }

        User user = userMapper.toEntity(userDTO);
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public UserRegistrationDTO getUserRegistrationDTOexample() {
        UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO();
        userRegistrationDTO.setName("Full Name");
        userRegistrationDTO.setEmail("email@example.com");
        userRegistrationDTO.setPassword("VeryStrongPassword123!");

        AddressRegistrationDTO addressRegistrationDTO = new AddressRegistrationDTO();
        addressRegistrationDTO.setFullName("Name Of The Person Living Here");
        addressRegistrationDTO.setPhoneNumber("phoneNumber");
        addressRegistrationDTO.setStreet("Name Of the Street");
        addressRegistrationDTO.setNumber("Number");
        addressRegistrationDTO.setCity("City");
        addressRegistrationDTO.setState("State");
        addressRegistrationDTO.setCountry("Country");
        addressRegistrationDTO.setZipCodeOrPostalCodeOrCEP("zipCodeOrPostalCodeOrCEP");

        userRegistrationDTO.getAddresses().add(addressRegistrationDTO);

        addressRegistrationDTO = new AddressRegistrationDTO();
        addressRegistrationDTO.setFullName("fullName2");
        addressRegistrationDTO.setPhoneNumber("phoneNumber2");
        addressRegistrationDTO.setStreet("street2");
        addressRegistrationDTO.setNumber("number2");
        addressRegistrationDTO.setCity("city2");
        addressRegistrationDTO.setState("state2");
        addressRegistrationDTO.setCountry("country2");
        addressRegistrationDTO.setZipCodeOrPostalCodeOrCEP("zipCodeOrPostalCodeOrCEP2");

        userRegistrationDTO.getAddresses().add(addressRegistrationDTO);

        return userRegistrationDTO;
    }
}
