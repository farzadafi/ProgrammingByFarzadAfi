package service;

import model.Professor;
import model.Student;

public class ClerkService {

    private final StudentService studentService = new StudentService();
    private final ProfessorService professorService = new ProfessorService();

    public boolean acceptStudent(String nationalCode) {
        return studentService.acceptStudent(nationalCode);
    }

    public boolean updateStudent(String nationalCode, String newFirstname) {
        return studentService.updateFirstname(nationalCode, newFirstname);
    }

    public boolean acceptProfessor(String nationalCode) {
        return professorService.acceptProfessor(nationalCode);
    }

    public boolean updateProfessor(String nationalCode, String newFirstname) {
        return professorService.updateFirstname(nationalCode, newFirstname);
    }

    public Student[] getAllStudent() {
        return studentService.getAll();
    }

    public Professor[] getAllProfessor() {
        return professorService.getAll();
    }
}
