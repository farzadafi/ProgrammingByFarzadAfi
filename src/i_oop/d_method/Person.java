package i_oop.d_method;

public class Person {

    public void eat(String firstname, String food) {
        System.out.println(firstname + " eating " + food);
    }

    public void eat(String firstname, int food1) {
        System.out.println(firstname + " eating ");
    }
}
