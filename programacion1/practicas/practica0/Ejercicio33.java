// Escribir, utilizando recursividad, un metodo int mcd(int a, int b) que calcula el maximo
// comun divisor entre a y b.

public class Ejercicio33 {

    static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(mcd(36, 20)); // 4
    }
}
