public class Main {
    public static void main(String[] args) {
        PersonArray personArray = new PersonArray();

        personArray.add(new Person("f1", "d"));
        personArray.add(new Person("f2", "d"));
        personArray.add(new Person("f3", "d"));

        System.out.println(personArray.getSize());
        System.out.println(personArray.isEmpty());
        System.out.println(personArray.getByIndex(1));
//        personArray.clear();
        System.out.println(personArray.isEmpty());
        System.out.println(personArray.getSize());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(personArray.contain(new Person("f1", "d")));
    }
}
