package model;

public class User {
    private String name;
    private String lastname;
    private String nationalCode;

    public User(String name, String lastname, String nationalCode) {
        this.name = name;
        this.lastname = lastname;
        this.nationalCode = nationalCode;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNationalCode() {
        return nationalCode;
    }
}
