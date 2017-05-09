package alpcelik.coffeepedia.dao;

import alpcelik.coffeepedia.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by alp on 12/03/17.
 */
@Repository
public interface CoffeeDao extends JpaRepository<Coffee, Integer> {
    Coffee getCoffeeById(Integer id);
}

