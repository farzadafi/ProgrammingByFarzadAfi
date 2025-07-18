package i_oop.g_exercise.b;

public class Main {
    public static void main(String[] args) {
        Student farzad = new Student("farzad afshar", 20, 20);
        System.out.println(farzad.getAverage());
        farzad.printStatus();

        Student naser = new Student("naser naseri", 10, 10);
        System.out.println(naser.getAverage());
        naser.printStatus();
    }
}
