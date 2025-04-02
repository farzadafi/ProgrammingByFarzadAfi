package g_method.a_teach.b;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int[] firstArray = createArray(1);
        int[] secondArray = createArray(2);

        printArray(1, firstArray);
        printArray(2, secondArray);

        System.out.println("finish");
    }

    public static int[] createArray(int numberArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a length for array " + numberArray + ":");
        int lengthOfFirstArray = scanner.nextInt();
        int[] array = new int[lengthOfFirstArray];

        System.out.println("enter number for " + numberArray + " array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("please enter number-" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int numberArray, int[] array) {
        System.out.println(numberArray + " array number are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
