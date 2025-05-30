package i_oop.g_exercise.c;

public class BankAccount {
    String firstname;
    String lastname;
    double balance;

    public BankAccount(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = 0;
    }

    public String getFullName() {
        String fullName = firstname + " " + lastname;
        return fullName;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > balance)
            System.out.println("balance insufficient");
        else
            balance -= amount;
    }

    public void display() {
        System.out.println(this.getFullName() + " balance is:" + this.balance);
    }
}
