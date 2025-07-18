package l_oop.a_abstractclass;

public abstract class Shape {

    Shape() {
        System.out.println("shape is created");
    }

    abstract void draw();

    public void test() {
        System.out.println("test");
    }

    public static void test1() {
        System.out.println("test1");
    }
}
