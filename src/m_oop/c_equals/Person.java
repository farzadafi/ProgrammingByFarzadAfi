package m_oop.c_equals;

import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//
//        if (obj == null || obj.getClass() != this.getClass())
//            return false;
//
//        Person person = (Person) obj;
//        return (this.firstname.equals(person.firstname) &&
//                this.lastname.equals(person.lastname));
//    }

//    @Override
//    public int hashCode() {
//        int hash = 1;
//        int firstNameHashCode = firstname.hashCode();
//        int lastNameHashCode = lastname.hashCode();
//        hash = 31 * hash + firstNameHashCode;
//        hash = 31 * hash + lastNameHashCode;
//        return hash;
//    }

//    public String toString() {
//        String result = "";
//        result += "person:";
//        result += "\nfirstname is: " + firstname;
//        result += "\nlastname is: " + lastname;
//        return result;
//    }
}
