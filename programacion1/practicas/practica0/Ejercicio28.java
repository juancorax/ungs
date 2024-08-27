// Escribir un metodo static boolean estaOrdenado(int[] a) que dado un arreglo de enteros,
// devuelve verdadero si el arreglo esta ordenado crecientemente de menor a mayor, y falso en caso
// contrario.

public class Ejercicio28 {

    static boolean estaOrdenado(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arreglo1 = { 1, 2, 3, 4, 5 };
        int[] arreglo2 = { 1, 5, 3, 4, 2 };

        System.out.println("Esta ordenado?: " + estaOrdenado(arreglo1)); // true
        System.out.println("Esta ordenado?: " + estaOrdenado(arreglo2)); // false
    }
}
