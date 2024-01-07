public class Main {
    public static void main(String[] args) {
        // Creazione di un oggetto Auto utilizzando il costruttore
        Auto miaAuto = new Auto(1600, "AB123CD", "Toyota", "Corolla");

        // Accesso alle informazioni tramite i metodi getters
        System.out.println("Informazioni sull'auto:");
        System.out.println("Cilindrata: " + miaAuto.getCilindrata() + " cc");
        System.out.println("Targa: " + miaAuto.getTarga());
        System.out.println("Marca: " + miaAuto.getMarca());
        System.out.println("Modello: " + miaAuto.getModello());

        // Modifica delle informazioni tramite i metodi setters
        miaAuto.setCilindrata(1800);
        miaAuto.setTarga("XY987ZZ");

        System.out.println("\nInformazioni sull'auto dopo la modifica:");
        System.out.println("Cilindrata: " + miaAuto.getCilindrata() + " cc");
        System.out.println("Targa: " + miaAuto.getTarga());
    }
}