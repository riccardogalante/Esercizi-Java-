import java.util.LinkedList;
class FruitLinkedList {
    private LinkedList<Fruit> fruits;

    public FruitLinkedList() {
        fruits = new LinkedList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void addFruitFirst(Fruit fruit) {
        fruits.addFirst(fruit);
    }

    public void addFruitLast(Fruit fruit) {
        fruits.addLast(fruit);
    }

    public void displayFruits() {
        System.out.println("Lista di frutta:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
    }
}
