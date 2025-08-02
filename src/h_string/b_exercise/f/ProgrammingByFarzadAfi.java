package h_string.b_exercise.f;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String str = scanner.nextLine();

        int counter = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isSpaceChar(ch))
                ++counter;
        }
        System.out.println(counter);
    }
}
