package repository;

import model.Course;

public class CourseRepository {

    private static final Course[] COURSES = new Course[100];

    public void add(Course course) {
        for (int i = 0; i < COURSES.length; i++) {
            if (COURSES[i] == null) {
                COURSES[i] = course;
                break;
            }
        }
    }

    public boolean isDuplicateCourse(String name) {
        for (int i = 0; i < COURSES.length; i++) {
            if (COURSES[i] != null && COURSES[i].getName().equals(name))
                return true;
        }
        return false;
    }

    public Course findByName(String name) {
        for (int i = 0; i < COURSES.length; i++) {
            if (COURSES[i] != null &&
                    COURSES[i].getName().equals(name))
                return COURSES[i];
        }
        return null;
    }

    public int getNumberOfCources() {
        int count = 0;
        for (int i = 0; i < COURSES.length; i++) {
            if (COURSES[i] != null)
                ++count;
        }
        return count;
    }

    public Course[] getCourseByNumber(int number) {
        Course[] courses = new Course[number];
        for (int i = 0; i < number; i++) {
            courses[i] = COURSES[i];
        }
        return courses;
    }
}
