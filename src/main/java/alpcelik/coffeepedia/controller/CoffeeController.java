package alpcelik.coffeepedia.controller;

import alpcelik.coffeepedia.entity.Coffee;
import alpcelik.coffeepedia.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Coffee> getAllCoffees(){
        return coffeeService.getAllCoffees();

    }
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public  Coffee getCoffeeById(@PathVariable("id") int id){
        return coffeeService.getCoffeeById(id);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public void deleteCoffeeById(@PathVariable("id") int id){
        coffeeService.removeCoffeeById(id);
    }

    @RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCoffeeById(@RequestBody Coffee coffee){
        coffeeService.updateCoffee(coffee);
    }

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCoffee(@RequestBody Coffee coffee){
        coffeeService.insertCoffee(coffee);
    }


}
