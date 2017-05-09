package alpcelik.coffeepedia.service;

import alpcelik.coffeepedia.controller.viewmodel.UserCreateViewModel;
import alpcelik.coffeepedia.dao.UserDao;
import alpcelik.coffeepedia.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean createUser(UserCreateViewModel viewModel) {
        if (userDao.findOneByUsernameOrEmail(viewModel.getUsername(), viewModel.getEmail()) == null) {
            if (userDao.save(new User(viewModel.getUsername(), viewModel.getPassword(), viewModel.getEmail(), viewModel.getName())) != null) {
                return true;
            }
        }
        return false;
    }


    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }


    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findEnabledUser(String username) {
        return userDao.findOneByUsernameAndEnabledTrue(username);
    }

}




