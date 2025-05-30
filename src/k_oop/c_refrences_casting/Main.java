package k_oop.c_refrences_casting;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.meow();
//        Animal animal = cat;
//

        Animal animal = new Cat();
        ( (Cat) animal).meow();
        Cat cat = (Cat) animal;
        cat.meow();
    }
}
