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
            if (sc != null && sc.getCourseCode() == code)
                ++count;
        }
        return count;
    }

    public int[] getNumbersStudentCourseCode(String nationalCode, int number) {
        int[] courseCode = new int[number];
        int counterOfCourseCode = 0;
        for (int i = 0; i < STUDENT_COURSE.length; i++) {
            StudentCourse sc = STUDENT_COURSE[i];
            if (sc != null && sc.getNationalCode().equals(nationalCode)) {
                courseCode[counterOfCourseCode] = sc.getCourseCode();
                ++counterOfCourseCode;
            }
        }
        return courseCode;
    }

    public int countOfNumberStudentCourseCode(String nationalCode) {
        int count = 0;
        for (int i = 0; i < STUDENT_COURSE.length; i++) {
            StudentCourse sc = STUDENT_COURSE[i];
            if (sc != null && sc.getNationalCode().equals(nationalCode))
                ++count;
        }
        return count;
    }

    public boolean isNationalCodeHasCourse(String nationalCode,
                                           int courseCode) {
        for (int i = 0; i < STUDENT_COURSE.length; i++) {
            StudentCourse sc = STUDENT_COURSE[i];
            if (sc != null &&
                    sc.getNationalCode().equals(nationalCode) &&
                    sc.getCourseCode() == courseCode)
                return true;
        }
        return false;
    }

    public void setGradeWithNationalCodeAndCourseCode(String nationalCode,
                                                      int courseCode,
                                                      int grade) {
        int i;
        for (i = 0; i < STUDENT_COURSE.length; i++) {
            StudentCourse sc = STUDENT_COURSE[i];
            if (sc != null && sc.getNationalCode().equals(nationalCode) && sc.getCourseCode() == courseCode)
                break;
        }
        STUDENT_COURSE[i].setGrade(grade);
    }
}
/**/