package e_loop.a_for.b_exercise.i;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number you want to enter:");
        int numberOfInput = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= numberOfInput; i++) {
            System.out.println("Enter number-" + i + ":");
            int number = scanner.nextInt();
            if (number % 2 == 1)
                result += number;
        }
        System.out.println("result is: " + result);
    }
}
