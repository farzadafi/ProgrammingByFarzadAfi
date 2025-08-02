public class Main {
    public static void main(String[] args) {
        DynamicArray personArray = new DynamicArray("Person");

        personArray.add(new Person("f1", "d"));
        personArray.add(new Person("f2", "d"));
        personArray.add(new Person("f3", "d"));
        if(!personArray.add(new Car()))
            System.out.println("cant add this");


        System.out.println(personArray.getSize());
        System.out.println(personArray.isEmpty());
        System.out.println(personArray.getByIndex(1));
        Object byIndex = personArray.getByIndex(1);
        Person person = (Person) byIndex;
        System.out.println("*****");
        person.printFullName();
        personArray.clear();
        System.out.println(personArray.isEmpty());
        System.out.println(personArray.getSize());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(personArray.contain(new Person("f1", "d")));

        DynamicArray carArray = new DynamicArray("Car");

        carArray.add(new Car());
        carArray.add(new Car());
        carArray.add(new Car());
        System.out.println(carArray.getSize());
        System.out.println(carArray.isEmpty());
    }
}
