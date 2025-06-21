package service;

import model.Student;
import utility.UserInputHandler;

public class ClerkService {

    private final StudentService studentService = new StudentService();
    private final UserInputHandler userInputHandler = new UserInputHandler();

    public void verifyStudent() {
        Student[] allInactiveStudent = studentService.getAllInactiveStudent();
        int numberOfInactiveStudent= calculateInactiveStudent(allInactiveStudent);
        if (numberOfInactiveStudent == 0) {
            System.out.println("all student is active");
            return;
        }
        System.out.println("All student that you can verify:\n");
        for (int i = 0; i < allInactiveStudent.length; i++) {
            if (allInactiveStudent[i] != null)
                System.out.println(allInactiveStudent[i]);
        }
        String nationalCodeStudent =
                userInputHandler.getStringFromUserByArg("nationalCode student");
        studentService.activeStudentByNationalCode(nationalCodeStudent);
        System.out.println("active successfully");
    }

    public int calculateInactiveStudent(Student[] students) {
        int i;
        for (i = 0; i < students.length; i++) {
            if (students[i] == null)
                return i;
        }
        return i;
    }

    public Student[] getAllInactiveStudent() {
        return studentService.getAllInactiveStudent();
    }
}
