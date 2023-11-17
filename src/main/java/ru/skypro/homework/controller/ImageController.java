package ru.skypro.homework.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;

/*** Rest controller for image service  / Класс-контроллер для работы с имиджевыми изображениями ***/
public class ImageController {
    @PatchMapping("/{id}")
    public ResponseEntity<?> updateAdsImage() {
        return updateAdsImage();
    }
}
