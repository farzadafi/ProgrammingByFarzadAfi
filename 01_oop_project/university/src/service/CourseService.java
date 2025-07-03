package service;

import model.Course;
import repository.CourseRepository;

public class CourseService {

    private final CourseRepository courseRepository = new CourseRepository();

    public boolean add(Course course) {
        boolean duplicateCourse = courseRepository.isDuplicateCourse(course.getName());
        if (duplicateCourse)
            return false;
        courseRepository.add(course);
        return true;
    }

    public Course[] getAllCourses() {
        int numberOfCourses = courseRepository.getNumberOfCources();
        return courseRepository.getCourseByNumber(numberOfCourses);
    }
}
