package net.ukrtel.ddns.ff.utilities.repositories;

import net.ukrtel.ddns.ff.utilities.entities.CounterData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterDataRepository extends JpaRepository<CounterData, Long> {
}
