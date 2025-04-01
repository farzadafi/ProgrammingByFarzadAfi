package f_array.a_one_dimensional.b_exercise.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number-" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("number is" + array[i]);
            System.out.println("number * 2=" + array[i] * 2);
            System.out.println();
        }
    }
}
