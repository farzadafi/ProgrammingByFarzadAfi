package d_condition.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if(firstNumber == 1) {
            if (secondNumber == 2) {
                if(true)
                    System.out.println('A');
                else
                    System.out.println('Q');
            }
            else
                System.out.println('C');
        }else
            System.out.println('Z');
    }
}
