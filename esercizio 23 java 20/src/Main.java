public class Main {
    public static void main(String[] args) {
        int valoreIngresso = 10;
        stampaNumeriConSalto(valoreIngresso);
    }

    public static void stampaNumeriConSalto(int valoreIngresso) {
        System.out.println("Numeri fino a " + valoreIngresso + ", saltando il valore 5:");

        for (int i = 1; i <= valoreIngresso; i++) {
            // Salta il valore 5
            if (i == 5) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}