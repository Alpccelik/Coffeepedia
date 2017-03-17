package alpcelik.coffeepedia.service;

import alpcelik.coffeepedia.dao.CoffeeDao;
import alpcelik.coffeepedia.entity.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by alp on 13/03/17.
 */
@Service
public class CoffeeService {
    @Autowired
    private CoffeeDao coffeeDao;
    public Collection<Coffee> getAllCoffees(){
        return coffeeDao.getAllCoffees();

    }
    public Coffee getCoffeeById(int id){
        return  this.coffeeDao.getCoffeeById(id);
    }

    public void removeCoffeeById(int id) {
        this.coffeeDao.removeCoffeeById(id);
    }

    public void updateCoffee(Coffee coffee){
        this.coffeeDao.updateCoffee(coffee);
    }

    public void insertCoffee(Coffee coffee) {
        this.coffeeDao.insertCoffeeToDb(coffee);
    }
}
