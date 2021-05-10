package ru.menkov.infsources.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.menkov.infsources.model.product.Source;
@Repository
public interface SourceRepository extends CrudRepository<Source,Integer> {
}
