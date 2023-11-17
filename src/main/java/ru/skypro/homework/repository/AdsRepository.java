package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.*;

import java.util.List;

/*** AdsRepository / Репозиторий объявлений ***/
@Repository
public interface AdsRepository extends JpaRepository <AdsModel, Integer> {
    List<AdsModel> findAllAds();
    List<AdsModel> findAllByUserModelId(Integer userModelId);


}
