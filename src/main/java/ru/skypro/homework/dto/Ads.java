package ru.skypro.homework.dto;

import lombok.Data;

/*** Data Transfer Object / Объект передачи данных ***/
@Data
public class Ads {
    private Integer author;
    private String image;
    private Integer pk;
    private Integer price;
    private String title;

    public Ads() {
    }
}
