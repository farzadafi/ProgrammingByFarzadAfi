package g_method.a_teach.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:");
        int firstNumber = getIntNumberFromUser(scanner);

        System.out.println("Please enter number:");
        int secondNumber = getIntNumberFromUser(scanner);

        System.out.println("Please enter number:");
        int thirdNumber = getIntNumberFromUser(scanner);

        int result = firstNumber + secondNumber + thirdNumber;
        printNumber(result);
    }

    public static int getIntNumberFromUser(Scanner scanner) {
        System.out.println("Please enter number:");
        int number = scanner.nextInt();
        return number;
    }

    public static void printNumber(int number) {
        System.out.println(number);
    }
}
