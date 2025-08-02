package h_string.a_teach.a_example.b;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first string:");
        String str1 = scanner.nextLine();

        System.out.println("Please enter second string:");
        String str2 = scanner.nextLine();

        if(str1.length() != str2.length())
            System.out.println("not equal!");
        else {
            boolean bool = isEqualString(str1, str2);
            if (bool)
                System.out.println("equal");
            else
                System.out.println("not equal");
        }
    }

    public static boolean isEqualString(String str1, String str2) {
        boolean bool = true;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                bool = false;
                break;
            }
        }
        return bool;
    }
}
