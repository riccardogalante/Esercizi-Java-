public class Main {
    public static void main(String[] args) {
        // Creazione di un punto con coordinate x=5 e y=10
        Punto punto = new Punto(5, 10);

        // Accesso alle coordinate x e y
        int coordinataX = punto.x();
        int coordinataY = punto.y();

        // Stampare le coordinate del punto
        System.out.println("Coordinate del punto: x=" + coordinataX + ", y=" + coordinataY);
    }
}