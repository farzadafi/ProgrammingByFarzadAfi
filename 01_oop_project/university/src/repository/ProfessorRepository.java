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
}
