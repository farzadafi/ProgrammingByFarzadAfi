package e_loop.a_for.b_exercise.h;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number:");
            int number = scanner.nextInt();
            if(number % 2 == 0)
                ++counter;
        }
        System.out.println("even number counter is: " + counter);
    }
}
