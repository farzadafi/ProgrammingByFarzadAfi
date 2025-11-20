package ir.farzadafi.service;

import com.sun.jdi.InvalidCodeIndexException;
import ir.farzadafi.exception.DatabaseAccessException;
import ir.farzadafi.exception.InvalidInputException;
import ir.farzadafi.exception.JdbcQueryException;
import ir.farzadafi.model.User;
import ir.farzadafi.repository.UserRepository;

import java.sql.SQLException;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public int save(User user) {
        validateInput(user.getName(), user.getNationalCode());
        boolean result = isExistsNationalCode(user.getNationalCode());
        if (result)
            return -5;
        return userRepository.save(user);
    }

    public void validateInput(String name, String nationalCode) {
        if (!isValidName(name))
            throw new InvalidInputException("name is invalid");
        if (!isValidNationalCode(nationalCode))
            throw new InvalidInputException("nationalCode is invalid");
    }

    public boolean isExistsNationalCode(String nationalCode) {
        try {
            return userRepository.isExistsNationalCode(nationalCode);
        } catch (DatabaseAccessException | JdbcQueryException e) {
            throw new DatabaseAccessException(e.getMessage());
        }
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
