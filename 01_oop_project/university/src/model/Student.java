package model;

public class Student {
    private String firstname;
    private String lastname;
    private String nationalCode;
    private String password;
    private boolean isActive;

    public Student(String firstname, String lastname,
                   String nationalCode, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nationalCode = nationalCode;
        this.password = password;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getFirstname() {
        return firstname;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                '}';
    }
}
