package ir.farzadafi.orm;

import ir.farzadafi.model.Car;
import ir.farzadafi.model.Person;

public class EntityRegistry {
    public final static Class<?>[] ENTITY = {
            Car.class,
            Person.class
    };
}
