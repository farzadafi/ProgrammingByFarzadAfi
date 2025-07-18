package model;

public class Course {
    private String name;
    private int code;
    private int capacity;

    public Course(String name, int code, int capacity) {
        this.name = name;
        this.code = code;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public int getCapacity() {
        return capacity;
    }
}
