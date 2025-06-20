package n_oop.service;

import n_oop.model.User;
import n_oop.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public void registerUser(User user){
        userRepository.addUser(user);
    }

    public String signUpUser(String username, String password) {
        User result = userRepository.findUserByUsername(username);
        if(result == null)
            return null;
        if(!result.getPassword().equals(password))
            return null;
        return result.getUsername();
    }
}
