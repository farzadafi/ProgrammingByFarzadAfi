package f_array.a_one_dimensional.b_exercise.i;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number:");
            array[i] = scanner.nextInt();
        }

        int counterOfOddNumber = 0;
        int counterOfEvenNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
                ++counterOfEvenNumber;
            else
                ++counterOfOddNumber;
        }

        System.out.println(counterOfEvenNumber + " of even number");
        System.out.println(counterOfOddNumber + " of odd number");
    }
}
