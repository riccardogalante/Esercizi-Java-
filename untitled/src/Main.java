public class Main {

    public static void main(String[] args) {
        try {
            divisionePerZero();
        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione per zero: " + e.getMessage());
        }
    }

    public static void divisionePerZero() {
        int dividendo = 10;
        int divisore = 0;

        try {
            int risultato = dividendo / divisore;
            System.out.println("Risultato della divisione: " + risultato);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Errore di divisione per zero");
        }
    }
}