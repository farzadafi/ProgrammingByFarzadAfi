package i_oop.g_exercise.c;

public class Main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("farzad", "afshar");
        System.out.println("new account:");
        a.display();
        a.deposit(50000);

        System.out.println("\n account after 50_000 deposit");
        a.display();
        a.withdraw(20000);
        System.out.println("\n account after 20_000 withdraw");
        a.display();
        System.out.println("\n account after a huge withdraw");
        a.withdraw(1000000);
    }
}
