import model.Student;
import repository.StudentRepository;
import service.ClerkService;
import service.StudentService;

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
    }
}
