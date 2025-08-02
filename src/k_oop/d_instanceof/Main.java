package k_oop.d_instanceof;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        if (animal instanceof Lion) {
            Lion lion = (Lion) animal;
            lion.test();
        } else {
            System.out.println("this isn't a lion");
        }
    }
}
