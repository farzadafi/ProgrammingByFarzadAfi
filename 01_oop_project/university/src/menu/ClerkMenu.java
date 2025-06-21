package menu;

import model.Student;
import service.ClerkService;
import service.StudentService;
import utility.UserInputHandler;

public class ClerkMenu {

    private final UserInputHandler userInputHandler = new UserInputHandler();
    private final ClerkService clerkService = new ClerkService();

    public void initialMenu() {
        System.out.println("*** Hello Admin ***");
        System.out.println("1-verify student");
        System.out.println("9-back");
        System.out.println("Please select:");
        int userInput = userInputHandler.getIntFromUser();
        switch (userInput) {
            case 1 -> {
                boolean b = printAllInactiveStudent();
                if (!b) {
                    System.out.println("all student active!");
                    initialMenu();
                }
                clerkService.verifyStudent();
                initialMenu();
            }
            case 9 -> {
            }
        }
    }

    public boolean printAllInactiveStudent() {
        Student[] allInactiveStudent = clerkService.getAllInactiveStudent();
        int numberOfInactiveStudent =
                clerkService.calculateInactiveStudent(allInactiveStudent);
        if (numberOfInactiveStudent == 0) {
            return false;
        }
        return true;
    }
}
