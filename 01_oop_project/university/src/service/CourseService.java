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

    public int getCapacityByCode(int code) {
        return courseRepository.getCapacityByCode(code);
    }

    public String[] getNameOfCourseFromCode(int[] courseCode) {
        String[] coursesName = new String[courseCode.length];
        for (int i = 0; i < courseCode.length; i++) {
            String nameByCode = courseRepository.getNameByCode(courseCode[i]);
            coursesName[i] = nameByCode;
        }
        return coursesName;
    }

    public String getCourseNameByCode(int code){
        return courseRepository.getNameByCode(code);
    }
}
