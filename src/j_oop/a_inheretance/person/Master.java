package j_oop.a_inheretance.person;

public class Master extends Person {
    String masterCode;
    long salary;

    public Master(String firstname,
                   String lastname,
                   int age,
                   String nationalCode,
                   String masterCode,
                  long salary) {
        super(firstname, lastname, age, nationalCode);
        this.masterCode = masterCode;
        this.salary = salary;
    }

    public long calcSalary() {
        return 0;
    }

    // student is a person? yes
    // student is a table? no
}
