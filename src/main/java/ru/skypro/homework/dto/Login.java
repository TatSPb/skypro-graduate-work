package ru.skypro.homework.dto;

import lombok.Data;
/*** Data Transfer Object / Объект передачи данных ***/
@Data
public class Login {

    private String username;
    private String password;
}
