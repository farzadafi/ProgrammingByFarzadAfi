package k_oop.e_polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog()
        };

        System.out.println(animals.length);

//        for (int i = 0; i < animals.length; i++) {
//            if(animals[i] instanceof Dog)
//                System.out.println("dog object");
//            else
//                System.out.println("cat object");
//        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat();
        }
    }
}
