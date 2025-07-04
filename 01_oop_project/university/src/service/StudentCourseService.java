package service;

import model.StudentCourse;
import repository.StudentCourseRepository;

public class StudentCourseService {

    private final CourseService courseService = new CourseService();
    private final StudentCourseRepository studentCourseRepository = new StudentCourseRepository();

    public boolean add(StudentCourse studentCourse) {
        int capacityByCode = courseService.getCapacityByCode(studentCourse.getCourseCode());
        int numberOfRegisterStudentCourse
                = studentCourseRepository.
                getNumberOfRegisterStudentCourse(studentCourse.getCourseCode());
        if(numberOfRegisterStudentCourse == capacityByCode)
            return false;
        studentCourseRepository.add(studentCourse);
        return true;
    }

    public int[] getNumbersOfStudentCourseCode(String nationalCode) {
        int number = studentCourseRepository.countOfNumberStudentCourseCode(nationalCode);
        return studentCourseRepository.getNumbersStudentCourseCode(nationalCode, number);
    }

    public boolean setGrade(String nationalCode,
                         int courseCode,
                         int grade) {
        boolean result =
                studentCourseRepository.isNationalCodeHasCourse(nationalCode, courseCode);
        if(!result)
            return false;
        studentCourseRepository.setGradeWithNationalCodeAndCourseCode(nationalCode, courseCode, grade);
        return true;
    }
}
