public class Main {
    public static void main(String[] args) {
        String parola="Rykard";
        stampaLunghezza(parola);


    }
    public static void stampaLunghezza(String stringa){
        if (stringa.length()>10){
            System.out.println("Lunghezza maggiore di 10");
        } else if (stringa.length()<10) {
            System.out.println("Lunghezza minore di 10");
        } else if (stringa.length()==10) {
            System.out.println("Lunghezza pari a 10");
        }
    }
}



//    Scrivi un programma che calcoli la lunghezza di una stringa,
//    sulla base di questa lunghezza stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".