package repository;

import model.Student;

public class StudentRepository {

    public final static Student[] STUDENTS = new Student[100];

    public void register(Student student) {
        for (int i = 0; i < STUDENTS.length; i++) {
            if (STUDENTS[i] == null) {
                STUDENTS[i] = student;
                break;
            }
        }
    }

    public void acceptStudent(String nationalCode) {
        int i;
        for (i = 0; i < STUDENTS.length; i++) {
            if (STUDENTS[i].getNationalCode().equals(nationalCode))
                break;
        }
        STUDENTS[i].setAccepted(true);
    }

    public Student findStudentByNationalCode(String nationalCode) {
        for (int i = 0; i < STUDENTS.length; i++) {
            if (STUDENTS[i] != null &&
                    STUDENTS[i].getNationalCode().equals(nationalCode))
                return STUDENTS[i];
        }
        return null;
    }

    public void updateFirstname(String nationalCode, String firstname) {
        int i;
        for (i = 0; i < STUDENTS.length; i++) {
            if (STUDENTS[i].getNationalCode().equals(nationalCode))
                break;
        }
        STUDENTS[i].setFirstname(firstname);
    }

    public int getNumberOfStudent() {
        int count = 0;
        for (int i = 0; i < STUDENTS.length; i++) {
            if (STUDENTS[i] != null)
                ++count;
        }
        return count;
    }

    public Student[] getStudentByNumber(int numberOfStudent) {
        Student[] students = new Student[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++) {
            students[i] = STUDENTS[i];
        }
        return students;
    }
}
