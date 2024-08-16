// Implementar una función public static int max(int[] a), que dado un arreglo
// de enteros desordenado devuelva el máximo elemento del arreglo.

public class Ejercicio3 {
    static int max(int[] a) {
        int maximo = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maximo) {
                maximo = a[i];
            }
        }

        return maximo;
    }

    public static void main(String[] args) {
        int[] arreglo = { 3, 2, 1, 5, 4 };

        System.out.println(max(arreglo));
    }
}
