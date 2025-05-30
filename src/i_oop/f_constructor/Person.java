package i_oop.f_constructor;

public class Person {
    String firstname;
    String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
/**/
    public void printFullName(String firstname) {
        System.out.println(firstname + " " + lastname);
    }
}
