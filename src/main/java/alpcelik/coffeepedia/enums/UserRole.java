package alpcelik.coffeepedia.enums;

/**
 * Created by alp on 21/03/17.
 */
public enum UserRole {
    USER("USER"),
    ADMIN("ADMIN");

    private String roleName;

    UserRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
