package e_loop.f_nestedLoop.b_exercise.b;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
         // *
         // * *
         // * * *
         // * * * *

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
