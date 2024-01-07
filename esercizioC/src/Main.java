public class Main {
    public static void main(String[] args) {
        Auto auto= new Auto(3000, "GP674VR", "lamborghini", "Veneno");
        Auto auto1= new Auto(1800, "KF674VR", "Ferrari", "Italia");

        System.out.println("la cilindrata dell'auto è: "+ auto.getCilindrata());
        System.out.println("la targa dell'auto è: "+ auto.getTarga());
        System.out.println("la marca dell'auto è: "+ auto.getMarca());
        System.out.println("il modello dell'auto è: "+ auto.getModello());

        System.out.println("la cilindrata dell'auto è: "+ auto1.getCilindrata());
        System.out.println("la targa dell'auto è: "+ auto1.getTarga());
        System.out.println("la marca dell'auto è: "+ auto1.getMarca());
        System.out.println("il modello dell'auto è: "+ auto1.getModello());

    }
}