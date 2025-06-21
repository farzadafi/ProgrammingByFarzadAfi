package menu;

import model.Student;
import service.StudentService;
import utility.UserInputHandler;

public class StudentMenu {

    private final StudentService studentService = new StudentService();
    private final UserInputHandler userInputHandler = new UserInputHandler();

    public void signUpStudent() {
        String firstname = userInputHandler.getStringFromUserByArg("firstname");
        String lastname = userInputHandler.getStringFromUserByArg("lastname");
        String nationalCode = userInputHandler.getStringFromUserByArg("nationalCode");
        String password = userInputHandler.getStringFromUserByArg("password");
        Student student = new Student(firstname, lastname, nationalCode, password);
        boolean result = studentService.signUp(student);
        if (result) {
            System.out.println("your register successfully");
        } else {
            System.out.println("try again");
            signUpStudent();
        }
    }
}
