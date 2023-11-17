package ru.skypro.homework.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/*** Rest controller for user service  / Класс-контроллер для работы с пользователями ***/

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/users")

public class UserController {

    @PostMapping("/set_password")
    public ResponseEntity<?> setPassword() {
        return setPassword();
    }

    @GetMapping("/me")
    public ResponseEntity<?> getUser() {
        return getUser();
    }

    @PatchMapping("/me")
    public ResponseEntity<?> updateUser() {
        return updateUser();
    }

    @PatchMapping(value = "/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void updateUserImage() {
    }
}



