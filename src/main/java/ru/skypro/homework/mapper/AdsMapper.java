package ru.skypro.homework.mapper;

import org.mapstruct.Mapping;
import ru.skypro.homework.dto.*;
import ru.skypro.homework.model.*;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/*** Mapper to map dto -> DB -> dto (advertising) / Сервис для маппинга из сущностей/моделей в dto и обратно ***/
@Component
public interface AdsMapper {
    AdsModel toAdsModel(AdsCreator adsCreator);
    @Mapping(target = "pk", source = "id")
    @Mapping(target = "author", source = "userModel.id")
    @Mapping(target = "image", expression="java(getImageModel(adsModel))")
    Ads adsModelToAds (AdsModel adsModel);

    @Mapping(target = "pk", source = "id")
    @Mapping(target = "authorFirstName", source = "userModel.firstName")
    @Mapping(target = "authorLastName", source = "userModel.lastName")
    @Mapping(target = "email", source = "userModel.username")
    @Mapping(target = "phone", source = "userModel.phone")
    @Mapping(target = "image", expression="java(getImageModel(adsModel))")
    AdsFull toAdsFullDto(AdsModel adsModel);

    default String getImageModel(AdsModel adsModel) {
        if (adsModel.getImageModel() == null) {
            return null;
        }
        return "/ads/image/" + adsModel.getId() + "/from-db";
    }

    List<Ads> adListToAdsDtoList(List<AdsModel> adList);

    List<AdsModel> toModelList(Collection<Ads> adsCollection);

    AdsCreator adsModelToCreateAds(AdsModel adsModel);
}
