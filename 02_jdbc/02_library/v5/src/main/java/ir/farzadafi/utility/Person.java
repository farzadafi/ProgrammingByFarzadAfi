package ir.farzadafi.utility;

import lombok.Setter;

@Setter
public class Person {
    private String firstname;
    private String lastname;
    private int age;

    public static final Person TEST = new Person();

    public Person() {
    }

    public static Person getInstanceA(){
        return TEST;
    }

    public static Person getInstance(String firstname, String lastname, int age) {
        Person person = new Person();
        person.setFirstname(firstname);
        person.setLastname(lastname);
        person.setAge(age);
        return person;
    }

    public static Person getInstanceAndCheckAge(String firstname, String lastname, int age) {
        Person person = new Person();
        person.setFirstname(firstname);
        person.setLastname(lastname);
        person.setAge(age + 10);
        return person;
    }
}
