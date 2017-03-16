package coffeepedia.example.entity;

/**
 * Created by alp on 12/03/17.
 */
public class User {
    private int userID;
    private String userName;
    private String userCoffeMachine;
    private int userPoint;

    public User(int userID, String userName, String userCoffeMachine, int userPoint) {
        this.userID = userID;
        this.userName = userName;
        this.userCoffeMachine = userCoffeMachine;
        this.userPoint = userPoint;
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

    public User(){};

}
