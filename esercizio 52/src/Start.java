import java.util.*;

public class Start {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("uno", 1);
        hashMap.put("tre", 3);
        hashMap.put("cinque", 5);
        hashMap.put("due", 2);
        hashMap.put("quattro", 4);


        Collection<Integer> values = hashMap.values();


        List<Integer> sortedValues = new ArrayList<>(values);


        Collections.sort(sortedValues);


        System.out.println("Valori ordinati:");
        for (Integer value : sortedValues) {
            System.out.println(value);
        }
    }
}
