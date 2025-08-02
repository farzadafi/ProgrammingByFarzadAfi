package l_oop.d_interface;

public interface Fly {
    void fly();

    default int test() {
        return 0;
    }
}
