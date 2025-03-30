package d_condition.c_exercise.d;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Please enter third number:");
        int thirdNumber = scanner.nextInt();

        int result = firstNumber + secondNumber + thirdNumber;
        int average = result / 3;

        if(average <= 20 && average >= 17)
            System.out.println('A');
        else if(average < 17 && average >= 14)
            System.out.println('B');
        else
            System.out.println('C');
    }
}