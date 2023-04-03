package com.usermanagementservice.exeption;


import java.time.LocalDateTime;

public class UserNotFoundExeption extends RuntimeException {
    private static String idMessage = "No user with ID %s found";
    private static String emailMessage = "No user with email %s found";
    private Long id;
    private String email;
    private LocalDateTime timestamp;

    public UserNotFoundExeption(Long id) {
        super(idMessage.formatted(id));
        this.id = id;
        timestamp = LocalDateTime.now();
    }

    public UserNotFoundExeption(String email) {
        super(emailMessage.formatted(email));
        this.email = email;
        timestamp = LocalDateTime.now();
    }
}
