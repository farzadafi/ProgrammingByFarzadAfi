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
}
