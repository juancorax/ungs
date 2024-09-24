// Ejercicio 2
public class Punto {

    private double x;
    private double y;

    // a)
    public Punto() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // b)
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // c)
    public void imprimir() {
        System.out.println("x: " + x + ", y: " + y);
    }

    // d)
    public void desplazar(double desp_x, double desp_y) {
        this.x += desp_x;
        this.y += desp_y;
    }

    // e)
    public static double distancia(Punto p1, Punto p2) {
        double x = Math.pow(p1.getX() - p2.getX(), 2);
        double y = Math.pow(p1.getY() - p2.getY(), 2);

        return Math.sqrt(x + y);
    }
}
