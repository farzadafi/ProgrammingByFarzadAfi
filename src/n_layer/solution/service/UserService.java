package n_layer.solution.service;

import n_layer.problem.User;
import n_layer.solution.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

    public int signUp(User user) {
        boolean isDuplicateUsername = userRepository.isDuplicateUsername(user.getUsername());
        if(isDuplicateUsername)
            return -2;
        return userRepository.signUp(user);
    }

    public String signIn(String username, String password) {
        User byUsername = userRepository.findByUsername(username);
        if(byUsername == null || !byUsername.getPassword().equals(password))
            return null;
        else
            return byUsername.getUsername();
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void updateName(String username, String name) {
        userRepository.updateName(username, name);
    }
}
