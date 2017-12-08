package net.ukrtel.ddns.ff.utilities.repositories;

import net.ukrtel.ddns.ff.utilities.entities.Counter;
import net.ukrtel.ddns.ff.utilities.entities.CounterData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CounterDataRepository extends JpaRepository<CounterData, Long> {
    List<CounterData> findLast5ByCounter(Counter counter);
}
