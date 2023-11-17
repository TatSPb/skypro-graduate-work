package ru.skypro.homework.model;

import javax.persistence.*;

/*** ImageModel class / Класс "Модель изображения в объявлениях") ***/

@Entity
@Table(name = "images")

public class ImageModel {

    /*** Image Id /Id изображения ***/
    @Id
    @GeneratedValue //(strategy = GenerationType.IDENTITY)
    private Integer id;

    /*** Image  / Изображение ***/
    @Lob
    private byte[] image;

    /*** Advertisement  / Объявление ***/
    private AdsModel adsModel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public AdsModel getAdsModel() {
        return adsModel;
    }

    public void setAdsModel(AdsModel adsModel) {
        this.adsModel = adsModel;
    }
}
