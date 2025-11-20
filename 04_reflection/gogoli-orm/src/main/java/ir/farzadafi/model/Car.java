package ir.farzadafi.model;

import ir.farzadafi.orm.GogoliOrm;

public class Car implements GogoliOrm {
    private String name;
    private String modelName;
    private int model;
    private Boolean test;

    public Car(String name, String modelName, int model, Boolean test) {
        this.name = name;
        this.modelName = modelName;
        this.model = model;
        this.test = test;
    }
}
