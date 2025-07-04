package service;

import model.Professor;
import repository.ProfessorRepository;
import utility.Validator;

public class ProfessorService {

    private final ProfessorRepository professorRepository = new ProfessorRepository();
    private final Validator validator = new Validator();

    public boolean register(Professor professor) {
        if (!validator.isValidName(professor.getFirstname()))
            return false;
        if (!validator.isValidName(professor.getLastname()))
            return false;
        if (!validator.isValidNationalCode(professor.getNationalCode()))
            return false;
        if (!validator.isValidPassword(professor.getPassword()))
            return false;

        professorRepository.register(professor);
        return true;
    }

    public boolean acceptProfessor(String nationalCode) {
        Professor professor =
                professorRepository.findByNationalCode(nationalCode);
        if (professor == null)
            return false;
        professorRepository.acceptProfessor(nationalCode);
        return true;
    }

    public boolean updateFirstname(String nationalCode, String newFirstname) {
        if (!validator.isValidName(newFirstname))
            return false;
        professorRepository.updateFirstname(nationalCode, newFirstname);
        return true;
    }

    public Professor[] getAll() {
        int numberOfStudent = professorRepository.getNumberOfProfessor();
        return professorRepository.getProfessorByNumber(numberOfStudent);
    }
}
