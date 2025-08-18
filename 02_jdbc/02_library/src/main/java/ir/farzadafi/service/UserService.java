package ir.farzadafi.service;

import ir.farzadafi.model.User;
import ir.farzadafi.repository.UserRepository;

import java.sql.SQLException;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public int save(User user) throws SQLException {
        if(!isValidName(user.getName()))
            return -1;
        if(!isValidNationalCode(user.getNationalCode()))
            return -1;
        if(userRepository.isExistsNationalCode(user.getNationalCode()))
            return -1;
        return userRepository.save(user);
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

    public int getIdByNationalCode(String nationalCode) throws SQLException {
        return userRepository.getIdByNationalCode(nationalCode);
    }
}
