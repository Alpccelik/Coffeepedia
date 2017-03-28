package alpcelik.coffeepedia.service;

import alpcelik.coffeepedia.entity.User;
import alpcelik.coffeepedia.enums.UserRole;
import org.springframework.stereotype.Repository;

import java.util.*;


/**
 * Created by alp on 12/03/17.
 */

@Repository
public class UserService {
    public static List<User> users = Arrays.asList(
            new User(1, "alp", "alpcelik3@gmail.com", "deneme123", "Krups", new HashSet<>(Arrays.asList(UserRole.ADMIN, UserRole.USER)), 0),
            new User(2, "bugra", "bugra@gmail.com", "deneme123", "Delongi", new HashSet<>(Collections.singleton(UserRole.USER)), 0));


    public Collection<User> getAllUsers() {
        return users;
    }

    public User getUserById(int id) {
        return UserService.users.get(id);
    }

    public void removeUserById(int id) {
        Optional<User> user = users.stream().filter(u -> u.getId().equals(id)).findAny();
        if (user.isPresent()) {
            users.remove(user.get());
        }
    }

    public User findOneById(int id) {
        return users.stream().filter(u -> u.getId().equals(id)).findAny().orElse(null);
    }

    public void updateUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User should be not null!");
        }
        Optional<User> onListOpt = users.stream().filter(u -> u.getId().equals(user.getId())).findAny();

        if (onListOpt.isPresent()) {
            User onList = onListOpt.get();
            users.remove(onList);
            users.add(user);
        } else {
            throw new IllegalArgumentException("User not on the list!");
        }
    }

    public void insertUserToDb(User user) {
        Optional<User> onListOpt = users.stream().filter(u -> u.getId().equals(user.getId())).findAny();
        onListOpt.ifPresent(user1 -> {
            throw new IllegalArgumentException("User already on the list!");
        });
        users.add(user);
    }

    public User getByUsername(String username) {
        return users.stream().filter(u -> u.getUsername().equals(username)).findAny().orElse(null);
    }
}
