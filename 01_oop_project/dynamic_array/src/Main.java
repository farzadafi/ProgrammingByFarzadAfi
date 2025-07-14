public class Main {
    public static void main(String[] args) {
        PersonArray personArray = new PersonArray();
        System.out.println(personArray.isEmpty());
        for (int i = 0; i < 15; i++) {
            personArray.add(new Person());
        }

        System.out.println(personArray.getSize());
        System.out.println(personArray.isEmpty());
    }
}
