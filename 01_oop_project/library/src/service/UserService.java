package service;

import model.User;
import repository.UserRepository;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public boolean addUser(User user) {
        if(!isValidName(user.getName()))
            return false;
        if(!isValidName(user.getLastname()))
            return false;
        if(!isValidNationalCode(user.getNationalCode()))
            return false;
        userRepository.save(user);
        return true;
    }

    public boolean isValidName(String name) {
        if (name.length() < 3)
            return false;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)))
                return false;
        }
        return true;
    }

    public boolean isValidNationalCode(String nationalCode) {
        if (nationalCode.length() != 10)
            return false;
        for (int i = 0; i < nationalCode.length(); i++) {
            if (!Character.isDigit(nationalCode.charAt(i)))
                return false;
        }
        return true;
    }

    public User findUserByNationalCode(String nationalCode) {
        return userRepository.findUserByNationalCode(nationalCode);
    }
}
