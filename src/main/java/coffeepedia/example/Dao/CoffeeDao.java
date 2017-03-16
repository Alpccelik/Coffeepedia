package coffeepedia.example.dao;

import coffeepedia.example.entity.Coffee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alp on 12/03/17.
 */

@Repository
public class CoffeeDao {

    public static Map<Integer,Coffee> coffees;

    static {

        coffees=new HashMap<Integer, Coffee>(){

            {
                put(1,new Coffee(1,"Espresso","primary",false));
                put(2,new Coffee(2,"filter","primary",false));
                put(3,new Coffee(3,"V60","primary",false));



            }
        };
    }
    public Collection<Coffee> getAllCoffees(){

        return this.coffees.values();

    }

    public Coffee getCoffeeById(int id){
        return  this.coffees.get(id);
    }

    public void removeCoffeeById(int id) {
        this.coffees.remove(id);
    }

    public void updateCoffee(Coffee coffee){
        Coffee c=coffees.get(coffee.getCoffeeid());
        c.setCoffeename(coffee.getCoffeename());
        c.setCoffeekind(coffee.getCoffeekind());
        coffees.put(coffee.getCoffeeid(),coffee);
    }

    public void insertCoffeeToDb(Coffee coffee) {
        this.coffees.put(coffee.getCoffeeid(),coffee);
    }
}
