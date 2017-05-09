package alpcelik.coffeepedia.service;

import alpcelik.coffeepedia.dao.CoffeeDao;
import alpcelik.coffeepedia.entity.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.InvalidParameterException;

/**
 * Created by alp on 13/03/17.
 */
@Service
public class CoffeeService {
    private CoffeeDao coffeeDao;

    @Autowired
    public CoffeeService(CoffeeDao coffeeDao) {
        this.coffeeDao = coffeeDao;
    }

    public Coffee create() {
        return coffeeDao.save(new Coffee());
    }

    public Coffee update(Coffee coffee) {
        if (coffeeDao.findOne(coffee.getId()) != null) {
            return coffeeDao.save(coffee);
        }
        throw new InvalidParameterException();
    }

    public void addNewItem(Integer id) {
        Coffee coffee = coffeeDao.getOne(id);
        coffeeDao.save(coffee);


    }

    public void updateCoffeeName(Integer id, String coffeename) {
        Coffee coffee = coffeeDao.findOne(id);
        if (coffee != null) {
            coffee.setCoffeename(coffeename);
            coffeeDao.save(coffee);
        } else {
            throw new InvalidParameterException();
        }
    }


    public void deleteCoffee(Integer id) {
        Coffee coffee = coffeeDao.findOne(id);
        coffeeDao.delete(coffee);
    }



}


