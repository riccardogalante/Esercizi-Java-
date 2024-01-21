public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape(ShapeType.CIRCLE);
        Shape rectangle = ShapeFactory.createShape(ShapeType.RECTANGLE);
        Shape triangle = ShapeFactory.createShape(ShapeType.TRIANGLE);

        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}