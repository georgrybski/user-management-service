package com.usermanagementservice.controller;

import com.usermanagementservice.dto.user.UserDTO;
import com.usermanagementservice.dto.user.UserRegistrationDTO;
import com.usermanagementservice.dto.user.UserUpdateDTO;
import com.usermanagementservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        value = "/api/users",
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
)
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<Void> createUser(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        userService.createUser(userRegistrationDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserDTO> getUser(@PathVariable String email) {
        return ResponseEntity.ok(userService.findUserByEmail(email));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateUser(@PathVariable Long id, @RequestBody UserUpdateDTO userDTO) {
        userService.updateUser(id, userDTO);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/example")
    public ResponseEntity<UserRegistrationDTO> getUserExample() {
        return ResponseEntity.ok(userService.getUserRegistrationDTOexample());
    }
}
