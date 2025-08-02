package f_array.b_two_dimensional.b_exercise.b;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
       int[][] array = new int[3][3];
       Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " row:");
            for (int j = 0; j < array.length; j++) {
                System.out.println("Please enter number:");
                array[i][j] = scanner.nextInt();
            }
        }

        int allNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                allNumber += array[i][j];
            }
        }
        System.out.println("result of all number is:" + allNumber);

        for (int i = 0; i < array.length; i++) {
            int result = 0;
            for (int j = 0; j < array.length; j++) {
                result += array[i][j];
            }
            System.out.println("result for " + i + " is:" + result);
        }
    }
}
