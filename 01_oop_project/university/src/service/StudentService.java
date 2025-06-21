package service;

import model.Student;
import repository.StudentRepository;

public class StudentService {

    private final StudentRepository studentRepository = new StudentRepository();

    public boolean signIn(Student student) {
        boolean firstNameResult = isValidName(student.getFirstname());
        boolean lastNameResult = isValidName(student.getLastname());
        boolean nationalCodeResult = isValidNationalCode(student.getNationalCode());
        boolean passwordResult = isValidPassword(student.getPassword());
        if(!firstNameResult || !lastNameResult || !nationalCodeResult || !passwordResult)
            return false;
        studentRepository.addStudent(student);
        return true;
    }

    public Student[] getAllInactiveStudent() {
        return studentRepository.getAllInactiveStudent();
    }

    public void activeStudentByNationalCode(String nationalCode) {
        studentRepository.activeStudentByNationalCode(nationalCode);
    }

    public boolean isValidName(String firstname) {
        if(firstname.length() < 3)
            return false;
        char[] charArray = firstname.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(!Character.isAlphabetic(charArray[i]))
                return false;
        }
        return true;
    }

    public boolean isValidNationalCode(String nationalCode) {
        if(nationalCode.length() != 10)
            return false;
        char[] chars = nationalCode.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(!Character.isDigit(chars[i]))
                return false;
        }
        return true;
    }

    public static boolean isValidPassword(String password) {
        if(password.length() < 8)
            return false;
        int numberOfDigit = 0;
        int numberOfUpperCase = 0;
        int numberOfLowerCase = 0;
        int numberOfSpecialChar = 0;
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&'};
        //todo write with e/**/lse if :(
        char[] charArray = password.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isDigit(charArray[i]))
                ++numberOfDigit;
            else if(Character.isUpperCase(charArray[i]))
                ++numberOfUpperCase;
            else if(Character.isLowerCase(charArray[i]))
                ++numberOfLowerCase;
        }
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < specialChars.length; j++) {
                if(charArray[i] == specialChars[j])
                    ++numberOfSpecialChar;
            }
        }
        if(numberOfDigit == 0 || numberOfUpperCase == 0 || numberOfLowerCase == 0
        || numberOfSpecialChar == 0)
            return false;
        return true;
    }
}
