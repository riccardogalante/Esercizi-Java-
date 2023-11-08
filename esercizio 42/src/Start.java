public class Start {
    public static void main(String[] args) {
        try {
            Integer numeratore = 5;
            Integer denominatore = null;

            divisione(numeratore, denominatore);
        } catch (NullPointerException e) {
            System.out.println("Errore: Numeratore o denominatore sono nulli.");
        } catch (ArithmeticException e) {
            System.out.println("Errore: Impossibile dividere per zero.");
        }
    }

    public static void divisione(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new NullPointerException();
        }

        if (denominatore == 0) {
            throw new ArithmeticException();
        }

        int risultato = numeratore / denominatore;
        System.out.println("Risultato: " + risultato);
    }
}
