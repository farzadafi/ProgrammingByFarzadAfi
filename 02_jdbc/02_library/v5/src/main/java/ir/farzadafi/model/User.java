package ir.farzadafi.model;

import lombok.Getter;

@Getter
public class User {
    private int id;
    private String name;
    private String nationalCode;

    public User(String name, String nationalCode) {
        this.name = name;
        this.nationalCode = nationalCode;
    }
}
