package model;

public class StudentCourse {
    private String nationalCode;
    private int courseCode;

    public StudentCourse(String nationalCode, int courseCode) {
        this.nationalCode = nationalCode;
        this.courseCode = courseCode;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public int getCourseCode() {
        return courseCode;
    }
}
