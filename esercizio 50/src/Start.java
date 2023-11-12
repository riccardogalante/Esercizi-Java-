import java.util.LinkedList;


public class Start {

    public static void main(String[] args) {

        LinkedList<Fruit> fruitList = new LinkedList<>();


        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Orange"));

        System.out.println("Lista iniziale:");
        printFruitList(fruitList);


        fruitList.addFirst(new Fruit("Strawberry"));


        fruitList.addLast(new Fruit("Grapes"));


        System.out.println("\nLista aggiornata:");
        printFruitList(fruitList);
    }


    private static void printFruitList(LinkedList<Fruit> fruitList) {
        for (Fruit fruit : fruitList) {
            System.out.println("Fruit: " + fruit.getName());
        }
    }
}
