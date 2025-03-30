package e_loop.a_for.b_exercise.e;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number:");
        int number = scanner.nextInt();

//        for(int i = 1;i <= number;i++)
//            if(i % 2 == 0)
//                System.out.println(i);

        for(int i = 2;i <= number;i += 2)
            System.out.println(i);
    }
}
