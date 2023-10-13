public class Start {

    public static void main(String[] args) {
        int[][] matrice = {{5, 9, 2}, {5, 4, 8}};
       int risultato= sommaPrimaRiga( matrice);

//        risultato = stampaMatrice ( matrice);
        System.out.println(risultato);

//        System.out.println(somma);
        stampaMatrice(matrice);

    }

    static void stampaMatrice (int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }


    }
    public  static int sommaPrimaRiga ( int [][] riga) {
        int somma = 0;
        for (int i = 0; i <= riga.length; i++) {
            somma = somma + riga[0][i];
            // System.out.println(riga[0][i]);
        }
        return somma;
    }
}