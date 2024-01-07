public class Main {

    public static void main(String[] args) {
        int[] array = {10, 5, 0, 8};

        try {
            divisioneArray(array);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            System.out.println("Esecuzione del blocco di codice terminata");
        }
    }

    public static void divisioneArray(int[] array) {
        try {
            for (int i = 0; i <= array.length; i++) {
                int risultato = array[i] / 0;
                System.out.println("Risultato della divisione: " + risultato);
            }
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Errore di divisione per zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Indice non presente nell'array");
        }
    }
}