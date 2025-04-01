package f_array.a_one_dimensional.b_exercise.g;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
       int[] array = new int[5];
       Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter number:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Please enter number for search:");
        int key = scanner.nextInt();

        boolean bool = false;
        int indexNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                bool = true;
                indexNumber = i;
                break;
            }
        }
        if(bool)
            System.out.println(key + "found in index " + indexNumber);
        else
            System.out.println(-1);
    }
}
