package f_array.a_one_dimensional.b_exercise.j;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int[] firstArray = new int[3];
        int[] secondArray = new int[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("first array number:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Please enter number:");
            firstArray[i] = scanner.nextInt();
        }

        System.out.println("second array number:");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println("Please enter number:");
            secondArray[i] = scanner.nextInt();
        }

        boolean bool = true;
        for (int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] != secondArray[i]) {
                bool = false;
                break;
            }
        }

        if(bool)
            System.out.println("arrays are the same");
        else
            System.out.println("arrays not the same");
    }
}
