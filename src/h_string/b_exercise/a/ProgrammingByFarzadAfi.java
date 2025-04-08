package h_string.b_exercise.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String str = scanner.next();

//        char[] array = str.toCharArray();
//        String newStr = "";
//
//        for (int i = array.length -1; i >= 0 ; i--) {
//            newStr += array[i];
//        }
//
//        System.out.println(newStr);
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
       /**/ }
        System.out.println(newStr);
    }
}
