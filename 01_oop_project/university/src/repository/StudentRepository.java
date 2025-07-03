package repository;

import model.Student;

public class StudentRepository {

    private final static Student[] students = new Student[100];

    public void register(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void acceptStudent(String nationalCode) {
        int i;
        for (i = 0; i < students.length; i++) {
            if (students[i].getNationalCode().equals(nationalCode))
                break;
        }
        students[i].setAccepted(true);
    }

    public Student findStudentByNationalCode(String nationalCode) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null &&
                    students[i].getNationalCode().equals(nationalCode))
                return students[i];
        }
        return null;
    }

    public void updateFirstname(String nationalCode, String firstname) {
        int i;
        for (i = 0; i < students.length; i++) {
            if (students[i].getNationalCode().equals(nationalCode))
                break;
        }
        students[i].setFirstname(firstname);
    }
}
