package h_string.b_exercise.k;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your phone number:");
        String phoneNumber = scanner.next();

//        if(phoneNumber.length() == 11)
//            System.out.println("valid");

//        if (phoneNumber.startsWith("09"))
//            System.out.println("valid");

//            if (array[i] != '0' && array[i] != '1') {
//                bool = false;
//                break;
        char[] array = phoneNumber.toCharArray();
        char[] numberArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if (array[i] == numberArray[j]) {
                    counter++;
                    break;
                }
            }
        }
        if (counter == 11)
            System.out.println("phone number");
        else
            System.out.println("not a phone number");
    }
}
