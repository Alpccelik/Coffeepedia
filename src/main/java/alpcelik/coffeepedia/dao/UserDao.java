package alpcelik.coffeepedia.dao;

import alpcelik.coffeepedia.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by alp on 12/03/17.
 */

@Repository
public class UserDao {

    public static Map<Integer,User> users;

    static {

        users=new HashMap<Integer, User>(){

            {
                put(1, new User(1, "Alp", "alpcelik3@gmail.com", "denem123", "Krups", 0));
                put(2, new User(2, "Bugra", "bugra@gmail.com", "denem123", "Delongi", 0));


            }
        };
    }
    public Collection<User> getAllUsers(){

        return this.users.values();

    }

    public User getUserById(int id){
        return  this.users.get(id);
    }

    public void removeUserById(int id) {
        this.users.remove(id);
    }

    public User findOneById(int id) {
        return this.users.get(id);
    }

    public void updateUser(User user){
        User u=users.get(user.getUserID());
        u.setUserName(user.getUserName());
        u.setUserCoffeMachine(user.getUserCoffeMachine());
        users.put(user.getUserID(),user);
    }

    public void insertUserToDb(User user) {this.users.put(user.getUserID(),user);
    }


}
