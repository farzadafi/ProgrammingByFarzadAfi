public class Main {
    public static void main(String[] args) {
        DynamicArray personArray = new DynamicArray();

        personArray.add(new Person("f1", "d"));
        personArray.add(new Person("f2", "d"));
        personArray.add(new Person("f3", "d"));

        System.out.println(personArray.getSize());
        System.out.println(personArray.isEmpty());
        System.out.println(personArray.getByIndex(1));
        personArray.clear();
        System.out.println(personArray.isEmpty());
        System.out.println(personArray.getSize());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(personArray.contain(new Person("f1", "d")));

        DynamicArray carArray = new DynamicArray();

        carArray.add(new Car());
        carArray.add(new Car());
        carArray.add(new Car());
        System.out.println(carArray.getSize());
        System.out.println(carArray.isEmpty());
    }
}
