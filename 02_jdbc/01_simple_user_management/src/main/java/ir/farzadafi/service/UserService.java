package ir.farzadafi.service;

import ir.farzadafi.model.User;
import ir.farzadafi.repository.UserRepository;
import ir.farzadafi.utility.Validator;

import java.sql.SQLException;

public class UserService {

    private final Validator validator = new Validator();
    private final UserRepository userRepository = new UserRepository();

    public int register(User user) throws SQLException {
        if (!validator.isValidName(user.getName()))
            return -1;
        if(!validator.isValidPassword(user.getPassword()))
            return -1;
        if(user.getAge() > 100 || user.getAge() < 0)
            return -1;
        if(userRepository.isExistUsername(user.getUsername()))
            return -1;
        return userRepository.save(user);
    }

    public boolean login(String username, String password) throws SQLException {
        User byUsername = userRepository.findByUsername(username);
        if(byUsername == null)
            return false;
        if(!byUsername.getPassword().equals(password))
            return false;
        return true;
    }

    public int updateName(String username, String newName) throws SQLException {
        boolean existUsername = userRepository.isExistUsername(username);
        if(!existUsername)
            return -1;
        return userRepository.updateName(username, newName);
    }

    public int removeByUsername(String username) throws SQLException {
        boolean existUsername = userRepository.isExistUsername(username);
        if(!existUsername)
            return -1;
        return userRepository.removeByUsername(username);
    }
}
