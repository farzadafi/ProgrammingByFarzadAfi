package h_string.b_exercise.b;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string:");
        String str = scanner.next();

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
//            if(!isAddBefore(newStr, ch))
            if(!newStr.contains(String.valueOf(ch)))
                newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }

    public static boolean isAddBefore(String str, char ch) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                result = true;
                break;
            }
        }
        return result;
    }
}
