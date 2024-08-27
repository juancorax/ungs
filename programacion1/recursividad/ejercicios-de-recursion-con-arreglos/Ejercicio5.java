// 5) public static boolean pertenece(int[] a, int n)
// Dado un arreglo, hacer una función que devuelva si un número está en el arreglo o no

public class Ejercicio5 {

    static int[] restoDeArreglo(int[] arreglo) {
        int[] nuevoArreglo = new int[arreglo.length - 1];

        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i + 1];
        }

        return nuevoArreglo;
    }

    static boolean pertenece(int[] a, int n) {
        if (a.length == 1) {
            if (a[0] == n) {
                return true;
            } else {
                return false;
            }
        } else {
            if (a[0] == n) {
                return true;
            } else {
                return pertenece(restoDeArreglo(a), n);
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };
        int numero1 = 3;
        int numero2 = 6;

        System.out.println(pertenece(arreglo, numero1)); // true
        System.out.println(pertenece(arreglo, numero2)); // false
    }
}
