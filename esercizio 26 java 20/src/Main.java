import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        int[] arraySenzaDuplicati = rimuoviDuplicati(array);

        System.out.println("Array originale: " + Arrays.toString(array));
        System.out.println("Array senza duplicati: " + Arrays.toString(arraySenzaDuplicati));
    }

    public static int[] rimuoviDuplicati(int[] array) {
        int lunghezzaOriginale = array.length;

        // Controllo degli elementi duplicati e conteggio degli elementi unici
        int elementiUnici = 0;
        for (int i = 0; i < lunghezzaOriginale; i++) {
            boolean duplicato = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                elementiUnici++;
            }
        }

        // Creazione di un nuovo array senza duplicati
        int[] arraySenzaDuplicati = new int[elementiUnici];
        int index = 0;
        for (int i = 0; i < lunghezzaOriginale; i++) {
            boolean duplicato = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicato = true;
                    break;
                }
            }
            if (!duplicato) {
                arraySenzaDuplicati[index++] = array[i];
            }
        }

        return arraySenzaDuplicati;
    }
}