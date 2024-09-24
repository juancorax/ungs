// Ejercicio 3
public class Circulo {

    private double radio;
    private Punto centro;

    // a)
    public Circulo(double radio, double centro_x, double centro_y) {
        this.radio = radio;
        this.centro = new Punto(centro_x, centro_y);
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    // b)
    public void imprimir() {
        System.out.println("radio: " + radio + ", centro_x: " + centro.getX() + ", centro_y: " + centro.getY());
    }

    // c)
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    public double superficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    // d)
    public void escalar(double factor) {
        if (factor > 0) {
            this.radio *= factor;
        } else {
            System.out.println("El factor debe ser mayor a 0");
        }
    }

    // e)
    public void desplazar(double desp_x, double desp_y) {
        this.centro.desplazar(desp_x, desp_y);
    }

    // f)
    public static double distancia(Circulo c1, Circulo c2) {
        return Punto.distancia(c1.centro, c2.centro) - (c1.radio + c2.radio);
    }

    // g)
    public static boolean seTocan(Circulo c1, Circulo c2) {
        return distancia(c1, c2) <= 0;
    }

    // h)
    public boolean loContiene(Circulo otro) {
        return distancia(this, otro) + otro.radio <= this.radio;
    }

    // Ejercicio 4
    public static void dibujarCirculos(Dibujador dib, int x, int y, int r) {
        if (r < 10) {
            return;
        }

        dib.dibujar(new Circulo(r, x, y));

        // izquiera
        dibujarCirculos(dib, x - (r / 2), y, r / 2);
        // derecha
        dibujarCirculos(dib, x + (r / 2), y, r / 2);
        // arriba
        dibujarCirculos(dib, x, y - (r / 2), r / 2);
        // abajo
        dibujarCirculos(dib, x, y + (r / 2), r / 2);
    }
}
