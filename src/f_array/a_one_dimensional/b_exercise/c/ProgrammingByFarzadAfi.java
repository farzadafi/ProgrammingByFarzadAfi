package f_array.a_one_dimensional.b_exercise.c;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
       int[] array = new int[5];
       Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number-" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i]; // result = result + array[i]
        }

        System.out.println("result is=" + result);
    }
}
