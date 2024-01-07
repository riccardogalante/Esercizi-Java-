import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Uno", 1);
        hashMap.put("Due", 5);
        hashMap.put("Tre", 3);
        hashMap.put("Quattro", 2);

        // Ottenere tutti i valori dell'HashMap
        Collection<Integer> values = hashMap.values();

        // Creazione di una lista ordinata dei valori
        List<Integer> sortedValues = new ArrayList<>(values);
        Collections.sort(sortedValues);

        // Stampa dei valori ordinati
        System.out.println("Valori ordinati:");
        for (Integer value : sortedValues) {
            System.out.println(value);
        }
    }
}