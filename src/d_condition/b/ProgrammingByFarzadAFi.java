package d_condition.b;

import java.util.Scanner;

public class ProgrammingByFarzadAFi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

//        if (number == 1)
//            System.out.println("Saturday");
//        else if (number == 2)
//            System.out.println("Sunday");
//        else if (number == 3)
//            System.out.println("Monday");
//        else if (number == 4)
//            System.out.println("Tuesday");
//        else if (number == 5)
//            System.out.println("Wednesday");
//        else if (number == 6)
//            System.out.println("Thursday");
//        else
//            System.out.println("Friday");

        switch (number) {
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            case 3 -> {
                System.out.println("Monday");
                System.out.println("Monday");
            }
            case 4 -> System.out.println("Tuesday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Friday");
            default -> System.out.println("Please enter a valid number");
        }

//        if (number == 1)
//            System.out.println("Saturday");
//        if (number == 2)
//            System.out.println("Sunday");
//        if (number == 3)
//            System.out.println("Monday");
//        if (number == 4)
//            System.out.println("Tuesday");
//        if (number == 5)
//            System.out.println("Wednesday");
//        if (number == 6)
//            System.out.println("Thursday");
//        if (number == 7)
//            System.out.println("Friday");
    }
}
