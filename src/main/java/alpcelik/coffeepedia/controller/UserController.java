package alpcelik.coffeepedia.controller;

import alpcelik.coffeepedia.dao.UserDao;
import alpcelik.coffeepedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService, UserDao userDao) {
        this.userService = userService;
    }

}
