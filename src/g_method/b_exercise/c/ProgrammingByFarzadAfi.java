package g_method.b_exercise.c;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int result = convertToSecond(1);
        System.out.println(result);
    }

    public static int convertToSecond(int minute) {
        int result = minute * 60;
        return result;
    }
}
