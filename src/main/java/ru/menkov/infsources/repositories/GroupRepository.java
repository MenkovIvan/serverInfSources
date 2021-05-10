package ru.menkov.infsources.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.menkov.infsources.model.custom.Group;

@Repository
public interface GroupRepository extends CrudRepository<Group,Integer> {
}
