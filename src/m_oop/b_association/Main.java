package m_oop.b_association;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("e1");
        Employee em2 = new Employee("e2");

        Bank bank = new Bank("b");
        bank.addEmploye(em1, 0);
        bank.addEmploye(em2, 1);

    }
}
