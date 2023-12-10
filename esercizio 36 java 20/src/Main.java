public class Main {
    public static void main(String[] args) {
        // Creazione di oggetti delle classi che implementano l'interfaccia Forma
        Forma mioRettangolo = new Rettangolo(5.0, 3.0);
        Forma mioTriangolo = new Triangolo(4.0, 6.0);

        // Chiamata al metodo calcolaArea della classe Rettangolo
        System.out.println("Calcolo dell'area del rettangolo:");
        mioRettangolo.calcolaArea();

        System.out.println(); // Aggiungi una riga vuota per separare gli output

        // Chiamata al metodo calcolaArea della classe Triangolo
        System.out.println("Calcolo dell'area del triangolo:");
        mioTriangolo.calcolaArea();
    }
}