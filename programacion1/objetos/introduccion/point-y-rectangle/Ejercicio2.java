import java.awt.Point;
import java.awt.Rectangle;

public class Ejercicio2 {

    public static void main(String[] args) {
        Rectangle rectangulo = new Rectangle(0, 0, 100, 50);

        System.out.println(diagonal(rectangulo));
    }

    public static double distancia(Point punto1, Point punto2) {
        double dx = punto2.x - punto1.x;
        double dy = punto2.y - punto1.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static double diagonal(Rectangle rectangulo) {
        Point p = new Point(rectangulo.x, rectangulo.y);
        Point q = new Point(rectangulo.x + rectangulo.width, rectangulo.y + rectangulo.height);

        return distancia(p, q);
    }
}
