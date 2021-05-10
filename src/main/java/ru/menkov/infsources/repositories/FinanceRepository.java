package ru.menkov.infsources.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.menkov.infsources.model.commerce.Finance;

@Repository
public interface FinanceRepository extends CrudRepository<Finance,Integer> {
}
