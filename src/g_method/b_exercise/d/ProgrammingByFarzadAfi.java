package g_method.b_exercise.d;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        int number = calculator(2, 2, 'a');
        System.out.println(number);
    }

    public static int calculator(int firstNumber, int secondNumber, char operation) {
        if (operation == '+') {
            int result = firstNumber + secondNumber;
            return result;
        } else if (operation == '-') {
            int result = firstNumber - secondNumber;
            return result;
        } else
            return -1;
    }
}
