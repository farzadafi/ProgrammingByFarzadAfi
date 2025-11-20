package ir.farzadafi.model;

import ir.farzadafi.orm.GogoliOrm;

public class Person implements GogoliOrm {
    private String firstname;
    private String lastname;
    private int age;
    private boolean isMarried;

    public Person(String firstname, String lastname, int age, boolean isMarried) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.isMarried = isMarried;
    }
}