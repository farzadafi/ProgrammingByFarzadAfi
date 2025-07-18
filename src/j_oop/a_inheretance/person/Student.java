package j_oop.a_inheretance.person;

public class Student extends Person {
    String studentCode;

    public int calcScore() {
        super.test();
        return 0;
    }

    @Override
    public void print(String test) {
        System.out.println("this is a student class");
    }

    public Student(String firstname, String lastname, int age, String nationalCode, String studentCode) {
        super(firstname, lastname, age, nationalCode);
        this.studentCode = studentCode;
    }
}
