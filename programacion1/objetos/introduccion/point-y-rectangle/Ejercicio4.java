import java.awt.Point;
import java.awt.Rectangle;

public class Ejercicio4 {

    public static void main(String[] args) {
        Point punto = new Point(3, 4);
        Rectangle rectangulo = new Rectangle(0, 0, 10, 5);

        System.out.println(estaDentro(punto, rectangulo));
    }

    public static boolean estaDentro(Point punto, Rectangle rectangulo) {
        boolean xDentro = punto.x >= rectangulo.x && punto.x <= rectangulo.x + rectangulo.width;
        boolean yDentro = punto.y >= rectangulo.y && punto.y <= rectangulo.y + rectangulo.height;

        if (xDentro && yDentro) {
            return true;
        }
        return false;
    }
}
