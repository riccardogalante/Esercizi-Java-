import java.util.HashMap;
import java.util.Map;

public class Start {

    public static void main(String[] args) {

        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Key1", 1);
        hashMap1.put("Key2", 2);
        hashMap1.put("Key3", 3);


        Map<String, String> hashMap2 = new HashMap<String, String>() {{
            put("Name1", "Topolino");
            put("Name2", "Paperino");
            put("Name3", "Pippo");
        }};


        Map<Integer, Boolean> hashMap3 = new HashMap<>();
        hashMap3.putAll(createHashMap());


        System.out.println("HashMap 1:");
        printHashMap(hashMap1);

        System.out.println("\nHashMap 2:");
        printHashMap(hashMap2);

        System.out.println("\nHashMap 3:");
        printHashMap(hashMap3);
    }


    private static <K, V> void printHashMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }


    private static Map<Integer, Boolean> createHashMap() {
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(101, true);
        map.put(102, false);
        map.put(103, true);
        return map;
    }
}
