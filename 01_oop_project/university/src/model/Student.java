package model;

public class Student extends Person {

    public Student(String firstname,
                   String lastname,
                   String nationalCode,
                   String password) {
        super(firstname, lastname, nationalCode, password);
    }

    @Override
    public String toString() {
        return "Student is: \n" + super.toString();
    }
}
