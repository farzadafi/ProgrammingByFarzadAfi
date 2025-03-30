package a_variable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte byteNumber = 50;
        System.out.println(byteNumber);

        short shortNumber = 1000;
        System.out.println(shortNumber);

        int intNumber = 2000000;
        System.out.println(intNumber);

        int userNumber;
        Scanner scanner = new Scanner(System.in);
        userNumber = scanner.nextInt();
        System.out.println(userNumber);

        boolean t = true;
        boolean f = false;

        char ch = 'F';
        char cha = 'f';
    }
}