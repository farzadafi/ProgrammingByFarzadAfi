package m_oop.d_record;

public class Main {
    public static void main(String[] args) {
        //get person name and age;
        SimplePersonRecord personById = getPersonById(1);
        System.out.println(personById);
    }

    public static SimplePersonRecord getPersonById(int id) {
        //something do on DB
        Person person = new Person(1, "f", "308", 12);
        SimplePersonRecord f = new SimplePersonRecord("f", 10);
//        f.age()
        return new SimplePersonRecord(person.getName(), person.getAge());
    }
}
