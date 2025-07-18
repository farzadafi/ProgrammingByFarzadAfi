package f_array.a_one_dimensional.a_teach;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
//        int age1 = 10;
//        int age2 = 20;
//        int age3 = 30;
//        int age4 = 40;
//        int age5 = 50;
//        int age6 = 60;
//
//        int[] age = {10, 20, 30, 40, 50, 60};
//        int[] score = new int[3];
//
//        score[0] = 10;
//        score[1] = 20;
//        score[2] = 30;
//        score[3] = 10;
//
////        System.out.println(age[4]);
//        for (int i = 0; i < 6; i++) {
//            System.out.println(age[i]);
//        }

        Scanner scanner = new Scanner(System.in);
        int[] score = new int[3];

        for (int i = 0; i < score.length; i++) {
            System.out.println("i is:" + i);
            System.out.println("Please enter score-" + (i + 1) + ":");
            score[i] = scanner.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}
