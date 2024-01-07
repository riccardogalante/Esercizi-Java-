public class Main {

    public static void main(String[] args) {
        // Esegui le funzioni con valori primitivi e oggetti
        int num1 = 5;
        int num2 = 7;
        stampaSomma(num1, num2);

        char carattere = 'A';
        stampaCarattere(carattere);

        Integer integer1 = 10;
        Integer integer2 = 20;
        stampaSomma(integer1, integer2);

        Character carattereObj = 'B';
        stampaCarattere(carattereObj);

        // Autoboxing
        int valorePrimitivoInt = 30;
        double valorePrimitivoDouble = 3.14;
        char valorePrimitivoChar = 'C';

        Integer oggettoInteger = valorePrimitivoInt;
        Double oggettoDouble = valorePrimitivoDouble;
        Character oggettoCharacter = valorePrimitivoChar;

        // Unboxing
        int unboxedInt = oggettoInteger;
        double unboxedDouble = oggettoDouble;
        char unboxedChar = oggettoCharacter;

        // Esegui le funzioni con i valori creati
        stampaSomma(valorePrimitivoInt, valorePrimitivoInt);
        stampaCarattere(valorePrimitivoChar);
        stampaSomma(oggettoInteger, oggettoInteger);
        stampaCarattere(oggettoCharacter);
    }

    public static void stampaSomma(int num1, int num2) {
        System.out.println("La somma è: " + (num1 + num2));
    }

    public static void stampaCarattere(char carattere) {
        System.out.println("Il carattere è: " + carattere);
    }

    public static void stampaSomma(Integer num1, Integer num2) {
        System.out.println("La somma degli Integer è: " + (num1 + num2));
    }

    public static void stampaCarattere(Character carattere) {
        System.out.println("Il carattere è: " + carattere);
    }
}