package ru.menkov.infsources.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.menkov.infsources.model.commerce.Score;
@Repository
public interface ScoreRepository extends CrudRepository<Score,Integer> {
}
