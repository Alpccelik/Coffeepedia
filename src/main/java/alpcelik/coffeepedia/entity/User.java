package alpcelik.coffeepedia.entity;

import alpcelik.coffeepedia.enums.UserRole;
import com.sun.istack.internal.NotNull;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Set;

/**
 * Created by alp on 12/03/17.
 */
public class User {
    @NotNull
    private int userID;

    @NotNull
    private String userName;

    @NotNull
    private String userEmail;

    @NotNull
    private String userPass;

    private String userCoffeMachine;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Set<UserRole> roles;

    private int userPoint;

    public User(int userID, String userName, String userEmail, String userPass, String userCoffeMachine, int userPoint) {
        this.userID = userID;
        this.userName = userName;
        this.userCoffeMachine = userCoffeMachine;
        this.userPoint = userPoint;
        this.userEmail = userEmail;
        this.roles = roles;
        this.userPass = userPass;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCoffeMachine() {
        return userCoffeMachine;
    }

    public void setUserCoffeMachine(String userCoffeMachine) {
        this.userCoffeMachine = userCoffeMachine;
    }

    public int getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(int userPoint) {
        this.userPoint = userPoint;
    }

    public User(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }


    public User(){};

}
