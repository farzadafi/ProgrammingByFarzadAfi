package h_string.b_exercise.c;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        System.out.println(Character.isLowerCase('A'));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String str = scanner.next();

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
//            if(isDigit(str.charAt(i)))
            if(Character.isDigit(str.charAt(i)))
                newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }

    public static boolean isNumber(char ch) {
        if (
                ch == '0' || ch == '1' ||
                        ch == '2' || ch == '3' ||
                        ch == '4' || ch == '5' ||
                        ch == '6' || ch == '7' ||
                        ch == '8' || ch == '9'
        )
            return true;
        return false;
    }

    public static boolean isDigit(char ch) {
        char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < array.length; i++) {
            if(array[i] == ch)
                return true;
        }
        return false;
    }
}
