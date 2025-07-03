package service;

import model.Student;
import repository.StudentRepository;

public class StudentService {

    private final StudentRepository studentRepository = new StudentRepository();

    public boolean register(Student student) {
        if (!isValidName(student.getFirstname()))
            return false;
        if (!isValidName(student.getLastname()))
            return false;
        if (!isValidNationalCode(student.getNationalCode()))
            return false;
        if (!isValidPassword(student.getPassword()))
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

    private boolean isValidName(String name) {
        if (name.length() < 3)
            return false;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)))
                return false;
        }
        return true;
    }

    private boolean isValidNationalCode(String nationalCode) {
        if (nationalCode.length() != 10)
            return false;
        for (int i = 0; i < nationalCode.length(); i++) {
            if (!Character.isDigit(nationalCode.charAt(i)))
                return false;
        }
        return true;
    }

    private boolean isValidPassword(String password) {
        int digit = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int specialChar = 0;
        if (password.length() < 8)
            return false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch))
                ++digit;
            else if (Character.isLowerCase(ch))
                ++lowerCase;
            else if (Character.isUpperCase(ch))
                ++upperCase;
        }

        char[] specialCharArray = {'!', '@', '#', '$', '%', '^', '&'};
        for (int i = 0; i < specialCharArray.length; i++) {
            for (int j = 0; j < password.length(); j++) {
                if (password.charAt(j) == specialCharArray[i]) {
                    ++specialChar;
                    break;
                }
            }
        }
        if ((digit > 0) && (lowerCase > 0) && (upperCase > 0) && (specialChar > 0))
            return true;
        else
            return false;
    }
}
