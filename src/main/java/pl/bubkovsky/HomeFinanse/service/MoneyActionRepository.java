package pl.bubkovsky.HomeFinanse.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bubkovsky.HomeFinanse.model.MoneyAction;

@Repository
public interface MoneyActionRepository extends JpaRepository<MoneyAction, Long> {
}
