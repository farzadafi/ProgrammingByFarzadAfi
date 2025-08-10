package ir.farzadafi;

import ir.farzadafi.model.User;
import ir.farzadafi.service.UserService;

import java.sql.SQLException;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User user = new User("test", 50, "farzad", "aA1!45435");
        System.out.println(userService.register(user));
    }
}
