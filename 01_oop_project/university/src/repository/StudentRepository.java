package repository;

import model.Student;

public class StudentRepository {

    private final Student[] students = new Student[100];

    public void register(Student student) {
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
}
