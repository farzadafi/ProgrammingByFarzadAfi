package ir.farzadafi.model;

import ir.farzadafi.orm.GogoliOrm;

public class Person implements GogoliOrm {
    private String firstname;
    private String lastname;
    private int age;
    private boolean isMarried;
}