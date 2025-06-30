package n_layer.solution.menu;

import n_layer.problem.User;
import n_layer.solution.service.UserService;

import java.util.Scanner;

public class UserMenu {

    private final Scanner scanner = new Scanner(System.in);
    private final UserService userService = new UserService();

    public void generalMenu() {
        System.out.println("*** Hello and Welcome ***");
        System.out.println("1-signIn:");
        System.out.println("2-signUp:");
        System.out.println("3-Exit:");
        System.out.println("Please enter a number:");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> signIn();
            case 2 -> signUp();
            case 3 -> {
                System.out.println("Good by!");
                System.exit(0);
            }
        }
    }

    public void signIn() {
        scanner.nextLine();
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        String result1 = userService.signIn(username, password);
        if (result1 != null) {
            signInMenu(username);
        } else {
            System.out.println("user not found or password is incorrect");
            generalMenu();
        }
    }

    public void signInMenu(String username) {
        System.out.println("*** Hello " + username + " ***");
        System.out.println("1-Print your info");
        System.out.println("2-Update name");
        System.out.println("3-Exit");
        System.out.println("Please enter a number:");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> printInfo(username);
            case 2 -> updateName(username);
            case 3 -> generalMenu();
        }
    }

    public void updateName(String username) {
        scanner.nextLine();
        System.out.println("Please enter your new name:");
        String newName = scanner.nextLine();
        userService.updateName(username, newName);
        signInMenu(username);
    }

    public void printInfo(String username) {
        User byUsername = userService.findByUsername(username);
        System.out.println(byUsername);
        signInMenu(username);
    }

    public void signUp() {
        scanner.nextLine();
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        int result = userService.signUp(new User(name, username, password));
        if (result == -2)
            System.out.println("username is duplicate");
        else if (result == -1)
            System.out.println("array haven't any index");
        else
            System.out.println("done");
        generalMenu();
    }
}
