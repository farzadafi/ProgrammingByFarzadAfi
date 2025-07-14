public class PersonArray {
    private Person[] people;

    public PersonArray() {
        people = new Person[10];
    }

    public void add(Person person) {
        for (int i = 0; i < people.length; i++) {
            if(people[i] == null){
                people[i] = person;
                break;
            }
        }
    }
}
