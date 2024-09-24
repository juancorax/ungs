// Ejercicio 1
public class Fraccion {

    private int numerador;
    private int denominador;

    // a)
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;

        if (numerador > 0 && denominador < 0) {
            this.numerador *= -1;
            this.denominador *= -1;
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    // b)
    public void imprimir() {
        System.out.println(numerador + " / " + denominador);
    }

    // c)
    public void invertirSigno() {
        this.numerador *= -1;

        if (numerador < 0 && denominador < 0) {
            this.numerador *= -1;
            this.denominador *= -1;
        }
    }

    // d)
    public void invertir() {
        int variableAuxiliar = numerador;
        this.numerador = denominador;
        this.denominador = variableAuxiliar;
    }

    // e)
    public double aDouble() {
        return numerador / denominador;
    }

    // f)
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public void reducir() {
        int mcd = mcd(numerador, denominador);

        this.numerador /= mcd;
        this.denominador /= mcd;
    }

    // g)
    public static Fraccion producto(Fraccion q1, Fraccion q2) {
        int productoDeNumeradores = q1.getNumerador() * q2.getNumerador();
        int productoDeDenominadores = q1.getDenominador() * q2.getDenominador();

        Fraccion productoDeFracciones = new Fraccion(productoDeNumeradores, productoDeDenominadores);
        productoDeFracciones.reducir();

        return productoDeFracciones;
    }

    // h)
    public static Fraccion suma(Fraccion q1, Fraccion q2) {
        int denominador = q1.getDenominador() * q2.getDenominador();

        int numerador = ((denominador / q1.getDenominador()) * q1.getNumerador()) +
                ((denominador / q2.getDenominador()) * q2.getNumerador());

        Fraccion sumaDeFracciones = new Fraccion(numerador, denominador);
        sumaDeFracciones.reducir();

        return sumaDeFracciones;
    }
}