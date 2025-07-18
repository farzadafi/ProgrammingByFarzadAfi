package f_array.a_one_dimensional.b_exercise.b;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number-" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }

        System.out.println("max number is=" + max);
    }
}
