import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String> set = creaHashSet();
        leggiHashSet(set);
    }

    public static HashSet<String> creaHashSet() {
        HashSet<String> hashSet = new HashSet<>();

        // Aggiungi elementi all'HashSet
        hashSet.add("Elemento 1");
        hashSet.add("Elemento 2");
        hashSet.add("Elemento 3");

        return hashSet;
    }

    public static void leggiHashSet(HashSet<String> set) {
        // Stampare grandezza e elementi dell'HashSet
        System.out.println("La grandezza dell'HashSet è: " + set.size());
        System.out.println("Gli elementi dell'HashSet sono:");

        for (String elemento : set) {
            System.out.println(elemento);
        }
    }
}