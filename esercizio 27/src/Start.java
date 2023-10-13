public class Start {
    public static void main(String[] args) {
        int [][] matrice1= creaMatrice(2,3);
        stampaMatrice(matrice1);
        int [][] risultato =scarmbioRigheColonne(matrice1);
        stampaMatrice(risultato);
    }

    public static int [][] scarmbioRigheColonne(int[][] matrice){
        int[][] trasposta= new int[matrice[0].length][matrice.length];
        for (int i=0; i<matrice.length; i++){
            for (int j=0; j<matrice[i].length; j++){
                trasposta[j][i]= matrice[i][j];
            }
        }

        return trasposta;

    }

    public static int [][] creaMatrice (int riga, int colonna){
        int [][] matrice = new int[riga][colonna];
        int contatore=1;
        for (int i=0; i<matrice.length; i++ ){
            for (int j=0; j<matrice[i].length; j++){
                matrice[i][j]=contatore;
                contatore++;
            }
        }

        return matrice;

    }
    public static void stampaMatrice (int[][] matrice){

        for (int i=0; i<matrice.length; i++ ){
            for (int j=0; j<matrice[i].length; j++){


                System.out.print(matrice[i][j] + " ");
            }


            System.out.println();
        }



    }

}
