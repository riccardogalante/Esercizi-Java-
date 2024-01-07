public class Main {
    public static void main(String[] args) {
        FruitLinkedList fruitList = new FruitLinkedList();

        fruitList.addFruit(new Fruit("Mela"));
        fruitList.addFruit(new Fruit("Banana"));
        fruitList.addFruit(new Fruit("Arancia"));

        fruitList.displayFruits();

        fruitList.addFruitFirst(new Fruit("Limone"));
        fruitList.addFruitLast(new Fruit("Pera"));

        fruitList.displayFruits();
    }
}