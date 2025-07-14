public class PersonArray {
    private Person[] people;
    private int size;

    public PersonArray() {
        people = new Person[10];
        size = 0;
    }

    public void add(Person person) {
        System.out.println("person " + size + " added");
        people[size] = person;
        ++size;
    }
}
