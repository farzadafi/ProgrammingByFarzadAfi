package repository;

import model.User;

public class UserRepository {

    private static final User[] USERS = new User[100];

    public void save(User user) {
        for (int i = 0; i < USERS.length; i++) {
            if (USERS[i] == null) {
                USERS[i] = user;
                break;
            }
        }
    }

    public User findUserByNationalCode(String nationalCode) {
        for (int i = 0; i < USERS.length; i++) {
            if (USERS[i] != null && USERS[i].getNationalCode().equals(nationalCode))
                return USERS[i];
            if(USERS[i] == null)
                break;
        }
        return null;
    }
}
