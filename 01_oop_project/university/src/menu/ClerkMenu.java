package menu;

import model.Student;
import service.StudentService;
import utility.UserInputHandler;

public class ClerkMenu {

    private final UserInputHandler userInputHandler = new UserInputHandler();
    private final StudentService studentService = new StudentService();

    public void initialMenu() {
        System.out.println("*** Hello Admin ***");
        System.out.println("1-verify student");
        System.out.println("9-back");
        System.out.println("Please select:");
        int userInput = userInputHandler.getIntFromUser();
        switch (userInput) {
            case 1 -> {
                verifyStudent();
                initialMenu();
            }
            case 9 -> {
            }
        }
    }

    public void verifyStudent() {
        System.out.println("All student that you can verify:\n");
        Student[] allInactiveStudent = studentService.getAllInactiveStudent();
        int numberOfInactiveStudent= calculateInactiveStudent(allInactiveStudent);
        if (numberOfInactiveStudent == 0) {
            System.out.println("all student is active");
            return;
        }
        for (int i = 0; i < allInactiveStudent.length; i++) {
            if (allInactiveStudent[i] != null)
                System.out.println(allInactiveStudent[i]);
        }
        String nationalCodeStudent =
                userInputHandler.getStringFromUserByArg("nationalCode student");
        studentService.activeStudentByNationalCode(nationalCodeStudent);
        System.out.println("active successfully");
    }
/**/
    private int calculateInactiveStudent(Student[] students) {
        int i;
        for (i = 0; i < students.length; i++) {
            if (students[i] == null)
                return i;
        }
        return i;
    }
}
