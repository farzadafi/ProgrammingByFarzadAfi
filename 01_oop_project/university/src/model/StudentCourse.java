package model;

public class StudentCourse {
    private String nationalCode;
    private int courseCode;
    private int grade = -1;

    public StudentCourse(String nationalCode, int courseCode) {
        this.nationalCode = nationalCode;
        this.courseCode = courseCode;
    }

    public int getGrade() {
        return grade;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setGrade(int grade) {
        if(grade > 20)
            this.grade = 20;
        else
            this.grade = grade;
    }
}
