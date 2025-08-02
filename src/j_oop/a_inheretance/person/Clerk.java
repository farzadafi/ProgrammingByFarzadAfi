package j_oop.a_inheretance.person;

public class Clerk extends Person {
    String clerkCode;

    public Clerk(String firstname,
                   String lastname,
                   int age,
                   String nationalCode,
                   String clerkCode) {
        super(firstname, lastname, age, nationalCode);
        this.clerkCode = clerkCode;
    }
}
