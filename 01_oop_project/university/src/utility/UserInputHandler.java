package utility;

import java.util.Scanner;

public class UserInputHandler {

    Scanner scanner = new Scanner(System.in);

    public String getStringFromUserByArg(String string) {
        scanner.nextLine();
        System.out.println("please enter your " + string + ":");
        return scanner.nextLine();
    }

    public int getIntFromUser() {
        return scanner.nextInt();
    }
}
