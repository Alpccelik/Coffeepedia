package alpcelik.coffeepedia.config.security;

import alpcelik.coffeepedia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by alp on 20/03/17.
 */
public class CustomUserDetailsService {
    private UserService userService;

    @Autowired
    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }


}
