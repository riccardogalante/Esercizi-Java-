public class Main {
    public static void main(String[] args) {
        int giornoDellaSettimana = 4;

        switch (giornoDellaSettimana) {
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");
                break;
            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Valore non valido per rappresentare un giorno della settimana.");
        }
    }
}



//    Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca il nome del giorno
//    della settimana come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.