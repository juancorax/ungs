// 3) public static boolean estaOrdenado(int[] a) que dado un arreglo de enteros,
// devuelve verdadero si el arreglo está ordenado
// crecientemente de menor a mayor, y falso en caso contrario.

public class Ejercicio3 {

    static int[] restoDeArreglo(int[] arreglo) {
        int[] nuevoArreglo = new int[arreglo.length - 1];

        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i + 1];
        }

        return nuevoArreglo;
    }

    static boolean estaOrdenado(int[] a) {
        if (a.length == 1) {
            return true;
        } else if (a[0] < a[1]) {
            return estaOrdenado(restoDeArreglo(a));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arreglo1 = { 1, 2, 3, 4, 5 };
        int[] arreglo2 = { 1, 5, 3, 4, 2 };

        System.out.println(estaOrdenado(arreglo1)); // true
        System.out.println(estaOrdenado(arreglo2)); // false
    }
}