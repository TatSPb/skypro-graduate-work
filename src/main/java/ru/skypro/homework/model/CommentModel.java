package ru.skypro.homework.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/*** CommentModel class / Класс "Модель комментария в объявлении" ***/

@Entity
@Table(name = "comments")

public class CommentModel {
    /*** Comment Id / Id комментария ***/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /*** Date&Time of comment creation / Дата и время создания комментария ***/
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    /*** Comment content /  Текст комментария ***/
    @Column(name = "text")
    private String text;

    /*** Comment author / Автор комментария ***/
    private UserModel userModel;

    /*** Advertisement / Объявление ***/
    private AdsModel adsModel;

    public CommentModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public AdsModel getAdsModel() {
        return adsModel;
    }

    public void setAdsModel(AdsModel adsModel) {
        this.adsModel = adsModel;
    }
}
