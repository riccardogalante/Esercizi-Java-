public class Main {
    public static void main(String[] args) {
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Matrice di partenza:");
        stampaMatrice(matrice);

        int[][] matriceScambiata = scambiaRigheConColonne(matrice);

        System.out.println("\nMatrice risultato dopo lo scambio:");
        stampaMatrice(matriceScambiata);
    }

    public static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] scambiaRigheConColonne(int[][] matrice) {
        int righe = matrice.length;
        int colonne = matrice[0].length;

        int[][] matriceScambiata = new int[colonne][righe];

        for (int i = 0; i < colonne; i++) {
            for (int j = 0; j < righe; j++) {
                matriceScambiata[i][j] = matrice[j][i];
            }
        }

        return matriceScambiata;
    }
}