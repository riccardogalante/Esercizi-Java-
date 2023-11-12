import java.util.HashSet;
import java.util.Iterator;

public class Start {

    public static void main(String[] args) {

        HashSet<MyObject> hashSet = creaEPopolaHashSet();

        MyObject objectToCheck = new MyObject();
        objectToCheck.setId(1);
        objectToCheck.setName("Example");

        Iterator<MyObject> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            MyObject currentObject = iterator.next();
            if (currentObject.equals(objectToCheck)) {
                iterator.remove();
                break;
            }
        }

        hashSet.clear();
        System.out.println("HashSet svuotato: " + hashSet.isEmpty());
    }

    private static HashSet<MyObject> creaEPopolaHashSet() {

        HashSet<MyObject> hashSet = new HashSet<>();

        MyObject obj1 = new MyObject();
        obj1.setId(1);
        obj1.setName("Object 1");

        MyObject obj2 = new MyObject();
        obj2.setId(2);
        obj2.setName("Object 2");

        hashSet.add(obj1);
        hashSet.add(obj2);

        return hashSet;
    }
}

