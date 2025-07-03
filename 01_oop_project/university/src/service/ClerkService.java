package service;

public class ClerkService {

    private final StudentService studentService = new StudentService();

    public boolean acceptStudent(String nationalCode) {
        return studentService.acceptStudent(nationalCode);
    }

    public boolean updateStudent(String nationalCode, String newFirstname) {
        return studentService.updateFirstname(nationalCode, newFirstname);
    }
}
