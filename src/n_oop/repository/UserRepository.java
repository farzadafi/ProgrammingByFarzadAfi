package n_oop.repository;

import n_oop.model.User;

public class UserRepository {
    private final User[] users = new User[100];

    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if(users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }

    public User findUserByUsername(String username){
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null && users[i].getUsername().equals(username))
                return users[i];
        }
        return null;
    }
}
