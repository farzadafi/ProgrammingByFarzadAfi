package service;

public class ClerkService {

    private final StudentService studentService = new StudentService();

    public boolean acceptStudent(String nationalCode) {
        return studentService.acceptStudent(nationalCode);
    }
}
