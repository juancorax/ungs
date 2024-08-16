// Ejercicio 3:
// a) Implementar la funcion siguientePrimo que dado un numero entero, retorne
// el primer numero primo mayor a el. (*)
// b) Calcular los siguientes primos de 8, 230 y 3527.

public class Ejercicio3 {
    static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int siguientePrimo(int numero) {
        int i = numero + 1;

        while (true) {
            if (esPrimo(i)) {
                return i;
            }

            ++i;
        }
    }

    public static void main(String[] args) {
        System.out.println("El siguiente primo de 8 es " + siguientePrimo(8));
        System.out.println("El siguiente primo de 230 es " + siguientePrimo(230));
        System.out.println("El siguiente primo de 3527 es " + siguientePrimo(3527));
    }
}
