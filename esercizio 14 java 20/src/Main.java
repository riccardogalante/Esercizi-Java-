public class Main {
    public static void main(String[] args) {
        int num=10;
        System.out.println("il numero è pari: " + verificaSePari(num));

    }
    public static boolean verificaSePari(int numero){
        int moduloNumero= numero%2;
        boolean risultato= (moduloNumero==0);
        return risultato;
    }
}



//    Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.