public class Main {
    public static void main(String[] args) {
        Forma formaGenerica = new Forma();
        Rettangolo mioRettangolo = new Rettangolo(5.0, 3.0);

        // Chiamata al metodo calcolaArea della classe Forma
        System.out.println("Calcolo dell'area della forma generica:");
        formaGenerica.calcolaArea();

        System.out.println(); // Aggiungi una riga vuota per separare gli output

        // Chiamata al metodo calcolaArea della classe Rettangolo
        System.out.println("Calcolo dell'area del rettangolo:");
        mioRettangolo.calcolaArea();
    }
}