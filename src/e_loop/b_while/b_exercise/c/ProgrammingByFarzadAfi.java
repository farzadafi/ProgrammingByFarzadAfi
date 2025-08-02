package e_loop.b_while.b_exercise.c;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int max = 0;
        while(i < 5){
            System.out.println("Please enter number:");
            int number = scanner.nextInt();
            if(number > max)
                max = number;
            i++;
        }
        System.out.println("max number is:" + max);
    }
}
