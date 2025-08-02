package i_oop.e.scope;

public class Main {
    public void test(String name) {
       String lastname = "afshar";
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
            System.out.println(lastname);
        }
        System.out.println(name);
        System.out.println(lastname);
    }

    public void test1() {
            int number = 10;
            System.out.println(number);
        System.out.println(number);
    }

    public void test2() {
        for (int i = 0; i < 10; i++) {
            int number = i + 10;
        }

//        System.out.println(number);
//
        if(true) {
            int number1 = 10;
        }
//        System.out.println(number1);
    }
}
