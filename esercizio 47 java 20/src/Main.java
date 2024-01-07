import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> set = creaHashSet();
        String elementoDaVerificare = "Elemento 2";

        boolean presente = verificaPresenza(set, elementoDaVerificare);

        System.out.println("L'elemento '" + elementoDaVerificare + "' è presente nel set: " + presente);
    }

    public static HashSet<String> creaHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        // Aggiungi elementi all'HashSet
        hashSet.add("Elemento 1");
        hashSet.add("Elemento 2");
        hashSet.add("Elemento 3");

        return hashSet;
    }

    public static boolean verificaPresenza(HashSet<String> set, String elemento) {
        // Verifica se l'elemento è presente nell'HashSet
        return set.contains(elemento);
    }
}