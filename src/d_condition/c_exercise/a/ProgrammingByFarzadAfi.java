package d_condition.c_exercise.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        if (number > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}
