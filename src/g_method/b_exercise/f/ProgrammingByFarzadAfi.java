package g_method.b_exercise.f;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int[] array = getArray();

        for (int i = 0; i < array.length; i++) {
            boolean result = isPrimeNumber(array[i]);
            if (result)
                System.out.println(array[i] + " is a prime number");
            else
                System.out.println(array[i] + " is not a prime number");
        }
    }

    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number-" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static boolean isPrimeNumber(int number) {
        int counter = 0;
        for (int j = 1; j <= number; j++) {
            if (number % j == 0)
                ++counter;
        }
        if (counter == 2)
            return true;
        else
            return false;
    }
}
