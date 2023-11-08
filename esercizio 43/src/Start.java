public class Start {
    public static void main(String[] args) {
        int risultatoInt = MathOperations.somma(5, 3);
        System.out.println("La somma degli int è: " + risultatoInt);

        char carattere = 'A';
        MathOperations.stampaCarattere(carattere);

        Integer num1 = 10;
        Integer num2 = 20;
        int risultatoInteger = MathOperations.somma(num1, num2);
        System.out.println("La somma degli Integer è: " + risultatoInteger);

        Character charObject = 'B';
        MathOperations.stampaCarattere(charObject);

        int valorePrimitivoInt = 42;
        double valorePrimitivoDouble = 3.14;
        char valorePrimitivoChar = 'C';

        Integer valoreAutoboxedInt = valorePrimitivoInt;
        Double valoreAutoboxedDouble = valorePrimitivoDouble;
        Character valoreAutoboxedChar = valorePrimitivoChar;

        int unboxedInt = valoreAutoboxedInt;
        double unboxedDouble = valoreAutoboxedDouble;
        char unboxedChar = valoreAutoboxedChar;

        System.out.println("Valori unboxed: " + unboxedInt + ", " + unboxedDouble + ", " + unboxedChar);
    }
}
