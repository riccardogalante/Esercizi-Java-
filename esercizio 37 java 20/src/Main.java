public class Main {
    public static void main(String[] args) {
        // Creazione di oggetti delle sottoclassi e chiamata al metodo calcolaArea
        Forma mioTriangolo = new Triangolo(4.0, 6.0);
        Forma mioRettangolo = new Rettangolo(5.0, 3.0);

        System.out.println("Calcolo dell'area del triangolo:");
        mioTriangolo.calcolaArea();
        System.out.println("Tipo di forma: " + ((Triangolo) mioTriangolo).getTipo());

        System.out.println(); // Aggiungi una riga vuota per separare gli output

        System.out.println("Calcolo dell'area del rettangolo:");
        mioRettangolo.calcolaArea();
        System.out.println("Tipo di forma: " + ((Rettangolo) mioRettangolo).getTipo());
    }
}