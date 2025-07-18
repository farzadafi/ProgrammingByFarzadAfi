package e_loop.c_dowhile.b_exercise.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Please enter number:");
            number = scanner.nextInt();
            System.out.println(number);
        } while (number != 0);
    }
}
