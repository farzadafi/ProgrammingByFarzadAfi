package g_method.b_exercise.e;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        //without method 51 line
        //with method 42
        int[] firstArray = getArray(1);
        int[] secondArray = getArray(2);
        int[] thirdArray = getArray(3);
/**/
        int resultAdditionOfFirstArray = getResultAdditionNumberOfArray(firstArray);
        int resultAdditionOfSecondArray = getResultAdditionNumberOfArray(secondArray);
        int resultAdditionOfThirdArray = getResultAdditionNumberOfArray(thirdArray);

        if(resultAdditionOfFirstArray == resultAdditionOfSecondArray &&
                resultAdditionOfFirstArray == resultAdditionOfThirdArray)
            System.out.println("array are the same");
        else
            System.out.println("not same");
    }

    public static int[] getArray(int numberArray) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println(numberArray + " array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number-" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int getResultAdditionNumberOfArray(int[] array) {
        int result= 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
}
