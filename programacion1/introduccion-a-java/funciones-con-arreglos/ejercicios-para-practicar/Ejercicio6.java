// Implementar una función public static boolean todosDivisores(int[]a, int n),
// que dado un arreglo de enteros devuelva true si todos los elementos del
// arreglo son divisores de n.

public class Ejercicio6 {
    static boolean todosDivisores(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (n % a[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 6, 12 };
        int numero = 12;

        System.out.println(todosDivisores(arreglo, numero)); // true
    }
}
