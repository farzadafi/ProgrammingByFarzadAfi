package k_oop.f_exercise;

public class Student {
    private int id;
    private float grade;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setGrade(float grade) {
        if (grade <= 20 && grade >= 0)
            this.grade = grade;
        else
            this.grade = 0;
    }

    public float getGrade() {
        return this.grade;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public char getLetterGrade() {
        if (grade <= 20 && grade >= 17)
            return 'A';
        if (grade < 17 && grade >= 14)
            return 'B';
        else
            return 'C';
    }

    public void printInfo() {
        System.out.println("id is:" + id);
        System.out.println("name is:" + name);
        System.out.println("grade is:" + grade);
    }

    public void updateGrade(float newGrade) {
        if ((newGrade > 20) || (newGrade < 0)) {
            System.out.println("grade is not correct");
            return;
        }
        if(newGrade < grade) {
            System.out.println("new grade must bigger than grade");
            return;
        }
        grade = newGrade;
        System.out.println("grade updated successfully");
    }
}
