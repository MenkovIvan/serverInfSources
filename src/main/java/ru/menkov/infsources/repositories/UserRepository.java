package ru.menkov.infsources.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.menkov.infsources.model.custom.User;
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    User findUserByName(String name);
    User findUserByUser_id(Integer user_id);
    User findUserByEmail(String email);
    Boolean existsUserByEmailAndPassword(String email, String password);
}
