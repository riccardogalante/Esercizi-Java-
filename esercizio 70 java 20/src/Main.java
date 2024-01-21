public class Main {
    public static void main(String[] args) {
        // Creazione di due oggetti User
        User user1 = new User("Default Name", 0);
        User user2 = new User("Nuovo Nome", 25);

        // Stampa delle informazioni di default per user1
        System.out.println("Informazioni di default per user1:");
        user1.printUserInfo();
        System.out.println();

        // Stampa delle informazioni per user2
        System.out.println("Informazioni per user2:");
        user2.printUserInfo();
    }
}