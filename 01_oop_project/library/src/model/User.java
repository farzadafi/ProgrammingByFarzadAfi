package model;

import java.time.LocalDate;

public class User {
    private String name;
    private String lastname;
    private String nationalCode;
    private LocalDate registerDate;

    public User(String name, String lastname,
                String nationalCode, LocalDate registerDate) {
        this.name = name;
        this.lastname = lastname;
        this.nationalCode = nationalCode;
        this.registerDate = registerDate;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
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
