package n_oop.menu;

import n_oop.service.UserService;
import n_oop.model.User;

import java.util.Scanner;

public class UserMenu {

    private final UserService userService = new UserService();

    public void generalMenu() {
        System.out.println("**** Hello and Welcome ****");
        System.out.println("1-signIn");
        System.out.println("2-signup");
        System.out.println("3-Exit");
        System.out.println("Please enter your select:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if(userInput == 1)
            signIn();
        else if(userInput == 2)
            signUp();
        else if(userInput == 3)
            exit();
        else {
            System.out.println("Please enter a correct input");
            exit();
        }
    }

    public void signIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        User user = new User(name, username, password);
        userService.registerUser(user);
        generalMenu();
    }

    public void signUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
        String result = userService.signUpUser(username, password);
        if(result == null)
            System.out.println("your username or password is incorrect!");
        else
            System.out.println("Hi " + result);
        generalMenu();
    }

    public void exit() {
        System.out.println("good buy!! :)");
        System.exit(0);
    }
}
