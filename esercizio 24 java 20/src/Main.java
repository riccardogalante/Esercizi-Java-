public class Main {
    public static void main(String[] args) {
        int[] array = creaEriempiArray();
        stampaArray(array);
        int somma = calcolaSommaArray(array);
        System.out.println("Somma degli elementi dell'array: " + somma);
    }

    public static int[] creaEriempiArray() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    public static void stampaArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int calcolaSommaArray(int[] array) {
        int somma = 0;

        for (int i = 0; i < array.length; i++) {
            somma += array[i];
        }

        return somma;
    }
}