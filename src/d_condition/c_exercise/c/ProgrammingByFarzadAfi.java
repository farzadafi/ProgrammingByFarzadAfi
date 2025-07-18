package d_condition.c_exercise.c;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;
        if(result > 20)
            System.out.println(result);
        else{
            System.out.println("Please enter third number:");
            int thirdNumber = scanner.nextInt();
            result += thirdNumber;
            System.out.println(result);
        }
    }
}
