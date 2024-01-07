public class Main {

    public static void main(String[] args) {
        int numDaControllare = 7;
        int minimoRange = 1;
        int massimoRange = 10;

        try {
            boolean risultato = controllaIntervallo(numDaControllare, minimoRange, massimoRange);
            System.out.println("Il numero è nel range specificato: " + risultato);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static boolean controllaIntervallo(int numero, int min, int max) throws IllegalArgumentException {
        if (numero < min || numero > max) {
            throw new IllegalArgumentException("Il numero non è nel range specificato");
        } else {
            return true;
        }
    }
}