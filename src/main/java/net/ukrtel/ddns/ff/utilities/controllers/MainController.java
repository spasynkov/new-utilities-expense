package net.ukrtel.ddns.ff.utilities.controllers;

import net.ukrtel.ddns.ff.utilities.entities.Counter;
import net.ukrtel.ddns.ff.utilities.entities.User;
import net.ukrtel.ddns.ff.utilities.entities.UtilityType;
import net.ukrtel.ddns.ff.utilities.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

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
        /*user.setId(1);
        user.setUsername("vasyok242");
        user.setPassword("vasya-super!");
        user.setSurname("Petrov");
        user.setName("Vasily");
        user.setFatherName("Ivanovich");*/

        Counter water = new Counter();
        water.setId(1);
        water.setType(UtilityType.WATER);
        water.setName("№242664");
        water.setLocation("Kutuzova 17");

        Counter elec = new Counter();
        elec.setId(2);
        elec.setType(UtilityType.ELECTRICITY);
        elec.setName("№5549974");
        elec.setLocation("Kutuzova 17");

        List<Counter> counters = new ArrayList<>(2);
        counters.add(water);
        counters.add(elec);

        user.getCounters().addAll(counters);
        return user;
    }
}
