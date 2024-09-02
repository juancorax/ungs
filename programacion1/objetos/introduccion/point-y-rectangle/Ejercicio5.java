import java.awt.Point;

public class Ejercicio5 {

    public static void main(String[] args) {
        Point punto1 = new Point(1, 2);
        Point punto2 = new Point(2, 4);

        System.out.println(puntoMedio(punto1, punto2));
    }

    public static Point puntoMedio(Point punto1, Point punto2) {
        int x = (punto1.x + punto2.x) / 2;
        int y = (punto1.y + punto2.y) / 2;

        return new Point(x, y);
    }
}
