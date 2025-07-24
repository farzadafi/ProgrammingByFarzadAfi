package o_garbagecollector;

import java.util.Scanner;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        print();
//        ...
//        test();

        for(;;){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter");
            scanner.nextLine();
            for (int i = 0; i < 10_000_000; i++) {
                test1(i);
            }
        }
    }

    public static void print() {
        Person person = new Person("farzad");
        person.printName();
        person = new Person("test");
    }

    public static void test() {
        DynamicArray dynamicArray = new DynamicArray("Person");
        for (int i = 0; i < 900_000_000; i++) {
            dynamicArray.add(new Person("Person" + i));
        }
    }

    public static void test1(int i) {
        String s = i + "test";
        System.out.println(s);
    }
}
