package net.ukrtel.ddns.ff.utilities.repositories;

import net.ukrtel.ddns.ff.utilities.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UsersRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
