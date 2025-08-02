package h_string.b_exercise.g;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();

        if (isGoodPassword(password))
            System.out.println("good password");
        else
            System.out.println("bad password");
    }

    public static boolean isGoodPassword(String password) {
        if(password.length() < 8)
            return false;

        boolean hasSpace = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecificChar = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isSpaceChar(ch))
                hasSpace = true;
            else if (Character.isLowerCase(ch))
                hasLowerCase = true;
            else if (Character.isUpperCase(ch))
                hasUpperCase = true;
            else if (Character.isDigit(ch))
                hasDigit = true;
            else if (isSpecificChar(ch))
                hasSpecificChar = true;
        }
        if(hasSpace && hasLowerCase && hasUpperCase && hasDigit && hasSpecificChar)
            return true;
        else
            return false;
    }

    public static boolean isSpecificChar(char ch) {
        char[] array = {'!', '@', '#', '$', '%', '&', '*'};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch)
                return true;
        }
        return false;
    }
}
