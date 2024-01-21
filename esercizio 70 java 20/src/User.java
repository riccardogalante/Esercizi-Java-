public class User {
    private String name;
    private int age;

    // Costruttore
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter e Setter per il nome
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter e Setter per l'età
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Metodo per stampare le informazioni
    public void printUserInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Età: " + age);
    }
}
