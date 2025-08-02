package d_condition.c_exercise.e;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

//        if(number == 1 || number == 2 || number == 3)
//            System.out.println("Spring");
//        else if(number == 4 || number == 5 || number == 6)
//            System.out.println("Summer");
//        else if(number == 7 || number == 8 || number == 9)
//            System.out.println("Autumn");
//        else if(number == 10 || number == 11 || number == 12)
//            System.out.println("Winter");
//        else
//            System.out.println("Please enter a correct number(1-12)");

        switch(number) {
            case 1, 2, 3 -> System.out.println("Spring");
            case 4, 5, 6 -> System.out.println("Summer");
            case 7, 8, 9 -> System.out.println("Autumn");
            case 10, 11, 12 -> System.out.println("Winter");
            default -> System.out.println("Please enter correct number(1-12");
        }
    }
}
