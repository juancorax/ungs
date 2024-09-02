import java.awt.Rectangle;

public class Ejercicio8 {

    public static void main(String[] args) {
        Rectangle rectangulo1 = new Rectangle(0, 0, 100, 100);
        Rectangle rectangulo2 = new Rectangle(50, 50, 100, 100);

        System.out.println(interseccion(rectangulo1, rectangulo2));
    }

    public static Rectangle interseccion(Rectangle rectangulo1, Rectangle rectangulo2) {
        int x = Math.max(rectangulo1.x, rectangulo2.x);
        int y = Math.max(rectangulo1.y, rectangulo2.y);

        int width = Math.min(rectangulo1.x + rectangulo1.width, rectangulo2.x + rectangulo2.width) - x;
        int height = Math.min(rectangulo1.y + rectangulo1.height, rectangulo2.y + rectangulo2.height) - y;

        if (width > 0 && height > 0) {
            return new Rectangle(x, y, width, height);
        } else {
            return null;
        }
    }
}
