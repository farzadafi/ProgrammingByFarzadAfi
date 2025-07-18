package e_loop.c_dowhile.b_exercise.b;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int number;
        do {
            System.out.println("Please enter number:");
            number = scanner.nextInt();
            result += number; // result = result + number;
        } while (number != 0);
        System.out.println("result is:" + result);
    }
}
