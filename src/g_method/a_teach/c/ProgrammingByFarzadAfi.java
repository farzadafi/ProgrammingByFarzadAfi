package g_method.a_teach.c;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int[] array = getArray();

        findMinNumber(array);
        findMaxNumber(array);

        int resultAddition = calculateAddition(array);
        System.out.println("result addition is:" + resultAddition);

        int countOfEvenNumber = countOfEvenNumber(array);
        System.out.println("counter of even number is:" + countOfEvenNumber);
    }

    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number-" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber)
                minNumber = array[i];
        }
        System.out.println("min number is:" + minNumber);
    }

    public static void findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber)
                maxNumber = array[i];
        }
        System.out.println("max number is:" + maxNumber);
    }

    public static int calculateAddition(int[] array) {
        int resultAddition = 0;
        for (int i = 0; i < array.length; i++) {
            resultAddition += array[i];
        }
        return resultAddition;
    }

    public static int countOfEvenNumber(int[] array) {
        int countOfEvenNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                ++countOfEvenNumber;
        }
        return countOfEvenNumber;
    }
}
