package c_operator.exercise;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        // first exercise
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println(++number);

        //exercise 2
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if(number == 2){
//            System.out.println('A');
//        }else{
//            System.out.println('B');
//        }

        //exercise 3
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber =  scanner.nextInt();
//        int secondNumber = scanner.nextInt();
//
//        if(firstNumber > secondNumber){
//            System.out.println('g');
//        }else {
//            System.out.println('l');
//        }

//        // exercise 4
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        int secondNumber = scanner.nextInt();
//        int thirdNumber = scanner.nextInt();
//
//        if ((firstNumber > 100) || (secondNumber > 100) || (thirdNumber > 100)) {
//            System.out.println('A');
//        } else {
//            System.out.println('B');
//        }

//         exercise 5
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        int secondNumber = scanner.nextInt();
//        int thirdNumber = scanner.nextInt();
//
//        if(firstNumber > 20 && secondNumber > 20 && thirdNumber > 20) {
//            System.out.println('A');
//        }else {
//            System.out.println('B');
//        }

        //exercise 6
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber))
            System.out.println('A');
        if ((secondNumber > firstNumber) && (secondNumber > thirdNumber))
            System.out.println('B');
        if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber))
            System.out.println('C');
    }
}
