package ir.farzadafi.model;

public class User {
    private int id;
    private String name;
    private String nationalCode;

    public User(String name, String nationalCode) {
        this.name = name;
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public String getNationalCode() {
        return nationalCode;
    }
}
