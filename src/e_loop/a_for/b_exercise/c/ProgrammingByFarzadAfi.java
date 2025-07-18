package e_loop.a_for.b_exercise.c;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:");
        int number = scanner.nextInt();

        for(int i = 1;i <= 4;i++)
            number *= 2;

        System.out.println(number);
    }
}
