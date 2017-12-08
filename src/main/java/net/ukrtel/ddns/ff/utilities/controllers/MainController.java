package net.ukrtel.ddns.ff.utilities.controllers;

import net.ukrtel.ddns.ff.utilities.entities.User;
import net.ukrtel.ddns.ff.utilities.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {
    private UsersService usersService;

    @Autowired
    public MainController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public User main(Principal principal) {
        User user = new User();
        if (principal != null) {
            user = usersService.getByUsername(principal.getName());
        }

        return user;
    }
}
