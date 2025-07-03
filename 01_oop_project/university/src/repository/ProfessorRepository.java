package repository;

import model.Professor;

public class ProfessorRepository {

    public final static Professor[] PROFESSORS = new Professor[100];

    public void register(Professor professor) {
        for (int i = 0; i < PROFESSORS.length; i++) {
            if (PROFESSORS[i] == null) {
                PROFESSORS[i] = professor;
                break;
            }
        }
    }

    public Professor findByNationalCode(String nationalCode) {
        for (int i = 0; i < PROFESSORS.length; i++) {
            if (PROFESSORS[i] != null &&
                    PROFESSORS[i].getNationalCode().equals(nationalCode))
                return PROFESSORS[i];
        }
        return null;
    }

    public void acceptProfessor(String nationalCode) {
        int i;
        for (i = 0; i < PROFESSORS.length; i++) {
            if (PROFESSORS[i].getNationalCode().equals(nationalCode))
                break;
        }
        PROFESSORS[i].setAccepted(true);
    }

    public void updateFirstname(String nationalCode, String newFirstname) {
        int i;
        for (i = 0; i < PROFESSORS.length; i++) {
            if (PROFESSORS[i].getNationalCode().equals(nationalCode))
                break;
        }
        PROFESSORS[i].setFirstname(newFirstname);
    }

    public int getNumberOfProfessor() {
        int count = 0;
        for (int i = 0; i < PROFESSORS.length; i++) {
            if (PROFESSORS[i] != null)
                ++count;
        }
        return count;
    }

    public Professor[] getProfessorByNumber(int numberOfProfessor) {
        Professor[] professors = new Professor[numberOfProfessor];
        for (int i = 0; i < numberOfProfessor; i++) {
            professors[i] = PROFESSORS[i];
        }
        return professors;
    }
}
