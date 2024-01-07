public class Main {

    public static void main(String[] args) {
        char carattereDaControllare = 'a';

        try {
            boolean risultato = controllaNumero(carattereDaControllare);
            System.out.println("Il carattere è un numero: " + risultato);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static boolean controllaNumero(char carattere) throws IllegalArgumentException {
        if (Character.isDigit(carattere)) {
            return true;
        } else {
            throw new IllegalArgumentException("Il carattere non è un numero");
        }
    }
}