package e_loop.b_while.b_exercise.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:");
        int number = scanner.nextInt();

        int i = 0;
        while (i < number) {
            System.out.println("Hello");
            i++;
        }
    }
}
