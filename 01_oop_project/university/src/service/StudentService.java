package service;

import dto.CourseWithGrade;
import model.Student;
import model.StudentCourse;
import repository.StudentRepository;
import utility.Validator;

public class StudentService {

    private final StudentRepository studentRepository = new StudentRepository();
    private final Validator validator = new Validator();
    private final StudentCourseService studentCourseService = new StudentCourseService();
    private final CourseService courseService = new CourseService();

    public boolean register(Student student) {
        if (!validator.isValidName(student.getFirstname()))
            return false;
        if (!validator.isValidName(student.getLastname()))
            return false;
        if (!validator.isValidNationalCode(student.getNationalCode()))
            return false;
        if (!validator.isValidPassword(student.getPassword()))
            return false;

        studentRepository.register(student);
        return true;
    }

    public boolean acceptStudent(String nationalCode) {
        Student studentByNationalCode =
                studentRepository.findStudentByNationalCode(nationalCode);
        if (studentByNationalCode == null)
            return false;
        studentRepository.acceptStudent(nationalCode);
        return true;
    }

    public boolean updateFirstname(String nationalCode, String newFirstname) {
        if (!validator.isValidName(newFirstname))
            return false;
        studentRepository.updateFirstname(nationalCode, newFirstname);
        return true;
    }

    public Student[] getAll() {
        int numberOfStudent = studentRepository.getNumberOfStudent();
        return studentRepository.getStudentByNumber(numberOfStudent);
    }

    public String[] getArraysOfRegisterCourse(String nationalCode) {
        int[] numbersOfStudentCourseCode = studentCourseService.getNumbersOfStudentCourseCode(nationalCode);
        return courseService.getNameOfCourseFromCode(numbersOfStudentCourseCode);
    }

    public CourseWithGrade[] getStudentCourseThatStudentPassed(String nationalCode) {
        StudentCourse[] studentCourseThatStudentPassed = studentCourseService.getStudentCourseThatStudentPassed(nationalCode);
        CourseWithGrade[] courseWithGrades = new CourseWithGrade[studentCourseThatStudentPassed.length];
        for (int i = 0; i < studentCourseThatStudentPassed.length; i++) {
            if (studentCourseThatStudentPassed[i] != null) {
                StudentCourse scs = studentCourseThatStudentPassed[i];
                String courseName = courseService.getCourseNameByCode(scs.getCourseCode());
                courseWithGrades[i] = new CourseWithGrade(courseName, scs.getGrade());
            }
        }
        return courseWithGrades;
    }
}
