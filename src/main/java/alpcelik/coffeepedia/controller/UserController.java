package alpcelik.coffeepedia.controller;

import alpcelik.coffeepedia.entity.User;
import alpcelik.coffeepedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User> getAllUsers() {

        return userService.getAllUsers();

    }
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public  User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable("id") int id){
        userService.removeUserById(id);
    }

    @RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteUserById(@RequestBody User user){
        userService.updateUser(user);
    }

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);
    }


}
