// 4) public static int cantidadApariciones(int[] a, int n)
// que dado un arreglo de enteros y un entero, cuenta la cantidad
// de veces que aparece n en a.

public class Ejercicio4 {

    static int[] restoDeArreglo(int[] arreglo) {
        int[] nuevoArreglo = new int[arreglo.length - 1];

        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i + 1];
        }

        return nuevoArreglo;
    }

    static int cantidadApariciones(int[] a, int n) {
        if (a.length == 1) {
            if (a[0] == n) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (a[0] == n) {
                return 1 + cantidadApariciones(restoDeArreglo(a), n);
            } else {
                return cantidadApariciones(restoDeArreglo(a), n);
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 2 };
        int numero = 2;

        System.out.println(cantidadApariciones(arreglo, numero)); // 2
    }
}
