import model.Course;
import model.Professor;
import model.Student;
import model.StudentCourse;
import repository.StudentRepository;
import service.*;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        ClerkService clerkService = new ClerkService();
        String password = "aA1!slkdjf";
        Student student
                = new Student("farzad", "afshar", "3080000000", password);
        System.out.println(studentService.register(student));

        System.out.println(clerkService.acceptStudent("3082000000"));

        System.out.println(clerkService.updateStudent("3080000000", "test"));

        ProfessorService professorService = new ProfessorService();
        System.out.println(professorService.register(new Professor("tkjfdlskfj", "dklfjdlkfj", "3080200000", "aA1!dslkjfd")));

        Student[] allStudent = clerkService.getAllStudent();
        for (int i = 0; i < allStudent.length; i++) {
            System.out.println(allStudent[i]);
        }

        Course course = new Course("programming", 12345, 0);
        CourseService courseService = new CourseService();
        courseService.add(course);
        StudentCourseService studentCourseService = new StudentCourseService();

        System.out.println("return of register course:");
        System.out.println(studentCourseService.add(new StudentCourse("3080000000", 12345)));
    }
}
