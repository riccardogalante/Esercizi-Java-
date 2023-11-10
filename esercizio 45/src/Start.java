import java.util.HashSet;

public class Start {
    public static void main(String[] args) {
        HashSet<String> mioHashSet = creaHashSetRiempito();
        String elemento2= "elemento2";
        String elemento6= "elemento6";

        System.out.println("Dimensione dell'HashSet: " + mioHashSet.size());
        System.out.println("Elementi dell'HashSet:");
        System.out.println("l'elemento2 è contenuto nell'hashset:" + mioHashSet.contains(elemento2));
        System.out.println("l'elemento6 è contenuto nell'hashset:" + mioHashSet.contains(elemento6));

        for (String elemento : mioHashSet) {
            System.out.println(elemento);
        }


    }
    public static HashSet<String> creaHashSetRiempito() {

        HashSet<String> hashset = new HashSet<>();
        hashset.add("elemento1");
        hashset.add("elemento2");
        hashset.add("elemento3");
        hashset.add("elemento4");
        hashset.add("elemento5");
        return hashset;
    }
}
