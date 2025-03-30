package d_condition.c_exercise.b;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        int result = number % 2;
        System.out.println("mod is : " + result);
        boolean bool = result == 0;
        System.out.println("bool is " + bool);
        if(bool)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
