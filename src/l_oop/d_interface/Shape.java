package l_oop.d_interface;

public interface Shape {
    int TEST = 0;

    int test1();

    private int test2() {
        int result = test3() ;
        return 0 + result;
    }

    private int test3() {
        return 0;
    }
}
