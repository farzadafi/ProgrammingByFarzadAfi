import model.Student;
import service.StudentService;

public class ProgrammingByFarzadAfi {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        String password = "aA1!slkdjf";
        Student student
                = new Student("farzad", "afshar", "3080000000", password);
        System.out.println(studentService.register(student));
    }
}
