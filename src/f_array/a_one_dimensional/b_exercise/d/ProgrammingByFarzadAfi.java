package f_array.a_one_dimensional.b_exercise.d;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
       int[] array = new int[3];
       Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number:");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
                System.out.println(array[i]);
        }
    }
}
