package e_loop.e_continueBreak;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        for(;;){
//            System.out.println("Please enter number:");
//            int number = scanner.nextInt();
//            if(number == 0)
//                break;
//            System.out.println(number);
//        }

//        while (true){
//            System.out.println("Please enter number:");
//            int number = scanner.nextInt();
//            if(number == 0)
//                break;
//            System.out.println(number);
//        }
        for (int i = 1; i <= 10; i++) {
//            if(i % 2 == 0)
//                System.out.println(i);
            if(i % 2 == 1)
                continue;
            System.out.println(i);
        }
    }
}
