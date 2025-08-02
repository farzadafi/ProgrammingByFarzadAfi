package h_string.a_teach.a_example.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String str = scanner.nextLine();

        boolean isContain = containAChar(str);
        if(isContain)
            System.out.println("contain a character");
        else
            System.out.println("doesn't have a character");
    }

    public static boolean containAChar(String str) {
        char[] array = str.toCharArray();
        boolean isContain = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 'a') {
                isContain = true;
                break;
            }
        }
        return isContain;
    }
}
