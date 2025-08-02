package h_string.b_exercise.d;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your phone number:");
        String phoneNumber = scanner.next();

        if(isValidPhoneNumber(phoneNumber))
            System.out.println("valid");
        else
            System.out.println("not valid");
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        System.out.println(1);
        if(phoneNumber.length() != 11)
            return false;

        System.out.println(2);
        if(!phoneNumber.startsWith("09"))
            return false;

        System.out.println(3);
        int counter = 0;
        for (int i = 0; i < phoneNumber.length(); i++) {
            if(Character.isDigit(phoneNumber.charAt(i)))
                ++counter;
        }
        if(counter != 11)
            return false;

        System.out.println(4);
        return true;
    }
}
