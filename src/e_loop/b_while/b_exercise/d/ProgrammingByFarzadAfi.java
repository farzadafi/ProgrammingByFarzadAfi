package e_loop.b_while.b_exercise.d;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number you want to enter:");
        int numberOfInput = scanner.nextInt();

        int i = 1;
        int result = 0;
        while(i <= numberOfInput){
            System.out.println("Please enter number:");
            int number = scanner.nextInt();
            if(number % 2 == 0)
                result += number; // result = result + number;
            i++;
        }
        System.out.println("result is: " + result);
    }
}
