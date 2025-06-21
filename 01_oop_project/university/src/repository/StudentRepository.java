package repository;

import model.Student;

public class StudentRepository {
    private final Student[] students = new Student[100];

    public StudentRepository() {
        students[0] = new Student("farzad", "afshar",
                "308", "1111");
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public Student[] getAllInactiveStudent() {
        Student[] inactiveStudent = new Student[100];
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null)
                break;
            else if(!students[i].isActive()) {
                inactiveStudent[counter] = students[i];
                ++counter;
            }
        }
        return inactiveStudent;
    }

    public void activeStudentByNationalCode(String nationalCode) {
        Student student = null;
        int i;
        for (i = 0; i < students.length; i++) {
            if(students[i] != null && students[i].getNationalCode().equals(nationalCode)) {
                student = students[i];
                break;
            }
        }
        if(student != null)
            student.setActive(true);
    }
}
