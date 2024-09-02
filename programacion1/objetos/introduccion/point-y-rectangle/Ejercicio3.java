import java.awt.Point;
import java.awt.Rectangle;

public class Ejercicio3 {

    public static void main(String[] args) {
        Rectangle rectangulo = new Rectangle(0, 0, 100, 50);

        System.out.println(centro(rectangulo));
    }

    public static Point centro(Rectangle rectangulo) {
        int x = rectangulo.x + (rectangulo.width / 2);
        int y = rectangulo.y + (rectangulo.height / 2);
        return new Point(x, y);
    }
}
