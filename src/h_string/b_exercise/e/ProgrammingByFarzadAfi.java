package h_string.b_exercise.e;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String str = scanner.next();

        int lowerCaseCounter = 0;
        int upperCaseCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch))
                ++upperCaseCounter/**/;
            else if(Character.isLowerCase(ch))
                ++lowerCaseCounter;
        }

        System.out.println("lower case:" + lowerCaseCounter);
        System.out.println("lower case:" + upperCaseCounter);
    }
}
