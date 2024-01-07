import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Metodo 1: Inizializzazione standard
        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Uno", 1);
        hashMap1.put("Due", 2);
        hashMap1.put("Tre", 3);

        System.out.println("Contenuto di hashMap1:");
        System.out.println(hashMap1);

        // Metodo 2: Inizializzazione utilizzando put individuale
        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("Gatto", 4);
        hashMap2.put("Cane", 7);
        hashMap2.put("Uccello", 2);

        System.out.println("\nContenuto di hashMap2:");
        System.out.println(hashMap2);

        // Metodo 3: Inizializzazione tramite inizializzatore statico
        Map<String, String> hashMap3 = new HashMap<>() {{
            put("Rosso", "Red");
            put("Blu", "Blue");
            put("Verde", "Green");
        }};

        System.out.println("\nContenuto di hashMap3:");
        System.out.println(hashMap3);
    }
}