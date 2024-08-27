// Escribir un metodo static int sumatoriaPares(int n) que devuelve la sumatoria de los nume-
// ros pares desde 2 hasta n.

public class Ejercicio11 {

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static int sumatoriaPares(int n) {
        int suma = 2;

        for (int i = 4; i <= n; i++) {
            if (esPar(i)) {
                suma += i;
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(sumatoriaPares(5));
    }
}
