public class Main {
    public static void main(String[] args) {
        char simboloOperazione='+';
        tipoOperazione(simboloOperazione);

    }
    public static void tipoOperazione(char simbolo){
        switch (simbolo){
            case '+':
                System.out.println("addizione");
                break;
            case  '-':
                System.out.println("sottrazione");
                break;
            case '*':
                System.out.println("moltiplicazione");
                break;
            case '/':
                System.out.println("divisione");
            default:
                System.out.println("ERROR");
        }
    }

}



//    Scrivi un programma che contenga un metodo che prende in ingresso un carattere e
//    ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
//        Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
//
