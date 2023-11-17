package ru.skypro.homework.mapper;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import ru.skypro.homework.dto.*;
import ru.skypro.homework.model.*;

/*** Mapper to map dto -> DB -> dto (user) / Сервис для маппинга пользователей из сущностей/моделей в dto и обратно ***/
@Component
@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(Register register);

    @Mapping(source = "username", target = "email")
    @Mapping(target = "image", expression = "java(getImageModel(userModel))")
    void toUser(@MappingTarget User user, UserModel userModel);

    default String getImageModel(UserModel userModel) {
        if (userModel.getImageModel() == null) {
            return null;
        }
        return "/users/image/" + userModel.getId() + "/from-db";
    }

    @Mapping(ignore = true, target = "userModel.id")
    @Mapping(ignore = true, target = "userModel.imageModel")
    @Mapping(ignore = true, target = "userModel.username")
    void toUserModel(@MappingTarget UserModel userModel, User user);

    public default UserModel mapRegisterReqToUserModel(Register register) {
        UserModel userModel = new UserModel();
        userModel.setUsername(register.getUsername());
        userModel.setPassword(register.getPassword());
        userModel.setFirstName(register.getFirstName());
        userModel.setLastName(register.getLastName());
        userModel.setPhone(register.getPhone());
        userModel.setRole(Role.USER);
        return userModel;
    }
}
