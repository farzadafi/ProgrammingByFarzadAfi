package k_oop.b_primitive_casting;

public class Main {
    public static void main(String[] args) {
        int myInt = 127;
        long myLong = myInt;

        double myDouble = 10_000_000_000_000_000_000d;
        float test = 10_000_000_000_000_000f;
        int intTest = (int) myDouble;
        System.out.println(intTest);
    }
}
