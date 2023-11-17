package ru.skypro.homework.dto;

import lombok.Data;
/*** Data Transfer Object / Объект передачи данных ***/
@Data
public class AdsCreation {
    private String description;
    private Integer price;
    private String title;
}
