package j_oop.a_inheretance.person;

public class Person {
    String firstname;
    String lastname;
    int age;
    String nationalCode;

    void test() {
        System.out.println("test");
    }

    protected void print(String test) {
        System.out.println("this is a person class");
    }

    public Person(String firstname, String lastname, int age, String nationalCode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.nationalCode = nationalCode;
    }
}
