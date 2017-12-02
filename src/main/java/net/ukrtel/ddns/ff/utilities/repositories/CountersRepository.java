package net.ukrtel.ddns.ff.utilities.repositories;

import net.ukrtel.ddns.ff.utilities.entities.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CountersRepository extends JpaRepository<Counter, Long> {
}
