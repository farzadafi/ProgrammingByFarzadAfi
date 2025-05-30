package j_oop.b_static;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("f", 10);
        Person.test = "test";
        Person person2 = new Person("a", 11);
        Person person3 = new Person("b", 12);

        System.out.println(person1.firstname);
        System.out.println(person1.test);

        person2.firstname = "ali";
        Person.test = "naser";

        System.out.println(person1.firstname);
        System.out.println(person1.test);
    }
}
