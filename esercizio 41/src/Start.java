public class Start {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 0, 4, 5};
        gestisciEccezioni(myArray);
    }

    public static void gestisciEccezioni(int[] array) {
        try {
            for (int numero : array) {
                int risultato = numero / 0;  // Tentativo di divisione per 0
                System.out.println("Risultato: " + risultato);
            }
        } catch (ArithmeticException e) {
            System.out.println("Errore di divisione per 0: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore di indice non presente nell'array: " + e.getMessage());
        } finally {
            System.out.println("Questo blocco di codice viene sempre eseguito.");
        }
    }
}