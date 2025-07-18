package e_loop.a_for.b_exercise.g;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number:");
            int number = scanner.nextInt();
            if (number > max)
                max = number;
        }
        System.out.println("max number is: " + max);
    }
}
