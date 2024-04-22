package Service;

import Model.Courses;
import Model.Instructor;
import Model.User;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class UserService {
    String username;
    String password;
    String firstName;
    String lastName;
    String userId;

    public UserService(String username, String password, String firstName, String lastName, String userId) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
    }

    Set<User> userSet = new HashSet<>();


    public void addUser(String username, String password, String firstName, String lastName, String userId) {
        User user = new User(username, password, firstName, lastName, userId);
        userSet.add(user);
    }

    public User getUser(String userId) {
        for (User users : userSet) {
            if(users.getUserId().equals(userId)) {
                return users;
            }
        }
        return null;
    }

    public Collection<User> getAllUsers() {
        return userSet;
    }
}
