package e_loop.a_for.b_exercise.b;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        for(int i = 0;i <= number;i++)
            System.out.println(i);
    }
}
