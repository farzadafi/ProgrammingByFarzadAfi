package service;

import model.Student;
import repository.StudentRepository;
import utility.Validator;

public class StudentService {

    private final StudentRepository studentRepository = new StudentRepository();
    private final Validator validator = new Validator();

    public boolean register(Student student) {
        if (!validator.isValidName(student.getFirstname()))
            return false;
        if (!validator.isValidName(student.getLastname()))
            return false;
        if (!validator.isValidNationalCode(student.getNationalCode()))
            return false;
        if (!validator.isValidPassword(student.getPassword()))
            return false;

        studentRepository.register(student);
        return true;
    }

    public boolean acceptStudent(String nationalCode) {
        Student studentByNationalCode =
                studentRepository.findStudentByNationalCode(nationalCode);
        if (studentByNationalCode == null)
            return false;
        studentRepository.acceptStudent(nationalCode);
        return true;
    }

    public boolean updateFirstname(String nationalCode, String newFirstname) {
        if(!validator.isValidName(newFirstname))
            return false;
        studentRepository.updateFirstname(nationalCode, newFirstname);
        return true;
    }
}
