package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.*;

import java.util.List;
import java.util.Optional;

/*** UserRepository / Репозиторий пользователей ***/
@Repository
public interface UserRepository extends JpaRepository {
    List<UserModel> findAllUsers();
    Optional<UserModel> getUserByUsernameIgnoreCase(String username);
    Optional<UserModel> findByUsername(String username);
}
