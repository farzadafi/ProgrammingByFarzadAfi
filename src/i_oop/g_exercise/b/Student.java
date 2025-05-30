package i_oop.g_exercise.b;

public class Student {
    String fullName;
    int grade1;
    int grade2;

    public Student(String fullName, int grade1, int grade2) {
        this.fullName = fullName;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double getAverage() {
        double average = (this.grade1 + this.grade2) / 2;
        return average;
    }

    public void printStatus() {
        double average = this.getAverage();
        if(average > 12)
            System.out.println(this.fullName + " is passed");
        else
            System.out.println(this.fullName + " is refused");
    }
}
