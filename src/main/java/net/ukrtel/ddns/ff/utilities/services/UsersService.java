package net.ukrtel.ddns.ff.utilities.services;

import net.ukrtel.ddns.ff.utilities.entities.User;

public interface UsersService {

    User getByUsername(String username);

    User add(User user);

    User save(User user);
}
