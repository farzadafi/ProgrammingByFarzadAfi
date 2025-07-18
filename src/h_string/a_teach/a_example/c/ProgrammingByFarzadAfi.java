package h_string.a_teach.a_example.c;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter string:");
        String str = scanner.nextLine();

        System.out.println("Please enter subString:");
        String subString = scanner.nextLine();

        if(subString.length() > str.length())
            System.out.println("not");
        else {
            boolean bool = isStartWith(str, subString);
            if(bool)
                System.out.println("start with");
            else
                System.out.println("not start with");
        }
    }

    public static boolean isStartWith(String string, String subString) {
        boolean bool = true;
        for (int i = 0; i < subString.length(); i++) {
            if(string.charAt(i) != subString.charAt(i)) {
                bool = false;
                break;
            }
        }
        return bool;
    }
}
