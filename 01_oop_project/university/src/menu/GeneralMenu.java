package menu;

import utility.UserInputHandler;

public class GeneralMenu {

    private final StudentMenu studentMenu = new StudentMenu();
    private final UserInputHandler userInputHandler = new UserInputHandler();
    private final ClerkMenu clerkMenu = new ClerkMenu();

    public void generalMenu() {
        printGeneralMenu();
        int userInput = userInputHandler.getIntFromUser();
        switch (userInput) {
            case 1 -> signIn();
            case 2 -> signUp();
            case 3 -> exit();
            case 4 -> {
                System.out.println("Please enter a correct select!");
                exit();
            }
        }
    }

    private void printGeneralMenu() {
        System.out.println("*** Hello And Welcome ***");
        System.out.println("1-signIn");
        System.out.println("2-signUp");
        System.out.println("3-exit");
        System.out.println("Please enter your select:");
    }

    public void signIn() {
        String username = userInputHandler.getStringFromUserByArg("username");
        String password = userInputHandler.getStringFromUserByArg("password");
        if(username.equals("admin") && password.equals("admin"))
            clerkMenu.initialMenu();
        generalMenu();
    }

    public void signUp() {
        printSignUpMenu();
        int userInput = userInputHandler.getIntFromUser();
        switch (userInput) {
            case 1 -> {
                studentMenu.signUpStudent();
                generalMenu();
            }
            case 2 -> {
            }
            case 3 -> generalMenu();
        }
    }

    public void exit() {
        System.out.println("Good Buy!");
        System.exit(0);
    }

    private void printSignUpMenu() {
        System.out.println("1-student");
        System.out.println("2-professor");
        System.out.println("3-back to general menu");
        System.out.println("Please enter your select:");
    }
}
