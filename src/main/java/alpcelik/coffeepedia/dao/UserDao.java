package alpcelik.coffeepedia.dao;

/**
 * Created by alp on 04/05/17.
 */

import alpcelik.coffeepedia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findOneByUsernameAndEnabledTrue(String username);

    User findOneByUsernameOrEmail(String username, String email);

    User getUserById(long id);


}

