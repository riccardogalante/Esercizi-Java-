import java.util.Arrays;
import java.util.Random;

public class Start {
    public static void main(String[] args) {
        int[] arrayA=new int[6];
        int k= 3;

        System.out.println(Arrays.toString(filtra(arrayA,k)));

    }
    public static int[] filtra(int[] a, int k){
// conta gli elementi da inserire nell'array restituito
// e ne memorizza il numero in numElementi
        int numElementi = 0;
        for (int i=0; i<a.length; i++)
            if (a[i]%k == 0)
                numElementi++;
// crea l'array b da restituire e vi memorizza gli elementi
// dell'array a che sono divisibili per k
        int[] b = new int[numElementi];
        int j = 0; // la prossima posizione libera nell'array b
        for (int i=0; i<a.length; i++)
            if (a[i]%k == 0){
                b[j] = a[i];
                j++;
            }
        return b;
        



//Esercizio 2 (esercizio 9.2 del libro di testo). Implementare un metodo statico di nome filtra che
//        prende come parametro un array a di numeri interi e un intero positivo k, e che restituisce un
//        nuovo array b di numeri interi contenente i soli elementi di a che sono divisibili per k. Si faccia in
//        modo che l’array b abbia una dimensione uguale al numero di elementi che deve contenere (non
//        devono cioè esservi posizioni inutilizzate).
