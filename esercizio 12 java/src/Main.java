public class Main {
    public static void main(String[] args) {

        int limiteI=5;
        int limiteS=10;
        int numeroC=7;
        System.out.println("limite inferiore: "+ limiteI);
        System.out.println("limite superiore: "+ limiteS);
        System.out.println("numero di confronto: "+ numeroC);
        System.out.println("il numero è compreso tra il limite inferiore e il limite superiore: "+ verificaNumero(limiteI,limiteS,numeroC));

    }
    public static boolean verificaNumero(int limiteInferiore,int limiteSuperiore, int numeroConfronto){
        boolean risultato= (limiteInferiore< numeroConfronto && limiteSuperiore > numeroConfronto);
        return risultato;
    }
}






//    Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto
//        verifichi se il numero di confronto è compreso tra due valori specifici e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)
//
