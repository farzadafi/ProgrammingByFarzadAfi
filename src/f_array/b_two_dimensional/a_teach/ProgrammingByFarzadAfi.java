package f_array.b_two_dimensional.a_teach;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
//        int[][] array = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };

//        System.out.println(array[1][1]);


        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Please enter number:");
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][/**/j] + " ");
            }
            System.out.println();
        }
    }
}
