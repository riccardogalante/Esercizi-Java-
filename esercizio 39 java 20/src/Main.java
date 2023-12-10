public class Main {
    public static void main(String[] args) {
        CarattereUnicode esempio = new CarattereUnicode("Hello");

        // Chiamata al metodo per ottenere il carattere Unicode all'indice 2
        String risultato = esempio.ottieniCarattereUnicode(2);
        System.out.println(risultato);
    }
}