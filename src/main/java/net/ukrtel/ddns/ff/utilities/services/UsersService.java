package net.ukrtel.ddns.ff.utilities.services;

import net.ukrtel.ddns.ff.utilities.entities.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface UsersService {
    @Transactional(propagation = Propagation.REQUIRED)
    User getByUsername(String username);

    User add(User user);

}
