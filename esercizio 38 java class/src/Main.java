public class Main {
    public static void main(String[] args) {
        String stringa1 = "Ciao";
        String stringa2 = "ciao";

        String risultatoConfronto = confrontaStringhe(stringa1, stringa2);

        System.out.println(risultatoConfronto);
    }

    // Metodo per confrontare due stringhe e restituire il risultato utilizzando StringBuilder
    public static String confrontaStringhe(String str1, String str2) {
        StringBuilder risultato = new StringBuilder("Le due stringhe sono ");

        // Confronto lessico-grafico
        if (str1.compareTo(str2) == 0) {
            risultato.append("uguali");
        } else {
            risultato.append("differenti");
        }

        return risultato.toString();
    }
}