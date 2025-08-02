package e_loop.a_for.b_exercise.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:");
        int number = scanner.nextInt();

        for(int i = 1;i <= number;i++)
            System.out.println(i + "-Hello");
    }
}
