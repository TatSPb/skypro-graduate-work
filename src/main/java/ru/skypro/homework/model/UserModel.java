package ru.skypro.homework.model;


import lombok.*;
import ru.skypro.homework.dto.*;

import javax.persistence.*;
import java.util.Set;

/*** UserModel class / Класс "Модель пользователя" ***/
@Entity
@Table(name = "users")

public class UserModel {

    /*** User Id / Id пользователя ***/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /*** User login / Логин пользователя ***/
    @Column(name = "userName")
    private String username;

    /*** User name / Имя пользователя ***/
    @Column(name = "first_name")
    private String firstName;

    /*** User lastname  / Фамилия пользователя ***/
    @Column(name = "last_name")
    private String lastName;

    /*** User phone number  / Номер телефона пользователя ***/
    @Column(name = "phone")
    private String phone;

    /*** User role / Роль пользователя ***/
    @Column(name = "role")
    private Role role;

    /*** User password / Пароль пользователя ***/
    @Column(name = "password")
    private String password;

    /*** User avatar / Аватар пользователя ***/
    private ImageModel imageModel;

    /*** User advertisements / Объявления пользователя ***/
    private Set<AdsModel> adsModels;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<AdsModel> getAdsModels() {
        return adsModels;
    }

    public void setAdsModels(Set<AdsModel> adsModels) {
        this.adsModels = adsModels;
    }


    public ImageModel getImageModel() {
        return imageModel;
    }

    public void setImageModel(ImageModel imageModel) {
        this.imageModel = imageModel;
    }
}