package coffeepedia.example.Controller;

import coffeepedia.example.Entity.Coffee;
import coffeepedia.example.Service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by alp on 13/03/17.
 */
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
