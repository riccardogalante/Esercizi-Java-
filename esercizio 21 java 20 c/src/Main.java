public class Main {
    public static void main(String[] args) {
        int numeroPartenza = 6;
        int maxRisultati = 3;

        stampaNumeriInversi(numeroPartenza, maxRisultati);
    }

    public static void stampaNumeriInversi(int numeroPartenza, int maxRisultati) {
        System.out.print("Risultati in ordine inverso: ");
        for (int i = numeroPartenza; i > numeroPartenza - maxRisultati && i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}