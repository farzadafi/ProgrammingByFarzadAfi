package k_oop.a_encapsulation;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

//    public void setAge(int age) {
//        if(age < 0)
//            this.age = 0;
//        else
//            this.age = age;
//    }
}
