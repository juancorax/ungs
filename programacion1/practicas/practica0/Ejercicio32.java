// Escribir un metodo static void collatz(int n) que toma un natural n e imprime, en lıneas
// separadas, los numeros de la sucesion.

public class Ejercicio32 {

    static void collatz(int n) {
        if (n == 1) {
            System.out.println(n);
        } else if (n % 2 == 0) {
            System.out.println(n);
            collatz(n / 2);
        } else {
            System.out.println(n);
            collatz(3 * n + 1);
        }
    }

    public static void main(String[] args) {
        collatz(5);
    }
}
