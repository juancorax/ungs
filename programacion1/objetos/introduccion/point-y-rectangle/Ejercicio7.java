import java.awt.Rectangle;

public class Ejercicio7 {

    public static void main(String[] args) {
        Rectangle rectangulo1 = new Rectangle(0, 0, 100, 50);
        Rectangle rectangulo2 = new Rectangle(0, 0, 150, 100);

        System.out.println(estaContenido(rectangulo1, rectangulo2));
    }

    public static boolean estaContenido(Rectangle rectangulo1, Rectangle rectangulo2) {
        boolean x1Dentro = rectangulo1.x >= rectangulo2.x && rectangulo1.x <= rectangulo2.x + rectangulo2.width;
        boolean x2Dentro = rectangulo1.x + rectangulo1.width >= rectangulo2.x
                && rectangulo1.x + rectangulo1.width <= rectangulo2.x + rectangulo2.width;

        boolean y1Dentro = rectangulo1.y >= rectangulo2.y && rectangulo1.y <= rectangulo2.y + rectangulo2.height;
        boolean y2Dentro = rectangulo1.y + rectangulo1.height >= rectangulo2.y
                && rectangulo1.y + rectangulo1.height <= rectangulo2.y + rectangulo2.height;

        if (x1Dentro && x2Dentro && y1Dentro && y2Dentro) {
            return true;
        }
        return false;
    }
}
