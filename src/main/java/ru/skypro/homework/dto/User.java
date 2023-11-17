package ru.skypro.homework.dto;

import lombok.Data;
/*** Data Transfer Object / Объект передачи данных ***/
@Data
public class User {
    public Long id;
    public String email;
    public String firstName;
    public String lastName;
    public String phone;
    private String image;

    public void User() {
    }
}
