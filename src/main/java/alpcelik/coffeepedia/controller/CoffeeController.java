package alpcelik.coffeepedia.controller;

import alpcelik.coffeepedia.dao.CoffeeDao;
import alpcelik.coffeepedia.entity.Coffee;
import alpcelik.coffeepedia.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Secured("ROLE_USER")
@RequestMapping("/coffees")
public class CoffeeController {
    CoffeeDao coffeeDao;
    @Autowired
    private CoffeeService coffeeService;

    @RequestMapping("/create")
    @ResponseBody
    public String create(Integer id, String coffeename, String coffeekind, boolean milkinside) {
        try {
            Coffee coffee = new Coffee(id, coffeename, coffeekind, milkinside);
            coffeeDao.save(coffee);
            id = Integer.valueOf(coffee.getId());
        } catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created with id = " + id;
    }

}
