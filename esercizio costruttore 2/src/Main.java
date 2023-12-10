public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Auto
        Auto miaAuto = new Auto(1600, "AB123CD", "Toyota", "Corolla");

        // Accesso alle informazioni tramite i metodi getters
        System.out.println("Informazioni sull'auto:");
        System.out.println("Cilindrata: " + miaAuto.getCilindrata() + " cc");
        System.out.println("Targa: " + miaAuto.getTarga());
        System.out.println("Marca: " + miaAuto.getMarca());
        System.out.println("Modello: " + miaAuto.getModello());
    }
}