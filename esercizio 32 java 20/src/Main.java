public class Main {
    public static void main(String[] args) {
        Animale animaleGenerico = new Animale();
        Gatto mioGatto = new Gatto();

        // Chiamata al metodo faiIlVerso della classe Animale
        System.out.println("Verso dell'animale generico:");
        animaleGenerico.faiIlVerso();

        System.out.println(); // Aggiungi una riga vuota per separare gli output

        // Chiamata al metodo faiIlVerso della classe Gatto
        System.out.println("Verso del gatto:");
        mioGatto.faiIlVerso();
    }
}