package m_oop.c_equals;

public class ImmutablePerson {
    private final int id;
    private final String fullName;

    public ImmutablePerson(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
