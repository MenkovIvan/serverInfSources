package ru.menkov.infsources.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.menkov.infsources.model.product.Catalog;

@Repository
public interface CatalogRepository extends CrudRepository<Catalog,Integer> {
}
