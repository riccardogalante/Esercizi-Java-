public class Main {

    public static void main(String[] args) {
        Integer numeratore1 = 10;
        Integer denominatore1 = null;
        Integer numeratore2 = null;
        Integer denominatore2 = 5;

        try {
            divisioneConControllo(numeratore1, denominatore1);
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        try {
            divisioneConControllo(numeratore2, denominatore2);
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void divisioneConControllo(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new NullPointerException("Numeratore o denominatore sono nulli");
        } else if (denominatore == 0) {
            throw new ArithmeticException("Denominatore è zero");
        } else {
            int risultato = numeratore / denominatore;
            System.out.println("Risultato della divisione: " + risultato);
        }
    }
}