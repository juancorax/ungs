import java.awt.Point;

public class Ejercicio1 {

    public static void main(String[] args) {
        Point punto1 = new Point(1, 2);
        Point punto2 = new Point(2, 1);

        System.out.println(distancia(punto1, punto2));
    }

    public static double distancia(Point punto1, Point punto2) {
        double dx = punto2.x - punto1.x;
        double dy = punto2.y - punto1.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}