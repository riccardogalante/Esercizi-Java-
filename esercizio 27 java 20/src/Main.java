public class Main {
    public static void main(String[] args) {
        int[][] matrice = inizializzaMatrice();
        stampaMatrice(matrice);

        int sommaPrimaRiga = calcolaSommaPrimaRiga(matrice);
        System.out.println("Somma degli elementi sulla prima riga: " + sommaPrimaRiga);
    }

    public static int[][] inizializzaMatrice() {
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        return matrice;
    }

    public static void stampaMatrice(int[][] matrice) {
        System.out.println("Matrice:");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int calcolaSommaPrimaRiga(int[][] matrice) {
        int somma = 0;
        for (int j = 0; j < matrice[0].length; j++) {
            somma += matrice[0][j];
        }
        return somma;
    }
}