package g_method.b_exercise.a;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int result = isEven(25);
        System.out.println(result);
    }

    public static int isEven(int number) {
        if(number % 2 == 0)
            return 2;
        else
            return 1;
    }
}
