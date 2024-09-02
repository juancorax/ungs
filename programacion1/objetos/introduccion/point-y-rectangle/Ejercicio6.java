import java.awt.Rectangle;

public class Ejercicio6 {

    public static void main(String[] args) {
        Rectangle rectangulo1 = new Rectangle(0, 0, 100, 50);
        Rectangle rectangulo2 = new Rectangle(100, 50, 50, 100);

        System.out.println(encuadrar(rectangulo1, rectangulo2));
    }

    public static Rectangle encuadrar(Rectangle rectangulo1, Rectangle rectangulo2) {
        int x = Math.min(rectangulo1.x, rectangulo2.x);
        int y = Math.min(rectangulo1.y, rectangulo2.y);

        int width = Math.max(rectangulo1.x + rectangulo1.width, rectangulo2.x + rectangulo2.width);
        int height = Math.max(rectangulo1.y + rectangulo1.height, rectangulo2.y + rectangulo2.height);

        return new Rectangle(x, y, width, height);
    }
}
