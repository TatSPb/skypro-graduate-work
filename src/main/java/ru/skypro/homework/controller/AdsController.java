package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.service.AdsService;

/*** Rest controller for user advertisement  / Контроллер для работы с объявлениями пользователя ***/
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/ads")

public class AdsController {
    private final AdsService adsService;

    public AdsController(AdsService adsService) {
        this.adsService = adsService;
    }

    @GetMapping()
    public ResponseEntity<?> getAds() {
        return getAds();
    }

    @PostMapping()
    public ResponseEntity<?> addAds() {
        return null;
    }

    @GetMapping("/{ad_pk}/comments")
    public ResponseEntity<?> getComments() {
        return getComments();
    }

    @PostMapping("/{ad_pk}/comments")
    public ResponseEntity<?> addComments() {
        return addComments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFullAd() {
        return getFullAd();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeAds() {
        return removeAds();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateAds() {
        return updateAds();
    }

    @GetMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> getComment() {
        return getComment();
    }

    @DeleteMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<Void> deleteComments() {
        return deleteComments();

    }
    @PatchMapping("/{ad_pk}/comments/{id}")
    public ResponseEntity<?> updateComments(){
        return updateComments();
    }
    @GetMapping("/{me}")
    public ResponseEntity<?> getAdsMe(){
        return getAdsMe();
    }
}
