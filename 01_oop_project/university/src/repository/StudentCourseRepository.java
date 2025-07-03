package repository;

import model.StudentCourse;

public class StudentCourseRepository {

    private static final StudentCourse[] STUDENT_COURSE = new StudentCourse[100];

    public void add(StudentCourse studentCourse) {
        for (int i = 0; i < STUDENT_COURSE.length; i++) {
            if (STUDENT_COURSE[i] == null) {
                STUDENT_COURSE[i] = studentCourse;
                break;
            }
        }
    }

    public int getNumberOfRegisterStudentCourse(int code) {
        int count = 0;
        for (int i = 0; i < STUDENT_COURSE.length; i++) {
            StudentCourse sc = STUDENT_COURSE[i];
            if(sc != null && sc.getCourseCode() == code)
                ++count;
        }
        return count;
    }
}
