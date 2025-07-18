package e_loop.c_dowhile.b_exercise.c;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int number = 569;

       int userNumber;
       do{
           System.out.println("enter your number:");
           userNumber = scanner.nextInt();
           if(userNumber > number)
               System.out.println("Please enter less number");
           else if(userNumber < number)
               System.out.println("Please enter grater number");
       }while (userNumber != number);
        System.out.println("Horaaaaaaaaaaaaaaaa");
    }
}
