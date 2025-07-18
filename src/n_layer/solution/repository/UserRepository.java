package n_layer.solution.repository;

import n_layer.problem.User;

public class UserRepository {

    private final User[] USERS = new User[10];

    public boolean isDuplicateUsername(String username) {
        for (int i = 0; i < USERS.length; i++) {
            if(USERS[i] != null && USERS[i].getUsername().equals(username))
                return true;
        }
        return false;
    }

    public int signUp(User user) {
        for (int i = 0; i < USERS.length; i++) {
            if (USERS[i] == null) {
                USERS[i] = user;
                return i;
            }
        }
        return -1;
    }

    public User findByUsername(String username) {
        for (int i = 0; i < USERS.length; i++) {
            if(USERS[i] != null && USERS[i].getUsername().equals(username))
                return USERS[i];
        }
        return null;
    }

    public void updateName(String username, String name) {
        int i;
        for (i = 0; i < USERS.length; i++) {
            if(USERS[i] != null && USERS[i].getUsername().equals(username))
                break;
        }
        USERS[i].setName(name);
    }
}
