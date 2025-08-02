package m_oop.b_association;

public class Bank {
    private String bankName;
    private Employee[] employees = new Employee[10];

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addEmploye(Employee employee, int index) {
       employees[index] = employee;
    }
}
