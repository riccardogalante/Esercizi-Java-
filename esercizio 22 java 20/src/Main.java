public class Main {
    public static void main(String[] args) {
        int valoreIngresso = 10;
        stampaNumeriConInterruzione(valoreIngresso);
    }

    public static void stampaNumeriConInterruzione(int valoreIngresso) {
        System.out.println("Numeri fino a " + valoreIngresso + ", interrompendo a 5:");

        for (int i = 1; i <= valoreIngresso; i++) {
            System.out.print(i + " ");

            // Interruzione se il valore è uguale a 5
            if (i == 5) {
                System.out.println("\nInterruzione raggiunta a 5.");
                break;
            }
        }
    }
}