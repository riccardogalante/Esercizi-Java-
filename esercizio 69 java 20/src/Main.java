public class Main {
    public static void main(String[] args) {
        // Creazione di oggetti Person usando il Builder
        Person person1 = new Person.Builder("John", "Doe")
                .age(30)
                .address("123 Main Street")
                .build();

        Person person2 = new Person.Builder("Jane", "Smith")
                .age(25)
                .build();

        // Stampa a video degli oggetti Person
        System.out.println(person1);
        System.out.println(person2);
    }
}