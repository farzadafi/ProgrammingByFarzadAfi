public class PersonArray {
    private Person[] people;
    private int size;

    public PersonArray() {
        people = new Person[10];
        size = 0;
    }

    public void add(Person person) {
        if (size == people.length)
            resize();
        people[size] = person;
        ++size;
    }

    public void resize() {
        Person[] newPeople = new Person[people.length * 2];
        for (int i = 0; i < people.length; i++) {
            newPeople[i] = people[i];
        }
        people = newPeople;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
