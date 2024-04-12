package Model;

import java.util.HashSet;
import java.util.Set;

public class User extends Person{

private String userId;


    public User(String username, String password, String firstName, String lastName, String userId) {
        super(username, password, firstName, lastName);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
