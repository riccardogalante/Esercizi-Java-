public class Main {
    public static void main(String[] args) {
        char[] arrayCaratteri = {'a', 'b', 'c', 'a', 'd', 'e', 'f', 'g', 'h', 'i'};
        stampaOccorrenzeCarattere(arrayCaratteri, 'a');
    }

    public static void stampaOccorrenzeCarattere(char[] arrayCaratteri, char carattereDaCercare) {
        System.out.print("Occorrenze del carattere '" + carattereDaCercare + "': ");
        boolean trovato = false;

        for (int i = 0; i < arrayCaratteri.length; i++) {
            if (arrayCaratteri[i] == carattereDaCercare) {
                System.out.print(i + " ");
                trovato = true;
            } else if (!trovato) {
                System.out.print("0");
            }
        }
    }
}