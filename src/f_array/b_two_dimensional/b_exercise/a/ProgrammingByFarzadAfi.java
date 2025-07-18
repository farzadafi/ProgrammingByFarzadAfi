package f_array.b_two_dimensional.b_exercise.a;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " row:");
            for (int j = 0; j < array.length; j++) {
                System.out.println("Please enter number:");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            for (int j = 1; j < array.length; j++) {
                if(array[i][j] > max)
                    max = array[i][j];
            }
            System.out.println("for " + i + " max number is:" + max);
        }
    }
}
