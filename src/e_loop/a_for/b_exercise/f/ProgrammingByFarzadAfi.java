package e_loop.a_for.b_exercise.f;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter number-" + i + ":");
            int number = scanner.nextInt();
            result += number;
        }
        System.out.println("result is: " + result);
    }
}
