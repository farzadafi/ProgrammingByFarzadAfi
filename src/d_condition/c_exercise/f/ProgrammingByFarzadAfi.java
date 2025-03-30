package d_condition.c_exercise.f;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        if(firstNumber > secondNumber)
            System.out.println(firstNumber / secondNumber);
        else
            System.out.println(firstNumber * secondNumber);
    }
}
