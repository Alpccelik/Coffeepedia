package alpcelik.coffeepedia.entity;

import alpcelik.coffeepedia.enums.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class User implements UserDetails {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String coffeeMachine;
    private Set<UserRole> roles;
    private Integer userPoint = 0;

    public User(String username, String password, String email, String name) {
    }

    public User(Integer id, String username, String email, String password, String coffeeMachine, Set<UserRole> roles, Integer userPoint) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.coffeeMachine = coffeeMachine;
        this.roles = roles;
        this.userPoint = userPoint;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCoffeeMachine() {
        return coffeeMachine;
    }

    public void setCoffeeMachine(String coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream().map(r -> new SimpleGrantedAuthority("ROLE_" + r.name())).collect(Collectors.toList());
    }

    public Set<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<UserRole> roles) {
        this.roles = roles;
    }

    public Integer getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(Integer userPoint) {
        this.userPoint = userPoint;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
