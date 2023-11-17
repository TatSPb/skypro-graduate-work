package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.*;

import java.util.List;
import java.util.Optional;

/*** CommentRepository / Репозиторий комментариев ***/
@Repository
public interface CommentRepository extends JpaRepository<CommentModel, Integer> {
    List<CommentModel> findAllByAdsModelId(Integer adsModelId);
    Optional<CommentModel> findByAdsModel_IdAndId(Integer adsModelId, Integer commentId);

}
