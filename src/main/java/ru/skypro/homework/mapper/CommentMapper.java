package ru.skypro.homework.mapper;

import org.mapstruct.*;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import ru.skypro.homework.dto.Comment;
import ru.skypro.homework.dto.CommentCreator;
import ru.skypro.homework.model.CommentModel;

import java.util.List;

/*** Mapper to map dto -> DB -> dto (comment)  / Сервис для маппинга комментариев из сущностей/моделей в dto и обратно ***/
@Component
@Mapper(componentModel = "spring")
public interface CommentMapper {

    CommentModel toCommentModel(CommentCreator commentCreator);

    @Mapping(target = "pk", source = "id")
    @Mapping(target = "author", source = "userModel.id")
    @Mapping(target = "authorFirstName", source = "userModel.firstName")
    @Mapping(target = "authorImage", expression = "java(getImageModel(commentModel))")
    Comment commentModelToComment(CommentModel commentModel);

    default String getImageModel(CommentModel commentModel) {
        if (commentModel.getUserModel().getImageModel() == null) {
            return null;
        }
        return "/users/image/" + commentModel.getUserModel().getId() + "/from-db";
    }

    List<Comment> commentListToCommentDtoList(List<CommentModel> commentList);
}
