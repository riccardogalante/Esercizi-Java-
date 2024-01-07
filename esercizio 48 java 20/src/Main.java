import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<String> set = creaHashSet();
        String oggettoDaEliminare = "Elemento 2";

        eliminaElemento(set, oggettoDaEliminare);
        verificaESvuotaHashSet(set);
    }

    public static HashSet<String> creaHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        // Aggiungi elementi all'HashSet
        hashSet.add("Elemento 1");
        hashSet.add("Elemento 2");
        hashSet.add("Elemento 3");

        return hashSet;
    }

    public static void eliminaElemento(HashSet<String> set, String oggetto) {
        // Scorrere il set e rimuovere l'oggetto
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals(oggetto)) {
                iterator.remove();
            }
        }
    }

    public static void verificaESvuotaHashSet(HashSet<String> set) {
        // Verifica se l'HashSet è vuoto dopo l'eliminazione dell'oggetto
        System.out.println("L'HashSet prima della pulizia contiene: " + set);

        set.clear(); // Svuota l'HashSet

        System.out.println("L'HashSet dopo la pulizia contiene: " + set);
        System.out.println("L'HashSet è vuoto: " + set.isEmpty());
    }
}