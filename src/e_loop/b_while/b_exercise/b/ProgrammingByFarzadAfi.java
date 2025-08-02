package e_loop.b_while.b_exercise.b;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        while (i <= 100) {
            result += i;
            i++;
        }
        System.out.println("result is: " + result);
    }
}
