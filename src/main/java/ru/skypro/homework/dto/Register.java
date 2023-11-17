package ru.skypro.homework.dto;

import lombok.Data;
/*** Data Transfer Object / Объект передачи данных ***/
@Data
public class Register {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;
}
