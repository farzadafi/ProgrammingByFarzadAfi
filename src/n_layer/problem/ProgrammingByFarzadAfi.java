package n_layer.problem;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {

    private static final User[] USERS = new User[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your username:");
        String username = scanner.nextLine();
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();

        boolean result = signUp(new User(name, username, password));
        if (!result)
            System.out.println("this username already exist!");
        else
            System.out.println("Done");

        System.out.println();
        System.out.println("Please enter your username fo signIn:");
        String usernameSignIn = scanner.nextLine();
        System.out.println("Please enter your username fo signIn:");
        String passwordSignIn = scanner.nextLine();
        User user = signIn(usernameSignIn, passwordSignIn);
        if (user != null)
            System.out.println("hello " + user.getName());
        else
            System.out.println("user not found or password is incorrect");
    }

    public static boolean signUp(User user) {
        for (int i = 0; i < USERS.length; i++) {
            if (USERS[i] != null && USERS[i].getUsername().equals(user.getUsername()))
                return false;
        }
        for (int i = 0; i < USERS.length; i++) {
            if (USERS[i] == null) {
                USERS[i] = user;
                break;
            }
        }
        return true;
    }

    public static User signIn(String username, String pasword) {
        User user = null;
        for (int i = 0; i < USERS.length; i++) {
            if (USERS[i] != null && USERS[i].getUsername().equals(username))
                user = USERS[i];
        }
        if (user != null && user.getPassword().equals(pasword))
            return user;
        else
            return null;
    }
}
