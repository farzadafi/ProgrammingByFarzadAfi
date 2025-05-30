package k_oop.f_exercise;

public class Course {
    private final String courseName = "programming";
    private Student[] students = new Student[100];

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void addSomeStudent() {
        Student student1 = new Student(1, "farzad");
        Student student2 = new Student(2, "farhad");
        Student student3 = new Student(3, "farshad");
        Student student4 = new Student(4, "naser");
        Student student5 = new Student(5, "ghasem");

        student1.setGrade(19.25f);
        student2.setGrade(19.75f);
        student3.setGrade(11.25f);
        student4.setGrade(11.25f);
        student5.setGrade(11.25f);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
    }

    public void printCourseReport() {
        int counter = 0;
        while (students[counter] != null) {
            System.out.println("student name: " + students[counter].getName() +
                    " student grade is: " + students[counter].getGrade());
            ++counter;
        }
        float average = getAverage();
        System.out.println(this.courseName + " average is:" + average);
    }

    public float getAverage() {
        int counter = 0;
        float grade = 0;
        while (students[counter] != null) {
            grade += students[counter].getGrade();
            ++counter;
        }
        float average = grade / counter;
        return average;
    }

    public Student findTopStudent() {
        int counter = 0;
        Student student = students[0];
        while (students[counter] != null) {
            if (students[counter].getGrade() > student.getGrade()) {
                student = students[counter];
            }
            ++counter;
        }
        return student;
    }

    public Student findBadStudent() {
        int counter = 0;
        Student student = students[0];
        while (students[counter] != null) {
            if (students[counter].getGrade() < student.getGrade()) {
                student = students[counter];
            }
            ++counter;
        }
        return student;
    }

    public Student findStudentById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null)
                return null;
            else if (students[i].getId() == id)
                return students[i];
        }
        return null;
    }

    public void removeById(int id) {
        int i;
        for (i = 0; i < students.length; i++) {
            if(students[i] != null && students[i].getId() == id) {
                students[i] = null;
                break;
            }
        }
        for (int j = i; j < students.length - 1; j++) {
            if(students[j + 1] != null) {
                students[j] = students[j + 1];
                students[j + 1] = null;
            }
        }
    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(i + " " + students[i]);
        }
    }
}
