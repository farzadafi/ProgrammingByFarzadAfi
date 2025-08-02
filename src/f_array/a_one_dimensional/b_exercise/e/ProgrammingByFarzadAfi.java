package f_array.a_one_dimensional.b_exercise.e;

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
            int counter = 0;
            for (int j = 1; j <= array[i]; j++) {
                if(array[i] % j == 0)
                    ++counter;
            }
            if(counter == 2)
                System.out.println(array[i] + " is a prime number");
        }
    }
}
